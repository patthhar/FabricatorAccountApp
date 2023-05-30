package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import me.darthwithap.android.fabricatoraccount.domain.models.FabricatorDeliverable

@Entity
data class FabricatorEntity(
  @PrimaryKey(autoGenerate = false) val id: String,
  val name: String
)
