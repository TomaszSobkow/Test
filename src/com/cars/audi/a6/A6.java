package com.cars.audi.a6;

import com.cars.audi.Audi;

import java.time.LocalDate;

public class A6 extends Audi {

    private String model = "A6";

    public A6(LocalDate productionDate) {
        super(productionDate);
    }

        @Override
        public void printAudi() {
            super.printAudi();
            System.out.println(getClass().toString().substring(getClass().toString().lastIndexOf('.')+1) +
                    "\nProduction Year: " +super.getProductionDate()+"\n");
        }


}
