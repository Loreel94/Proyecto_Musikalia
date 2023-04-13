package com.example.proyectomusikalia.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.proyectomusikalia.R
import com.example.proyectomusikalia.data.Generos
import com.example.proyectomusikalia.data.Song
import com.example.proyectomusikalia.data.generos
import com.example.proyectomusikalia.ui.MusikaliaViewModel

@Composable
fun MusikaliaApp(navController: NavHostController, viewModel: MusikaliaViewModel = viewModel()) {
    val uiState by viewModel.UiState.collectAsState()
    Scaffold(
        topBar = {
            MusikaliaTopAppBar()
        }
    ) {padding->
        LazyColumn(modifier = Modifier
            .background(MaterialTheme.colors.background)
            .padding(padding)) {
            items(generos) {
                MusicaItem(genero = it, onSongClick = {Song ->viewModel.UpdateSong(Song); navController.navigate("Pantalla Cancion"){
                    launchSingleTop = true
                } })
            }
        }
    }
}


@Composable
fun MusicaItem (genero: Generos,onSongClick:(Song)-> Unit, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        elevation = 4.dp,
        modifier = modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                MusicaIcon(genero.imageResourceId)
                MusicaInformation(genero.name,genero.POPULARIDAD)
                Spacer(Modifier.weight(1f))
                MusicaItemButton(
                    expanded = expanded,
                    onClick = { expanded = !expanded },
                )
            }
            if (expanded) {
                Song(genero.song, onSongClick)
            }
        }
    }
}



@Composable
private fun MusicaItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            tint = MaterialTheme.colors.secondary,
            contentDescription = stringResource(R.string.expand_button_content_description),
        )
    }
}


@Composable
fun MusikaliaTopAppBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colors.primary),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = modifier
                .size(64.dp)
                .padding(8.dp),
            painter = painterResource(R.drawable.musicaicono),

            contentDescription = null
        )
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.h1
        )
    }
}


@Composable
fun MusicaIcon(@DrawableRes musicaIcon: Int, modifier: Modifier = Modifier) {
    Image(
        modifier = modifier
            .size(64.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(50)),
        contentScale = ContentScale.Crop,
        painter = painterResource(musicaIcon),

        contentDescription = null
    )
}


@Composable
fun MusicaInformation(@StringRes musicaName: Int, POPULARIDAD: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = stringResource(musicaName),
            style = MaterialTheme.typography.h2,
            modifier = modifier.padding(top = 8.dp)
        )
        Text(
            text = stringResource(R.string.gusto_genero, POPULARIDAD),
            style = MaterialTheme.typography.body1
        )
    }
}

@Composable
fun Song(songs: List<Song>,onSongClick:(Song)-> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(
            start = 16.dp,
            top = 8.dp,
            bottom = 16.dp,
            end = 16.dp
        )
    ) {
        Text(
            text = stringResource(R.string.canciones),
            style = MaterialTheme.typography.h3
        )
        Spacer(modifier = Modifier.height(10.dp))
        songs.forEach {
            Card(modifier = Modifier.clickable { onSongClick(it) }) {
                Column(
                    modifier = Modifier.background(MaterialTheme.colors.background).padding(8.dp)
                ) {
                    Text(
                        text = it.name,
                        style = MaterialTheme.typography.h2
                    )
                    Text(
                        text = it.artist,
                        style = MaterialTheme.typography.body1
                    )
                    Text(
                        text = it.year.toString(),
                        style = MaterialTheme.typography.body1
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
