package com.example.testing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun TextTest() {
    Text(text = "texto 1")
    Text(text = "texto 2")
    Text(text = "texto 3")
}

@Composable
fun BoxTest(text: String) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .background(Color.Red)
    ) {
        Text(text = text)
    }
}

@Composable
fun ColumnTest() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .verticalScroll(rememberScrollState())
    ) {

        Row(
            modifier = Modifier
                .background(Color.Red)
                .weight(3f)
                .fillMaxWidth()
                .align(Alignment.End)
        ) {
            Text(text = "soy el rojo")
        }

        Row(
            modifier = Modifier
                .background(Color.Yellow)
                .weight(2f)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .weight(3f)
                    .fillMaxHeight()
            ) {

            }
            Column(
                modifier = Modifier
                    .background(Color.Cyan)
                    .weight(2f)
                    .fillMaxHeight()
            ) {

            }

        }
        Row(
            modifier = Modifier
                .background(Color.Magenta)
                .weight(3f)
                .fillMaxWidth()
        ) {

        }
    }
}
