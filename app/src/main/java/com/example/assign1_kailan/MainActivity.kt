package com.example.assign1_kailan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon



import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assign1_KailanTheme {
                BusinessCardApp(modifier = Modifier)

            }
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {


    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(color = colorResource(R.color.background))
            .fillMaxSize()
    ){
        NameAndTitleSection(modifier = modifier)
        PersonalDetailsSection(modifier = modifier)


        Box(
            modifier = Modifier
                .height(25.dp)
                .fillMaxWidth()
                .background(color = Color.Black)

        )
    }



}

@Composable
fun NameAndTitleSection(modifier: Modifier){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 300.dp)
    ){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(110.dp)
                .background(color = colorResource(R.color.android_icon_background))

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
            fontWeight = FontWeight(350),
            fontSize = 48.sp
        )
        Text(
            text = stringResource(R.string.my_title),
            fontSize = 16.sp,
            fontWeight = FontWeight(750),
            color = colorResource(R.color.icons_and_text)

        )
    }

}

@Composable
fun PersonalDetailsSection(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.padding(top = 220.dp)
    ){
        IconAndText(R.string.my_phoneNumber, Icons.Rounded.Phone, "Phone Icon")
        IconAndText(R.string.my_socials, Icons.Rounded.Share, "Share Icon")
        IconAndText(R.string.my_email, Icons.Rounded.Email, "Email Icon")

    }
}


@Composable
fun IconAndText(
        @StringRes stringResourceId: Int,
        imageVector: ImageVector,
        iconDescription: String
){
    Row(
        modifier = Modifier.padding(top = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            imageVector = imageVector,
            contentDescription = iconDescription,
            tint = colorResource(R.color.icons_and_text),
            modifier = Modifier.padding(end = 20.dp)
        )
        Text(
            text = stringResource(stringResourceId),
            fontSize = 16.sp,
            style = MaterialTheme.typography.titleLarge
        )
    }
}


@Preview(showBackground = true)
@Composable
fun Assign1Preview() {
    Assign1_KailanTheme {
        BusinessCardApp()
    }
}