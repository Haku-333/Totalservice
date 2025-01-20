/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.TotalService.Model;

/**
 *
 * @author P_nyachhyon
 */
public class TotalService {

    /**
     * @param args the command line arguments
     */
    private String customerName;
    private String vehicleCompany;
    private String vehicleType;
    private String serviceStatus;
    private int customerNumber;
    private int vehicleNumber;

    public String getCustomerName() {
        return customerName;
    }

    public String getVehicleCompany() {
        return vehicleCompany;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setVehicleCompany(String vehicleCompany) {
        this.vehicleCompany = vehicleCompany;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public TotalService(int vehicleNumber,String vehicleType,  String vehicleCompany,String customerName,int customerNumber, String serviceStatus) {
        this.customerName = customerName;
        this.vehicleCompany = vehicleCompany;
        this.vehicleType = vehicleType;
        this.serviceStatus = serviceStatus;
        this.customerNumber = customerNumber;
        this.vehicleNumber = vehicleNumber;
    }
       
   
}
