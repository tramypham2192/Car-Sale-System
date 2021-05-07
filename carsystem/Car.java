/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carsystem;

/**Final Project
 * create a Car class to setup and get the info of the vehicle
 * @author Dongxian Li
 * 04/27/2021
 */

//import java.util.*;

public class Car {
    private String make;
    private String model;
    private String info;
    private String year;
    private double price;
    private double mileage;
    private String stockNumber;
    private String image;
    
    //constructor
    public Car(String make, String model, String info, String year, double price, double mileage, String stockNumber, String image) {
        if (price <= 0.0) { //validate
            throw new IllegalArgumentException("The price of vehicle must be greater than 0.");
        }
        
        if (mileage < 0.0) { //validate
            throw new IllegalArgumentException("The distance traveled must be no less than 0.0 km.");
        }
        
        this.make = make;
        this.model = model;
        this.info = info;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.stockNumber = stockNumber;
        this.image = image;
    }
    
    //set the make
    public void setMake(String make) {
	this.make = make;
    }
    
    //get the make
    public String getMake() {
        return make;
    }
    
    //set the model
    public void setModel(String model) {
	this.model = model;
    }
    
    //get the model
    public String getModel() {
        return model;
    }
    
    //set the info
    public void setInfo(String info) {
	this.info = info;
    }
    
    //get the info
    public String getInfo() {
        return info;
    }
    
    //set the year
    public void setYear(String year) {
	this.year = year;
    }
    
    //get the year
    public String getYear() {
        return year;
    }
    
    //set the price
    public void setPrice(double price) {
	this.price = price;
    }
    
    //get the price
    public double getPrice() {
        return price;
    }
    
    //set the mileage
    public void setMileage(double mileage) {
	this.mileage = mileage;
    }
    
    //get the mileage
    public double getMileage() {
        return mileage;
    }
    
    //set the stock number
    public void setStockNumber(String stockNumber) {
	this.stockNumber = stockNumber;
    }
    
    //get the stock number
    public String getStockNumber() {
        return stockNumber;
    }
    
    //set the image
    public void setImage(String image) {
	this.image = image;
    }
    
    //get the image
    public String getImage() {
        return image;
    }
    
    //return String representation of Car object
    @Override
    public String toString() {
        return String.format("Make: %s%nModel: %s%nInfo: %s%nYear: %s%nPrice: %s%nMileage: %s%nStock Number: %s%nImage: %s%n", make, model, info, year, price, mileage, stockNumber, image);
    }
} //end of Class Car