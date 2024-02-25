import Show
import Character
import Episode
import java.util.Date

fun createSeriesList(): MutableList<Show> {
    val seriesList = mutableListOf<Show>()
//
//    for (i in 1..10) {
//        val episodes = mutableListOf<Episode>()
//        for (j in 1..10) {
//            episodes.add(Episode("Episode $j", "Episode $j", j, Date(2013,10,1)))
//        }
//
//        val characters = mutableListOf<Character>()
//        for (k in 1..5) {
//            characters.add(Character("Character $k", "Character $k"))
//        }
//
//        seriesList.add(
//            Show(
//                story = "Story of Show $i",
//                episodes = episodes,
//                characters = characters,
//                year = 2022 - i, // Adjusting the year for demo purposes
//                pictureUrl = "https://example.com/show$i.jpg", // Placeholder URL
//                producer = "Producer of Show $i",
//                title = "Show $i"
//            )
//        )
//    }

    seriesList.add(SHIELDData)
    return seriesList
}


val SHIELDData = Show(
    story = "The missions of the Strategic Homeland Intervention, Enforcement and Logistics Division. A small team of operatives led by Agent Coulson (Clark Gregg) who must deal with the strange new world of \"superheroes\" after the \"Battle of New York\", protecting the public from new and unknown threats.",
    episodes = mutableListOf<Episode>(
        Episode("https://comicvine.gamespot.com/agents-of-shield-101-pilot/4070-1/", "Pilot", 1, Date(2013,9,24)),
        Episode("https://comicvine.gamespot.com/agents-of-shield-102-0-8-4/4070-2/", "0-8-4", 2, Date(2013,10,1)),
        Episode("https://comicvine.gamespot.com/agents-of-shield-103-the-asset/4070-3/o", "The Asset", 3, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-104-eye-spy/4070-3251/", "Eye Spy", 4, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-105-girl-in-the-flower-dress/4070-3547/", "Girl in the Flower Dress", 5, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-106-f-z-z-t/4070-4072/", "F.Z.Z.T", 6, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-107-the-hub/4070-4297/", "The Hub", 7, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-108-the-well/4070-4320/", "The Well", 8, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-109-repairs/4070-4622/", "Repairs", 9, Date(2013,10,8)),
        Episode("https://comicvine.gamespot.com/agents-of-s-h-i-e-l-d-110-the-bridge/4070-4629/", "The Bridge", 10, Date(2013,10,8)),
    ),
    characters = mutableListOf<Character>(
        Character("Jemma Simmons", "https://comicvine.gamespot.com/a/uploads/scale_small/7/79073/4998056-jemma%20simmons%20%28earth-616%29%20002.jpg"),
        Character("Quake", "https://comicvine.gamespot.com/a/uploads/scale_small/3/31666/4629368-quake2015001-cov-0aca1.jpg"),
        Character( "Melinda May", "https://comicvine.gamespot.com/a/uploads/scale_small/0/3848/4629523-cavalry2015001-cov-9fefd.jpg"),
        Character( "Phil Coulson", "https://comicvine.gamespot.com/a/uploads/scale_small/10/100647/3711822-sonofcoul.jpg"),
        Character( "Leo Fitz", "https://comicvine.gamespot.com/a/uploads/scale_small/1/15776/9138117-leofitz.jpg"),
        Character( "Al MacKenzie", "https://comicvine.gamespot.com/a/uploads/scale_small/11111/111115288/5716178-9513828408-almac.jpg"),
        Character( "SlingShot", "https://comicvine.gamespot.com/a/uploads/scale_small/3/35127/1534444-yoyo.jpg"),
        Character( "Grant Ward", "https://comicvine.gamespot.com/a/uploads/scale_small/7/79073/6046066-grant%20ward%20%28earth-616%29%20001.jpg"),
        Character( "Lance Hunter", "https://comicvine.gamespot.com/a/uploads/scale_small/11129/111293013/6913775-lancelot_hunter_%2528earth-22110%2529.jpg"),
        Character( "Mockingbird", "https://comicvine.gamespot.com/a/uploads/scale_small/3/31666/4956373-mockingbird2015001-35c9d.jpg")
    ),
    year = 2013,
    pictureUrl = "https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6238345-3060875932-35677.jpg",
    producer = "Marvel",
    title = "Agents of SHIELD"
)