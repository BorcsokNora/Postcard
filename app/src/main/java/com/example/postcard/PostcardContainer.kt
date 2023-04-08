package com.example.postcard

import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.core.view.drawToBitmap

@Composable
fun PostcardContainer(
    content: @Composable () -> Unit,
): () -> Unit {
    val context = LocalContext.current
    val composeView = remember { ComposeView(context) }

    fun shareSnapshot() {
        val bitmap = composeView.drawToBitmap()
        val bitmapPath: String =
            MediaStore.Images.Media.insertImage(
                context.contentResolver,
                bitmap,
                "MyAppSnapshot",
                null
            )
        val snapshotUri = Uri.parse(bitmapPath)
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "image/png"
        intent.putExtra(Intent.EXTRA_STREAM, snapshotUri)
        ContextCompat.startActivity(
            context,
            Intent.createChooser(intent, "Share"),
            null
        )
    }

    AndroidView(
        factory = {
            composeView.apply {
                setContent {
                    content.invoke()
                }
            }
        }
    )

    return ::shareSnapshot
}