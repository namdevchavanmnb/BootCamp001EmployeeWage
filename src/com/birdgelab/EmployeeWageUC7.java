package com.birdgelab;

public class EmployeeWageUC7 {
    public static final int is_Part_Time =1;
    public static final int is_Full_Time =2;
    public static final int is_Emp_Rate_Per_Hour =20;
    private static final int Num_Of_Working_Days = 2;
    private static final int Max_Hrs_In_Month = 10;


    public static void main(String[] args) {
        //Variables
        int empHrs=0,totalEmpHrs=0,totalWorkingdayes=0;
        //Computation
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
            int totalEmpWag = totalEmpHrs * is_Emp_Rate_Per_Hour;
            System.out.println("Total Emp Wage: " + totalEmpWag);
            return;
        }
    }
    private static void computeEmpWage() {
        computeEmpWage();

    }

}


