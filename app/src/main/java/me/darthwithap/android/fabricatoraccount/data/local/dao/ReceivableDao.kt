package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.ReceivableEntity

@Dao
interface ReceivableDao {

  @Upsert
  suspend fun upsertReceivable(receivableEntity: ReceivableEntity)

  @Delete
  suspend fun deleteReceivable(receivableEntity: ReceivableEntity)
}