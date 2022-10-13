package com.example.weather

import android.os.Bundle
import android.provider.SyncStateContract.Columns
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weather.ui.theme.WeatherTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.sp

@Composable
fun pastcard(image: Int, time: String,temp:String){
    Box(
        modifier = Modifier
            .height(height = 200.dp)
            .width(width = 100.dp)
            .padding(all = 4.dp)
            .clip(RoundedCornerShape(20))
            .background(Color.LightGray.copy(0.2f))
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(height = 20.dp))
            Text(text = time, fontSize = 20.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(height = 20.dp))
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .height(height = 50.dp)
                    .width(width = 50.dp)
            )
            Spacer(modifier = Modifier.height(height = 20.dp))
            Text(text = temp, fontSize = 20.sp,color=Color.Black)
            Spacer(modifier = Modifier.height(height = 10.dp))
        }
    }
}

@Composable
fun warningcard(warn: String, warning_message:String){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .width(width = 50.dp)
            .padding(all = 4.dp)
            .clip(RoundedCornerShape(20))
            .background(Color.LightGray.copy(0.5f))

    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(text = warn, fontSize = 20.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(height = 2.dp))
            Text(text = warning_message, fontSize = 10.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(height = 10.dp))
        }
    }
}

@Composable
fun sunrise_set(sunrise: String, sunset:String){
    Box(
        modifier = Modifier
            .height(height = 150.dp)
            .width(width = 360.dp)
            .padding(all = 10.dp)
            .clip(RoundedCornerShape(20))
            .background(Color.LightGray.copy(0.3f))
    ){
        Row() {
            Spacer(modifier = Modifier.width(width = 65.dp))
            Column() {
                Spacer(modifier = Modifier.height(height = 10.dp))
                Text(text = "Sunrise", color = Color.Black, fontSize = 20.sp)
                Text(text = sunrise,color = Color.Black,fontSize = 10.sp)
                Spacer(modifier = Modifier.height(height = 10.dp))
                val sunrise_image= painterResource(id = R.drawable.icons8_sunrise_50)
                Image(painter = sunrise_image, contentDescription = null, modifier = Modifier
                    .height(height = 50.dp)
                    .width(width = 50.dp))
            }
            Spacer(modifier = Modifier.width(width = 90.dp))
            Column() {
                Spacer(modifier = Modifier.height(height = 10.dp))
                Text(text = "Sunset",color = Color.Black, fontSize = 20.sp)
                Text(text = sunset,color = Color.Black,fontSize = 10.sp)
                Spacer(modifier = Modifier.height(height = 10.dp))
                val sunset_image= painterResource(id = R.drawable.icons8_sunset_50)
                Image(painter = sunset_image, contentDescription = null, modifier = Modifier
                    .height(height = 50.dp)
                    .width(width = 50.dp))
            }
        }
    }
}

@Composable
fun additional_info(uv: String,wind:String,humidity:String){
    Box(
        modifier = Modifier
            .height(height = 150.dp)
            .width(width = 360.dp)
            .padding(all = 10.dp)
            .clip(RoundedCornerShape(20))
            .background(Color.LightGray.copy(0.3f))
    ){
        Row() {
            Spacer(modifier = Modifier.width(width = 40.dp))
            Column() {
                Spacer(modifier = Modifier.height(height = 20.dp))
                val sun_image= painterResource(id = R.drawable.icons8_sun_48)
                Image(painter = sun_image, contentDescription = null, modifier = Modifier
                    .height(height = 45.dp)
                    .width(width = 45.dp))
                Text(text = "UV index", color = Color.Black, fontSize = 15.sp)
                Text(text = uv,color = Color.Black,fontSize = 10.sp)
                Spacer(modifier = Modifier.height(height = 10.dp))
            }
            Spacer(modifier = Modifier.width(width = 50.dp))
            Column() {
                Spacer(modifier = Modifier.height(height = 20.dp))
                val wind_image= painterResource(id = R.drawable.icons8_wind_30)
                Image(painter = wind_image, contentDescription = null, modifier = Modifier
                    .height(height = 45.dp)
                    .width(width = 45.dp))
                Text(text = "Wind", color = Color.Black, fontSize = 15.sp)
                Text(text = wind,color = Color.Black,fontSize = 10.sp)
                Spacer(modifier = Modifier.height(height = 10.dp))
            }
            Spacer(modifier = Modifier.width(width = 50.dp))
            Column() {
                Spacer(modifier = Modifier.height(height = 20.dp))
                val humididty_image= painterResource(id = R.drawable.icons8_humidity_53)
                Image(painter = humididty_image, contentDescription = null, modifier = Modifier
                    .height(height = 45.dp)
                    .width(width = 45.dp))
                Text(text = "Humidity", color = Color.Black, fontSize = 15.sp)
                Text(text = humidity,color = Color.Black,fontSize = 10.sp)
                Spacer(modifier = Modifier.height(height = 10.dp))
            }
        }
    }
}

@Composable
fun r_history(day: String, percentage:String, image:Int,temperature: String){
    Row() {
        Spacer(modifier = Modifier.width(width = 30.dp))
        Text(text = day, color = Color.Black, fontSize = 18.sp)
        Spacer(modifier = Modifier.width(width = 30.dp))

        val rain_drop= painterResource(id = R.drawable.icons8_drop_48)
        Image(painter = rain_drop, contentDescription = null, modifier = Modifier
            .height(height = 20.dp)
            .width(width = 20.dp))

        Text(text = percentage,color = Color.Black, fontSize = 15.sp)

        Spacer(modifier = Modifier.width(width = 30.dp))
        Image(

            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .height(height = 30.dp)
                .width(width = 30.dp)
        )
        Spacer(modifier = Modifier.width(width = 30.dp))
        Text(text = temperature,color = Color.Black, fontSize = 15.sp)
    }
}

@Composable
fun history(
    day1: String, percentage1:String, image1:Int,temperature1: String,
    day2: String, percentage2:String, image2:Int,temperature2: String,
    day3: String, percentage3:String, image3:Int,temperature3: String,
    day4: String, percentage4:String, image4:Int,temperature4: String,
    day5: String, percentage5:String, image5:Int,temperature5: String,
    day6: String, percentage6:String, image6:Int,temperature6: String,
){
    Box(
        modifier = Modifier
            .height(height = 350.dp)
            .width(width = 360.dp)
            .padding(all = 10.dp)
            .clip(RoundedCornerShape(10))
            .background(Color.LightGray.copy(0.3f))
    ){
        Column() {
            Spacer(modifier = Modifier.height(height = 30.dp))
            r_history(day1,percentage1,image1,temperature1)
            Spacer(modifier = Modifier.height(height = 15.dp))
            r_history(day2,percentage2,image2,temperature2)
            Spacer(modifier = Modifier.height(height = 15.dp))
            r_history(day3,percentage3,image3,temperature3)
            Spacer(modifier = Modifier.height(height = 15.dp))
            r_history(day4,percentage4,image4,temperature4)
            Spacer(modifier = Modifier.height(height = 15.dp))
            r_history(day5,percentage5,image5,temperature5)
            Spacer(modifier = Modifier.height(height = 15.dp))
            r_history(day6,percentage6,image6,temperature6)
            Spacer(modifier = Modifier.height(height = 15.dp))
        }
    }
}

@Composable
fun Mainscreen(){
    val image= painterResource(id = R.drawable.ashley_whitlatch_36agnv29ss0_unsplash)
    Image(painter = image,contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(height = 30.dp))
        val nav_image= painterResource(id = R.drawable.icons8_menu_67)
        Button(onClick = { /*TODO*/ }, colors= ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)) {
            Image(
                painter = nav_image, contentDescription = null,
                modifier = Modifier.padding(start = 5.dp),
            )
        }
        Spacer(modifier = Modifier.height(height = 20.dp))
        Row() {
            Text(
                text = "23",
                modifier = Modifier.padding(start = 20.dp),
                color = Color.White,
                fontSize =90.sp
            )
            Text(
                text = "\u00B0",
                color = Color.White,
                fontSize =90.sp
            )
            val current_image= painterResource(id = R.drawable.icons8_partly_cloudy_day_48)
            Spacer(modifier = Modifier.width(width=70.dp))
            Image(painter = current_image, contentDescription = null, modifier = Modifier
                .height(height = 150.dp)
                .width(width = 150.dp))

                 }

        Spacer(modifier = Modifier.height(height = 5.dp))
        Text(text = "Dharwad", modifier = Modifier.padding(start =20.dp ),color=Color.White, fontSize = 30.sp)
        Spacer(modifier = Modifier.height(height = 5.dp))
        Text(text = "30℃/21℃ Feels like 23℃", modifier = Modifier.padding(start =20.dp ),color=Color.White)
        Text(text = "Thu,22:14", modifier = Modifier.padding(start =20.dp ),color=Color.White)
        Spacer(modifier = Modifier.height(height = 40.dp))
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.width(width = 2.dp))
            pastcard(image = R.drawable.icons8_light_rain_50, time = "22:30", temp = "23℃")

            Spacer(modifier = Modifier.width(width = 2.dp))
            pastcard(image = R.drawable.icons8_light_rain_50, time = "1:30", temp = "22℃")

            Spacer(modifier = Modifier.width(width = 2.dp))
            pastcard(image = R.drawable.icons8_light_rain_50, time = "2:30", temp = "21℃")

            Spacer(modifier = Modifier.width(width = 2.dp))
            pastcard(image = R.drawable.icons8_lightning_64, time = "3:30", temp = "21℃")

            Spacer(modifier = Modifier.width(width = 2.dp))
            pastcard(image = R.drawable.icons8_lightning_64, time = "4:30", temp = "20℃")

            Spacer(modifier = Modifier.width(width = 2.dp))
            pastcard(image = R.drawable.icons8_stormy_weather_30, time = "5:30", temp = "23℃")

            Spacer(modifier = Modifier.width(width = 2.dp))
            pastcard(image = R.drawable.icons8_stormy_weather_30, time = "6:30", temp = "23℃")

            Spacer(modifier = Modifier.width(width = 2.dp))
            pastcard(image = R.drawable.icons8_cloudy_64, time = "6:30", temp = "23℃")
        }
        Spacer(modifier = Modifier.height(height = 10.dp))
        warningcard(warn = "Six Hour Storm Outlook", warning_message = "Storms to end by 3:35. More possible later")

        Spacer(modifier = Modifier.height(height = 5.dp))
        sunrise_set(sunrise = "06:19", sunset = "18:20")

        Spacer(modifier = Modifier.height(height = 2.dp))
        additional_info(uv = "Low", wind = "8km/h", humidity = "95%")

        Spacer(modifier = Modifier.height(height = 10.dp))
        history(
            day1 = "Yesterday",
            percentage1 = "90%",
            image1 = R.drawable.icons8_light_rain_50,
            temperature1 = "26°21°",
            day2 = "Tuesday  ",
            percentage2 = "77%",
            image2 = R.drawable.icons8_stormy_weather_30,
            temperature2 = "27°21°",
            day3 = "Monday   ",
            percentage3 = "65%",
            image3 = R.drawable.icons8_stormy_weather_30,
            temperature3 = "28°20°",
            day4 = "Sunday   ",
            percentage4 = "61%",
            image4 = R.drawable.icons8_cloudy_64,
            temperature4 ="29°20°" ,
            day5 = "Saturday ",
            percentage5 = "19%",
            image5 = R.drawable.icons8_cloudy_64,
            temperature5 = "30°21°",
            day6 = "Friday     ",
            percentage6 ="57%" ,
            image6 =R.drawable.icons8_cloudy_64 ,
            temperature6 = "28°21°"
        )
        Spacer(modifier = Modifier.height(height = 10.dp))
        Text(text = "Weather Updated Channel at 30/09, 13:53", color = Color.Black, fontSize = 10.sp, modifier = Modifier.padding(start = 150.dp))


    }
}
