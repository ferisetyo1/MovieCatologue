package feri.com.moviecatologue.modul.home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.DataBindingUtil
import feri.com.moviecatologue.R
import feri.com.moviecatologue.databinding.ItemMovieBinding
import feri.com.moviecatologue.model.MovieModel
import feri.com.moviecatologue.modul.detail.DetailActivity

class HomeMovieAdapter(private val context: Context, private var movielist: MutableList<MovieModel>) :
    BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var binding: ItemMovieBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.item_movie,
            parent,
            false
        )
        val viewHolder = ViewHolder(binding)
        viewHolder.bind(movielist.get(position),object :HomeItemAction{
            override fun onClickDetail() {
                val intent=Intent(context,DetailActivity::class.java)
                intent.putExtra("movie_data",movielist.get(position))
                context.startActivity(intent)
            }
        })
        return binding.root
    }

    override fun getItem(position: Int): Any = movielist.get(position)

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = movielist.size

    fun replacedata(list: ArrayList<MovieModel>){
        movielist=list
        notifyDataSetChanged()
    }

    private inner class ViewHolder internal constructor(view: ItemMovieBinding) {
        val binding=view

        internal fun bind(movie: MovieModel,action: HomeItemAction) {
            binding.model=movie
            binding.action=action
            binding.executePendingBindings()
        }
    }
}