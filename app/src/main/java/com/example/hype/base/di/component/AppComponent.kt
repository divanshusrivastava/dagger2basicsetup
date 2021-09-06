package com.example.hype.base.di.component

import android.app.Application
import com.example.hype.AppController
import com.example.hype.base.di.module.ActivityBuilderModule
import com.example.hype.base.di.module.NetworkModule
import com.example.hype.base.di.module.ServiceProviderModule
import com.example.hype.base.di.module.ViewModelModule
import com.example.hype.base.di.scope.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@ApplicationScope
@Component(
        modules = [AndroidSupportInjectionModule::class, ActivityBuilderModule::class, ViewModelModule::class, ServiceProviderModule::class, NetworkModule::class])
interface AppComponent : AndroidInjector<AppController> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}