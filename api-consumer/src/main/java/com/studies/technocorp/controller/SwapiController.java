package com.studies.technocorp.controller;

import com.studies.technocorp.model.*;
import com.studies.technocorp.model.model_wrapper.*;
import com.studies.technocorp.service.ConsumerService;
import lombok.AllArgsConstructor;
import com.studies.technocorp.controllers.CrudController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor             //TO MAKE THE DEPENDENCY INJECTION
@RestController                 //MAINLY MAKES THE CLASS A BEAN THAT RESPONSES A JSON
@RequestMapping("/swapi")       //ENDPOINT MAPPER
@ComponentScan("com.studies.technocorp.controllers")
public class SwapiController {

    //DEPENDS OF ConsumerService
    ConsumerService consumerService;
    CrudController crudController;


    @GetMapping("/teste")
    public String testDependency() {
        return crudController.hello();
    }

    //MAPPERS TO METHODS THAT CALL THE ENTIRE COLLECTION
    @GetMapping("/people")
    public PeopleWrapper callAllPeople() {
        return consumerService.callAllPeople("people");
    }

    @GetMapping("/films")
    public FilmWrapper callAllFilms() {
        return consumerService.callAllfilms("films");
    }

    @GetMapping("/planets")
    public PlanetWrapper callAllPlanets() {
        return consumerService.callAllPlanets("planets");
    }

    @GetMapping("/species")
    public SpecieWrapper callAllSpecies() {
        return consumerService.callAllSpecies("species");
    }

    @GetMapping("/starships")
    public StarshipWrapper callAllStarships() {
        return consumerService.callAllStarships("starships");
    }

    @GetMapping("/vehicles")
    public VehicleWrapper callAllVehilcles() {
        return consumerService.callAllVehicles("vehicles");
    }

    //MAPPERS THAT CALL A SINGLE DOCUMENT
    @GetMapping("/people/{id}")
    public People callPeople(@PathVariable String id) {
        return consumerService.callPeople("people", id);
    }

    @GetMapping("/planets/{id}")
    public Planet callPlanets(@PathVariable String id) {
        return consumerService.callPlanet("planets", id);
    }

    @GetMapping("/species/{id}")
    public Specie callSpecies(@PathVariable String id) {
        return consumerService.callSpecies("species", id);
    }

    @GetMapping("/starships/{id}")
    public Starship callStarships(@PathVariable String id) {
        return consumerService.callStarships("starships", id);
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle callVehicles(@PathVariable String id) {
        return consumerService.callVehicles("vehicles", id);
    }

    @GetMapping("/films/{id}")
    public Films callFilms(@PathVariable String id) {
        return consumerService.callFilms("films", id);
    }

}
