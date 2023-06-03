package me.darthwithap.android.fabricatoraccount.data.mapper

import android.os.Build
import androidx.annotation.RequiresApi
import me.darthwithap.android.fabricatoraccount.data.local.entity.AccountEntryEntity
import me.darthwithap.android.fabricatoraccount.domain.models.AccountEntry
import me.darthwithap.android.fabricatoraccount.domain.models.AccountEntryType
import me.darthwithap.android.fabricatoraccount.domain.repository.FabricatorRepository
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun AccountEntry.toEntity(): AccountEntryEntity {
  return AccountEntryEntity(
    id = entryId,
    fabricatorId = fabricator.id,
    entryType = entryType.name,
    dayOfMonth = entryDate.dayOfMonth,
    month = entryDate.monthValue,
    year = entryDate.year
  )
}

@RequiresApi(Build.VERSION_CODES.O)
fun AccountEntryEntity.toDomainModel(
  fabricatorRepository: FabricatorRepository
): AccountEntry {
  return AccountEntry(
    entryId = id,
    fabricator = fabricatorRepository.getFabricatorById(fabricatorId),
    entryType = AccountEntryType.fromString(entryType),
    entryDate = LocalDate.of(year, month, dayOfMonth)
  )
}