package me.darthwithap.android.fabricatoraccount.presentation.dashboard

import android.os.Build
import androidx.annotation.RequiresApi
import me.darthwithap.android.fabricatoraccount.domain.models.FromFabricatorSlip
import me.darthwithap.android.fabricatoraccount.domain.models.ToFabricatorSlip
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
data class DashboardState(
  val date: LocalDate = LocalDate.now(),
  val todaySlips: List<FromFabricatorSlip> = emptyList(),
  val activeSlips: List<ToFabricatorSlip> = emptyList(),
  //TODO: add fabricator balances functionality
  //val fabricatorBalances: Map<Fabricator, Int>
)