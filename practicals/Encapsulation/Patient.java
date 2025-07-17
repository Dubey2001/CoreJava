package com.corejava;

public class Patient {
    // Private variables
    private String name;
    private int age;
    private double temperature;

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) 
    {
        if (age > 0) 
        {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    // Getter and Setter for temperature
    public double getTemperature() 
    {
        return temperature;
    }
    public void setTemperature(double temperature) 
    {
        if (temperature >= 90 && temperature <= 110) 
        {
            this.temperature = temperature;
        } else {
            System.out.println("Temperature out of realistic human range.");
        }
    }
}