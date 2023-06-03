package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DeliverableEntity(
  val fabricatorId: String,
  val finishedGoodId: String,
  val chargePerUnit: Float,
  @PrimaryKey(autoGenerate = true) val id: Int = 0
)