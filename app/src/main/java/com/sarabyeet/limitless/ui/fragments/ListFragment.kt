package com.sarabyeet.limitless.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.sarabyeet.limitless.adapter.AppTileAdapter
import com.sarabyeet.limitless.R
import com.sarabyeet.limitless.model.AppTile
import com.sarabyeet.limitless.model.AppTileInterface
import com.sarabyeet.limitless.ui.BaseMainActivityFragment
import com.sarabyeet.limitless.util.SharedPrefUtil


class ListFragment: BaseMainActivityFragment(R.layout.fragment_list), AppTileInterface {

    private lateinit var appTileAdapter: AppTileAdapter
    private val appTileList: List<AppTile>
        get() = mainActivity.appTileList

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //(mainActivity).supportActionBar?.title = "StarWars DataBank"

        appTileAdapter = AppTileAdapter(appTileList, this)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = appTileAdapter
    }
    override fun onResume() {
        super.onResume()
        appTileAdapter.notifyDataSetChanged()
    }
    override fun onLearnMoreButtonClick(position: Int) {
        val characterId = appTileList[position].id
        findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(characterId = characterId))
    }


    override fun onFavoriteClick(position: Int) {
        val appTile = appTileList[position]
        appTile.isFavorite = !appTile.isFavorite

        SharedPrefUtil.setAppTileFavorite(appTile.id, appTile.isFavorite)
        appTileAdapter.notifyItemChanged(position)
    }
}