package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByBrand(String brand);

    List<Car> findByBrandOrYear(String brand, int year);

    List<Car> findByBrandOrderByYearAsc(String brand);
}
