package com.company;

public class Employee {

    private int salary;
    private String name;

    private String classType = getClass().toString();

    public Employee(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }



    public String print(){
        System.out.println(classType.substring(classType.lastIndexOf('.')+1)+"\nName: "+ name +
                            "\nSalary " +salary);
        return "";
    }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
