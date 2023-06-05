package me.darthwithap.android.fabricatoraccount.domain.usecases.dashboard

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.DayOfWeek
import java.time.LocalDate

class GetWeekDates {
  @RequiresApi(Build.VERSION_CODES.O)
  operator fun invoke(
    date: LocalDate
  ): List<LocalDate> {
    val startOfWeek = date.with(DayOfWeek.MONDAY)
    val weekDates = mutableListOf<LocalDate>()

    for (i in 0 until 7) {
      weekDates.add(startOfWeek.plusDays(i.toLong()))
    }
    return weekDates
  }
}