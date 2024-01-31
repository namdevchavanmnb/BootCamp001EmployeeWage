package com.birdgelab;

public class EmployeeWageUC8 {
    public static final int is_Part_Time =1;
    public static final int is_Full_Time =2;
    private static final int Max_Hrs_In_Month = 0;
    private static final int Num_Of_Working_Days = 0;
    private static final int Emp_Rate_Per_Hour = 0;
    private static final String totalEmpWage = null;


    public static String main1(String[] args) {
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
        System.out.println("Total Emp Wage: " + totalEmpHrs);
        return totalEmpWage;
    }
    public static void main11(String[] args) {
        computeEmpWage(null, 0, 0, 0);
    }
    private static void computeEmpWage(String string, int i, int j, int k) {


    }
    public static void main(String[] args) {
        computeEmpWage("DMart",20,2,10);
        computeEmpWage("Reliance",10,4,20);
    }
}

