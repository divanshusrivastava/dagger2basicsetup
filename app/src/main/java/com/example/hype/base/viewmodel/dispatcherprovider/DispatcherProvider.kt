package com.example.hype.base.viewmodel.dispatcherprovider

import kotlinx.coroutines.CoroutineDispatcher

abstract class DispatcherProvider {
    abstract val main: CoroutineDispatcher
    abstract val backgorund: CoroutineDispatcher
}