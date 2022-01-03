package com.example.holidaysite.service;

import com.example.holidaysite.entity.Hotels;

import java.util.List;

public interface HotelService {
    List<Hotels> getHotels(Long id);

    Hotels bookRoom(Long cid, Long hid);
}
