package com.example.hype.app.registration.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.example.hype.app.registration.repository.RegistrationRepository
import com.example.hype.base.viewmodel.BaseViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class RegistrationViewModel @Inject constructor(private val registrationRepository: RegistrationRepository) :
    BaseViewModel() {


    fun callLoginApi(userName: String, password: String) {
        val data :MutableLiveData
        liveData(dispatcherProvider.backgorund) {
            val result = registrationRepository.callLoginApi(userName, password)
            emit(result)
        }
    }

}