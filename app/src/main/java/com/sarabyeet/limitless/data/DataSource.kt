package com.sarabyeet.limitless.data

import com.sarabyeet.limitless.model.AppTile
import com.sarabyeet.limitless.R
import com.sarabyeet.limitless.util.SharedPrefUtil

class DataSource {
    fun loadCharacters(): List<AppTile> {
        return listOf(
            AppTile(
                id = "yoda",
                title = "Master Yoda",
                description = "Yoda was a legendary Jedi Master",
                "Stronger than most in his connection with the Force. Small in size but wise and powerful, he trained Jedi for over 800 years.",
                imageResourceId = R.drawable.yoda,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218589-4-yoda-6a430ef2-4be5-43d5-8614-e743ca7b2f69.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/yoda",
                isFavorite = SharedPrefUtil.getAppTileBoolean("yoda")
            ),
            AppTile(
                id = "han_solo",
                title = "Han Solo",
                description = "Smuggler. Scoundrel. Hero. Han Solo, captain of the Millennium Falcon",
                "was one of the great leaders of the Rebel Alliance. He and his co-pilot Chewbacca came to believe in the cause of galactic freedom, joining Luke Skywalker and Princess Leia Organa in the fight against the Empire.",
                imageResourceId = R.drawable.han_solo,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218584-1-han-f4c9a887-81df-4c58-b166-94ab4485286b.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/han-solo",
                isFavorite = SharedPrefUtil.getAppTileBoolean("han_solo")
            ),
            AppTile(
                id = "luke_skywalker",
                title = "Luke Skywalker",
                description = "a Tatooine farmboy",
                "Rose from humble beginnings to become one of the greatest Jedi the galaxy has ever known.",
                imageResourceId = R.drawable.luke_skywalker,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218592-6-luke-cd70ba0f-828e-4231-9c8d-f8d6ab92a07b.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/luke-skywalker",
                isFavorite = SharedPrefUtil.getAppTileBoolean("luke_skywalker")
            ),
            AppTile(
                id = "obi_wan",
                title = "Obi-Wan Kenobi",
                description = "A legendary Jedi Master.",
                "Obi-Wan Kenobi was a noble man and gifted in the ways of the Force. He trained Anakin Skywalker, served as a general in the Republic Army during the Clone Wars, and guided Luke Skywalker as a mentor.",
                imageResourceId = R.drawable.obi_kenobi,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/obi-kenobi.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/obi-wan-kenobi",
                isFavorite = SharedPrefUtil.getAppTileBoolean("obi_wan")
            ),
            AppTile(
                id = "mace_windu",
                title = "Mace Windu",
                description = "A grim Jedi Master with an amethyst-bladed lightsaber.",
                "Mace Windu was the champion of the Jedi Order, with little tolerance for the failings of the Senate, the arguments of politicians, or the opinions of rebellious Jedi.",
                imageResourceId = R.drawable.windu,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218612-16-Windu-2.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/mace-windu",
                isFavorite = SharedPrefUtil.getAppTileBoolean("mace_windu")
            ),
            AppTile(
                id = "general_grievous",
                title = "General Grievous",
                description = "A brilliant Separatist military strategist and a feared Jedi hunter.",
                "known for his ruthlessness and hacking cough. His body itself was a weapon, allowing him lightning quick strikes and devastating blows.",
                imageResourceId = R.drawable.general,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218646-21-general-grievous-225c2125-ffc7-45ba-8dbb-2338853df6ca.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/general-grievous",
                isFavorite = SharedPrefUtil.getAppTileBoolean("general_grievous")
            ),
            AppTile(
                id = "darth_vader",
                title = "Darth Vader",
                description = "Seduced by the dark side of the Force, became a Sith Lord.",
                "Discovered as a slave on Tatooine by Qui-Gon Jinn and Obi-Wan Kenobi, Anakin Skywalker had the potential to become one of the most powerful Jedi ever, and was believed by some to be the prophesied Chosen One who would bring balance to the Force.",
                imageResourceId = R.drawable.vader,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218586-2-vader-f6cdf838-912c-4bfa-8a12-f43521fbd99c.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/darth-vader",
                isFavorite = SharedPrefUtil.getAppTileBoolean("darth_vader")
            ),
            AppTile(
                id = "grogu",
                title = "Grogu",
                description = "Baby Yoda or Grogu is mysterious child pursued by bounty hunters on behalf of Imperial interests.",
                "the foundling Grogu found protection with the Mandalorian Din Djarin. Through their adventures and journeys through the galaxy, young Grogu is honing remarkable abilities.",
                imageResourceId = R.drawable.grogu,
                imageResourceUrl = "https://static.wikia.nocookie.net/shaniverse/images/7/7f/Grogu.jpg/revision/latest/scale-to-width-down/1000?cb=20201222173404",
                characterUrl = "https://www.starwars.com/databank/grogu",
                isFavorite = SharedPrefUtil.getAppTileBoolean("grogu")
            ),
            AppTile(
                id = "boba_fett",
                title = "Boba Fett",
                description = "Boba Fett was once regarded as one of the most fearsome and capable bounty hunters in the galaxy.",
                "An unaltered genetic clone of his father, bounty hunter Jango Fett, Boba learned combat and martial skills from a young age. Over the course of his career, which included contracts for the Empire and the criminal underworld, he became a legend. Although Fett seemingly met his demise in the Sarlacc pit on Tatooine after falling into the Great Pit of Carkoon, Boba survived the beast and lived to reclaim his armor, taking over the throne at Jabba's Palace.",
                imageResourceId = R.drawable.boba,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218587-3-boba-fett-9dce897b-f605-4fae-9de7-dfbf95ab1a2d.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/boba-fett",
                isFavorite = SharedPrefUtil.getAppTileBoolean("boba_fett")
            ),
            AppTile(
                id = "princess_leia",
                title = "Princess Leia",
                description = "Princess Leia Organa was one of the greatest leaders of the Rebel Alliance.",
                "Daughter of Padmé Amidala and Anakin Skywalker, sister of Luke Skywalker, and with a soft spot for scoundrels, Leia ranked among the galaxy’s great heroes. But life under the New Republic proved difficult for her. Sidelined by a new generation of political leaders, she struck out on her own to oppose the First Order as founder of the Resistance. These setbacks in her political career were accompanied by more personal losses, which she endured with her seemingly inexhaustible will.",
                imageResourceId = R.drawable.leia,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218591-5-leia-a09cab78-e7a1-4be4-b437-99a1d7d4d280.jpg?w=800",
                characterUrl = "https://www.starwars.com/databank/leia-organa",
                isFavorite = SharedPrefUtil.getAppTileBoolean("princess_leia")
            ),
            AppTile(
                id = "r2_d2",
                title = "R2-D2",
                description = "A reliable and versatile astromech droid, R2-D2 has served Padmé Amidala, Anakin Skywalker, and Luke Skywalker.",
                " showing great bravery in rescuing his masters and their friends from many perils. A skilled starship mechanic and fighter pilot's assistant, he has an unlikely but enduring friendship with the fussy protocol droid C-3PO.",
                imageResourceId = R.drawable.r2d2,
                imageResourceUrl = "https://cdn11.bigcommerce.com/s-5ylnei6or5/images/stencil/1280x1280/products/587/695/0116_R2_D2_28__28082.1514653978.jpg?c=2",
                characterUrl = "https://www.starwars.com/databank/r2-d2",
                isFavorite = SharedPrefUtil.getAppTileBoolean("r2_d2")
            ),
            AppTile(
                id = "bb_8",
                title = "BB-8",
                description = "The rolling droid who accompanies the human adventurers of The Force Awakens manages to make metal seem cuddly.",
                "When Poe’s mission to Jakku ended with his capture by the First Order, BB-8 fled into the desert with a vital clue to the location of Luke Skywalker. He rejoined Poe in time for the attack on Starkiller Base, then helped Rey locate Skywalker’s planet of exile. As the Resistance rebuilt its forces after the Battle of Crait, BB-8 helped both Poe and Rey.",
                imageResourceId = R.drawable.bb8,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/bb8.jpg?w=432",
                characterUrl = "https://www.starwars.com/databank/bb-8",
                isFavorite = SharedPrefUtil.getAppTileBoolean("bb_8")
            ),
            AppTile(
                id = "darth_maul",
                title = "Darth Maul",
                description = "A deadly, agile Sith Lord trained by the evil Darth Sidious, Darth Maul was a formidable warrior and scheming mastermind.",
                "He wielded an intimidating double-bladed lightsaber and fought with a menacing ferocity. Though he fell in battle against Obi-Wan Kenobi, the Zabrak from Dathomir would prove to be much harder to destroy than originally believed.",
                imageResourceId = R.drawable.maul,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218597-10-darth-maul-f7404aae-41a5-46bf-8422-6cedebde95d8.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/darth-maul",
                isFavorite = SharedPrefUtil.getAppTileBoolean("darth_maul")
            ),
            AppTile(
                id = "c_3po",
                title = "C-3PO",
                description = "C-3PO longs for more peaceful times, but his continued service to the Resistance and his knowledge of more than seven million forms of communication.",
                "Programmed for etiquette and protocol, Threepio was built by a young Anakin Skywalker, and has been a constant companion to astromech R2-D2. Over the years, he was involved in some of the galaxy’s most defining moments and thrilling battles.",
                imageResourceId = R.drawable.c3po,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218599-11-C-3PO.jpg?w=1024",
                characterUrl = "https://www.starwars.com/databank/c-3po",
                isFavorite = SharedPrefUtil.getAppTileBoolean("c_3po")
            ),
            AppTile(
                id = "qui_gon_jinn",
                title = "Qui-Gon Jinn",
                description = "A venerable if maverick Jedi Master, Qui-Gon Jinn was a student of the living Force." ,
                "Qui-Gon lived for the moment, espousing a philosophy of \"feel, don't think -- use your instincts.\" On Tatooine, Qui-Gon discovered a young slave boy named Anakin Skywalker who was strong in the Force. Sensing the boy's potential, Qui-Gon liberated Anakin from slavery. The Jedi Master presented Anakin to the Jedi Council, but they deemed the boy too old to begin training and dangerously full of fear and anger. They refused to allow Qui-Gon to train Anakin, but rescinded their decision to fulfill Qui-Gon's dying wish.",
                imageResourceId = R.drawable.qui,
                imageResourceUrl = "https://www.rollingstone.com/wp-content/uploads/2015/12/rs-218643-20-jinn-0a7fb237-3cff-45bc-b27e-e26accc8f921.jpg?w=943",
                characterUrl = "https://www.starwars.com/databank/qui-gon-jinn",
                isFavorite = SharedPrefUtil.getAppTileBoolean("qui_gon_jinn")
            ),
        )
    }
}