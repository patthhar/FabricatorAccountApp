package me.darthwithap.android.fabricatoraccount.domain.models

import java.time.LocalDate

data class ToFabricatorSlip(
  val slipNumber: Int,
  val dateOfDispatch: LocalDate,
  val rawMaterialsSent: List<RawMaterialSent>,
  val fabricator: Fabricator,
  val isComplete: Boolean = false,
  val isActive: Boolean = !isComplete
)
