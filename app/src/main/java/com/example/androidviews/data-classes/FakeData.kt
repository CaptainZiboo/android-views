import Show
import Character
import Episode

fun createSeriesList(): MutableList<Show> {
    val seriesList = mutableListOf<Show>()

    for (i in 1..10) {
        seriesList.add(
            Show(
                story = "Histoire de la série $i",
                episodes = List(10) { Episode("", "Épisode $it", it, "Date de l'épisode $it") },
                characters = List(5) { Character("Personnage $it", "") },
                year = i,
                pictureUrl = "",
                producer = "Studio de la série $i",
                title = "Série $i"
            )
        )
    }

    return seriesList
}

val seriesListObject = createSeriesList()