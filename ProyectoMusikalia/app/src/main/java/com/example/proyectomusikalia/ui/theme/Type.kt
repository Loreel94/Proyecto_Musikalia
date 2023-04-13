package com.example.proyectomusikalia.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.proyectomusikalia.R

// Set of Material typography styles to start with
val AbrilFatface = FontFamily(
    Font(R.font.abril_fatface_regular)
)



val Caveat = FontFamily(
    Font(R.font.caveat_regular),
    Font(R.font.caveat_bold, FontWeight.Bold)
)
// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = AbrilFatface,
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp
    ),
    h2 = TextStyle(
        fontFamily = Caveat,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    ),
    h3 = TextStyle(
        fontFamily = Caveat,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    body1 = TextStyle(
        fontFamily = Caveat,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    )
)