/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TotalService.controller;

import com.TotalService.Model.TotalService;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author P_nyachhyon
 */
public class Totalservice {
     private LinkedList<TotalService> vehicleList;

    public Totalservice() {
        vehicleList = new LinkedList<>();
    }  
    
    public List<TotalService> search(String query) {
        return vehicleList.stream()
            .filter(vehicle -> vehicle.getCustomerName().toLowerCase().contains(query.toLowerCase())
                || vehicle.getVehicleType().toLowerCase().contains(query.toLowerCase()))
            .collect(Collectors.toList());
    }
     public void sortByVehicleNumber() {
        vehicleList.sort((v1, v2) -> Integer.compare(v1.getVehicleNumber(), v2.getVehicleNumber()));
    }

    // Sort by customer name in ascending order
    public void sortByCustomerName() {
        vehicleList.sort((v1, v2) -> v1.getCustomerName().compareToIgnoreCase(v2.getCustomerName()));
    }
    public LinkedList<TotalService> getVehicleList() {
        return vehicleList;
    }

}
