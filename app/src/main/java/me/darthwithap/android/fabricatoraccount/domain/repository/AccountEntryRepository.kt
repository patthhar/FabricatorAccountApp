package me.darthwithap.android.fabricatoraccount.domain.repository

import me.darthwithap.android.fabricatoraccount.domain.models.AccountEntry

interface AccountEntryRepository {
  suspend fun upsertAccountEntry(accountEntry: AccountEntry)
  suspend fun deleteAccountEntry(accountEntry: AccountEntry)
  suspend fun deleteOldAccountEntries(fabricatorId: String)
  suspend fun deleteAllAccountEntries(fabricatorId: String)
}