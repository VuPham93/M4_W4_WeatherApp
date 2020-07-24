package com.weatherApp.M4_W4_WeatherApp.service;

import com.weatherApp.M4_W4_WeatherApp.model.Location;
import com.weatherApp.M4_W4_WeatherApp.repository.ILocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationService implements ILocationService{
    @Autowired
    private ILocationRepository locationRepository;

    @Override
    public Location findById(Long id) {
        Optional<Location> location = locationRepository.findById(id);
        Location local=null;
        if (location.isPresent()){
            local=location.get();
        }
        return local;
    }

    @Override
    public Iterable<Location> findAll() {
        return locationRepository.findAll();
    }
}