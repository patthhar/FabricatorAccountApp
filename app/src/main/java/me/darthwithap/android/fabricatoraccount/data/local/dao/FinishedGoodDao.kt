package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.FinishedGoodEntity

@Dao
interface FinishedGoodDao {
  @Upsert
  suspend fun upsertFinishedGood(finishedGoodEntity: FinishedGoodEntity)

  @Delete
  suspend fun deleteFinishedGood(finishedGoodEntity: FinishedGoodEntity)

  @Query("""
    SELECT * FROM FinishedGoodEntity WHERE id=:id
  """)
  fun getFinishedGoodById(id: String):FinishedGoodEntity
}