import Show
import Character
import Episode

fun createSeriesList(): MutableList<Show> {
    val seriesList = mutableListOf<Show>()

    for (i in 1..10) {
        val episodes = mutableListOf<Episode>()
        for (j in 1..10) {
            episodes.add(Episode("Episode $j", "Episode $j", j, "Date of Episode $j"))
        }

        val characters = mutableListOf<Character>()
        for (k in 1..5) {
            characters.add(Character("Character $k", "Character $k"))
        }

        seriesList.add(
            Show(
                story = "Story of Show $i",
                episodes = episodes,
                characters = characters,
                year = 2022 - i, // Adjusting the year for demo purposes
                pictureUrl = "https://example.com/show$i.jpg", // Placeholder URL
                producer = "Producer of Show $i",
                title = "Show $i"
            )
        )
    }

    return seriesList
}