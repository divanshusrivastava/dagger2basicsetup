package com.example.hype.app.registration.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hype.R
import com.example.hype.app.registration.viewmodel.RegistrationViewModel
import com.example.hype.base.di.factory.ViewModelProviderFactory
import com.example.hype.base.utils.SCREEN_NAME_LOGIN_FRAGMENT
import com.example.hype.base.utils.initViewModelByActivity
import com.example.hype.base.utils.onClick
import com.example.hype.base.view.fragment.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*
import javax.inject.Inject

class LoginFragment : BaseFragment() {

    override fun getScreenName(): String? = SCREEN_NAME_LOGIN_FRAGMENT

    override fun hostActivityName(): String? = activity?.javaClass?.simpleName

    companion object {
        fun newInstance() = LoginFragment()
    }

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    private var mRegistrationViewModel: RegistrationViewModel? = null

    private val userName: String
        get() = et_login_user_name.text.toString()
    private val password: String
        get() = et_login_user_name.text.toString()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_login, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
        initClickListener()
        initLiveDataObservers()
    }

    private fun initViewModel() {
        mRegistrationViewModel = initViewModelByActivity(viewModelProviderFactory)
    }

    private fun initClickListener() {
        btn_login.onClick {
            if (validate()) {
                mRegistrationViewModel?.callLoginApi(userName, password)
            }
        }
    }

    private fun validate(): Boolean {
        return if (et_login_user_name.text.isNullOrBlank()) {
            true
        } else {
            false
        }
    }

    private fun initLiveDataObservers() {

    }


}