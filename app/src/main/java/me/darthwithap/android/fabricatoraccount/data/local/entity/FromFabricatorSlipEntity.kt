package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FromFabricatorSlipEntity(
  @PrimaryKey(autoGenerate = true) val id: String,
  val slipNo: Int,
  val dayOfMonth: Int,
  val month: Int,
  val year: Int,
  val fabricatorId: String,
  val totalCharge: Int = 0,
  val isComplete: Boolean = false,
  val isActive: Boolean = !isComplete
)