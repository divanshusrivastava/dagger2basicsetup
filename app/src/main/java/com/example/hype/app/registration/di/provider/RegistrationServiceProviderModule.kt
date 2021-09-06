package com.example.hype.app.registration.di.provider

import com.example.hype.app.registration.service.IRegistrationService
import com.example.hype.base.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class RegistrationServiceProviderModule {

    @Provides
    @ApplicationScope
    fun provideRegistrationService(retrofit: Retrofit): IRegistrationService =
        retrofit.create(IRegistrationService::class.java)
}