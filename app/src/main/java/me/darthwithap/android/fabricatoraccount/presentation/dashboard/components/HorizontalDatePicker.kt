package me.darthwithap.android.fabricatoraccount.presentation.dashboard.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import me.darthwithap.android.fabricatoraccount.core.ui.LocalDimensions
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun HorizontalDatePicker(
  selectedDate: MutableState<LocalDate>,
  weekDates: List<LocalDate>,
  onDateSelected: (LocalDate) -> Unit
) {
  val dimens = LocalDimensions.current

  Row(
    modifier = Modifier.horizontalScroll(rememberScrollState())
  ) {
    weekDates.forEach {
      DateChip(date = it, isSelected = selectedDate.value == it) {
        onDateSelected(it)
      }
      Spacer(modifier = Modifier.width(dimens.xs))
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
    Text(
      text = date.format(
        DateTimeFormatter.ofPattern("dd MM")
      ),
      style = TextStyle(
        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
        color = if (isSelected) Color.White else Color.Black
      )
    )
  }
}