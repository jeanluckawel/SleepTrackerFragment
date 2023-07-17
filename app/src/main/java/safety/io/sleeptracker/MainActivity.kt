package safety.io.sleeptracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import safety.io.sleeptracker.ui.theme.SleepTrackerFragmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SleepTrackerFragmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Header(text: String, backIcon: ImageVector?, background: Color = Color.DarkGray) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(background)
            .height(52.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(12.dp))
        if (null != backIcon) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
            ) {
                Icon(imageVector = backIcon, contentDescription = null, tint = Color.White)
            }
        }
        Text(text = text, color = Color.White)
    }
}

@Composable
fun Main() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(text = "Bus Schedule", backIcon = null, background = Color(0xFF9C27B0))
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    SleepTrackerFragmentTheme {
        Header(
            text = "Bus Schedule",
            backIcon = Icons.Default.ArrowBack,
            background = Color(0xFF9C27B0)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun MainPreview() {
    SleepTrackerFragmentTheme {
        Main()
    }
}