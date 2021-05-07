/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carsystem;

import java.util.ArrayList;

/**
 *
 * @author thuy
 */
public class CarManager {
    public static CarManager sharedInstance = new CarManager();
    
    private ArrayList<Car> carList = new ArrayList<Car>();
    
    public void addCar(Car car) {
        carList.add(car);
    }
    
    public ArrayList<Car> getAllCars() {
        return carList;
    }
    
    public ArrayList<Car> getCarsByMake(String make) {
        ArrayList<Car> result = new ArrayList<Car>();
        for (Car car : carList) {
            if (car.getMake().equals(make)) {
                result.add(car);
            }
        }
        return result;
    }
}
