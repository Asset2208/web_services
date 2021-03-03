package com.services.impl;

import com.entities.Timezone;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.entities.Location;
import com.services.GeoLocationService;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/geo")
public class GeoLocationServiceImpl implements GeoLocationService {
    private final OkHttpClient client = new OkHttpClient();

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getLocationByZip(@QueryParam("zip_code") String zip_code) {

        String url = "https://www.zipcodeapi.com/rest/7eGrRfQxBlf4I0XahwcdOV6Prbfhf5NDA0XbRHXPIn51KCXtaHFDQhrkesMWOjRJ/info.json/" + zip_code + "/degrees";

        Request request = new Request.Builder()
                .url(url)
                .get()
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
    @Path("/timezone")
    @Produces(MediaType.APPLICATION_JSON)
    public Timezone getTimeZone(@QueryParam("zip_code") String zip_code) {
        String url = "https://www.zipcodeapi.com/rest/7eGrRfQxBlf4I0XahwcdOV6Prbfhf5NDA0XbRHXPIn51KCXtaHFDQhrkesMWOjRJ/info.json/" + zip_code + "/degrees";

        ObjectMapper objectMapper = new ObjectMapper();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            Location location = objectMapper.readValue(response.body().string(), Location.class);
            return location.getTimezone();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
