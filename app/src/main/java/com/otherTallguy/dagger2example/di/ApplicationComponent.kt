package com.otherTallguy.dagger2example.di

import android.content.Context
import com.otherTallguy.dagger2example.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class,DatabaseModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity) // for field inject property inside the MainActivity

    /** Dagger will check the MainActivity for the fields inside to provide values. Inorder to do that we need this inject method.
     * */

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }

}