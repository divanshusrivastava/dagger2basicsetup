package com.example.hype.app.registration.di.builder

import com.example.hype.app.registration.view.activity.RegistrationActivity
import com.example.hype.base.di.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RegistrationActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun provideRegistrationActivity(): RegistrationActivity
}