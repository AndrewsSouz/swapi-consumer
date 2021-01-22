package com.studies.technocorp.service;


import com.studies.technocorp.model.*;
import com.studies.technocorp.model.model_wrapper.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service        //SERVICE BEAN
public class SwapiConsumerService {


    String api = "https://swapi.dev/api/";                      //FIXES THE HOST AND API
    private RestTemplate restTemplate = new RestTemplate();     //INSTANTIATE THE CLASS THAT MAKES THE REQUEST

    //URL ASSEMBLERS
    public String joinUrl(String endpoint) {
        return api + endpoint + "/";
    }

    public String joinUrl(String endpoint, String id) {
        return api + endpoint + "/" + id + "/";
    }

    //THESE METHODS CALL ENTIRE COLLECTION OF EACH ENDPOINT
    public PeopleWrapper callAllPeople(String endpoint) {
        return restTemplate.getForObject(joinUrl(endpoint), PeopleWrapper.class);
    }

    public FilmWrapper callAllfilms(String endpoint) {
        return restTemplate.getForObject(joinUrl(endpoint), FilmWrapper.class);
    }

    public PlanetWrapper callAllPlanets(String endpoint) {
        return restTemplate.getForObject(joinUrl(endpoint), PlanetWrapper.class);
    }

    public SpecieWrapper callAllSpecies(String endpoint) {
        return restTemplate.getForObject(joinUrl(endpoint), SpecieWrapper.class);
    }

    public StarshipWrapper callAllStarships(String endpoint) {
        return restTemplate.getForObject(joinUrl(endpoint), StarshipWrapper.class);
    }

    public VehicleWrapper callAllVehicles(String endpoint) {
        return restTemplate.getForObject(joinUrl(endpoint), VehicleWrapper.class);
    }

    //THESE METHODS CALL A SINGLE DOCUMENT OF THE DESIGNED ENDPOINT
    public People callPeople(String endpoint, String id) {
        return restTemplate.getForObject(joinUrl(endpoint, id), People.class);
    }

    public Planet callPlanet(String endpoint, String id) {
        return restTemplate.getForObject(joinUrl(endpoint, id), Planet.class);
    }

    public Specie callSpecies(String endpoint, String id) {
        return restTemplate.getForObject(joinUrl(endpoint, id), Specie.class);
    }

    public Starship callStarships(String endpoint, String id) {
        return restTemplate.getForObject(joinUrl(endpoint, id), Starship.class);
    }

    public Vehicle callVehicles(String endpoint, String id) {
        return restTemplate.getForObject(joinUrl(endpoint, id), Vehicle.class);
    }

    public Films callFilms(String endpoint, String id) {
        return restTemplate.getForObject(joinUrl(endpoint, id), Films.class);
    }
}