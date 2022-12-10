package com.otherTallguy.dagger2example.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.otherTallguy.dagger2example.model.Country

@Dao
interface CountryDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCountries(countries: List<Country>)

    @Query("SELECT * FROM Country")
    fun getCountries() : List<Country>

}