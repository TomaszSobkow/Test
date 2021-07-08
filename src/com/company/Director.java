package com.company;

import java.util.List;
import java.util.function.Predicate;

public class Director extends Manager{
    private int checkPlan = 10;

    public Director(String name, int salary, int bonus, int checkPlan) {
        super(name, salary, bonus);
        this.checkPlan = checkPlan;
    }

    public static void findBonus(List<Employee> employees, Predicate<Employee> bonus){
        employees.forEach(b -> { if( b instanceof Director )
                                    {    bonus.test( b);
                                         System.out.println(b.print());}});}



    public int getCheckPlan() {
        return checkPlan;
    }
    public void setCheckPlan(int checkPlan) {
        this.checkPlan = checkPlan;
    }

    public String print(){
        super.print();
        System.out.println("CheckPlan "+ this.checkPlan);
        return "";
    }
}
