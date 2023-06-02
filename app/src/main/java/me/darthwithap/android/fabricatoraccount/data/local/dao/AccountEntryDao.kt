package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.AccountEntryEntity

@Dao
interface AccountEntryDao {
  @Upsert
  suspend fun upsertAccountEntry(accountEntryEntity: AccountEntryEntity)

  @Delete
  suspend fun deleteAccountEntry(accountEntryEntity: AccountEntryEntity)


  //TODO add deletion of older entries logic
  @Query("DELETE FROM AccountEntryEntity")
  suspend fun deleteOldAccountEntries(fabricatorId: String)

  @Query("DELETE FROM AccountEntryEntity")
  suspend fun deleteAllAccountEntries(fabricatorId: String)
}