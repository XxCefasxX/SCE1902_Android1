package com.example.testing

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testing.ui.theme.TestingTheme


@Preview(showBackground = true)
@Composable
fun PersonalPrev() {
    TestingTheme {
        Personal()
    }
}


@Composable
fun Personal() {

    var name by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var old by remember { mutableStateOf(0) }
    var cel by remember { mutableStateOf("") }

    var persona = Persona("", "", "", 0, "")
    var lista = remember { mutableStateListOf(persona) }

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Nombre:")
        TextField(value = "", onValueChange = { newval ->
            name = newval
        })
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Apellido:")
        TextField(value = "", onValueChange = { newval ->
            lastName = newval
        })
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Correo:")
        TextField(value = "", onValueChange = { newval ->
            email = newval
        })
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Edad:")
        TextField(value = "", onValueChange = { newval ->
            old = newval.toInt()
        })
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Celular:")
        TextField(value = "", onValueChange = { newval ->
            cel = newval
        })
        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {
            persona = Persona(name, lastName, email, old, cel)
            lista.add(persona)
            printlista(lista)
        }) {
            Text(text = "Agregar")
        }
    }
}

fun printlista(perosnas: List<Persona>) {
    for (item in perosnas) {
        Log.i("prueba", "${item.Nombre}")
    }
}

fun ListTest() {
    var milista: ArrayList<Persona> = ArrayList()
    var persona = Persona(
        "Pedro",
        "Salazar",
        "coreo@prueba.com",
        18,
        "+54656465"
    )
    milista.add(persona)
    persona = Persona(
        "Juan",
        "Lopez",
        "coreojuan@prueba.com",
        18,
        "87987"
    )
    milista.add(persona)


    for (item in milista) {
        Log.i("prueba", "$item")
    }
}

class Persona(
    val Nombre: String,
    val Apellido: String,
    val Correo: String,
    val Edad: Int,
    val Celular: String
) {}