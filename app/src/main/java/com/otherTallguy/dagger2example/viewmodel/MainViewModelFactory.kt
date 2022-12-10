package com.otherTallguy.dagger2example.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.otherTallguy.dagger2example.repository.CountryRepository
import javax.inject.Inject

/** Here dagger will check for CountryRepository since we are using constructor injection here
 * and Dagger will provide the object here automatically
 * and we will pass it into the MainViewModel
 */
class MainViewModelFactory @Inject constructor(private val repository: CountryRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}