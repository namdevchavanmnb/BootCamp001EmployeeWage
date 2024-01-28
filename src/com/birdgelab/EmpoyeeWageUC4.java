package com.birdgelab;

public class EmpoyeeWageUC4 {
    public static final int is_Part_Time =1;
    public static final int is_Full_Time =2;
    public static final int is_Emp_Rate_Per_Hour =20;
    private static final int EMP_RATE_PER_HOUR = 0;

    public static void main(String[] args) {
        int empHrs =0;
        int empWage =0;
        int empcheck = (int)Math.floor(Math.random()* 10)%3;
        switch(empcheck) {
            case is_Part_Time:
                empHrs = 8;
                break;
            default:
                empHrs =8;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }
}



