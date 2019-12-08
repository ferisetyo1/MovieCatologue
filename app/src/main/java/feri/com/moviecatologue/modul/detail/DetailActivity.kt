package feri.com.moviecatologue.modul.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import feri.com.moviecatologue.R
import feri.com.moviecatologue.databinding.ActivityDetailBinding
import feri.com.moviecatologue.model.MovieModel

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        val movieModel = intent.getParcelableExtra<MovieModel>("movie_data")
        binding = DataBindingUtil
            .setContentView<ActivityDetailBinding>(this, R.layout.activity_detail)
            .apply {
                vm = ViewModelProviders.of(this@DetailActivity).get(DetailViewModel::class.java)
                vm!!.setmovie(movieModel!!)

                action=object : DetailAction{

                    override fun onClickBack() {
                        finish()
                    }

                }
            }
    }
}
