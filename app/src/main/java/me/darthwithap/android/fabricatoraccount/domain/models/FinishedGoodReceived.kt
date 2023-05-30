package me.darthwithap.android.fabricatoraccount.domain.models

data class FinishedGoodReceived(
  val id: String,
  val fromFabricatorSlipNo: Int,
  val deliverable: FabricatorDeliverable,
  val quantity: Int
)
