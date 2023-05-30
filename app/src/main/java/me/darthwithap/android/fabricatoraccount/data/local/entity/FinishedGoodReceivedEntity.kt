package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import me.darthwithap.android.fabricatoraccount.domain.models.FabricatorDeliverable

@Entity
data class FinishedGoodReceivedEntity(
  @PrimaryKey(autoGenerate = false) val id: String,
  val fromFabricatorSlipNo: Int,
  val deliverableId: String,
  val quantity: Int
)