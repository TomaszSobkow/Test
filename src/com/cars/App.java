package com.cars;

import com.cars.audi.Audi;
import com.cars.audi.a4.A4;
import com.cars.audi.a6.A6;
import com.cars.audi.a8.A8;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class App {

    public List<Audi> audis = new ArrayList<>();

    public static void main(String[] args) {
       new App().initAudi();

    }

     void initAudi(){
        Audi a4 = new A4(LocalDate.of(2020, Month.AUGUST,11));
        Audi a6 = new A6(LocalDate.of(2021,Month.MARCH,12));
        Audi a8 = new A8(LocalDate.of(2018,Month.MARCH,11));
        audis.add(a4);
        audis.add(a6);
        audis.add(a8);

        audis.forEach(a -> { if (a != null) a.printAudi();});
    }
}
