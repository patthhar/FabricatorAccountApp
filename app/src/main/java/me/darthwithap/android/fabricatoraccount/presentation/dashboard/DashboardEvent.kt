package me.darthwithap.android.fabricatoraccount.presentation.dashboard

import me.darthwithap.android.fabricatoraccount.domain.models.FromFabricatorSlip
import me.darthwithap.android.fabricatoraccount.domain.models.ToFabricatorSlip
import java.time.LocalDate

sealed class DashboardEvent {
  data class OnDateChange(val date: LocalDate) : DashboardEvent()
  object OnAddFabricatorSlipClick : DashboardEvent()
  data class OnActiveSlipClick(val toFabricatorSlip: ToFabricatorSlip) : DashboardEvent()
  data class OnTodaySlipClick(val todaySlip: FromFabricatorSlip) : DashboardEvent()
}