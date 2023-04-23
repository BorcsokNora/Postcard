package com.example.postcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
                    MyComposable()
                }
            }
        }
    }
}

@Composable
fun MyComposable() {

//    Column {
//        Text(text = "GREETINGS FROM")
//        Text(text = "MARSEILLE")
//    }

//    Row {
//        Text(text = "GREETINGS FROM")
//        Text(text = "MARSEILLE")
//    }

    Box {
        Text(
            text = "GREETINGS FROM",
            modifier = Modifier.background(Color(0xFF4CAF50))
        )
        Text(
            text = "MARSEILLE",
            modifier = Modifier.background(Color(0xFFFF9800))
        )
    }

}


@Preview(showBackground = true)
@Composable
fun ComposablePreview() {
    MyComposable()
}