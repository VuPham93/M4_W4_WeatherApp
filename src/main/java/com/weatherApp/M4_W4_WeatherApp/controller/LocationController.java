package com.weatherApp.M4_W4_WeatherApp.controller;

import com.weatherApp.M4_W4_WeatherApp.model.Location;
import com.weatherApp.M4_W4_WeatherApp.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LocationController {
    @Autowired
    private ILocationService locationService;

    @GetMapping
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("locations", locationService.findAll());
        return modelAndView;
    }

    @GetMapping("/weather/")
    public ModelAndView showWeather(@RequestParam Long location) {
        ModelAndView modelAndView = new ModelAndView("/weather");
        modelAndView.addObject("location", locationService.findById(location));
        return modelAndView;
    }
}
