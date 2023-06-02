package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.RawMaterialEntity

@Dao
interface RawMaterialDao {
  @Upsert
  suspend fun upsertRawMaterial(rawMaterialEntity: RawMaterialEntity)

  @Delete
  suspend fun deleteRawMaterial(rawMaterialEntity: RawMaterialEntity)
}