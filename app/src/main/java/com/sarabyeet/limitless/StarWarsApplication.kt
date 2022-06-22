package com.sarabyeet.limitless

import android.app.Application
import com.sarabyeet.limitless.util.SharedPrefUtil

class StarWarsApplication: Application() {
    /** Application is the top level class, Hence our data will stay in the scope of application itself */
    companion object{
        //lateinit var appTileList: List<AppTile>
    }

    override fun onCreate() {
        super.onCreate()
        //appTileList = DataSource().loadCharacters()
        SharedPrefUtil.init(this)
    }
}