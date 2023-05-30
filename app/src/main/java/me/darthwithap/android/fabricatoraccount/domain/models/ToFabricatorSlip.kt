package me.darthwithap.android.fabricatoraccount.domain.models

import java.time.LocalDate

data class ToFabricatorSlip(
  val slipNumber: Int,
  val dateOfDispatch: LocalDate,
  val rawMaterialSentId: String,
  val numberOfRolls: Int,
  val quantityInMeters: Int = 0, //TODO: Calculate this using a specific UseCase
  val fabricator: Fabricator
)
