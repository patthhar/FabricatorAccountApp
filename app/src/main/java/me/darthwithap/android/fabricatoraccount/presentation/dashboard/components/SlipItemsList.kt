package me.darthwithap.android.fabricatoraccount.presentation.dashboard.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import me.darthwithap.android.fabricatoraccount.core.ui.LocalDimensions
import me.darthwithap.android.fabricatoraccount.domain.models.FromFabricatorSlip
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SlipItemsList(
  date: LocalDate,
  slips: List<FromFabricatorSlip>,
  onSlipClick: (FromFabricatorSlip) -> Unit,
) {
  val dimens = LocalDimensions.current

  LazyColumn(
    modifier = Modifier
      .fillMaxSize()
      .padding(bottom = dimens.base)
  ) {
    item {
      Text(text = ParseDateText(date = date), style = MaterialTheme.typography.headlineMedium)
      Spacer(modifier = Modifier.height(dimens.base))
      Spacer(modifier = Modifier.height(dimens.medium))
    }
    items(slips) { slip ->
      SlipItem(
        slip = slip,
        onClick = { onSlipClick(slip) },
        modifier = Modifier.fillMaxWidth()
      )
      Spacer(modifier = Modifier.height(dimens.regular))
    }
  }
}

@Composable
fun SlipItem(
  slip: FromFabricatorSlip,
  modifier: Modifier = Modifier,
  onClick: () -> Unit
) {
  val dimens = LocalDimensions.current

  Card(
    modifier = modifier
      .clickable { onClick() }
      .padding(dimens.big),
    elevation = CardDefaults.cardElevation(defaultElevation = dimens.small)
  ) {
    Column(
      modifier = Modifier.padding(dimens.medium)
    ) {
      Text(text = slip.fabricator.name)
      Spacer(modifier = Modifier.height(dimens.base))
      Text(text = slip.dateOfReceiving.toString())
    }
  }
}