package com.sarabyeet.limitless.model

import java.io.Serializable

data class AppTile(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val descriptionLong: String = "",
    val buttonText: String = "",
    val imageResourceId: Int = 0,
    val imageResourceUrl: String? = null,
    val characterUrl: String = "",
    var isFavorite: Boolean = false
    )




//anakin
//https://lumiere-a.akamaihd.net/v1/images/Anakin-Skywalker_d3330724.jpeg?region=0%2C0%2C1200%2C675&width=768

//Yoda
// https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218589-4-yoda-6a430ef2-4be5-43d5-8614-e743ca7b2f69.jpg?w=1024

// han solo
//https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218584-1-han-f4c9a887-81df-4c58-b166-94ab4485286b.jpg?w=1024

//Luke
//https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218592-6-luke-cd70ba0f-828e-4231-9c8d-f8d6ab92a07b.jpg?w=1024

//Obiwan
//https://www.rollingstone.com/wp-content/uploads/2015/12/obi-kenobi.jpg?w=1024

// windu
// https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218612-16-Windu-2.jpg?w=1024

//general
//https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218646-21-general-grievous-225c2125-ffc7-45ba-8dbb-2338853df6ca.jpg?w=1024

//Vader
//https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218586-2-vader-f6cdf838-912c-4bfa-8a12-f43521fbd99c.jpg?w=1024