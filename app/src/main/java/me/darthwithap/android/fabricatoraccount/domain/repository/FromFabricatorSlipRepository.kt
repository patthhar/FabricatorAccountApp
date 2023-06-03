package me.darthwithap.android.fabricatoraccount.domain.repository

import me.darthwithap.android.fabricatoraccount.domain.models.FromFabricatorSlip

interface FromFabricatorSlipRepository {
  suspend fun upsertFromFabricatorSlip(fromFabricatorSlip: FromFabricatorSlip)
  suspend fun deleteFromFabricatorSlip(fromFabricatorSlip: FromFabricatorSlip)
}