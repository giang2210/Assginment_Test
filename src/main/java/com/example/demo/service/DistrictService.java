package com.example.demo.service;

import com.example.demo.entity.District;
import com.example.demo.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictService {
    @Autowired
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
