package com.example.hype.app.registration.repository

import com.example.hype.app.registration.model.response.LoginApiResponse
import com.example.hype.base.network.response.Result

interface RegistrationRepository {

    suspend fun callLoginApi(userName: String, password: String): Result<LoginApiResponse>

}