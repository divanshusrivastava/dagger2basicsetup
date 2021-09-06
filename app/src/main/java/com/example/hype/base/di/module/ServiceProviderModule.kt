package com.example.hype.base.di.module

import com.example.hype.app.registration.di.provider.RegistrationServiceProviderModule
import dagger.Module

@Module(includes = [RegistrationServiceProviderModule::class])
abstract class ServiceProviderModule