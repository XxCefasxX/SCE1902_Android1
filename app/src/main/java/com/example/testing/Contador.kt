package com.example.testing

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun Counter() {
    var count by remember {
        mutableStateOf(0)
    }
    Column {
        Button(onClick = {
            count++
        }) {
            Text(text = "+")
        }
        Text(text = count.toString())
    }
}