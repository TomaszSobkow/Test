package com.cars.audi.a4;

import com.cars.audi.Audi;

import java.time.LocalDate;

public class A4 extends Audi {

    private  String model = "A4";

    public A4(LocalDate productionDate){
        super(productionDate);
    }

    @Override
    public void printAudi() {
        super.printAudi();
        System.out.println(getClass().toString().substring(getClass().toString().lastIndexOf('.')+1) +
                "\nProduction Year: " +super.getProductionDate()+"\n");
    }

    public void printModel(){  System.out.println( getModel());  }

    public  String getModel() {  return model; }
    public void setModel(String model) {  this.model = model;   }
}
