package com.jcjiron.pounds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jcjiron.pounds.theme.PoundsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PoundsTheme {
                Scaffold(topBar = { AppBar() }) {

                    Row(verticalAlignment = Alignment.Bottom,
                    modifier = Modifier.fillMaxSize()) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary)
                        ) {
                            Text(
                                text = "Presioname",
                                color = MaterialTheme.colors.onSecondary
                            )
                        }
                        Column {
                            Text("Alfred")
                            Text("3 minutes ago")
                        }
                    }

                }
            }
        }
    }

    @Composable
    fun AppBar() {
        TopAppBar(
            title = { Text(text = "Título de la pantalla") },
            elevation = 8.dp
        )
    }

}