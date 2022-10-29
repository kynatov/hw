package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemperature(20, 50));
        System.out.println(ageTemperature(50, 0));
        System.out.println(ageTemperature(10, 10));
        System.out.println(ageTemperature(8, 30));

    }
    public static String ageTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return ("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return ("Можно идти гулять");
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return ("Можно идти гулять");
        } else
            return ("Оставайтесь дома");
    }
}