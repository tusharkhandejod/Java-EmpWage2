public class UC5MonthlyWage{
public static void main(String args[]){
	wageForMonth wage = new wageForMonth();
        wage.calculate();
	}
}

class wageForMonth{
	final static int absent=0;
    final static int isFullTime=1;
    final static int isPartTime=2;
    int salary = 0;
    final int empRatePerHour = 20;
    int empHours = 0;
    int totalSalary = 0;         
    public void calculate(){
    	for(int Day=1; Day<=20; Day++){
    		int salary = 0;
    		int check=(int)(Math.floor(Math.random()*10)%3);
            switch(check){
                case isPartTime:
                	    System.out.println("Day   "+Day +"   HalfTime");
                	    empHours = 4;
                        break;
                case isFullTime :
                	    System.out.println("Day   "+Day +"   FullTime");
                	    empHours = 8;
                        break;
                default :
                	    System.out.println("Day   "+Day +"   Absent");
                	    empHours = 0;
            }
            salary=empRatePerHour*empHours;
            System.out.println("Sallery=  "+salary);
            totalSalary += salary;  //salary for 20 days
    	}
                System.out.println("Total wage for 20 days: " +totalSalary);
    }
}

