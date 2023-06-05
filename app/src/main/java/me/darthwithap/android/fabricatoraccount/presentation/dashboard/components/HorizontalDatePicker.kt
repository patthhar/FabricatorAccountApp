package me.darthwithap.android.fabricatoraccount.presentation.dashboard.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import me.darthwithap.android.fabricatoraccount.R
import me.darthwithap.android.fabricatoraccount.core.ui.LocalDimensions
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun HorizontalDatePicker(
  selectedDate: LocalDate,
  weekDates: List<LocalDate>,
  onPreviousWeekClick: () -> Unit,
  onNextWeekClick: () -> Unit,
  onDateSelected: (LocalDate) -> Unit,
  modifier: Modifier = Modifier,
) {
  val dimens = LocalDimensions.current

  Row(
    modifier = modifier.horizontalScroll(rememberScrollState()),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically
  ) {
    IconButton(onClick = onPreviousWeekClick) {
      Icon(
        imageVector = Icons.Default.ArrowBack,
        contentDescription = stringResource(id = R.string.previous_day)
      )
    }
    Spacer(modifier = Modifier.width(dimens.xs))
    weekDates.forEach {
      DateChip(date = it, isSelected = selectedDate == it) {
        onDateSelected(it)
      }
      if (it != weekDates.last()) {
        Spacer(modifier = Modifier.width(dimens.xs))
      }
    }
    Spacer(modifier = Modifier.width(dimens.xs))
    IconButton(onClick = onNextWeekClick) {
      Icon(
        imageVector = Icons.Default.ArrowForward,
        contentDescription = stringResource(id = R.string.next_day)
      )
    }
  }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DateChip(
  date: LocalDate,
  isSelected: Boolean = false,
  onDateSelected: () -> Unit
) {
  val dimens = LocalDimensions.current

  Box(
    modifier = Modifier
      .padding(horizontal = dimens.regular)
      .clickable { onDateSelected() }
      .background(
        color = if (isSelected) Color.Blue else Color.LightGray,
        shape = RoundedCornerShape(dimens.small)
      )
      .padding(dimens.regular)
  ) {
    Column {
      Text(
        text = date.format(
          DateTimeFormatter.ofPattern("dd")
        ),
        style = TextStyle(
          fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
          color = if (isSelected) Color.White else Color.Black
        )
      )
      Spacer(modifier = Modifier.height(dimens.small))
      Text(
        text = date.format(
          DateTimeFormatter.ofPattern("MMM")
        ),
        style = TextStyle(
          fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
          color = if (isSelected) Color.White else Color.Black
        )
      )
    }
  }
}