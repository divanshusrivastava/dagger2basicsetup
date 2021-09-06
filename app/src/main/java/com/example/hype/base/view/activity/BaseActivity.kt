package com.example.hype.base.view.activity

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import timber.log.Timber

abstract class BaseActivity : DaggerAppCompatActivity() {

    abstract fun getScreenName(): String?

    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        Timber.i("%s onCreate -- TASK ID: $taskId", getScreenName())
    }

}