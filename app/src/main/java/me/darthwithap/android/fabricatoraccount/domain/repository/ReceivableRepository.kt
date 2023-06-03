package me.darthwithap.android.fabricatoraccount.domain.repository

import me.darthwithap.android.fabricatoraccount.domain.models.FabricatorReceivable

interface ReceivableRepository {
  suspend fun upsertReceivable(receivable: FabricatorReceivable)
  suspend fun deleteReceivable(receivable: FabricatorReceivable)
}