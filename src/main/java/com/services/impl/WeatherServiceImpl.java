package com.services.impl;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.services.WeatherService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/weather")
public class WeatherServiceImpl implements WeatherService {

    private final OkHttpClient client = new OkHttpClient();

    @Override
    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getWeatherByPath(@PathParam("name") String name) {

        String url = "https://community-open-weather-map.p.rapidapi.com/weather?q=" + name;
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("x-rapidapi-key", "f8915bacb3mshc675e249f5fc321p177892jsn0fc20b5f127e")
                .addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getWeatherByParam(@QueryParam("city") String city_name) {

        String url = "https://community-open-weather-map.p.rapidapi.com/weather?q=" + city_name;
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("x-rapidapi-key", "f8915bacb3mshc675e249f5fc321p177892jsn0fc20b5f127e")
                .addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
