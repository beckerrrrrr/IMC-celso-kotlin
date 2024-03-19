package br.senai.sp.jandira.layout_luisbecker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.layout_luisbecker.ui.theme.Layout_LuisBeckerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout_LuisBeckerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}
@Composable
fun Greeting() {
    Surface (
        modifier = Modifier.fillMaxSize(),
    ) {
        Column {

            Card(

                modifier = Modifier

                    .size(height = 180.dp, width = 400.dp),

                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xfffED145B)
                    ),


                ) {
                Image(
                    painter = painterResource(id = R.drawable.login),
                    contentDescription = "Foto de Perfil",
                    modifier = Modifier
                        .size(height = 60.dp, width = 360.dp)
                        .offset(y = 20.dp),

                    )
                Text(
                    text = "Calculadora IMC",
                    modifier = Modifier
                        .padding(top = 25.dp, start = 100.dp),
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                )


            }

            Card(


                modifier = Modifier
                    .width(350.dp)
                    .height(450.dp)
                    .padding(start = 45.dp)
                    .offset(y = -40.dp)
                    .align(Alignment.Start)

            ) {
                Column()
                {
                    Text(
                        text = "Seus dados",
                        fontSize = 24.sp,
                        color = Color(0xfffED145B),
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .padding(32.dp)
                            .align(Alignment.CenterHorizontally)
                    )

                    Text(
                        text = "Seus dados",
                        fontSize = 15.sp,
                        color = Color(0xfffED145B),
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .padding(start = 24.dp)
                    )


                    Spacer(modifier = Modifier.height(11.dp))
                    OutlinedTextField(
                        modifier = Modifier.padding(20.dp),
                        value = "",
                        onValueChange = {},
                        shape = RoundedCornerShape(10.dp),
                        placeholder = {
                            Text(text = "Seu Peso em kg")
                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedContainerColor = Color.White,
                                focusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xFFE61753),
                                focusedBorderColor = Color(0xFFE61753),
                                unfocusedPlaceholderColor = Color.Gray,
                            )

                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Sua altura",
                        fontSize = 15.sp,
                        color = Color(0xfffED145B),
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .padding(start = 24.dp)
                    )

                    
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        modifier = Modifier.padding(20.dp),
                        value = "",
                        onValueChange = {},
                        shape = RoundedCornerShape(10.dp),
                        placeholder = {

                            Text(text = "Sua altura em cm")
                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedContainerColor = Color.White,
                                focusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xFFE61753),
                                focusedBorderColor = Color(0xFFE61753),
                                unfocusedPlaceholderColor = Color.Gray,
                            )

                    )


                    Spacer(modifier = Modifier.height(10.dp))
                    Button(
                        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color(0xFFE61753) ),
                        modifier = Modifier
                            .width(350.dp)
                            .height(70.dp)
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally),

                    ) {
                        Text(
                            text = "CALCULAR",
                            fontWeight = FontWeight.ExtraBold,



                        )

                    }
                }
                    }
                    Spacer(modifier = Modifier.height(40.dp))
                    Card(
                        modifier = Modifier
                            .width(350.dp)
                            .height(100.dp)
                            .padding(start = 30.dp)
                            .offset(y = -50.dp),
                        colors = CardDefaults.cardColors(Color(0xff329F6B)),
                        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
                    )
                    {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(start = 20.dp, top = 20.dp),
                        )
                        {
                            Column(
                                modifier = Modifier
                                    .padding(5.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Resultado",
                                    fontSize = 16.sp,
                                    color = Color(0xFFFFFFFF),
                                )
                                Text(
                                    text = "Peso Ideal",
                                    fontSize = 24.sp,
                                    color = Color(0xFFFFFFFF),
                                )
                            }
                            Spacer(modifier = Modifier.width(40.dp))
                            Text(
                                text = "21.3",
                                fontSize = 45.sp,
                                color = Color(0xFFFFFFFF),
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }





            }


        }

    }




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Layout_LuisBeckerTheme {
        Greeting()
    }
}