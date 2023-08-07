package dev.sobhy.facebookcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.sobhy.facebookcompose.screens.FriendsScreen
import dev.sobhy.facebookcompose.screens.HomeScreen
import dev.sobhy.facebookcompose.screens.MenuScreen
import dev.sobhy.facebookcompose.screens.NotificationScreen
import dev.sobhy.facebookcompose.screens.ProfileScreen
import dev.sobhy.facebookcompose.ui.theme.FacebookComposeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FacebookComposeTheme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = { TopBar() },
                    bottomBar = { BottomBar(navController) }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(it)
                            .background(Color.LightGray)
                    ) {
                        NavHost(
                            navController = navController,
                            startDestination = "home"
                        ) {
                            composable("home") {
                                HomeScreen()
                            }
                            composable("friends") {
                                FriendsScreen()
                            }
                            composable("profile") {
                                ProfileScreen()
                            }
                            composable("notification") {
                                NotificationScreen()
                            }
                            composable("menu") {
                                MenuScreen()
                            }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        title = {
            Text(
                text = "Facebook",
                color = Color.Blue,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Add",
                    modifier = Modifier
                        .background(color = Color.LightGray, shape = CircleShape)
                        .padding(6.dp),
                    tint = Color.Black
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "search",
                    modifier = Modifier
                        .background(color = Color.LightGray, shape = CircleShape)
                        .padding(6.dp),
                    tint = Color.Black
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "message",
                    modifier = Modifier
                        .background(color = Color.LightGray, shape = CircleShape)
                        .padding(6.dp),
                    tint = Color.Black
                )
            }
        }
    )
}

@Composable
fun BottomBar(navController: NavHostController) {
    var selectedItem by remember {
        mutableStateOf("home")
    }
    BottomAppBar {
        NavigationBarItem(
            selected = selectedItem == "home",
            onClick = {
                selectedItem = "home"
                navController.navigate("home")
            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "home"
                )
            }
        )
        NavigationBarItem(
            selected = selectedItem == "friends",
            onClick = {
                selectedItem = "friends"
                navController.navigate("friends")
            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Friends"
                )

            }
        )
        NavigationBarItem(
            selected = selectedItem == "profile",
            onClick = {
                selectedItem = "profile"
                navController.navigate("profile")
            },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = "Profile"
                )
            }
        )
        NavigationBarItem(
            selected = selectedItem == "notification",
            onClick = {
                selectedItem = "notification"
                navController.navigate("notification")
            },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "Notification"
                )
            }
        )
        NavigationBarItem(
            selected = selectedItem == "menu",
            onClick = {
                selectedItem = "menu"
                navController.navigate("menu")
            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Menu"
                )
            }
        )
    }
}
