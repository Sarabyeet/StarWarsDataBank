package com.sarabyeet.limitless.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.sarabyeet.limitless.R
import com.sarabyeet.limitless.data.DataSource
import com.sarabyeet.limitless.model.AppTile
import com.sarabyeet.limitless.ui.fragments.ListFragment

class MainActivity : AppCompatActivity() {

    lateinit var appTileList: List<AppTile>

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment_container_view) as NavHostFragment
        navController = navHostFragment.navController

        appTileList = DataSource().loadCharacters()

        setupActionBarWithNavController(navController)

        //appTileAdapter.notifyDataSetChanged()

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || return super.onSupportNavigateUp()
    }

//    override fun onFavoriteClick(position: Int) {
//       val appTile = appTileList[position]
//        appTile.isFavorite = !appTile.isFavorite
//        //appTileAdapter.notifyItemChanged(position)
//    }


}