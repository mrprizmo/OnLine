﻿package ru.hse.online.client.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import ru.hse.online.client.view.map.ActualMapView
import ru.hse.online.client.view.map.BaseMapView
import ru.hse.online.client.view.map.MapOverlayView
import ru.hse.online.client.ui.theme.ClientTheme

class MapView : ComponentActivity() {
//    private val mapView: BaseMapView = StaticMapView()
    private val mapView: BaseMapView = ActualMapView()
    private val mapOverlay: MapOverlayView = MapOverlayView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ClientTheme(darkTheme = true) {
                Surface(modifier = Modifier.fillMaxSize()) {
                    mapView.DrawMap()
                    mapOverlay.Draw(this)
                }
            }
        }
    }
}
