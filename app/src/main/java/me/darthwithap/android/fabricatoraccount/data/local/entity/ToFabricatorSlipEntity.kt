package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToFabricatorSlipEntity(
  val slipNumber: Int,
  val dayOfMonth: Int,
  val month: Int,
  val year: Int,
  val fabricatorId: String,
  val isComplete: Boolean = false,
  val isActive: Boolean = !isComplete,
  @PrimaryKey(autoGenerate = true) val id: Int = 0
)