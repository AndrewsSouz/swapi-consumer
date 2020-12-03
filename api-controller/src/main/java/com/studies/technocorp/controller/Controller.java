package com.studies.technocorp.controller;

import com.studies.technocorp.model.*;
import com.studies.technocorp.model.model_wrapper.*;
import com.studies.technocorp.service.SwapiConsumerService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor             //TO MAKE THE DEPENDENCY INJECTION
@RestController                 //MAINLY MAKES THE CLASS A BEAN THAT RESPONSES A JSON
@RequestMapping("/swapi")       //ENDPOINT MAPPER
@ComponentScan("com.studies.technocorp.controllers")
public class Controller {

    //DEPENDS OF SwapiConsumerService
    SwapiConsumerService swapiConsumerService;

    //MAPPERS TO METHODS THAT CALL THE ENTIRE COLLECTION
    @GetMapping("/people")
    public PeopleWrapper callAllPeople() {
        return swapiConsumerService.callAllPeople("people");
    }

    @GetMapping("/films")
    public FilmWrapper callAllFilms() {
        return swapiConsumerService.callAllfilms("films");
    }

    @GetMapping("/planets")
    public PlanetWrapper callAllPlanets() {
        return swapiConsumerService.callAllPlanets("planets");
    }

    @GetMapping("/species")
    public SpecieWrapper callAllSpecies() {
        return swapiConsumerService.callAllSpecies("species");
    }

    @GetMapping("/starships")
    public StarshipWrapper callAllStarships() {
        return swapiConsumerService.callAllStarships("starships");
    }

    @GetMapping("/vehicles")
    public VehicleWrapper callAllVehilcles() {
        return swapiConsumerService.callAllVehicles("vehicles");
    }

    //MAPPERS THAT CALL A SINGLE DOCUMENT
    @GetMapping("/people/{id}")
    public People callPeople(@PathVariable String id) {
        return swapiConsumerService.callPeople("people", id);
    }

    @GetMapping("/planets/{id}")
    public Planet callPlanets(@PathVariable String id) {
        return swapiConsumerService.callPlanet("planets", id);
    }

    @GetMapping("/species/{id}")
    public Specie callSpecies(@PathVariable String id) {
        return swapiConsumerService.callSpecies("species", id);
    }

    @GetMapping("/starships/{id}")
    public Starship callStarships(@PathVariable String id) {
        return swapiConsumerService.callStarships("starships", id);
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle callVehicles(@PathVariable String id) {
        return swapiConsumerService.callVehicles("vehicles", id);
    }

    @GetMapping("/films/{id}")
    public Films callFilms(@PathVariable String id) {
        return swapiConsumerService.callFilms("films", id);
    }

}
