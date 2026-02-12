package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<Object> {
    /**
     * Holds the city name.
     */
    private String city;
    /**
     * Holds the province name.
     */
    private String province;

    /**
     * Constructor for City.
     * @param city
     *  City name
     * @param province
     *  Province name
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     * @return city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the name of the province.
     * @return province name
     */
    String getProvinceName() {
        return this.province;
    }

    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;
        return this.city.equals(city.city) &&
                this.province.equals(city.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
