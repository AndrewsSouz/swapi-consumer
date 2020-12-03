package com.studies.technocorp.service;

import com.studies.technocorp.model.*;
import com.studies.technocorp.model.model_wrapper.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service        //SERVICE BEAN
public class ConsumerService {


    String api = "https://swapi.dev/api/";                      //FIXES THE HOST AND API
    private RestTemplate restTemplate = new RestTemplate();     //INSTANTIATE THE CLASS THAT MAKES THE REQUEST

    //URL ASSEMBLERS
    public String joinUrl(String endpoint) {
        String url = api + endpoint + "/";
        return url;
    }

    public String joinUrl(String endpoint, String id) {
        String url = api + endpoint + "/" + id + "/";
        return url;
    }

    //THESE METHODS CALL ENTIRE COLLECTION OF EACH ENDPOINT
    public PeopleWrapper callAllPeople(String endpoint) {
        PeopleWrapper peoples = restTemplate.getForObject(joinUrl(endpoint), PeopleWrapper.class);
        return peoples;
    }

    public FilmWrapper callAllfilms(String endpoint) {
        FilmWrapper films = restTemplate.getForObject(joinUrl(endpoint), FilmWrapper.class);
        return films;
    }

    public PlanetWrapper callAllPlanets(String endpoint) {
        PlanetWrapper planets = restTemplate.getForObject(joinUrl(endpoint), PlanetWrapper.class);
        return planets;
    }

    public SpecieWrapper callAllSpecies(String endpoint) {
        SpecieWrapper species = restTemplate.getForObject(joinUrl(endpoint), SpecieWrapper.class);
        return species;
    }

    public StarshipWrapper callAllStarships(String endpoint) {
        StarshipWrapper starships = restTemplate.getForObject(joinUrl(endpoint), StarshipWrapper.class);
        return starships;
    }

    public VehicleWrapper callAllVehicles(String endpoint) {
        VehicleWrapper vehicles = restTemplate.getForObject(joinUrl(endpoint), VehicleWrapper.class);
        return vehicles;
    }

    //THESE METHODS CALL A SINGLE DOCUMENT OF THE DESIGNED ENDPOINT
    public People callPeople(String endpoint, String id) {
        People people = restTemplate.getForObject(joinUrl(endpoint, id), People.class);
        return people;
    }

    public Planet callPlanet(String endpoint, String id) {
        Planet planet = restTemplate.getForObject(joinUrl(endpoint, id), Planet.class);
        return planet;
    }

    public Specie callSpecies(String endpoint, String id) {
        Specie species = restTemplate.getForObject(joinUrl(endpoint, id), Specie.class);
        return species;
    }

    public Starship callStarships(String endpoint, String id) {
        Starship starship = restTemplate.getForObject(joinUrl(endpoint, id), Starship.class);
        return starship;
    }

    public Vehicle callVehicles(String endpoint, String id) {
        Vehicle vehicle = restTemplate.getForObject(joinUrl(endpoint, id), Vehicle.class);
        return vehicle;
    }

    public Films callFilms(String endpoint, String id) {
        Films film = restTemplate.getForObject(joinUrl(endpoint, id), Films.class);
        return film;
    }


}