package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 64)
    private String brand;
    private int year;
    private Long engineerID;
}
