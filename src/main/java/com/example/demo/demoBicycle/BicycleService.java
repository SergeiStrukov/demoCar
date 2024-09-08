package com.example.demo.demoBicycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BicycleService {
    @Autowired
    BicycleRepository bicycleRepository;

    public BicycleService(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }

    public Bicycle createBicycle(Bicycle bicycle) {
        return bicycleRepository.save(bicycle);
    }

    public List<Bicycle> getAllBicycles() {
        return bicycleRepository.findAll();
    }

    public Bicycle updateBicycle(Long id, Bicycle bicycle) {
        bicycle.setId(id);
        bicycleRepository.save(bicycle);
        return bicycle;
    }
    public boolean deleteBicycleById(Long id){
        if (bicycleRepository.existsById(id)){
            bicycleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
