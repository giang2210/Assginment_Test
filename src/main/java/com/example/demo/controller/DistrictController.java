package com.example.demo.controller;

import com.example.demo.entity.District;
import com.example.demo.repository.DistrictRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/districts")
public class DistrictController {
    private DistrictRepository districtRepository;

    public List<District> findAll() {
        return districtRepository.findAll();
    }

    public Optional<District> findById(Integer id) {
        return districtRepository.findById(id);
    }

    public District save(District district) {
        return districtRepository.save(district);
    }

    public List<District> saveAll(List<District> districts){return districtRepository.saveAll(districts);}

    public void deleteById(Integer id) {
        districtRepository.deleteById(id);
    }
}
