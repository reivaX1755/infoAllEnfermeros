package com.hospital.infonurse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.infonurse.models.Nurse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/enfermeros")
public class NurseController {

    @GetMapping
    public List<Nurse> getAllNurses() {
        List<Nurse> nurses = new ArrayList<>();
        nurses.add(new Nurse("Laura", "laurag", "password123"));
        nurses.add(new Nurse("Carlos", "carlosm", "passCarlos"));
        nurses.add(new Nurse("Marta", "martaf", "martaSecure01"));
        nurses.add(new Nurse("Juan", "juanperez", "juanPass!"));
        nurses.add(new Nurse("Ana", "ana_garcia", "ana123456"));
        nurses.add(new Nurse("Jose", "jose_lara", "josePwd789"));
        nurses.add(new Nurse("Sofia", "sofia.m", "sofPass10"));
        nurses.add(new Nurse("Pedro", "pedroruiz", "pedroKey"));
        nurses.add(new Nurse("Elena", "elena99", "elena!pass"));
        nurses.add(new Nurse("Raul", "raulh", "raulSegura"));
        
        return nurses;
    }
}
