package com.entities;

import java.util.Arrays;
import java.util.List;

public class Location {
    private String zip_code;
    private double lat;
    private double lng;
    private String city;
    private String state;
    private Timezone timezone;
    private List<City> acceptable_city_names;
    private int[] area_codes;

    public Location() {}

    public Location(String zip_code, double lat, double lng, String city, String state, Timezone timezone, List<City> acceptable_city_names, int[] area_codes) {
        this.zip_code = zip_code;
        this.lat = lat;
        this.lng = lng;
        this.city = city;
        this.state = state;
        this.timezone = timezone;
        this.acceptable_city_names = acceptable_city_names;
        this.area_codes = area_codes;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Timezone getTimezone() {
        return timezone;
    }

    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    public List<City> getAcceptable_city_names() {
        return acceptable_city_names;
    }

    public void setAcceptable_city_names(List<City> acceptable_city_names) {
        this.acceptable_city_names = acceptable_city_names;
    }

    public int[] getArea_codes() {
        return area_codes;
    }

    public void setArea_codes(int[] area_codes) {
        this.area_codes = area_codes;
    }

    @Override
    public String toString() {
        return "Location{" +
                "zip_code='" + zip_code + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", timezone=" + timezone +
                ", acceptable_city_names=" + acceptable_city_names +
                ", area_codes=" + Arrays.toString(area_codes) +
                '}';
    }
}
