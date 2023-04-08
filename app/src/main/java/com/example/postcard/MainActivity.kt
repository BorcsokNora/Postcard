package com.example.postcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.postcard.ui.theme.PostcardTheme

// TODO: 1. run the app (on an emulator or on a physical device)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PostcardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    // TODO: 2. uncomment this line to change background color
                    //color = Color(0xFFD3BDF8)
                ) {
                    // TODO: 3. write your name in the quotation marks
                    Greeting(name = "Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    // TODO: 4. delete the text in the quotation marks and replace it with any text you want
    Text(text = "Hello $name!")
}
