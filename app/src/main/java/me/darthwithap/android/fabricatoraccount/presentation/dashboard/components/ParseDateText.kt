package me.darthwithap.android.fabricatoraccount.presentation.dashboard.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import me.darthwithap.android.fabricatoraccount.R
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ParseDateText(
  date: LocalDate
): String {
  val today = LocalDate.now()
  return when (date) {
    today -> stringResource(id = R.string.today_slips)
    today.minusDays(1) -> stringResource(id = R.string.yesterday_slips)
    today.plusDays(1) -> stringResource(id = R.string.tomorrow_slips)
    else -> {
      val dateString = DateTimeFormatter.ofPattern("dd LLLL").format(date)
      stringResource(id = R.string.slips_from_date, dateString)
    }
  }
}