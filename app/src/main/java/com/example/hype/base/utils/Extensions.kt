package com.example.hype.base.utils

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.hype.base.di.factory.ViewModelProviderFactory

// Initializing ViewModels for Activity
inline fun <reified T : ViewModel> AppCompatActivity.getViewModelForActivity(factory: ViewModelProviderFactory): T =
    ViewModelProviders.of(this, factory).get(T::class.java)

// Initializing ViewModels for Fragments
inline fun <reified T : ViewModel> Fragment.getViewModelForFragment(factory: ViewModelProviderFactory): T =
    ViewModelProviders.of(this, factory).get(T::class.java)

// Initializing ViewModels for FragmentActivity
inline fun <reified T : ViewModel> Fragment.getViewModelByActivity(factory: ViewModelProviderFactory): T =
    activity?.let {
        ViewModelProviders.of(it, factory).get(T::class.java)
    } ?: getViewModelForFragment(factory)


fun View.onClick(listener: NoArgumentListener) {
    setOnClickListener {
        listener.invoke()
    }
}