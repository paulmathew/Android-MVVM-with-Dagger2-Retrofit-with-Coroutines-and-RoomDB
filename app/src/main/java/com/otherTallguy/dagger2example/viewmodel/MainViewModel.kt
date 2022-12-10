package com.otherTallguy.dagger2example.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.otherTallguy.dagger2example.model.Country
import com.otherTallguy.dagger2example.repository.CountryRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * viewModel needs  repository class object to access the data from the model.
 * so we are passing that in the constructor itself
 */

class MainViewModel @Inject constructor(
    private val repository: CountryRepository,
    private val testForMultiBinding: TestForMultiBinding
) : ViewModel() {

    val countriesLiveData: LiveData<List<Country>>
        get() = repository.countries

    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    // inti method will call right after the viewModel is created .
    // so all the codes inside the init method will be executed first
//    init {
//        // this is the coroutine that we use to connenct the api.
//        viewModelScope.launch {
//            repository.getCountries()
//        }
//    }
    fun refresh() {
        loading.value = true
        fetchCountries()
    }

    private fun fetchCountries() {
        viewModelScope.launch {
            repository.getCountries()
            loading.value = false
        }
    }

}


class TestForMultiBinding @Inject constructor() {
    fun testSomething() {

    }
}