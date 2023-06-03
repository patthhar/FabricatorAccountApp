package me.darthwithap.android.fabricatoraccount.domain.models

data class FabricatorDeliverable(
  val id: String,
  val fabricator: Fabricator,
  val finishedGood: FinishedGood,
  val chargePerUnit: Float
)
