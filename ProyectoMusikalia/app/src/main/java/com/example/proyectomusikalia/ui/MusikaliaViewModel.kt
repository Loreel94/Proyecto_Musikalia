package com.example.proyectomusikalia.ui

import androidx.lifecycle.ViewModel
import com.example.proyectomusikalia.data.Song
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MusikaliaViewModel: ViewModel() {
    private val _UiState = MutableStateFlow(MusikaliaUiState())
    val UiState: StateFlow<MusikaliaUiState>
        get() = _UiState.asStateFlow()
    fun UpdateSong(song: Song) {
        _UiState.update { estadoActual->
            estadoActual.copy(song = song)
        }
    }
}