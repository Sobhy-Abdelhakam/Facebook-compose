package dev.sobhy.facebookcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.sobhy.facebookcompose.R

@Composable
fun FriendsScreen() {
    LazyColumn {
        items(20) {
            FriendRequestItem()
            Divider()
        }
    }
//    Box(modifier = Modifier.fillMaxSize()) {
//        Text(text = "Friends Screen", fontSize = 25.sp, modifier = Modifier.align(Alignment.Center))
//    }
}

@Composable
fun FriendRequestItem() {
    Row(modifier = Modifier.fillMaxWidth().background(Color.White)) {
        Image(
            painter = painterResource(id = R.drawable.profile_pic),
            contentDescription = "",
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(text = "User Name", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "4 mutual friends")
            Row {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Confirm")
                }
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.LightGray)) {
                    Text(text = "Delete", color = Color.Black)
                }
            }
        }
    }
}