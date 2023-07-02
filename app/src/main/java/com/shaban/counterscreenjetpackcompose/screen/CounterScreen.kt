package com.shaban.counterscreenjetpackcompose.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen() {
    var counter by remember { mutableStateOf(0) }

    CounterContent(
        counter = counter.toString(),
        onClickPlus = { counter++ },
        onClickMinus = { counter-- }
    )
}

@Composable
private fun CounterContent(
    counter: String,
    onClickPlus: () -> Unit,
    onClickMinus: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Text(text = counter, fontSize = 96.sp)
        Row {
            Button(
                modifier = Modifier.size(96.dp),
                onClick = onClickMinus,
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "-", fontSize = 48.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                modifier = Modifier.size(96.dp),
                onClick = onClickPlus,
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "+", fontSize = 48.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCounterScreen() {
    CounterScreen()
}