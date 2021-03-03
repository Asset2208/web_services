package com.services;

import com.entities.Timezone;

public interface GeoLocationService {

    String getLocationByZip(String zip_code);
    Timezone getTimeZone(String zip_code);
}
