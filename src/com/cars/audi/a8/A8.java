package com.cars.audi.a8;

import com.cars.audi.Audi;

import java.time.LocalDate;

public class A8 extends Audi {

    private String model = "A8";

    public A8(LocalDate productionDate) {
        super(productionDate);
    }

    @Override
    public void printAudi() {
        super.printAudi();
        System.out.println(getClass().toString().substring(getClass().toString().lastIndexOf('.')+1) +
                "\nProduction Year: " +super.getProductionDate()+"\n" +
                "" +
                "");
    }

    public String getModel() {   return model; }
    public void setModel(String model) { this.model = model; }
}
