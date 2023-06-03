package me.darthwithap.android.fabricatoraccount.domain.repository

import me.darthwithap.android.fabricatoraccount.domain.models.RawMaterialSent

interface RawMaterialSentRepository {
  suspend fun upsertRawMaterialSent(rawMaterialSent: RawMaterialSent)
  suspend fun deleteRawMaterialSent(rawMaterialSent: RawMaterialSent)

  suspend fun deleteOldRawMaterialSent()
}