package com.shailtalati.intellify_shail_practical.weather_info_show.model

import com.shailtalati.intellify_shail_practical.common.RequestCompleteListener
import com.shailtalati.intellify_shail_practical.weather_info_show.model.data_class.City
import com.shailtalati.intellify_shail_practical.weather_info_show.model.data_class.WeatherInfoResponse

interface WeatherInfoShowModel {
    fun getCityList(callback: RequestCompleteListener<MutableList<City>>)
    fun getWeatherInfo(cityId: Int, callback: RequestCompleteListener<WeatherInfoResponse>)
}