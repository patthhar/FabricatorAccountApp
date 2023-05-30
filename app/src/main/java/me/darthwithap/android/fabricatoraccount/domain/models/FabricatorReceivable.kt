package me.darthwithap.android.fabricatoraccount.domain.models

data class FabricatorReceivable(
  val itemName: String,
  val quantity: Int,
  val costToFabricator: Float? = null
)
