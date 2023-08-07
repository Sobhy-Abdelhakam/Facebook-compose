package dev.sobhy.facebookcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.sobhy.facebookcompose.R

@Composable
fun ProfileScreen() {
    ProfileComp()
}

@Composable
fun ProfileComp() {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.landscape),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth()
        )
        Image(
            painter = painterResource(id = R.drawable.profile_pic),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Text(text = "Sobhy Abdel Hakam")
    }
}