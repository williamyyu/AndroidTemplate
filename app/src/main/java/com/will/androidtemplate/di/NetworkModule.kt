package com.will.androidtemplate.di

import com.will.tmdbsdk.TmdbService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

/**
 * @author WeiYi Yu
 * @date 2020-11-11
 */

@InstallIn(ApplicationComponent::class)
@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideTmdbService(): TmdbService {
        return TmdbService.create()
    }
}