package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import me.darthwithap.android.fabricatoraccount.domain.models.RawMaterial

@Entity
data class FinishedGoodEntity(
  @PrimaryKey(autoGenerate = false) val id: String,
  val name: String,
  val rawMaterialId: String,
  val requiredQuantity: Int
)