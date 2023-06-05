package me.darthwithap.android.fabricatoraccount.presentation.dashboard

import android.os.Build
import androidx.annotation.RequiresApi
import me.darthwithap.android.fabricatoraccount.domain.models.FromFabricatorSlip
import me.darthwithap.android.fabricatoraccount.domain.models.ToFabricatorSlip
import me.darthwithap.android.fabricatoraccount.domain.usecases.dashboard.GetWeekDates
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
data class DashboardState(
  val selectedDate: LocalDate = LocalDate.now(),
  val weekDates: List<LocalDate> = emptyList(),
  val todaySlips: List<FromFabricatorSlip> = emptyList(),
  val activeSlips: List<ToFabricatorSlip> = emptyList(),
  //TODO: add fabricator balances functionality
  //val fabricatorBalances: Map<Fabricator, Int>
)