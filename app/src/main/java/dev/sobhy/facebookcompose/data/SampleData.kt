package dev.sobhy.facebookcompose.data

import dev.sobhy.facebookcompose.R

object SampleData{
    val profileImage = R.drawable.profile_pic
    val name = "Sobhy Abdel Hakam"
    val time = "45m"


    val SampleDataList = listOf(
        Post(profileImage, name, time, "This is the content of post 1", null),
        Post(profileImage, name, time, "This is the content of post 2", R.drawable._1),
        Post(profileImage, name, time, "This is the content of post 3", null),
        Post(profileImage, name, time, "This is the content of post 4", null),
        Post(profileImage, name, time, "This is the content of post 5", R.drawable._2),
        Post(profileImage, name, time, "This is the content of post 6", null),
        Post(profileImage, name, time, "This is the content of post 7", null),
        Post(profileImage, name, time, "This is the content of post 8", R.drawable._3),
        Post(profileImage, name, time, "This is the content of post 9", null),
        Post(profileImage, name, time, "This is the content of post 10", null),
        Post(profileImage, name, time, "This is the content of post 11", R.drawable._4),
        Post(profileImage, name, time, "This is the content of post 12", null),

    )
}