package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.FinishedGoodReceivedEntity

@Dao
interface FinishedGoodReceivedDao {
  @Upsert
  suspend fun upsertFinishedGoodReceived(finishedGoodReceivedEntity: FinishedGoodReceivedEntity)

  @Delete
  suspend fun deleteFinishedGoodReceived(finishedGoodReceivedEntity: FinishedGoodReceivedEntity)
}