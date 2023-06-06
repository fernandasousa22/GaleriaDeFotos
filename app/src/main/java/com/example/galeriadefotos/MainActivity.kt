package com.example.galeriadefotos

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.galeriadefotos.ui.theme.GaleriaDeFotosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaDeFotosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun GaleriaDeFotos(
    idImage: Int,
    idDescrição: Int
) {

    Card() {
        Column() {
            Image(
                painter = painterResource(id = idImage),
                contentDescription = null
            )
            Text(
                text = stringResource(id = idDescrição))
        }



    }
}
@Preview
@Composable
fun PreviewGaleria(){
    Column() {
        GaleriaDeFotos(
            idImage = R.drawable.vangogh,
            idDescrição = R.string.descricao_imagem1
        )
        GaleriaDeFotos(
            idImage = R.drawable.vangogh1,
            idDescrição = R.string.descricao_imagem2
        )
    }
}
