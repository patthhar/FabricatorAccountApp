package me.darthwithap.android.fabricatoraccount.domain.repository

import me.darthwithap.android.fabricatoraccount.domain.models.RawMaterial

interface RawMaterialRepository {
  suspend fun upsertRawMaterial(rawMaterial: RawMaterial)
  suspend fun deleteRawMaterial(rawMaterial: RawMaterial)
  fun getRawMaterialById(id: String): RawMaterial
}