package me.darthwithap.android.fabricatoraccount.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.mapper.toEntity
import me.darthwithap.android.fabricatoraccount.domain.models.AccountEntry
import me.darthwithap.android.fabricatoraccount.domain.repository.AccountEntryRepository
import javax.inject.Inject

@RequiresApi(Build.VERSION_CODES.O)
class AccountEntryRepositoryImpl @Inject constructor(
  val db: AppDatabase
) :
  AccountEntryRepository {
  private val dao = db.accountEntryDao
  override suspend fun upsertAccountEntry(accountEntry: AccountEntry) {
    dao.upsertAccountEntry(accountEntry.toEntity())
  }

  override suspend fun deleteAccountEntry(accountEntry: AccountEntry) {
    dao.deleteAccountEntry(accountEntry.toEntity())
  }

  override suspend fun deleteOldAccountEntries(fabricatorId: String) {
    // TODO: Implement AccountEntryRepositoryImpl: deleteOldAccountEntries
  }

  override suspend fun deleteAllAccountEntries(fabricatorId: String) {
    // TODO: Implement AccountEntryRepositoryImpl: deleteAllAccountEntries
  }
}