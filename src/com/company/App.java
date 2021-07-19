package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {

        static List<Employee> employeesList = new ArrayList<>();

        public static void main(String[] args) {

            emloyeeInit();
        }

        static void emloyeeInit(){
            Employee employee = new Employee("John",12);
            Employee manager = new Manager("Agnes", 122,30);
            Employee director = new Director("Simon",200,12,34);
            Employee director1 = new Director("Kriss",2002,122,324);
            
            employeesList.add(employee);
            employeesList.add(manager);
            employeesList.add(director);
            employeesList.add(director1);

            //findSalary(employeesList, a -> a.getSalary()>120);
           Director.findBonus(employeesList, a->((Director)a).getBonus() >10);

        }

        static void findSalary(List<Employee> employees, Predicate<Employee> salary){
            employees.forEach(a -> { if(salary.test(a)) System.out.println("\n"+a.print());});

        }


}