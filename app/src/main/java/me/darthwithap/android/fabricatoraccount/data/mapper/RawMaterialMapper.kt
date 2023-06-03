package me.darthwithap.android.fabricatoraccount.data.mapper

import me.darthwithap.android.fabricatoraccount.data.local.entity.RawMaterialEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.RawMaterialSentEntity
import me.darthwithap.android.fabricatoraccount.domain.models.RawMaterial
import me.darthwithap.android.fabricatoraccount.domain.models.RawMaterialSent

fun RawMaterial.toEntity(): RawMaterialEntity {
  return RawMaterialEntity(id, name, rollLength)
}

fun RawMaterialEntity.toDomainModel(): RawMaterial {
  return RawMaterial(id, name, rollLength)
}

fun RawMaterialSent.toEntity(): RawMaterialSentEntity {
  return RawMaterialSentEntity(
    id,
    toFabricatorSlipNo,
    rawMaterialSentId,
    numberOfRolls,
    quantitySentInMeters,
    quantityReceivedInMeters
  )
}

fun RawMaterialSentEntity.toDomainModel(): RawMaterialSent {
  return RawMaterialSent(
    id,
    toFabricatorSlipNo,
    rawMaterialSentId,
    numberOfRolls,
    quantitySentInMeters,
    quantityReceivedInMeters
  )
}