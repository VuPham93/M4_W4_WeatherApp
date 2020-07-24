package com.weatherApp.M4_W4_WeatherApp.service;

import com.weatherApp.M4_W4_WeatherApp.model.Location;

public interface ILocationService {
    Location findById(Long id);

    Iterable<Location> findAll();
}
