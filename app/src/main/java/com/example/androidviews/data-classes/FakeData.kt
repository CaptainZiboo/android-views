val seriesList = mutableListOf<Series>()

for (i in 1..10) {
    seriesList.add(
        Series(
            story = "Histoire de la série $i",
            episodes = List(10) { Episode("", "Épisode $it", it, "Date de l'épisode $it") },
            characters = List(5) { Character("Personnage $it", "") },
            date = "Date de la série $i",
            pictureUrl = "",
            producer = "Studio de la série $i",
            title = "Série $i"
        )
    )
}

val seriesListObject = SeriesList(seriesList)