package com.dream.chaser.api.dto;

import java.io.Serializable;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/5/15 17:28
 */
public class CityDTO implements Serializable {

    private Long id;

    private String name;

    private String countryCode;

    private String district;

    private Long population;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }
}
