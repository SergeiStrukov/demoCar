package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/demoCar")
public class CarController {

    @Autowired
    private CarService carService;
    @Autowired
    private CarRepository carRepository;

    @PostMapping(value = "/CarRegistration")
    public Car createCar(@Validated @RequestBody Car car) {
        Car car1 = carService.createCar(car);
        return car1;
    }

    @GetMapping(value = "/Cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/Cars/{id}")
    public Optional<Car> getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @PutMapping("/UpdateCars/{id}")
    public Car updateCar(@PathVariable Long id, @Validated @RequestBody Car car) {
        return carService.updateCar(id, car);
    }

    @DeleteMapping("/DeleteCars/{id}")
    public boolean deleteCar(@PathVariable Long id) {
        return carService.deleteCar(id);
    }

    @GetMapping("/findByBrand")
    public List<Car> findByBrand(@RequestParam String brand) {
        List<Car> cars = carRepository.findByBrand(brand);
        return cars;
//        return carService.findByBrand(brand);
    }

    @GetMapping("/findByBrandOrYear")
    public List<Car> findByBrandOrYear(@RequestParam String brand, @RequestParam int year) {
        List<Car> cars = carRepository.findByBrandOrYear(brand, year);
        return cars;

    }

    @GetMapping("/findByBrandOrderByYearAsc")
    public List<Car> findByIdOrderByYearAsc(@RequestParam String brand) {
        List<Car> cars = carRepository.findByBrandOrderByYearAsc(brand);
        return cars;
    }
}
