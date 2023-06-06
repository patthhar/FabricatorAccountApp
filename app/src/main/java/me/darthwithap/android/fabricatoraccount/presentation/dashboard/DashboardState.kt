package me.darthwithap.android.fabricatoraccount.presentation.dashboard

import android.os.Build
import androidx.annotation.RequiresApi
import me.darthwithap.android.fabricatoraccount.domain.models.FromFabricatorSlip
import me.darthwithap.android.fabricatoraccount.domain.models.ToFabricatorSlip
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
data class DashboardState(
  val selectedDate: LocalDate = LocalDate.now(),
  val weekDates: List<LocalDate> = emptyList(),
  val slipsForDate: MutableList<FromFabricatorSlip> = mutableListOf(),
  val activeSlips: MutableList<ToFabricatorSlip> = mutableListOf(),
  //TODO: add fabricator balances functionality
  //val fabricatorBalances: Map<Fabricator, Int>
)