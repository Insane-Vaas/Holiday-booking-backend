package com.example.holidaysite.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long userid;
    private String name;
    private int age;
    private String cityName;
    private String hotelName;

    public User() {
    }

    public User(Long userid, String name, int age, String cityName, String hotelName) {
        this.userid = userid;
        this.name = name;
        this.age = age;
        this.cityName = cityName;
        this.hotelName = hotelName;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cityName='" + cityName + '\'' +
                ", hotelName='" + hotelName + '\'' +
                '}';
    }
}
