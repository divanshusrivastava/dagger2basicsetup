package com.example.hype.app.registration.repository.repositoryimpl

import com.example.hype.app.registration.model.response.LoginApiResponse
import com.example.hype.app.registration.repository.RegistrationRepository
import com.example.hype.app.registration.service.IRegistrationService
import com.example.hype.base.network.response.Result
import javax.inject.Inject

class RegistrationRespositoryImpl @Inject constructor(private val iRegistrationService: IRegistrationService) :
    RegistrationRepository {

    override suspend fun callLoginApi(
        userName: String,
        password: String
    ): Result<LoginApiResponse> {

    }

}