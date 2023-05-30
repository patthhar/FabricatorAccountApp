package me.darthwithap.android.fabricatoraccount.domain.models

import java.time.LocalDate

data class AccountEntry(
  val entryId: String,
  val fabricator: Fabricator,
  val entryType: AccountEntryType,
  val entryDate: LocalDate
)
