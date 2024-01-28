package com.birdgelab;

public class EmployeeWageUC2 {
    public static void main(String[] args) {
        int is_Full_Time = 1;
        int Emp_Rate_Per_Hour =20;
        int empHrs = 0;
        int empWage = 0;
        double empcheck = Math.floor(Math.random()* 10);
        if (empcheck == is_Full_Time)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * Emp_Rate_Per_Hour;
        System.out.println("Emp Wage: + empWage");
    }
    }

