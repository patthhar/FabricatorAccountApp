package me.darthwithap.android.fabricatoraccount.domain.models

data class Fabricator(
  val id: String,
  val name: String,
  val deliverables: List<FabricatorDeliverable> = listOf()
)
