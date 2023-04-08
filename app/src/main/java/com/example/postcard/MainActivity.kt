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
import androidx.compose.ui.modifier.modifierLocalConsumer
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
                    MyComposable()
                }
            }
        }
    }
}

@Composable
fun MyComposable() {
    Box(Modifier.fillMaxSize()) {
        // TODO: 1. add a Modifier to the image to fill the max height,
        //            modifier = Modifier.fillMaxHeight(),

        // TODO: 2. scale the image to fill the screen with ContentScale.Crop
        //            contentScale = ContentScale.Crop,
        Image(
            painter = painterResource(id = R.drawable.marseille),
            contentDescription = null,
        )

        Column(
            modifier = Modifier
        ) {
            // TODO: 3. add styling to the text
            //  change the text color to white: color = Color(0xFFFFFFFF),
            //  increase the size: fontSize = 14.sp,
            //  make the text more spacious: letterSpacing = 6.sp
            Text(
                text = "GREETINGS FROM",
            )
            // TODO: 4. add styling to the text:
            //  color: white,
            //  fontSize: 32.sp,
            //  letterSpacing: 8.sp,
            //  fontWeight: FontWeight.Bold
            Text(
                text = "MARSEILLE",
            )

        // TODO: 5. replace the default Modifier of the column to emphasize the text:
        //       modifier = Modifier
        //          .background(Color(0x40FFFFFF))
        //          .padding(8.dp)

        }
    }
}


@Preview(showBackground = true)
@Composable
fun ComposablePreview() {
    MyComposable()
}