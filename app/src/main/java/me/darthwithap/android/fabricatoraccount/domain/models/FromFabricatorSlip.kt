package me.darthwithap.android.fabricatoraccount.domain.models

import java.time.LocalDate

data class FromFabricatorSlip(
  val slipNo: Int,
  val dateOfReceiving: LocalDate,
  val fabricator: Fabricator,
  val receivedFinishedGoods: List<FinishedGoodReceived> = listOf(),
  val totalCharge: Int = 0, //TODO: Calculate using a useCase
  val isComplete: Boolean = false,
  val isActive: Boolean = !isComplete
)
