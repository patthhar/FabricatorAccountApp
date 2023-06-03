package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ReceivableEntity(
  val itemName: String,
  val quantity: Int,
  val costToFabricator: Float? = null,
  @PrimaryKey(autoGenerate = true) val id: Int = 0
)
