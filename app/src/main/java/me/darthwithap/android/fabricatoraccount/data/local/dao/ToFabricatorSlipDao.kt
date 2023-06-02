package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.ToFabricatorSlipEntity

@Dao
interface ToFabricatorSlipDao {
  @Upsert
  suspend fun upsertToFabricatorSlipDao(toFabricatorSlipEntity: ToFabricatorSlipEntity)

  @Delete
  suspend fun deleteToFabricatorSlipDao(toFabricatorSlipEntity: ToFabricatorSlipEntity)

  //TODO: Figure out how to delete weekly old slips
  @Query(
    """
      DELETE FROM ToFabricatorSlipEntity
    """
  )
  suspend fun deleteOldToFabricatorSlips()
}