package com.example.holidaysite.service.serviceImp;

import com.example.holidaysite.entity.City;
import com.example.holidaysite.entity.Hotels;
import com.example.holidaysite.entity.User;
import com.example.holidaysite.repository.CityRepository;
import com.example.holidaysite.repository.HotelRepository;
import com.example.holidaysite.repository.UserRepository;
import com.example.holidaysite.service.CityService;
import com.example.holidaysite.service.HotelService;
import com.example.holidaysite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Services implements CityService, HotelService, UserService {

    @Autowired
    private CityRepository crepo;

    @Autowired
    private HotelRepository hrepo;

    @Autowired
    private UserRepository urepo;


    @Override
    public List<City> getCities() {
        List<City> list = new ArrayList<>();

        for(City city : crepo.findAll()){

            list.add(city);

        }

        return list;

    }

    @Override
    public List<Hotels> getHotels(Long id) {

        boolean exist = crepo.existsById(id);
        List<Hotels> list = new ArrayList<>();
        if(exist){

            Optional<City> city = crepo.findById(id);
            list = city.get().getHotelsList();

        }
        return list;

    }

    @Override
    public Hotels bookRoom(Long cid, Long hid) {
        boolean exist = crepo.existsById(cid);

        if(exist){

            for(Hotels hotel : hrepo.findAll()){

                if(hotel.getH_id().equals(hid)){

                    return hotel;

                }

            }

        }

        return new Hotels();

    }

    @Override
    public void addUser(List<User> user, Long cid, Long hid) {

        Optional<City> city = crepo.findById(cid);
        String cityName = city.get().getName();
        Optional<Hotels> hotels = hrepo.findById(hid);
        String hotelName = hotels.get().getHotelName();
        Hotels hotel = hotels.get();
        int a = hotel.getRoomsAva();
        hotel.setRoomsAva(a-1);
        hrepo.save(hotel);

        for(User user1 : user){

            user1.setCityName(cityName);
            user1.setHotelName(hotelName);
            urepo.save(user1);


        }



    }
}
