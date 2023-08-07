package dev.sobhy.facebookcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.sobhy.facebookcompose.R
import dev.sobhy.facebookcompose.data.Post
import dev.sobhy.facebookcompose.data.SampleData

@Composable
fun HomeScreen() {
    Posts(posts = SampleData.SampleDataList)
}

@Composable
fun PostItem(post: Post) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)) {
        Column {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)) {
                Image(
                    painter = painterResource(id = post.profileImage),
                    contentDescription = "profile",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(text = post.name, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(text = post.time)
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Icon(
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = "more",
                    )
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "close",
                    )
                }

            }
            Text(text = "This is the content of post")
            if (post.image != null){
                Image(
                    painter = painterResource(id = post.image),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))
            Divider()
            Row {
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
                    Row {
                        Icon(imageVector = Icons.Outlined.ThumbUp, contentDescription = "like")
                        Text(text = "Like")
                    }

                }
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
                    Row {
                        Icon(imageVector = Icons.Outlined.Share, contentDescription = "share")
                        Text(text = "Share")
                    }

                }
            }
        }

    }
}

@Composable
fun Posts(posts: List<Post>) {
    LazyColumn {
        items (posts){post ->
            Spacer(modifier = Modifier.height(8.dp))
            PostItem(post = post)
        }
    }
}
@Composable
fun StatusCard() {
    Box {
        Image(painter = painterResource(id = R.drawable._1), contentDescription = "", modifier = Modifier
            .height(100.dp)
            .width(50.dp))
        Image(imageVector = Icons.Filled.AccountCircle, contentDescription = "", modifier = Modifier.padding(8.dp))
        Text(text = "User Name", modifier = Modifier.align(Alignment.BottomStart))
    }
}

