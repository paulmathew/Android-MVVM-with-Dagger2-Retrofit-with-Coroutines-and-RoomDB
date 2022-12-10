package com.otherTallguy.dagger2example.di

import androidx.lifecycle.ViewModel
import com.otherTallguy.dagger2example.viewmodel.MainViewModel
import com.otherTallguy.dagger2example.viewmodel.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
abstract class ViewModelModule {

    @Binds
    @ClassKey(MainViewModel::class)
    @IntoMap
    abstract fun  mainViewModel(mainViewModel: MainViewModel):ViewModel
    // what this fun do is , it will bind the mainViewModel object with the  ViewModel
    // when ever there is a request for a viewModel it will return mainViewModel object.

    /**
     * @ClassKey() and @Intomap. what these two annotation do ?
     *  it will create a map with key as class name and value as the object below @IntoMap. Here it is ViewModel.
     *
     * so it will be like MainViewModel::class -> MainViewModel
     * MainViewModel2::class -> MainViewModel2
     */

    @Binds
    @ClassKey(MainViewModel2::class)
    @IntoMap
    abstract fun  mainViewModel2(mainViewModel2: MainViewModel2):ViewModel
}