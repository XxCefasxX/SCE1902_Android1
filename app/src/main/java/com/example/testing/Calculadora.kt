package com.example.testing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testing.ui.theme.TestingTheme


@Preview(showBackground = true)
@Composable
fun CalcPrev() {
    TestingTheme {
        Calculator()
    }
}


@Composable
fun Calculator() {
    var num1 by remember {
        mutableStateOf(0)
    }
    var num2 by remember {
        mutableStateOf(0)
    }
    var resultado by rememberSaveable {
        mutableStateOf(0)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        TextField(value = num1.toString(), onValueChange = { newvalue ->
            num1 = newvalue.toInt()
        })
        Spacer(modifier = Modifier.height(5.dp))
        TextField(value = num2.toString(), onValueChange = { newvalue ->
            num2 = newvalue.toInt()
        })
        Row {
            Button(onClick = {
                resultado = num1 + num2
            }) {
                Text(text = "+")
            }
            Button(onClick = {
                resultado = num1 - num2
            }) {
                Text(text = "-")
            }
            Button(onClick = {
                resultado = num1 * num2
            }) {
                Text(text = "*")
            }
            Button(onClick = {
                resultado = num1 / num2
            }) {
                Text(text = "/")
            }
        }
        Text(text = resultado.toString())
    }
}