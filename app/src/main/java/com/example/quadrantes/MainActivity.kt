package com.example.quadrantes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantes.ui.theme.QuadrantesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PainelPrincipal()
                }
            }
        }
    }
}

@Composable
fun PainelPrincipal(){
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.weight(1f)
            ) {
            ConteudoColuna(title = "Text composable",
                description = "Displays text and follows Material Design guidelines.",
                backgroundColor = androidx.compose.ui.graphics.Color.Green,
                modifier = Modifier.weight(1f)
            )
            ConteudoColuna(title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = androidx.compose.ui.graphics.Color.Yellow,
                modifier = Modifier.weight(1f)
            )

        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(androidx.compose.ui.graphics.Color.Cyan)
                    .weight(1f)
                    .fillMaxSize()
            ) {
                Text(text = "Row composable",
                    modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight.Bold)
                Text(text = "A layout composable that places its children in a horizontal sequence.",
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    textAlign = TextAlign.Justify)
            }
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(androidx.compose.ui.graphics.Color.LightGray)
                    .weight(1f)
                    .fillMaxSize()
            ) {
                Text(text = "Column composable",
                    modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight.Bold)
                Text(text = "A layout composable that places its children in a vertical sequence.",
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    textAlign = TextAlign.Justify)
            }
        }
    }

}

@Composable
private fun ConteudoColuna(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(backgroundColor)
            .fillMaxSize()
    ) {
        Text(text = title,
            modifier = Modifier.padding(16.dp),
            fontWeight = FontWeight.Bold)
        Text(text = description,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QuadrantesTheme {
        PainelPrincipal()
    }
}