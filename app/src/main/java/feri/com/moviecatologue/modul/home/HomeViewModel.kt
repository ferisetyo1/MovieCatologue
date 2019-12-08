package feri.com.moviecatologue.modul.home

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.lifecycle.ViewModel
import feri.com.moviecatologue.data.MovieData
import feri.com.moviecatologue.model.MovieModel

class HomeViewModel : ViewModel() {
    val list_movie: ObservableList<MovieModel> = ObservableArrayList()

    init {
        list_movie.addAll(MovieData.generateMovies())
    }
}