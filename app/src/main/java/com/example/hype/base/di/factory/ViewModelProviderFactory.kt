package com.example.hype.base.di.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.hype.base.di.scope.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider

@ApplicationScope
@Suppress("UNCHECKED_CAST")
class ViewModelProviderFactory @Inject constructor(
    private val viewModelsMap: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val creator = viewModelsMap[modelClass] ?: viewModelsMap.asIterable().firstOrNull {
            modelClass.isAssignableFrom(it.key)
        }?.value ?: throw IllegalAccessException("unknown model class $modelClass")
        return try {
            creator.get() as T
        } catch (e: Exception) {
            throw java.lang.RuntimeException(e)
        }
    }
}
