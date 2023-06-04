package me.darthwithap.android.fabricatoraccount.core.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import me.darthwithap.android.fabricatoraccount.core.ui.LocalDimensions
import me.darthwithap.android.fabricatoraccount.core.ui.TextSizes
import me.darthwithap.android.fabricatoraccount.domain.models.Fabricator


// TODO: Don't access Fabricator model directly, instead figure out
//  how to make use of UI States
//  Accessing viewModel here

@Composable
fun FabricatorChips(
  options: List<Fabricator>,
  selectedChip: Fabricator,
  onChipSelected: (Fabricator) -> Unit
) {
  Row {
    for (option in options) {
      val isSelected = option == selectedChip
      Chip(text = option.name, isSelected = isSelected) {
        onChipSelected(option)
      }
    }
  }
}

@Composable
fun Chip(
  text: String,
  isSelected: Boolean,
  onSelected: () -> Unit
) {
  val dimens = LocalDimensions.current
  val textSizes = TextSizes.current

  Button(
    onClick = { onSelected.invoke() },
    modifier = Modifier
      .wrapContentSize()
      .padding(dimens.xs),
    shape = RoundedCornerShape(dimens.base),
    colors = ButtonDefaults.buttonColors(
      containerColor = if (isSelected) Color.Cyan else Color.LightGray
    ),
    border = BorderStroke(
      width = dimens.xs,
      color = if (isSelected) Color.Blue else Color.Gray
    ),
    contentPadding = PaddingValues(dimens.xs)

  ) {
    Text(
      text = text,
      color = if (isSelected) Color.White else Color.Black,

      )
  }
}