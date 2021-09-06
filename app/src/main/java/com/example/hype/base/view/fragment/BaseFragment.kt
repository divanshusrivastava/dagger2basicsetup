package com.example.hype.base.view.fragment

import android.os.Bundle
import dagger.android.support.DaggerFragment
import timber.log.Timber

abstract class BaseFragment : DaggerFragment() {

    abstract fun getScreenName(): String?

    abstract fun hostActivityName(): String?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Timber.i("%1s onCreate -- Host Activity: %2s", getScreenName(), hostActivityName())
    }

}