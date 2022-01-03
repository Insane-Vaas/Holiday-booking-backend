package com.example.holidaysite.service;

import com.example.holidaysite.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {

    void addUser(List<User> user, Long cid, Long hid);
}
