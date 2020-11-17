//Calculate daily wage
public class UC2EmpDailyWage {
	public static void main(String[] args) {
		DailyWage dailywage	= new DailyWage();
	    dailywage.employeeWage();
	}
}


class DailyWage{
	final int present = 1;
    final int empRatePerHour = 20;
    final int empHours = 8;
    public void employeeWage(){       //method for calculating emp salary
    	for(int Day=1;Day<=20;Day++) {
    	int salary = 0;
    	int check = (int)(Math.floor(Math.random()*10)%2);
    	if(present == check){
    		System.out.println("Employee is present");
    		salary = empRatePerHour * empHours; //salary for the given hours
            System.out.println(salary);
        }
    else{
    	    System.out.println("Employee is absent");
    	    System.out.println(salary);
            }
    }
}
}
