package feri.com.moviecatologue.modul.detail

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import feri.com.moviecatologue.model.MovieModel

class DetailViewModel :ViewModel(){
    var movie:ObservableField<MovieModel> = ObservableField()

    fun setmovie(movieModel: MovieModel){
        movie.set(movieModel)
    }
}