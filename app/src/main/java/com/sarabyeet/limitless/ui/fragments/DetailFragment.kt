package com.sarabyeet.limitless.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.sarabyeet.limitless.R
import com.sarabyeet.limitless.model.AppTile
import com.sarabyeet.limitless.ui.BaseMainActivityFragment
import com.sarabyeet.limitless.util.SharedPrefUtil
import com.squareup.picasso.Picasso

class DetailFragment: BaseMainActivityFragment(R.layout.fragment_detail) {

    private lateinit var appTile: AppTile

    private val appTileList: List<AppTile>
        get() = mainActivity.appTileList

    private val passedId: DetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val appTileId = passedId.characterId

        appTile = appTileList.find {
            it.id == appTileId
        }?: AppTile(title = "Whoops..",
            description = "Something went wrong - Please try again!")


        val headerImage: ImageView = view.findViewById(R.id.headerImageView)
        val title: TextView = view.findViewById(R.id.titleTextView)
        val description: TextView = view.findViewById(R.id.descriptionTextView)
        val descriptionLong: TextView = view.findViewById(R.id.descriptionLongTextView)


       // headerImage.setImageResource(appTile.imageResourceId)
        title.text = appTile.title
        description.text = appTile.description
        descriptionLong.text = appTile.descriptionLong

        Picasso.get().isLoggingEnabled = true
        Picasso.get()
            .load(appTile.imageResourceUrl)
            .placeholder(R.drawable.ic_download_24)
            .error(R.drawable.ic_baseline_error_24)
            .into(headerImage)

        setHasOptionsMenu(true)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.menuItemLink -> {

                /** Implicit Intent, which is handled
                 * (maintaining backstack and opening required app) by Android system */
                val openLinkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(appTile.characterUrl))
                startActivity(openLinkIntent)
                true
            }
            R.id.menuItemFavorite -> {
                val isCurrentlyFavorite = appTile.isFavorite

                if (isCurrentlyFavorite){
                    item.setIcon(R.drawable.ic_favorite_border_24)
                } else {
                    item.setIcon(R.drawable.ic_favorite_24)
                }
                /** When the icon is clicked the state is reversed, i.e If the item was our
                 * favorite, we will un-favorite it */
                appTile.isFavorite = !isCurrentlyFavorite
                SharedPrefUtil.setAppTileFavorite(appTile.id, appTile.isFavorite)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_app_tile_link, menu)

        if(appTile.isFavorite) {
            menu.findItem(R.id.menuItemFavorite)?.setIcon(R.drawable.ic_favorite_24)
        }
    }



}

