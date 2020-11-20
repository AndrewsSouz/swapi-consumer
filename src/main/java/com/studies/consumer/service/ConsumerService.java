package com.studies.consumer.service;

import com.studies.consumer.model.*;
import com.studies.consumer.model.model_wrappers.*;
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

    public Planets callPlanet(String endpoint, String id) {
        Planets planet = restTemplate.getForObject(joinUrl(endpoint, id), Planets.class);
        return planet;
    }

    public Species callSpecies(String endpoint, String id) {
        Species species = restTemplate.getForObject(joinUrl(endpoint, id), Species.class);
        return species;
    }

    public Starships callStarships(String endpoint, String id) {
        Starships starships = restTemplate.getForObject(joinUrl(endpoint, id), Starships.class);
        return starships;
    }

    public Vehicles callVehicles(String endpoint, String id) {
        Vehicles vehicles = restTemplate.getForObject(joinUrl(endpoint, id), Vehicles.class);
        return vehicles;
    }

    public Films callFilms(String endpoint, String id) {
        Films film = restTemplate.getForObject(joinUrl(endpoint, id), Films.class);
        return film;
    }


}