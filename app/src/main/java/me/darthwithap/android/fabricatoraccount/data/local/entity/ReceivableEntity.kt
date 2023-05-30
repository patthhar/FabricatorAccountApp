package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.PrimaryKey

data class ReceivableEntity(
  @PrimaryKey(autoGenerate = true) val id: String,
  val itemName: String,
  val quantity: Int,
  val costToFabricator: Float? = null
)
