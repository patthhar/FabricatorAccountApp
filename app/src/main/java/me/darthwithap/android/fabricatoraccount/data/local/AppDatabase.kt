package me.darthwithap.android.fabricatoraccount.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import me.darthwithap.android.fabricatoraccount.data.local.dao.AccountEntryDao
import me.darthwithap.android.fabricatoraccount.data.local.dao.DeliverableDao
import me.darthwithap.android.fabricatoraccount.data.local.dao.FabricatorDao
import me.darthwithap.android.fabricatoraccount.data.local.dao.FinishedGoodDao
import me.darthwithap.android.fabricatoraccount.data.local.dao.FinishedGoodReceivedDao
import me.darthwithap.android.fabricatoraccount.data.local.dao.FromFabricatorSlipDao
import me.darthwithap.android.fabricatoraccount.data.local.dao.RawMaterialSentDao
import me.darthwithap.android.fabricatoraccount.data.local.dao.ReceivableDao
import me.darthwithap.android.fabricatoraccount.data.local.dao.ToFabricatorSlipDao
import me.darthwithap.android.fabricatoraccount.data.local.entity.AccountEntryEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.DeliverableEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.FabricatorEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.FinishedGoodEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.FinishedGoodReceivedEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.FromFabricatorSlipEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.RawMaterialEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.RawMaterialSentEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.ReceivableEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.ToFabricatorSlipEntity

@Database(
  entities = [
    AccountEntryEntity::class,
    DeliverableEntity::class,
    FabricatorEntity::class,
    FinishedGoodEntity::class,
    FinishedGoodReceivedEntity::class,
    FromFabricatorSlipEntity::class,
    RawMaterialEntity::class,
    RawMaterialSentEntity::class,
    ReceivableEntity::class,
    ToFabricatorSlipEntity::class
  ],
  version = 1
)
abstract class AppDatabase : RoomDatabase() {
  abstract val accountEntryDao: AccountEntryDao
  abstract val deliverableDao: DeliverableDao
  abstract val fabricatorDao: FabricatorDao
  abstract val finishedGoodDao: FinishedGoodDao
  abstract val finishedGoodReceivedDao: FinishedGoodReceivedDao
  abstract val fromFabricatorSlipDao: FromFabricatorSlipDao
  abstract val rawMaterialSentDao: RawMaterialSentDao
  abstract val receivableDao: ReceivableDao
  abstract val toFabricatorSlipDao: ToFabricatorSlipDao
}