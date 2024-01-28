package com.birdgelab;

public class EmployeeWageUC5 {
    public static final int is_Part_Time =1;
    public static final int is_Full_Time =2;
    public static final int is_Emp_Rate_Per_Hour =20;
    private static final int Num_Of_Working_Days = 2;
    private static final int Emp_Rate_Per_Hour = 0;

    public static void main(String[] args) {
        int empHrs = 0, empWage =0, totalEmpWage =0;
        for (int day =0; day< Num_Of_Working_Days; day++) {
            int empcheck = (int)Math.floor(Math.random()* 10)%3;
            switch(empcheck) {
                case is_Part_Time:
                    empHrs = 4;
                    break;
                case is_Full_Time:
                    empHrs=8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * Emp_Rate_Per_Hour;
            totalEmpWage +=empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}

