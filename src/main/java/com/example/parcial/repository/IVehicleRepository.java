package com.example.parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parcial.models.Vehicle;

public interface IVehicleRepository extends JpaRepository<Vehicle, Long>{

}
