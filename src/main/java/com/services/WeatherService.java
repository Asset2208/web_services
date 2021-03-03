package com.services;

import org.json.JSONObject;

public interface WeatherService {
    String getWeatherByPath(String name);
    String getWeatherByParam(String name);
}
