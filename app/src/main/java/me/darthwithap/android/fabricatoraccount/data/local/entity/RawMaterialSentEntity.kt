package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RawMaterialSentEntity(
  @PrimaryKey(autoGenerate = false) val id: String,
  val toFabricatorSlipNo: Int,
  val rawMaterialSentId: String,
  val numberOfRolls: Int,
  val quantitySentInMeters: Int = 0, //TODO: Calculate this using a specific UseCase
  val quantityReceivedInMeters: Int? = null, //TODO: Calculate this using a specific UseCase
  val surplusQtyUsed: Int? = null
)