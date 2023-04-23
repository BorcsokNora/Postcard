package com.example.postcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.postcard.ui.theme.PostcardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PostcardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFFFFFF)
                ) {
                    Box {
                        //  Enable sharing the screen as an image
                        val sharePostcard = PostcardContainer {
                            MyComposable()
                        }
                        Button(
                            modifier = Modifier
                                .padding(16.dp)
                                .align(Alignment.BottomCenter),
                            colors = ButtonDefaults.buttonColors(
                                contentColor = Color(0xFF0580A8),
                                backgroundColor = Color(0xE6FFFFFF),
                            ),
                            onClick = {
                                sharePostcard()
                            }) {
                              Icon(
                                  painter = painterResource(id = R.drawable.share_icon),
                                  contentDescription = null
                              )
                            Text(
                                modifier = Modifier.padding(horizontal = 16.dp),
                                text = "SHARE",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MyComposable() {
    Box(Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.marseille),
            contentDescription = null,
            modifier = Modifier.fillMaxHeight(),
            contentScale = ContentScale.Crop,
        )
        Column(
            modifier = Modifier
                .background(Color(0x40FFFFFF))
                .padding(8.dp)
        ) {
            Text(
                text = "GREETINGS FROM",
                fontSize = 14.sp,
                letterSpacing = 6.sp,
                color = Color(0xFFFFFFFF)
            )
            Text(
                text = "MARSEILLE",
                fontSize = 32.sp,
                letterSpacing = 8.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ComposablePreview() {
    MyComposable()
}