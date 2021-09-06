package com.example.hype.app.registration.di.module

import androidx.lifecycle.ViewModel
import com.example.hype.app.registration.viewmodel.RegistrationViewModel
import com.example.hype.base.di.factory.key.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class RegistrationViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(RegistrationViewModel::class)
    abstract fun bindRegistrationViewModel(viewModel: RegistrationViewModel): ViewModel

}