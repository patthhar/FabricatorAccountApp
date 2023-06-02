package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.FromFabricatorSlipEntity

@Dao
interface FromFabricatorSlipDao {
  @Upsert
  suspend fun upsertFromFabricatorSlip(fromFabricatorSlipEntity: FromFabricatorSlipEntity)

  @Delete
  suspend fun deleteFromFabricatorSlip(fromFabricatorSlipEntity: FromFabricatorSlipEntity)
}