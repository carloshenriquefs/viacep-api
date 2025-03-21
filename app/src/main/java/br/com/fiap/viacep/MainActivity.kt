package br.com.fiap.viacep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.fiap.viacep.screen.CepScreen
import br.com.fiap.viacep.ui.theme.ViacepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViacepTheme {
                CepScreen()
            }
        }
    }
}
