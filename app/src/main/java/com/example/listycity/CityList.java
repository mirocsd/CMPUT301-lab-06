package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *  This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *  Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if cities contains the given city
     * @param city
     *  The city to check
     * @return
     *  Boolean indicating whether the city is contained
     */
    public boolean hasCity(City city) {
        return this.cities.contains(city);
    }

    /**
     * Removes the given city from the list, throws an
     * exception if the list does not contain the city
     * @param city
     *  The city to be removed
     */
    public void deleteCity(City city) {
        if (hasCity(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException("List does not contain the given city!");
        }
    }
    
    /**
     * Gets the number of cities in the list
     *
     * @return
     *    The number of cities in the list
     */
    public void countCities() {
        return cities.length();
    }
}

