package com.example.hype.base.di.module

import androidx.lifecycle.ViewModelProvider
import com.example.hype.app.registration.di.module.RegistrationViewModelModule
import com.example.hype.base.di.factory.ViewModelProviderFactory
import com.example.hype.base.di.scope.ApplicationScope
import com.example.hype.base.viewmodel.dispatcherprovider.DipatcherProviderImpl
import com.example.hype.base.viewmodel.dispatcherprovider.DispatcherProvider
import dagger.Binds
import dagger.Module

@Module(includes = [RegistrationViewModelModule::class])
abstract class ViewModelModule {

    @Binds
    @ApplicationScope
    abstract fun bindViewModelFactory(
        viewModelFactory: ViewModelProviderFactory
    ): ViewModelProvider.Factory

    @Binds
    @ApplicationScope
    abstract fun bindDispatcherProvider(
        dispatcherProviderImpl: DipatcherProviderImpl
    ): DispatcherProvider

}