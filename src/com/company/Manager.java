package com.company;

import java.util.List;
import java.util.function.Predicate;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }




    public int getBonus() { return bonus; }
    public void setBonus(int bonus) { this.bonus = bonus; }

    public String print(){
        super.print();
        System.out.println("Bonus " + this.bonus);
        return "";
    }
}
