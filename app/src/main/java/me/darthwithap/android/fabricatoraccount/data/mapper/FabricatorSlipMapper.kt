package me.darthwithap.android.fabricatoraccount.data.mapper

import android.os.Build
import androidx.annotation.RequiresApi
import me.darthwithap.android.fabricatoraccount.data.local.entity.FromFabricatorSlipEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.ToFabricatorSlipEntity
import me.darthwithap.android.fabricatoraccount.domain.models.FromFabricatorSlip
import me.darthwithap.android.fabricatoraccount.domain.models.ToFabricatorSlip
import me.darthwithap.android.fabricatoraccount.domain.repository.FabricatorRepository
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun FromFabricatorSlip.toEntity(): FromFabricatorSlipEntity {
  return FromFabricatorSlipEntity(
    slipNumber = slipNo,
    dayOfMonth = dateOfReceiving.dayOfMonth,
    month = dateOfReceiving.monthValue,
    year = dateOfReceiving.year,
    fabricatorId = fabricator.id,
    totalCharge, isComplete, isActive
  )
}

// Todo: Get list of receivedFinishedGoods from slipNumber either by useCase or from Dao
@RequiresApi(Build.VERSION_CODES.O)
fun FromFabricatorSlipEntity.toDomainModel(
  fabricatorRepository: FabricatorRepository
): FromFabricatorSlip {
  return FromFabricatorSlip(
    slipNo = slipNumber,
    dateOfReceiving = LocalDate.of(year, month, dayOfMonth),
    fabricator = fabricatorRepository.getFabricatorById(fabricatorId),
    totalCharge = totalCharge,
    isComplete = isComplete
  )
}

@RequiresApi(Build.VERSION_CODES.O)
fun ToFabricatorSlip.toEntity(): ToFabricatorSlipEntity {
  return ToFabricatorSlipEntity(
    slipNumber = slipNumber,
    dayOfMonth = dateOfDispatch.dayOfMonth,
    month = dateOfDispatch.monthValue,
    year = dateOfDispatch.year,
    fabricatorId = fabricator.id,
    isComplete = isComplete
  )
}

// Todo: Get list of rawMaterialsSent from slipNumber either by useCase or from Dao
@RequiresApi(Build.VERSION_CODES.O)
fun ToFabricatorSlipEntity.toDomainModel(
  fabricatorRepository: FabricatorRepository
): ToFabricatorSlip {
  return ToFabricatorSlip(
    slipNumber = slipNumber,
    dateOfDispatch = LocalDate.of(year, month, dayOfMonth),
    fabricator = fabricatorRepository.getFabricatorById(fabricatorId),
    isComplete = isComplete
  )
}