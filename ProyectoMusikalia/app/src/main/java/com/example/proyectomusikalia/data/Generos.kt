package com.example.proyectomusikalia.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.proyectomusikalia.R


data class Generos(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val POPULARIDAD: String,
    val description: String,
    val song: List<Song>,
)


val generos = listOf(
    Generos(R.drawable.blues, R.string.genero_1, "19%", "Género musical que se originó en el sur de Estados Unidos y que se caracteriza por su melodía y su letra triste.",songBlues),
    Generos(R.drawable.disco, R.string.genero_2, "89%", "Se originó en la ciudad de Nueva York, Estados Unidos, a mediados de la década de 1970.", songDisco),
    Generos(R.drawable.flamenco, R.string.genero_3, "24%", "Género musical y danza folclórica originario de Andalucía, una región del sur de España", songClasica),
    Generos(R.drawable.hiphop, R.string.genero_4, "15,40%","Género musical que se originó en las comunidades afroamericanas y latinas de Nueva York.", songClasica),
    Generos(R.drawable.metal, R.string.genero_5, "28%", "Género musical que se caracteriza por el uso de guitarras eléctricas y baterías fuertes.", songClasica),
    Generos(R.drawable.reggeton, R.string.genero_6, "48%", "Género musical originario de Puerto Rico que combina el reggae, el hip hop y la música latina.", songClasica),
    Generos(R.drawable.rock, R.string.genero_7, "29%", "Género musical que se originó como una variedad del rock and roll en la década de 1950.", songRock),
    Generos(R.drawable.techno, R.string.genero_8, "18%", "Se originó en la ciudad de Detroit, Estados Unidos, a principios de la década de 1980", songClasica),
    Generos(R.drawable.bandassonoras, R.string.genero_9, "8%", "También conocidas como soundtracks, tienen su origen en el cine y la televisión. Se popularizó en la década de 1930.", songBandaSonora),
    Generos(R.drawable.musicaclasica, R.string.genero_10, "9,4%", "Música culta o académica, que se ha desarrollado a lo largo de varios siglos.", songClasica),
    Generos(R.drawable.country, R.string.genero_11, "13%", "Género musical originario de Estados Unidos, que se caracteriza por sus letras sobre historias cotidianas.", songCountry),
    Generos(R.drawable.jazz, R.string.genero_12, "25%",  "Género musical que se originó en Nueva Orleans a finales del siglo XIX.", songJazz),
    Generos(R.drawable.pop, R.string.genero_13, "64%", "Género musical que se caracteriza por ser fácil de recordar y con una estructura básica.", songPop),
    Generos(R.drawable.ryb, R.string.genero_14, "20%", "Se originó en los Estados Unidos a mediados de la década de 1940 como una evolución del blues y el jazz, con influencias del gospel y el swing.", songRyb),
    Generos(R.drawable.salsa, R.string.genero_15, "11%", "Se originó en Nueva York en la década de 1960", songSalsa),
    Generos(R.drawable.soul, R.string.genero_16, "10%", "Se originó en los Estados Unidos a finales de la década de 1950 y principios de la década de 1960, principalmente en las comunidades afroamericanas de las ciudades de Detroit.", songSoul)
)