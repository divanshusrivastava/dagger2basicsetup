package com.example.hype.app.registration.view.activity

import android.os.Bundle
import com.example.hype.R
import com.example.hype.app.registration.view.fragment.LoginFragment
import com.example.hype.base.utils.SCREEN_NAME_REGISTRATION_ACTIVITY
import com.example.hype.base.utils.TAG_LOGIN_FRAGMENT
import com.example.hype.base.view.activity.BaseActivity

class RegistrationActivity : BaseActivity() {

    override fun getScreenName(): String? = SCREEN_NAME_REGISTRATION_ACTIVITY

    override fun getLayoutId(): Int = R.layout.activity_registration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        initFragments(savedInstanceState)
    }

    private fun initFragments(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(
                R.id.fl_fragment_container, LoginFragment.newInstance(),
                TAG_LOGIN_FRAGMENT
            ).commit()
        }
    }
}
