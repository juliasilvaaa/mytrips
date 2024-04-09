package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R

@Composable
fun TelaHome(controleDeNavegacao: NavHostController) {

    // Column, Surface a imagem e uma column que tenha td que vai estar por cima


    Column {
        Surface (
            modifier = Modifier
                .height(200.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.fundoparis),
                contentDescription = "Paris",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )

            Column {
                Image(
                    painter = painterResource(id = R.drawable.mulher),
                    contentDescription = "Perfil",
                    modifier = Modifier
                        .width(61.dp)
                        .height(61.dp)
                        .offset(x = 315.dp, y = 13.dp)
                )

                Text(
                    text = "Susanna Hoffs",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier
                        .offset(x = 290.dp, y = 18.dp)


                )

                Icon(
                    imageVector = Icons.Filled.LocationOn,
                    contentDescription = "", tint = Color.White,
                    modifier = Modifier
                        .offset(x = 0.dp, y = 64.dp)
                )

                Text(
                    text = "You're in Paris",
                    color = Color.White,
                    modifier = Modifier
                        .offset(x = 25.dp, y = 42.dp)
                )

                Text(
                    text = "My Trips",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .offset(x = 20.dp, y = 38.dp)
                )
            }
        }

        Column {
            Text(
                text = "Categories",
                fontWeight = FontWeight.W400,
                fontSize = 18.sp,
                color = Color(0xFF565454),
                modifier = Modifier
                    .offset(x = 10.dp, y = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(14.dp))


        LazyRow {
            items(3){

                // Card das categorias
                Card (

                    modifier = Modifier
                        .fillMaxWidth()
                        .height(90.dp)
                        .width(140.dp)
                        .padding(horizontal = 6.dp),
                    colors = CardDefaults
                        .cardColors(
                            // FF - opacidade
                            containerColor = Color(0xFFCF06F0)
                        )

                ) {

                    Column (
                        // Alinhando no centro
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        // Deixar o fundo tranparente
                        Card(
                            colors = CardDefaults.cardColors(Color.Transparent))
                        {
                            Image(
                                painter = painterResource(id = R.drawable.montanha) ,
                                contentDescription = "Montanha",
                                modifier = Modifier
                                    .width(52.dp)
                                    .height(52.dp)

                            )
                        }
                        Column (
                            modifier = Modifier
                                .padding(start = 8.dp)
                        ){
                            Text(
                                text = "Montain",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W400,
                                color = Color.White,
                            )

                        }


                    }

                }
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(90.dp)
                        .width(140.dp)
                        .padding(horizontal = 6.dp),
                    colors = CardDefaults
                        .cardColors(
                            // FF - opacidade
                            containerColor = Color(0xFFCF06F0)

                        )

                ) {

                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Card(colors = CardDefaults.cardColors(Color.Transparent)){
                            Image(
                                painter = painterResource(id = R.drawable.montanha) ,
                                contentDescription = "Montanha",
                                // Traz a imagem para frente e ocupa o espaco
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(52.dp)
                                    .height(52.dp)
                            )
                        }

                        Column (
                            modifier = Modifier
                                .padding(start = 8.dp)
                        ){
                            Text(
                                text = "Snow",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W400,
                                color = Color.White

                            )
                            Spacer(modifier = Modifier)

                        }


                    }

                }

                // Card dos lugares
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(90.dp)
                        .width(140.dp)
                        .padding(horizontal = 6.dp),
                    colors = CardDefaults
                        .cardColors(
                            // FF - opacidade
                            containerColor = Color(0xFFCF06F0)
                        )

                ) {

                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Card(colors = CardDefaults.cardColors(Color.Transparent)){
                            Image(
                                painter = painterResource(id = R.drawable.praia) ,
                                contentDescription = "Praia",
                                // Traz a imagem para frente e ocupa o espaco
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(52.dp)
                                    .height(52.dp)
                            )
                        }
                        Column (
                            modifier = Modifier
                                .padding(start = 8.dp)
                        ){
                            Text(
                                text = "Beach",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W400,
                                color = Color.White,


                                )
                            Spacer(modifier = Modifier)

                        }

                    }

                }
            }


        }
        Spacer(modifier = Modifier.height(4.dp))

        Card (
            elevation = CardDefaults.cardElevation(7.dp),
            shape = RoundedCornerShape(23.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(70.dp)
        ) {
            // Campo de pesquisa
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 7.dp)
                ,
                placeholder = {
                    Text(
                        text = "Search your destiny",
                        color = Color(0xFFA09C9C)
                    )
                },
                trailingIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "",
                            tint = Color(0xFFB7B7B7)
                        )

                    }
                },
                colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color.Transparent, focusedBorderColor = Color.Transparent)
            )
        }


        Text(
            text = "Past Trips",
            fontSize = 16.sp,
            color = Color(0xFF565454),
            modifier = Modifier
                .offset(x = 12.dp)
        )


//        Lugares
        LazyColumn{
            items(2){

                // Card das categorias
                Card (
                    // Deixar com espaco das laterais, elevacao, cor e tamanho do Card
                    elevation = CardDefaults.cardElevation(6.dp),
                    modifier = Modifier
                        .height(235.dp)
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = CardDefaults
                        .cardColors(
                            // FF - opacidade
                            containerColor = Color.White
                        )

                ) {
                    Column (
                        // Alinhando no centro
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(3.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.london) ,
                            contentDescription = "London, 2019",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(120.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(8.dp))

                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "London, 2019",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.W400,
                            color = Color(0xFFCF06F0)
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                            fontSize = 12.sp,
                            color = Color(0xFFA09C9C)

                        )

                        Text(
                            text = "18 Feb - 21 Feb",
                            color = Color(0xFFCF06F0),
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.End)
                        )


                    }

                }

                // Card de porto
                Card (
                    // Deixar com espaco das laterais, elevacao, cor e tamanho do Card
                    elevation = CardDefaults.cardElevation(6.dp),
                    modifier = Modifier
                        .height(235.dp)
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = CardDefaults
                        .cardColors(
                            // FF - opacidade
                            containerColor = Color.White
                        )

                ) {
                    Column (
                        // Alinhando no centro
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(3.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.porto) ,
                            contentDescription = "Porto, 2022",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(120.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(8.dp))

                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Porto, 2022",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.W400,
                            color = Color(0xFFCF06F0)
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula's major urban areas.",
                            fontSize = 12.sp,
                            color = Color(0xFFA09C9C)

                        )

                        Text(
                            text = "15 may - 22 may",
                            color = Color(0xFFCF06F0),
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.End)
                        )


                    }

                }



            }
        }

    }


}