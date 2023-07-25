package castelles.com.github.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import castelles.com.github.designsystem.theme.Purple40

@Composable
fun PrimaryButton(
    text: String,
    isEnabled: Boolean,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick.invoke() },
        enabled = isEnabled,
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .setBackgroundOnState(isEnabled),

        ) {
        Text(text = text, color = Color.White, fontWeight = FontWeight.Bold)
    }
}

fun Modifier.setBackgroundOnState(enabled: Boolean): Modifier {
    background(if (enabled) Purple40 else Color.LightGray)
    return this
}

@Preview
@Composable
fun ButtonPreview() {
    PrimaryButton(text = "Fetch", isEnabled = true) { }
}