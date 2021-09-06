package com.example.hype.base.viewmodel

import androidx.lifecycle.ViewModel
import com.example.hype.base.viewmodel.dispatcherprovider.DipatcherProviderImpl
import com.example.hype.base.viewmodel.dispatcherprovider.DispatcherProvider
import javax.inject.Inject

open class BaseViewModel : ViewModel() {

    @Inject
    lateinit var dispatcherProvider: DipatcherProviderImpl

}