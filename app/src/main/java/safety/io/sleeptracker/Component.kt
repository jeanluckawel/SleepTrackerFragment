package safety.io.sleeptracker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import safety.io.sleeptracker.ui.theme.SleepTrackerFragmentTheme
import java.util.Date

@Composable
fun ListLabel(stop:String, arrival:String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(start = 12.dp, end = 12.dp, top = 20.dp, bottom = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = stop, color = Color.DarkGray)
            Text(text = arrival, color = Color.DarkGray)
        }
        Divider(color = Color.DarkGray, thickness = 0.5.dp, modifier = Modifier.padding(bottom = 8.dp))
    }
}

@Composable
fun ListItem(name:String, time: Date) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color(0xFFFDF0FF)/*,
                shape = RoundedCornerShape(12.dp)*/
            ),

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = name, color = Color.DarkGray)
            Text(text = time.toString(), color = Color.DarkGray)
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

@Preview(showBackground = true)
@Composable
fun ListItemPreview() {
    SleepTrackerFragmentTheme {
        ListItem(name = "Name 1", time = Date())
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
fun BodyPreview() {
    SleepTrackerFragmentTheme {
        ListLabel(stop = "Stop 1", arrival = "Arrival 1")
    }
}