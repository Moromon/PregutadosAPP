package com.example.apptrivial.screens


import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apptrivial.components.RadioButton


@Composable
fun OptionsScreen(
    quantity: Int,
    updateData: (Int) -> Unit = { },
    updateMusic: (Boolean) -> Unit = { },

) {
    var selectedQuantity by remember { mutableStateOf(quantity) }
    var mutedSong by remember { mutableStateOf(true)}

    fun OnQuantitySelected(i: Int) {
        selectedQuantity = i
        updateData(selectedQuantity)
    }
    fun MuteSong(){
        updateMusic(mutedSong)
    }


    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Selecciona la cantidad de preguntas:",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            RadioButton(
                selected = selectedQuantity == 10,
                onClick = { OnQuantitySelected(10) },
                text = "10"
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
            Text("Música")
            Checkbox(
                checked = mutedSong,
                onCheckedChange = { isChecked ->
                    mutedSong = isChecked
                    MuteSong()
                }
            )
        }

    }



}






