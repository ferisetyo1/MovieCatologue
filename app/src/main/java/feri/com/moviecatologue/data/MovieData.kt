package feri.com.moviecatologue.data

import feri.com.moviecatologue.R
import feri.com.moviecatologue.model.MovieModel

object MovieData {
    fun generateMovies(): List<MovieModel> {
        return listOf(
            MovieModel(
                "Avenger Invinity War",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "2018",
                R.drawable.poster_avengerinfinity,
                "2 jam 29 menit"
            ),
            MovieModel(
                "Aquaman",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "2018",
                R.drawable.poster_aquaman,
                "2 jam 24 menit"
            ),
            MovieModel(
                "Once Upon a Deadpool",
                "A kidnapped Fred Savage is forced to endure Deadpool's PG-13 rendition of Deadpool 2 as a Princess Bride-esque story that's full of magic, wonder & zero F's.",
                "2018",
                R.drawable.poster_deadpool,
                "1 jam 57 menit"
            ),
            MovieModel(
                "Creed II",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "2018",
                R.drawable.poster_creed,
                "2 jam 10 menit"
            ),
            MovieModel(
                "A Star Is Born",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "2018",
                R.drawable.poster_a_star,
                "2 jam 16 menit"
            ),
            MovieModel(
                "Bumblebee",
                "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                "2018",
                R.drawable.poster_bumblebee,
                "1 jam 54 menit"
            ),
            MovieModel(
                "Bohemian Rhapsody",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "2018",
                R.drawable.poster_bohemian,
                "2 jam 15 menit"
            ),
            MovieModel(
                "Bird Box",
                "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",
                "2018",
                R.drawable.poster_birdbox,
                "2 jam 4 menit"
            ),
            MovieModel(
                "Venom",
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                "2018",
                R.drawable.poster_venom,
                "1 jam 52 menit"
            ),
            MovieModel(
                "Glass",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "2018",
                R.drawable.poster_glass,
                "2 jam 9 menit"
            )

        )
    }

    fun filteredData(string: String): ArrayList<MovieModel> {
        val temp_ = ArrayList<MovieModel>()
        for (moviemodel in generateMovies()) {
            if (moviemodel.judul?.toLowerCase()?.contains(string.toLowerCase())!!) {
                temp_.add(moviemodel)
            }
        }
        return temp_
    }
}