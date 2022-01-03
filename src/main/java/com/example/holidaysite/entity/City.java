package com.example.holidaysite.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class City {

    @Id
    private Long id;
    private String name;
    private double cityRating;
    @OneToMany
    private List<Hotels> hotelsList;

    public City() {
    }

    public City(Long id, String name, double cityRating, List<Hotels> hotelsList) {
        this.id = id;
        this.name = name;
        this.cityRating = cityRating;
        this.hotelsList = hotelsList;
    }


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

    public double getCityRating() {
        return cityRating;
    }

    public void setCityRating(double cityRating) {
        this.cityRating = cityRating;
    }

    public List<Hotels> getHotelsList() {
        return hotelsList;
    }

    public void setHotelsList(List<Hotels> hotelsList) {
        this.hotelsList = hotelsList;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityRating=" + cityRating +
                ", hotelsList=" + hotelsList +
                '}';
    }
}
