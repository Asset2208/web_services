package com.hello;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/hello")
public class Hello {

    OkHttpClient client = new OkHttpClient();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() throws IOException {


        Request request = new Request.Builder()
                .url("https://community-open-weather-map.p.rapidapi.com/weather?q=Almaty&lat=0&lon=0&callback=test&id=2172797&lang=null&units=%22metric%22%20or%20%22imperial%22&mode=xml%2C%20html")
                .get()
                .addHeader("x-rapidapi-key", "f8915bacb3mshc675e249f5fc321p177892jsn0fc20b5f127e")
                .addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response);
        return response.body().string();
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllObjects(@PathParam("name") String name) {


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
}
