package com.cars.audi;

import com.cars.Vehicle;

import java.time.LocalDate;

public abstract class Audi extends Vehicle {

    private LocalDate productionDate;
    private String brand = "Audi";

    public Audi(LocalDate productionDate){
        this.productionDate = productionDate;
    }

    public void printAudi(){
        System.out.print( brand +" ");
    }

    public LocalDate getProductionDate() { return productionDate;  }
    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }
    public String getBrand() { return brand;  }
    public void setBrand(String brand) { this.brand = brand; }
}
