package com.elflin.visprog_week2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elflin.visprog_week2.ui.theme.VisProg_Week2Theme

class QuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisProg_Week2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantView()
                }
            }
        }
    }
}

@Composable
fun QuadrantView() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = "Displays text and follows the recommended Material Design guidelines.")
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Image composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = "Creates a composable that lays out and draws a given Painter class object.")
            }
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            CellView(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)
            )
            CellView(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun CellView(title: String, description: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextTitleAndDesc(
            title,
            FontWeight.Bold,
            TextAlign.Center,
            Modifier.padding(bottom=16.dp)
        )
        TextTitleAndDesc(
            description,
            FontWeight.Normal,
            TextAlign.Justify,
            Modifier.padding(bottom=0.dp)
        )
    }
}

@Composable
fun TextTitleAndDesc(
    text: String,
    fontWeight: FontWeight,
    textAlign: TextAlign,
    modifier: Modifier){
    Text(
        text = text,
        fontWeight = fontWeight,
        textAlign = textAlign,
        modifier =modifier
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadrantPreview() {
    VisProg_Week2Theme {
        QuadrantView()
    }
}