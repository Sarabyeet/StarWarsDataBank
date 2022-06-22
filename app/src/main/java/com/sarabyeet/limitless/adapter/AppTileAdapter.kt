package com.sarabyeet.limitless.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sarabyeet.limitless.R
import com.sarabyeet.limitless.model.AppTile
import com.sarabyeet.limitless.model.AppTileInterface
import com.squareup.picasso.Picasso

class AppTileAdapter(
    private val data: List<AppTile>,
    private val appTileInterface: AppTileInterface
    ): RecyclerView.Adapter<AppTileAdapter.AppTileViewHolder>() {

    inner class AppTileViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.view_holder_app_tile, parent, false)
    ) {
            private val image: ImageView = itemView.findViewById(R.id.headerImageView)
            private val title: TextView = itemView.findViewById(R.id.titleTextView)
            private val description:TextView = itemView.findViewById(R.id.descriptionTextView)
            private val button: Button = itemView.findViewById(R.id.learnMoreButton)
            private val favoriteIconImageView: ImageView = itemView.findViewById(R.id.favoriteIcon)

        fun onBind(appTile: AppTile, appTileInterface: AppTileInterface){
            image.setImageResource(appTile.imageResourceId)
            //Picasso.get().load(appTile.imageResourceUrl).into(image)
            title.text = appTile.title
            description.text = appTile.description
            button.setOnClickListener {
                appTileInterface.onLearnMoreButtonClick(adapterPosition)
            }
            val icon = if (appTile.isFavorite) R.drawable.ic_favorite_24 else R.drawable.ic_favorite_border_24
            favoriteIconImageView.setImageResource(icon)
            favoriteIconImageView.setOnClickListener {
                appTileInterface.onFavoriteClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppTileViewHolder {
        return AppTileViewHolder(parent)
    }

    override fun onBindViewHolder(holder: AppTileViewHolder, position: Int) {
        holder.onBind(appTile = data[position], appTileInterface = appTileInterface)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}