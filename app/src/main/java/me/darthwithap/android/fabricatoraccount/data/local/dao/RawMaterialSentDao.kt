package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.RawMaterialSentEntity

@Dao
interface RawMaterialSentDao {
  @Upsert
  suspend fun upsertRawMaterialSent(rawMaterialSentEntity: RawMaterialSentEntity)

  @Delete
  suspend fun deleteRawMaterialSent(rawMaterialSentEntity: RawMaterialSentEntity)

  // TODO: See if we need this, how to delete old raw material sent entities
  // from slips based on the slips deleted
  @Query(
    """
    DELETE FROM RawMaterialSentEntity
  """
  )
  suspend fun deleteOldRawMaterialSent()
}