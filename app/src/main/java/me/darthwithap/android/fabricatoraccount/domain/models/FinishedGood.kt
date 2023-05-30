package me.darthwithap.android.fabricatoraccount.domain.models

data class FinishedGood(
  val id: String,
  val name: String,
  val rawMaterial: RawMaterial,
  val requiredQuantity: Int
)
