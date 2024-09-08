package com.example.demo.demoBicycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demoBicycle")
public class BicycleController {

    @Autowired
    private BicycleService bicycleService;

    @PostMapping("/BicycleRegistration")
    public Bicycle createBicycle(@Validated @RequestBody Bicycle bicycle) {
        return bicycleService.createBicycle(bicycle);
    }

    @GetMapping("/GetAllBicycles")
    public List<Bicycle> getAllBicycles() {
        return bicycleService.getAllBicycles();
    }

    @PutMapping("/UpdateBicycle/{id}")
    public Bicycle updateBicycle(@PathVariable Long id, @Validated @RequestBody Bicycle bicycle) {
        return bicycleService.updateBicycle(id, bicycle);
    }

    @DeleteMapping("/DeleteBicycleById/{id}")
    public boolean deleteBicycleById(@PathVariable Long id) {
        return bicycleService.deleteBicycleById(id);
    }
}
