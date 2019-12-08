package feri.com.moviecatologue.modul.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.lifecycle.ViewModelProviders

import feri.com.moviecatologue.R
import feri.com.moviecatologue.data.MovieData
import feri.com.moviecatologue.databinding.FragmentHomeBinding

class HomeFragment : Fragment(),SearchView.OnQueryTextListener {

    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(inflater,container,false)
            .apply {
                vm=ViewModelProviders.of(this@HomeFragment)
                    .get(HomeViewModel::class.java)
            }
        binding.lvMovie.apply {
            adapter=HomeMovieAdapter(context,binding.vm!!.list_movie)
        }
        binding.svHome.setOnQueryTextListener(this)
        return binding.root
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        binding.lvMovie.apply {
            (adapter as HomeMovieAdapter).replacedata(MovieData.filteredData(newText!!))
        }
        return true
    }

}
