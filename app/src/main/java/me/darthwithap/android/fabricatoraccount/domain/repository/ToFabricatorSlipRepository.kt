package me.darthwithap.android.fabricatoraccount.domain.repository

import me.darthwithap.android.fabricatoraccount.domain.models.ToFabricatorSlip

interface ToFabricatorSlipRepository {
  suspend fun upsertToFabricatorSlip(toFabricatorSlip: ToFabricatorSlip)
  suspend fun deleteToFabricatorSlip(toFabricatorSlip: ToFabricatorSlip)
  //TODO: Figure out how do we want to implement this
  suspend fun deleteOldToFabricatorSlips(fabricatorId: String)
}