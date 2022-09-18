package com.ninto.birthdaygreeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ninto.birthdaygreeting.ui.theme.BirthdayGreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayGreetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingImg("Keerthana", "Compose Camp Members, GDSC VJIT")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreeting(name: String, from: String) {
    Column{
        Text(
            text = "Happy Birthday $name!",
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 20.dp, top = 20.dp)
        )
        Text(
            text = "- from $from",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 20.dp, top = 20.dp)
        )
    }
}

@Composable
fun BirthdayGreetingImg(name: String, from: String){
    val image = painterResource(R.drawable.adparty)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
    BirthdayGreeting("Keerthana", "Compose Camp Members, GDSC VJIT")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    BirthdayGreetingTheme {
        //BirthdayGreeting("Keerthana", "Compose Camp Members, GDSC VJIT")
        BirthdayGreetingImg("Keerthana", "Compose Camp Members, GDSC VJIT")
    }
}