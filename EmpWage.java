//calculating employee wage for different companies by taking inputs from user
public class UC8EmpWageDiffCompanies {
	final static int isabsent = 0; 
	final static int isFullTime = 1;
     final static int isPartTime = 2;
    
     public static void calculate(String company_name,int empRatePerHour,int totalDays,int totalHours){
    	 System.out.println("                             ");
    	 System.out.println("                             ");
	     System.out.println("Company Name= "+company_name);
	     System.out.println("Employee's status= ");
    	 System.out.println("Day   Attendance    DailyWage  TotalWorkingHours TotalMonthlySallery");
    	 int hours = 0;
	     int days = 0;
	     int empHours;
	     int totalSalary = 0;
	     String status;
	     while(hours <=totalHours && days<totalDays){
	    	     int salary = 0;
	    	     int check = (int)(Math.floor(Math.random()*10)%3);
	             switch(check){
	             case isPartTime:
	                     empHours = 4;
	                     status="HalfTime";
	                     break;
	             case isFullTime:
	                     empHours = 8;
	                     status="FullTime";
	                     break;
	             default :
	                     empHours = 0;
	                     status="Absent**";
	             }
	             salary = empRatePerHour*empHours;
                 totalSalary = totalSalary+salary;
                 System.out.println((days+1)+"\t"+status+"\t"+salary+"\t\t"+hours+"\t\t"+totalSalary);
                 hours += empHours;
	             days += 1;
	     }
	     int totalEmpWage=hours*empRatePerHour;
	     System.out.println("                             ");
	     System.out.println("Total Monthly Salary of the employee in the "+company_name+" company is: "+totalEmpWage);
     }
     public static void main(String args[]){
    		System.out.println("                             ");
    		System.out.println("Welcome to the Employee Wage problem using java");
    		System.out.println("                             ");
    		calculate("Amazon",700,20,180);
       	    calculate("Microsoft",500,24,200);
       	    calculate("Flipkart",400,26,230);
       	    calculate("Wipro",300,28,250);
       	    calculate("Accenture",500,22,200);
     }

}

