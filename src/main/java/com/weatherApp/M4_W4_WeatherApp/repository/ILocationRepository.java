package com.weatherApp.M4_W4_WeatherApp.repository;

import com.weatherApp.M4_W4_WeatherApp.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocationRepository extends CrudRepository<Location, Long> {
}
