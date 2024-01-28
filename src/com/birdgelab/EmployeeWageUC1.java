package com.birdgelab;

public class EmployeeWageUC1 {

    public static void main(String[] args) {
        System.out.println("Hello ");
        int is_Full_Time=1;
        double empcheck = Math.floor(Math.random() *10)%2;
        if (empcheck == is_Full_Time)
            System.out.println("Emplyee is Present");
        else
            System.out.println("Emplyee is Abscent");

    }

}






