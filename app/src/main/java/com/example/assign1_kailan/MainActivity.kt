package com.example.assign1_kailan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.assign1_kailan.ui.theme.Assign1_KailanTheme


import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon



import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assign1_KailanTheme {

                BusinessCardApp(modifier = Modifier)

//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BusinessCardApp(modifier = Modifier.padding(innerPadding))
//                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(color = Color.Cyan)
            .fillMaxSize()
    ){
        NameAndTitleSection(modifier = modifier)
        PersonalDetailsSection(modifier = modifier)
    }

}

@Composable
fun NameAndTitleSection(modifier: Modifier){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 140.dp)
    ){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(110.dp)
                .background(color =  Color.Black)

        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
                    .height(95.dp),

                contentScale = ContentScale.Crop,
                alignment = Alignment.Center

            )
        }

        Text(
            text = stringResource(R.string.my_name),
            fontSize = 48.sp,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = stringResource(R.string.my_title),
            fontSize = 16.sp,
            style = MaterialTheme.typography.titleLarge
        )
    }

}

@Composable
fun PersonalDetailsSection(modifier: Modifier) {
    Column(
        //horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically

        ){
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = "Phone Icon",
                tint = Color.Magenta,
                modifier = Modifier.padding(end = 10.dp)

            )
            Text(
                text = stringResource(R.string.my_phoneNumber),
                fontSize = 16.sp,
                style = MaterialTheme.typography.titleLarge
            )
        }
        Row(
            modifier = Modifier.padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = "Share Icon",
                tint = Color.Magenta,
                modifier = Modifier.padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.my_socials),
                fontSize = 16.sp,
                style = MaterialTheme.typography.titleLarge
            )
        }
        Row(
            modifier = Modifier.padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "Home Icon",
                tint = Color.Magenta,
                modifier = Modifier.padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.my_email),
                fontSize = 16.sp,
                style = MaterialTheme.typography.titleLarge
            )
        }

    }
}



@Preview(showBackground = true)
@Composable
fun Assign1Preview() {
    Assign1_KailanTheme {
        BusinessCardApp()
    }
}