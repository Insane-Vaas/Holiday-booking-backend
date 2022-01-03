package com.example.holidaysite.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotels {

    @Id
    private Long h_id;
    private String hotelName;
    private int cost;
    private int roomsAva;
    private double hotelRating;

    public Hotels() {
    }

    public Hotels(Long h_id, String hotelName, int cost, int roomsAva, double hotelRating) {
        this.h_id = h_id;
        this.hotelName = hotelName;
        this.cost = cost;
        this.roomsAva = roomsAva;
        this.hotelRating = hotelRating;
    }

    public Long getH_id() {
        return h_id;
    }

    public void setH_id(Long h_id) {
        this.h_id = h_id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getRoomsAva() {
        return roomsAva;
    }

    public void setRoomsAva(int roomsAva) {
        this.roomsAva = roomsAva;
    }

    public double getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(double hotelRating) {
        this.hotelRating = hotelRating;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "h_id=" + h_id +
                ", hotelName='" + hotelName + '\'' +
                ", cost=" + cost +
                ", roomsAva=" + roomsAva +
                ", hotelRating=" + hotelRating +
                '}';
    }
}
