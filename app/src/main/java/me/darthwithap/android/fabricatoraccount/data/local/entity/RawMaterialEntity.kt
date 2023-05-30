package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RawMaterialEntity(
  @PrimaryKey(autoGenerate = false) val id: String,
  val name: String,
  val rollLength: Int
)