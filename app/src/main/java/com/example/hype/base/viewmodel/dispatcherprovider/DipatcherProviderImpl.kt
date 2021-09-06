package com.example.hype.base.viewmodel.dispatcherprovider

import com.example.hype.base.di.scope.ApplicationScope
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@ApplicationScope
class DipatcherProviderImpl @Inject constructor() : DispatcherProvider() {
    override val main: CoroutineDispatcher
        get() = Dispatchers.Main
    override val backgorund: CoroutineDispatcher
        get() = Dispatchers.IO
}