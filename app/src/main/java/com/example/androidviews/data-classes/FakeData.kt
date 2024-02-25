import Show
import Character
import Episode
import java.util.Date

fun createSeriesList(): MutableList<Show> {
    val seriesList = mutableListOf<Show>(
        Show(
            story = "From Warner Bros. Animation, these teen titans are on the go! Right after they make a sandwich or play some video games. Wait, there's laundry to do? (\"Not it!\") After that, they'll definitely go fight some crime. Maybe. Don't miss the return of Robin, Starfire, Raven, Beast Boy and Cyborg — teen super heroes who are totally unsupervised!"
            episodes = mutableListOf<Episode>(
                Episode("", "Sweet Revenge", 739, Date(2022, 5, 24)),
                Episode("", "Porch Pirates", 740, Date(2022, 5, 25)),
                Episode("", "A Sticky Situation", 741, Date(2022, 5, 26)),
                Episode("", "The Perfect Pitch?", 742, Date(2022, 5, 27)),
                Episode("", "Pool Season", 743, Date(2022, 8, 1)),
                Episode("", "Kyle", 744, Date(2022, 8, 2)),
                Episode("", "TV Knight 7", 745, Date(2022, 8, 3)),
                Episode("", "We'll Be Right Back", 746, Date(2022, 8, 4)),
                Episode("", "Jump City Rock", 747, Date(2022, 9, 12)),
                Episode("", "Natural Gas", 748,  Date(2022, 9, 13)),
                Episode("", "50% Chad", 749, Date(2022, 9, 14)),
                Episode("", "The Score", 750, Date(2022, 9, 15)),
                Episode("", "365!", 751, Date(2022, 9, 16)),
                Episode("", "Welcome To Halloween", 752, Date(2022, 10, 7)),
                Episode("", "The Great Holiday Escape", 753, Date(2022, 9, 12)),
                Episode("", "The Great Disaster", 754, Date(2023, 2, 6)),
            ),
            characters = mutableListOf<Character>(
                Character("Beast Boy", "https://comicvine.gamespot.com/a/uploads/square_small/11161/111612243/8912349-1325762190-FuFtnhWWYAUk1ub.jpg"),
                Character("Starfire", "https://comicvine.gamespot.com/a/uploads/square_small/11161/111612243/8912348-9748240835-FuFtla2WAAIPrPd.jpg"),
                Character("Raven", "https://comicvine.gamespot.com/a/uploads/square_small/11161/111612243/8912347-2482635404-FuFtmKgWwAYg0kY.jpg"),
                Character("Dick Grayson", "https://comicvine.gamespot.com/a/uploads/square_small/11138/111381541/8988436-nightwing-106-open-to-order-variant-mora-675x1024.jpg"),
                Character("Cyborg", "https://comicvine.gamespot.com/a/uploads/square_small/11142/111427220/8796970-cyborgnewlook.jpeg"),
                Character("Starfish", "https://comicvine.gamespot.com/a/uploads/square_small/13/135098/7102208-starfish.jpg"),
                Character("Silkie", "https://comicvine.gamespot.com/a/uploads/square_small/13/135098/7110278-0039695833-250px.png"),
                Character("Batman", "https://comicvine.gamespot.com/a/uploads/square_small/11144/111442876/8759934-jrjrhr.jpg"),
                Character("Jinx", "https://comicvine.gamespot.com/a/uploads/square_small/11161/111612243/9182475-jinx4.jpg"),
                Character("Mammoth", "https://comicvine.gamespot.com/a/uploads/square_small/3/31666/900351-mammoth_2.jpg"),
                Character("Gizmo", "https://comicvine.gamespot.com/a/uploads/square_small/6/62795/5722713-gizmo.jpg"),
                Character("Sticky Joe", "https://comicvine.gamespot.com/a/uploads/square_small/13/135098/7110446-sticky-joe2.jpg"),
                Character("Billy Numerous", "https://comicvine.gamespot.com/a/uploads/square_small/1/18154/9187368-6470037081-latest.jpg"),
                Character("Pelican", "https://comicvine.gamespot.com/a/uploads/square_small/13/135098/7099830-0975028992-Pelican.png%20"),
                Character("Octopus", "https://comicvine.gamespot.com/a/uploads/square_small/13/135098/7099857-9478316673-Octopus.png%20"),
            ),
            year = 2013,
            pictureUrl = "https://comicvine.gamespot.com/a/uploads/scale_medium/6/67663/6736344-0825472122-LYeMs1of-CwWuLb1ZgwWwiaH7tH3on7X5gRYfK3Yn49NPz8o9-0GvPmLR73SZEwmy0bz%3Ds2000",
            producer = "DC Comics",
            title = "Teen Titans Go!"
        ),

        Show(
            story = "Ultimate Spider-Man is an animated television series based on the superhero Spider-Man and is loosely based of the comic series.",
            episodes = mutableListOf<Episode>(
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608283-2778665908-cS4sVgLZtZbineV6gctp5caRXtKpC1yYftH9QM3KzQZ9EStkED8v97cwylrR_8OFvZQ%3Dw6000", "The New Sinister 6: Part 1", 410, Date(2016,6,12)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608284-2136064028-QNTjAzwcA79wqlg0bFuEVPDBOn0abIozRWFK7G4cw55oxSfKfPaJLnHLxOMYf8cWeFGe%3Dw6000", "The New Sinister 6: Part 2", 411, Date(2016,6,19)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608285-3436113469-gJ_L8qwreFXFxfGLSUt5VzdI2foSCu9U10vdu3O_CJES6pRoDA__b5uGQT1sUksUCLs0%3Dw6000", "Agent Web", 412, Date(2016,6,26)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608286-9349321347-NRlcb_ph14EWjeSBKjx21L34lx0oOs_uuyLPLEQ3H2ya8QOueyPbAiL_7U9W_qilBNkf-Q%3Dw6000", "The Symbiote Saga: Part 1", 413, Date(2016,7,3)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608287-9560716440-CXRq5BJmdHvn4hiwC0YMBbOj151eXw6kwHMLcfJxI4902V5t2XZu4OthEdGpBbxhiozZ%3Dw6000", "The Symbiote Saga: Part 2", 414, Date(2016,7,10)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608288-7129455449-MS-4G-WJFtANngXn8yRzUp8KOyOzVWHmUQ2NfbYJbtk0mpB27RXO3AC5yOThzAMDkOKa%3Dw6000", "The Symbiote Saga: Part 3", 415, Date(2016,7,17)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608289-3585740886-0ct2WcSiTNNs-swbRWAQyqbT-3QMFEsmeQEyv5jbB3gFnxdJ3Obw4EhfLhfxdTbloNxh%3Dw6000", "Return to the Spider-Verse: Part 1", 416, Date(2016,8,27)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608290-6269338274-kaFc8_v3e6Z8BgAfDTg2ukwYGGCvqt-tmgMYTOQ5mgSgZZoqdxCvR3PqYf7FLuK9Kq_wkg%3Dw6000", "Return to the Spider-Verse: Part 2", 417, Date(2016,9,3)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608291-0196782086-XAkBZJZaJQIHu5u-2gvd3LJb9Q-dErG8n0FGTVDkE_YE2xwD8N0qdAB5CloZnpDe6WS6%3Dw6000", "Return to the Spider-Verse: Part 3", 418, Date(2016,9,10)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608292-8683548411-Oa_XX9v2imajV9-sKwPoUEHYoeUNQiY4Y0L7NcfLEvXxlqCakzre8y0j98FgX8Pu0bUN%3Dw6000", "Return to the Spider-Verse: Part 4", 419, Date(2016,9,17)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608299-9317748161-JCA-ZV-T9Fd7-ZoGSkLmEjtd7diO-f3JmpC8w8smG8sONFO-_ZDLrzlQvD4bo1NvWOAi%3Dw6000", "Strange Little Halloween", 420, Date(2016,10,1)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608300-9045748521-EdgJLrNnYHK9kkB2G3f24skWaIjQEUTUAzLI44pxglFzuTAcWWAoW7J8oP7e62HOenvJaQ%3Dw6000", "The Spider Slayers: Part 1", 421, Date(2016,10,8)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608301-0942016674-SwUuiib2YmHl2m57d0Acki5e9WHq6uUWbJDBFjG5TIVG7DBvUbO52vRze_D0260ww1w9%3Dw6000", "The Spider Slayers: Part 2", 422, Date(2016,10,15)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608302-3674211256-bGMzZrgKfHGdEkDRRAIEHDglNoYSnRgwQaqo6DWgJPSXElENf0XRbnO6bDpTjaruQE6D%3Dw6000", "The Spider Slayers: Part 3", 423, Date(2016,10,22))
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608303-5924560274-Xf8RFejSLxFNYkMS_PRa9KayLxCPbJ9av-C_OZne9pnBexWrCBk4FVgIQqcqVUnuXxhdaw%3Dw6000", "The Moon Knight Before Christmas", 424, Date(2016,10,29)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608304-4693518421-3t_R0RWT4CP7OsrciDwWyJvHqwj0LV2_K4ZUwcFjO1OC3Numg9mC7m6cuG5x0fEEW_fu%3Dw6000", "Graduation Day: Part 1", 425, Date(2017,1,7)),
                Episode("https://comicvine.gamespot.com/a/uploads/scale_small/6/67663/6608305-9767412179-PZjg8MtHw0jVqyDY7jBsDulVa79slq6VogPOroF3hhZqRnMz1NICwE-A10Efhw-cLOQ%3Dw6000", "Graduation Day: Part 2", 426, Date(2017,1,7)), 
            ),
            characters = mutableListOf<Character>(
                Character("Spider Man", "https://comicvine.gamespot.com/a/uploads/square_small/12/124259/8126579-amazing_spider-man_vol_5_54_stormbreakers_variant_textless.jpg"),
                Character("Luke Cage", "https://comicvine.gamespot.com/a/uploads/square_small/12/124259/7773026-rco001_1583481104.jpg"),
                Character("Iron Fist", "https://comicvine.gamespot.com/a/uploads/square_small/11156/111564182/8967544-ironfist.jpg"),
                Character("Ava Ayala", "https://comicvine.gamespot.com/a/uploads/square_small/1/15776/3657194-white%20tiger%202.jpg"),
                Character("Sam Alexander", "https://comicvine.gamespot.com/a/uploads/square_small/3/31666/2887428-nova_1_adi_granov.jpg"),
                Character("Nick Fury", "https://comicvine.gamespot.com/a/uploads/square_small/8/80111/5323224-nick%20furia%2016.png"),
                Character("Flash Thompson", "https://comicvine.gamespot.com/a/uploads/square_small/12/124259/8056388-extreme_carnage_alpha_vol_1_1_616_comics_and_jolzar_collectibles_exclusive_virgin_variant.jpg"),
                Character("Doctor Octopus", "https://comicvine.gamespot.com/a/uploads/square_small/12/124259/8273265-xwo2dl8g0c381.jpg"),
                Character("Venom", "https://comicvine.gamespot.com/a/uploads/square_small/11144/111442876/8759820-fgjfj.jpg"),
                Character("Aunt May", "https://comicvine.gamespot.com/a/uploads/square_small/11/117763/2733264-marvel_knights_spider_man__4___page_3.jpg"),
                Character("Norman Osborn", "https://comicvine.gamespot.com/a/uploads/square_small/11144/111442876/8810793-bjdyt.jpg"),
                Character("Harry Osborn", "https://comicvine.gamespot.com/a/uploads/square_small/6/62795/6388168-harry.jpg"),
                Character("Mary Jane", "https://comicvine.gamespot.com/a/uploads/square_small/1/14487/9241248-img_0539.jpeg"),
                Character("Amadeus Cho", "https://comicvine.gamespot.com/a/uploads/square_small/12/124259/8080926-immortal_hulk_vol_1_49_asian_american_and_pacific_islander_heritage_virgin_wraparound_variant.jpg"),
            ),
            year = 2012,
            pictureUrl = "https://comicvine.gamespot.com/a/uploads/scale_small/0/77/4270314-ultimate_spider-man_%28animated_series%29_season_3_11.jpg",
            producer = "Marvel",
            title = "Ultimate Spider-Man"
        ),

        Show(
            story = "The missions of the Strategic Homeland Intervention, Enforcement and Logistics Division. A small team of operatives led by Agent Coulson (Clark Gregg) who must deal with the strange new world of \"superheroes\" after the \"Battle of New York\", protecting the public from new and unknown threats.",
            episodes = mutableListOf<Episode>(
                Episode("https://comicvine.gamespot.com/a/uploads/original/7/76663/3330523-marvels-agents-of-shield.jpg", "Pilot", 101, Date(2013,09,24)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/0/40/3346846-coulson.jpg", "0–8–4", 102, Date(2013,10,01)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/0/40/3363120-asset231-710x400.jpg", "The Asset", 103, Date(2013,10,08)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/6/64675/3369543-133228_8082_pre.jpg", "Eye Spy", 104, Date(2013,10,15)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/0/40/3396508-133345_3988_pre.jpg", "Girl in the Flower Dress", 105, Date(2013,10,22)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/6/64675/3427545-706136-133582_7509_pre.jpg", "F.Z.Z.T.", 106, Date(2013,11,05)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/6/64675/3437387-707781-133831_1191_pre.jpg", "The Hub", 107, Date(2013,11,12)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/11111/111115288/4030466-8708883006-agents.jpeg", "The Well", 108, Date(2013,11,19)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/11111/111115288/4153934-0369333376-197qi.jpg", "Repairs", 109, Date(2013,11,26)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/6/64675/3482728-134085_3082_pre-300x199.jpg", "The Bridge", 110, Date(2013,12,03)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/0/40/3558197-agents-of-shield-s1ep11-still-image-saffron-burrows-as-victoria-hand-010314.jpg", "The Magical Place", 111, Date(2014,01,07)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/6/64675/3576585-717593-marvelsagentsofshield_y1_d112_f012_023_pre.jpg", "Seeds", 112, Date(2014,01,14)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/6/64675/3620137-marvelsagentsofshield_y1_d113-f013_002_pre.jpg", "T.R.A.C.K.S.", 113, Date(2014,02,04)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/11111/111115288/3623033-52f287cc14033.jpg", "T.A.H.I.T.I.", 114, Date(2014,03,04)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/11111/111115288/3692612-4353507658-822x..jpg", "Yes Men", 115, Date(2014,03,11)),
                Episode("https://comicvine.gamespot.com/a/uploads/original/11111/111115288/3720121-3706383-screenshot%2Bfrom%2B2014-03-19%2B11-30-38.png", "End of the Beginning", 116, Date(2014,04,01)),

            ),

            characters = mutableListOf<Character>(
                Character("Jemma Simmons", "https://comicvine.gamespot.com/a/uploads/original/7/79073/4998056-jemma%20simmons%20%28earth-616%29%20002.png"),
                Character("Quake", "https://comicvine.gamespot.com/a/uploads/original/3/31666/4629368-quake2015001-cov-0aca1.jpg"),
                Character("Melinda May", "https://comicvine.gamespot.com/a/uploads/original/0/3848/4629523-cavalry2015001-cov-9fefd.jpg"),
                Character("Phil Coulson", "https://comicvine.gamespot.com/a/uploads/original/10/100647/3711822-sonofcoul.jpg"),
                Character("Leo Fitz", "https://comicvine.gamespot.com/a/uploads/original/1/15776/9138117-leofitz.png"),
                Character("Al MacKenzie", "https://comicvine.gamespot.com/a/uploads/original/11111/111115288/5716178-9513828408-almac.png"),
                Character("Slingshot", "https://comicvine.gamespot.com/a/uploads/original/3/35127/1534444-yoyo.jpg"),
                Character("Grant Ward", "https://comicvine.gamespot.com/a/uploads/original/7/79073/6046066-grant%20ward%20%28earth-616%29%20001.png"),
                Character("Lance Hunter", "https://comicvine.gamespot.com/a/uploads/original/11129/111293013/6913775-lancelot_hunter_%2528earth-22110%2529.jpg"),
                Character("Mockingbird", "https://comicvine.gamespot.com/a/uploads/original/3/31666/4956373-mockingbird2015001-35c9d.jpg"),
                Character("Glenn Talbot", "https://comicvine.gamespot.com/a/uploads/original/8/84205/3659762-3659044-1579865-glen_talbot_01.jpg"),
                Character("Holden Radcliffe", "https://comicvine.gamespot.com/a/uploads/original/11112/111123579/5646619-holden_radcliffe_%28earth-616%29_from_machine_teen_vol_1_5_001.png"),
                Character("Viper", "https://comicvine.gamespot.com/a/uploads/original/2/25835/1039666-tumblr_krttk6azud1qzs9o3.jpg"),
                Character("Antoine Triplett", "https://comicvine.gamespot.com/a/uploads/original/11112/111123579/5502848-antoine_triplett_%28earth-199999%29_from_marvel%27s_agents_of_s.h.i.e.l.d._0001.png"),
                Character("A.I.D.A.", "https://comicvine.gamespot.com/a/uploads/original/13/135098/7712903-2453071092-44904.jpg"),
                Character("Raina", "https://comicvine.gamespot.com/a/uploads/original/7/79073/4746337-raina%20%28earth-616%29%20001.png"),
            ),
            year = 2013
            pictureUrl = "https://comicvine.gamespot.com/a/uploads/original/6/67663/6238345-3060875932-35677.jpg",
            producer = "Marvel",
            title = "Agents of S.H.I.E.L.D."
        )
    )

    val finalList = mutableListOf<Show>()

    for (i in 0..6) {
        finalList.addAll(seriesList)
    }
    
}