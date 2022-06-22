package com.sarabyeet.limitless.util

import android.content.Context
import android.content.SharedPreferences
import com.sarabyeet.limitless.BuildConfig

object SharedPrefUtil {

    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(
            "${BuildConfig.APPLICATION_ID}.shared_preferences", Context.MODE_PRIVATE)
    }

    private fun setBoolean(name: String, value: Boolean) {
        sharedPreferences.edit().putBoolean(name, value).apply()
    }

    private fun getBoolean(name: String, defaultBoolean: Boolean = false): Boolean {
        return sharedPreferences.getBoolean(name, defaultBoolean)
    }

    fun setAppTileFavorite(id: String, value: Boolean) {
        setBoolean(id, value)
    }

    fun getAppTileBoolean(id: String): Boolean {
        return getBoolean(id)
    }
}