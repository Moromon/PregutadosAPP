package com.example.apptrivial.screens


import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apptrivial.R
import com.example.apptrivial.components.RadioButton


@Composable
fun OptionsScreen(
    quantity: Int,
    updateData: (Int) -> Unit = { },
    updateMusic: (Boolean) -> Unit = { },
    onMenu: () -> Unit = {}

) {
    var selectedQuantity by remember { mutableStateOf(quantity) }
    var mutedSong by remember { mutableStateOf(true) }

    val context = LocalContext.current
    val sharedPreferences = context.getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE)
    mutedSong = sharedPreferences.getBoolean("muted", true)
    fun OnQuantitySelected(i: Int) {
        selectedQuantity = i
        updateData(selectedQuantity)
    }

    fun MuteSong() {
        val editor = sharedPreferences.edit()
        editor.putBoolean("muted", mutedSong)
        editor.apply()
        updateMusic(mutedSong)
    }

    val image = painterResource(R.drawable.fondo1)
    val imageModifier = Modifier
        .fillMaxSize()

    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = imageModifier
    )


    Column(
        modifier = Modifier
            .offset(y = 100.dp)
            .padding(horizontal = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Selecciona la cantidad de preguntas:",
            fontSize = 14.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,

            )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            RadioButton(
                selected = selectedQuantity == 10,
                onClick = { OnQuantitySelected(10) },
                text = "10",
            )
            RadioButton(
                selected = selectedQuantity == 15,
                onClick = { OnQuantitySelected(15) },
                text = "15"
            )
            RadioButton(
                selected = selectedQuantity == 20,
                onClick = { OnQuantitySelected(20) },
                text = "20"
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Música",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,

            )
            Checkbox(
                checked = mutedSong,
                onCheckedChange = { isChecked ->
                    mutedSong = isChecked
                    MuteSong()
                }
            )
        }

    }
    Box(modifier = Modifier
        .offset(y = 400.dp)
        .padding(horizontal = 30.dp)
    ) {
        Button(
            onClick = { onMenu() }, modifier = Modifier

                .fillMaxWidth()
                .size(0.dp, 50.dp)
        ) { Text("Menú Principal", style = TextStyle(fontSize = 20.sp)) }
    }


}






