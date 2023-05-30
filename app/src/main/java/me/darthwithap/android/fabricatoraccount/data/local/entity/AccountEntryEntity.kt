package me.darthwithap.android.fabricatoraccount.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import me.darthwithap.android.fabricatoraccount.domain.models.AccountEntryType
import me.darthwithap.android.fabricatoraccount.domain.models.Fabricator
import java.time.LocalDate

@Entity
data class AccountEntryEntity(
  @PrimaryKey(autoGenerate = false) val id: String,
  val fabricatorId: String,
  val entryType: String,
  val dayOfMonth: Int,
  val month: Int,
  val year: Int,
)
