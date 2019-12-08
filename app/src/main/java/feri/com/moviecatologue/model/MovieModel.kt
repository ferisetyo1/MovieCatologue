package feri.com.moviecatologue.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class MovieModel(
    val judul: String?,
    val sinopsis: String?,
    val tahun_release: String?,
    val poster: Int,
    val durasi:String
) : Parcelable