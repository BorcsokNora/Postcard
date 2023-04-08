package com.example.postcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
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
                    // TODO: 1. open the Split view to see the preview of "MyComposable" within Android Studio
                    MyComposable()
                }
            }
        }
    }
}

@Composable
fun MyComposable() {

    Column {
        Text(text = "GREETINGS FROM")
        Text(text = "MARSEILLE")
    }

    Row {
        // TODO: 2. copy the texts in here to show them in a row, and comment out the column
    }

    // TODO: 3. uncomment the below code to show the texts in a box,
    //  then change the order of the two texts
/*    Box {
        Text(
            text = "GREETINGS FROM",
            modifier = Modifier.background(Color(0xFF4CAF50))
        )
        Text(
            text = "MARSEILLE",
            modifier = Modifier.background(Color(0xFFFF9800))
        )
    }
*/

}


@Preview(showBackground = true)
@Composable
fun ComposablePreview() {
    MyComposable()
}