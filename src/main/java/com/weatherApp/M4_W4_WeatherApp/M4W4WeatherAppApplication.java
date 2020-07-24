package com.weatherApp.M4_W4_WeatherApp;

import com.weatherApp.M4_W4_WeatherApp.model.Location;
import com.weatherApp.M4_W4_WeatherApp.service.ILocationService;
import com.weatherApp.M4_W4_WeatherApp.service.LocationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class M4W4WeatherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(M4W4WeatherAppApplication.class, args);
	}
}
