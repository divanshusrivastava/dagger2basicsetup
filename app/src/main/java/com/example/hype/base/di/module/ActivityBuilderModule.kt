package com.example.hype.base.di.module

import com.example.hype.app.registration.di.builder.RegistrationActivityBuilderModule
import dagger.Module

@Module(includes = [RegistrationActivityBuilderModule::class])
abstract class ActivityBuilderModule