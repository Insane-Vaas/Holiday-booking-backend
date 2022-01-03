package com.example.holidaysite.controller;

import com.example.holidaysite.entity.City;
import com.example.holidaysite.entity.Hotels;
import com.example.holidaysite.entity.User;
import com.example.holidaysite.service.CityService;
import com.example.holidaysite.service.HotelService;
import com.example.holidaysite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private CityService cityService;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<City> getCity(){

        return cityService.getCities();

    }

    @GetMapping("/{cid}")
    public List<Hotels> getHotels(@PathVariable @Valid Long cid){

        return hotelService.getHotels(cid);

    }

    @GetMapping("/{cid}/{hid}")
    public Hotels bookHotel(@PathVariable @Valid Long cid,@PathVariable @Valid Long hid){

        return hotelService.bookRoom(cid,hid);

    }

    @PostMapping("/{cid}/{hid}/booking")
    public ResponseEntity bookticket(@RequestBody List<User> user, @PathVariable @Valid Long cid, @PathVariable @Valid Long hid){

        userService.addUser(user,cid,hid);

        return new ResponseEntity<>("added", HttpStatus.OK);

    }




}
