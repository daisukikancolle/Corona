package com.example.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core.data.source.local.entities.CountryEntity

@Database(entities = [CountryEntity::class], version = 1, exportSchema = false)
abstract class CountryDatabase : RoomDatabase() {
    abstract fun countryDao(): CountryDao
}