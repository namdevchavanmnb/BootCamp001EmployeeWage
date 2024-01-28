package com.birdgelab;

public class EmployeeWageUC6 {
    static final int is_Part_Time =1;
    static final int is_Full_Time =2;
     static final int is_Emp_Rate_Per_Hour =20;
     static final int Num_Of_Working_Days = 2;
     static final int Max_Hrs_In_Month = 10;
    static final String totalEmpWage = null;
     static int Emp_Rate_Per_Hour;

    public static void main(String[] args) {
        int empHrs=0,totalEmpHrs=0,totalWorkingdayes=0;
        while(totalEmpHrs<=Max_Hrs_In_Month &&
                totalWorkingdayes <Num_Of_Working_Days) {
            totalWorkingdayes++;
            int empcheck =(int)Math.floor(Math.random()*10)%3;
            switch(empcheck) {
                case is_Part_Time:
                    empHrs=4;
                    break;
                case is_Full_Time:
                    empHrs =8;
                    break;
                default:
                    empHrs =0;
            }
            totalEmpHrs +=empHrs;
            System.out.println("Day#: " + totalWorkingdayes +"Emp Hrs: "+empHrs);
        }
        int totalEmpWag = totalEmpHrs * Emp_Rate_Per_Hour;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}
