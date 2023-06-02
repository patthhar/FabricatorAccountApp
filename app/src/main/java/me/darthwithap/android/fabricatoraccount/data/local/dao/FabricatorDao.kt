package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.FabricatorEntity

@Dao
interface FabricatorDao {
  @Upsert
  suspend fun upsertFabricator(fabricatorEntity: FabricatorEntity)

  @Delete
  suspend fun deleteFabricator(fabricatorEntity: FabricatorEntity)

  @Query("DELETE FROM FabricatorEntity")
  suspend fun deleteAllFabricators()

  @Query("SELECT * FROM FabricatorEntity WHERE id=:id")
  fun getFabricatorById(id: String): FabricatorEntity

  @Query("SELECT * FROM FabricatorEntity")
  suspend fun getAllFabricators(): List<FabricatorEntity>?
}