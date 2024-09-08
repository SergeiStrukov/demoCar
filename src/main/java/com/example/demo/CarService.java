package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car createCar(Car car) {
        Car tempCar = carRepository.save(car);
        return tempCar;
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public Car updateCar(Long id, Car updateCar) {
        if (carRepository.existsById(id)) {
            updateCar.setId(id);
            carRepository.save(updateCar);
            return updateCar;
        }
        return null;
    }

    public boolean deleteCar(Long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return true;
        }
        return false;
    }
//    public List<Car> findByBrand(String brand) {
//        return carRepository.findByBrand(brand);
//    }
}