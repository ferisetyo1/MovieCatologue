package feri.com.moviecatologue.utils

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingTools {
    @BindingAdapter("app:imgurl")
    @JvmStatic
    fun setImg(imageView: ImageView,int: Int){
        Glide.with(imageView.context)
            .load(int)
            .into(imageView)
    }

    @BindingAdapter("app:cutsinopsis")
    @JvmStatic
    fun setsinopsis(textView: TextView,string: String){
        if (string.length>200){
            textView.text="${string.substring(0,200)}..."
        }else{
            textView.text=string
        }
    }

    @BindingAdapter("app:tahunrelease")
    @JvmStatic
    fun setthrelease(textView: TextView,string: String){
        textView.text="($string)"
    }
}