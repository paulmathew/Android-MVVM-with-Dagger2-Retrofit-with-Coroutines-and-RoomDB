package com.otherTallguy.dagger2example.viewmodel

import androidx.lifecycle.ViewModel
import com.otherTallguy.dagger2example.repository.CountryRepository
import javax.inject.Inject

class MainViewModel2 @Inject constructor(
    private val repository: CountryRepository,
    private val testForMultiBinding: TestForMultiBinding
) : ViewModel() {


}