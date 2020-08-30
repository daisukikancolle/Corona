package com.beone.bestpractice.core.data.source.remote.response

import android.os.Parcelable
import androidx.room.Embedded
import com.beone.bestpractice.core.data.local.entities.CountryInfoEntity
import kotlinx.android.parcel.Parcelize
import org.jetbrains.annotations.Nullable

@Parcelize
data class CountryResponse(
    val active: Int,
    val activePerOneMillion: Double,
    val cases: Int,
    val casesPerOneMillion: Int,
    val continent: String,
    val country: String,
    val critical: Int,
    val criticalPerOneMillion: Double,
    val deaths: Int,
    val deathsPerOneMillion: Double,
    val oneCasePerPeople: Int,
    val oneDeathPerPeople: Int,
    val oneTestPerPeople: Int,
    val population: Int,
    val recovered: Int,
    val recoveredPerOneMillion: Double,
    val tests: Int,
    val testsPerOneMillion: Int,
    val todayCases: Int,
    val todayDeaths: Int,
    val todayRecovered: Int,
    val updated: Long,
    @Nullable val countryInfo: CountryInfoResponse

):Parcelable

@Parcelize
data class CountryInfoResponse(
        var _id: Int,
        var flag: String,
        @Nullable var iso2: String? = "",
        @Nullable var iso3: String? = "",
        var lat: Double,
        var long: Double
):Parcelable
