package com.example.proyectomusikalia.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.proyectomusikalia.data.Song
import com.example.proyectomusikalia.ui.MusikaliaViewModel


@Composable
fun Cancion(navController: NavHostController, viewModel: MusikaliaViewModel = viewModel()) {
    val uiState by viewModel.UiState.collectAsState()
    LazyColumn(){
        item{
            Column(
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 8.dp,
                    bottom = 16.dp,
                    end = 16.dp
                )
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }
                    Text(
                        text = uiState.song!!.name,
                        style = MaterialTheme.typography.h1,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))
                Image(
                    painter = painterResource(uiState.song!!.imageResourceId),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .size(280.dp)
                )
                Row {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Artista",
                            style = MaterialTheme.typography.h3
                        )
                        Text(
                            text = uiState.song!!.artist,
                            style = MaterialTheme.typography.body1
                        )
                    }

                    Column(horizontalAlignment = Alignment.End, modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Año de lanzamiento",
                            style = MaterialTheme.typography.h3
                        )
                        Text(
                            text = uiState.song!!.year.toString(),
                            style = MaterialTheme.typography.body1
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Letra",
                    style = MaterialTheme.typography.h3,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = uiState.song!!.lyrics,
                    style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Significado de la canción",
                    style = MaterialTheme.typography.h3
                )
                Text(
                    text = uiState.song!!.meaning,
                    style = MaterialTheme.typography.body1
                )

            }
        }
    }

}
