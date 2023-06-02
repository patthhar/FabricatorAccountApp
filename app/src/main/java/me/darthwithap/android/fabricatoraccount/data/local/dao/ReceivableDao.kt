package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Upsert

@Dao
interface ReceivableDao {

  @Upsert
  suspend fun upsertReceivable(receivableEntity: ReceivableDao)

  @Delete
  suspend fun deleteReceivable(receivableEntity: ReceivableDao)
}