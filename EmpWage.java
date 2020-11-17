//find the wages till 100 hours and 20 days
public class UC6MonthlyWagesTillConndition {
	public static void main(String args[]) {
		System.out.println("Welcome to the Employee wage program using java");
		WageDayHour wage = new WageDayHour();
        wage.calculate();
	}

}

class WageDayHour {
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
                	    System.out.println("Day   "+(Days+1) +"   HalfTime");
                	    empHours = 4;
                        break;
                case isFullTime:
                	    System.out.println("Day   "+(Days+1) +"   FullTime");
                	    empHours = 8;
                        break;
                default :
                	    System.out.println("Day   "+(Days+1) +"   Absent");
                	    empHours = 0;
                }
                hours += empHours;
                Days += 1;
                salary = empRatePerHour*empHours;
                System.out.println("Sallery=  "+salary);
                System.out.println("Total hours= "+hours);
                System.out.println("                    ");
                totalSalary = totalSalary+salary;
        }
        System.out.println("Total Salary based on 20 days and 100 Hours of work is " +totalSalary);
    }
}

