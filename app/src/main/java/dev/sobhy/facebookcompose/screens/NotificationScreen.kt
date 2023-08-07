package dev.sobhy.facebookcompose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun NotificationScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Notification Screen", fontSize = 25.sp, modifier = Modifier.align(Alignment.Center))
    }
}