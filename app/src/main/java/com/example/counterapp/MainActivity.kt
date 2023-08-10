package com.example.counterapp

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.counterapp.ui.theme.CounterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myCounter()
        }
    }
}

@Composable
fun myCounter() {

    var count by rememberSaveable {
        mutableStateOf(0)
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Greek Salad",
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            ))

        Row {
            IconButton(onClick = {count--}) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "Subtract")
            }

            Text(text = count.toString(),
                modifier = Modifier.padding(10.dp),
                style = TextStyle(
                    fontSize = 18.sp
                )
            )

            IconButton(onClick = {count++}) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Add")
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
