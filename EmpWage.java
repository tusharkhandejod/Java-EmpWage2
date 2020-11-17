
public class UC7ClassAndObject {
public static void main(String args[]) {
	System.out.println("                             ");
	System.out.println("Welcome to the Employee Wage problem using java");
	System.out.println("                             ");
	System.out.println("Day  Attendance  DailyWage  Total Working Hours  Total Monthly Sallery");
	WageDayHour1 wage = new WageDayHour1();
    wage.calculate();
}
}

class WageDayHour1 {
	final int absent= 0;
	final int isFullTime = 1;
	final int isPartTime = 2;
    final int empRatePerHour = 20;
    public void calculate(){
    	 int hours = 0;
         int Days = 0;
         int empHours;
         int totalSalary = 0;
         while(hours<=100 && Days<20){
        	 int salary = 0;  
         	int check = (int)(Math.floor(Math.random()*10)%3);
                 switch(check){
                 case isPartTime:
                	 empHours = 4;
                     break;
                 case isFullTime:
                	 empHours = 8;
                     break;
                 default :
             	     empHours = 0;
             	    }
                 salary = empRatePerHour*empHours;
                 totalSalary = totalSalary+salary;
                 System.out.println((Days+1)+"     "+empHours+"              "+salary+"            "+hours+"                  "+totalSalary);
                 hours += empHours;
                 Days += 1;
    }
         System.out.println("         ");
         System.out.println("Total Salary based on 20 days and 100 Hours of work is " +totalSalary);
}
}
