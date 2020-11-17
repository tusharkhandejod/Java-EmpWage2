k//UC12EmployeeWageBuilder Arraylist Approach
import java.util.ArrayList;
import java.util.Collections; 

interface IComputeEmpWage {
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maximumHoursPerMonth);
	public void computeEmpWage();
}

 class CompanyEmpWageCalculations {
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maximumHoursPerMonth;
	public int totalWage;
	
	public CompanyEmpWageCalculations(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maximumHoursPerMonth = maximumHoursPerMonth;
	}
	
	public void setTotalEmpWage(int totalWage){
		this.totalWage=totalWage;
	}
	
	public String toString() {
		return "Total Employee Wage for "+company+" is "+totalWage;
	}
}

public class UC12EmployeeWageBuilder implements IComputeEmpWage{
	public static final int absent=1;
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	private ArrayList<CompanyEmpWageCalculations> empList;
	public UC12EmployeeWageBuilder() {
		empList=new ArrayList<>();
	}
	@Override
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
		CompanyEmpWageCalculations empWage=new CompanyEmpWageCalculations(company,empRatePerHour,numOfWorkingDays,maximumHoursPerMonth);
		empList.add(empWage);
	}

	@Override
	public void computeEmpWage() {
		for(int i=0;i<empList.size();i++) {
			empList.get(i).setTotalEmpWage(this.computeEmpWage(empList.get(i)));
			System.out.println(empList.get(i));
		}	
		
	}
	private  int computeEmpWage(CompanyEmpWageCalculations companyEmpWageCalculations) {
		int empHours=0, totalEmpHours=0, totalWorkingDays=0;
		 while(totalEmpHours<=companyEmpWageCalculations.maximumHoursPerMonth && totalWorkingDays<companyEmpWageCalculations.numOfWorkingDays){
             int check=(int)(Math.floor(Math.random()*10)%2);
               switch(check){
               case isPartTime:
                       empHours=4;
                       break;
               case isFullTime:
                       empHours=8;
                       break;
               default :
                       empHours=0;
               }
               totalEmpHours+=empHours;
               totalWorkingDays+=1;
               }
		  return (totalEmpHours * companyEmpWageCalculations.empRatePerHour);

	}
	public static void main(String args[]) {
		UC12EmployeeWageBuilder employeeWageBuilder=new UC12EmployeeWageBuilder();
		employeeWageBuilder.addCompanyEmpWage("Amazon", 150, 20, 180);
		employeeWageBuilder.addCompanyEmpWage("Microsoft", 500, 24, 200);
		employeeWageBuilder.addCompanyEmpWage("Flipkart", 200, 26, 230);
		employeeWageBuilder.addCompanyEmpWage("Wipro", 120, 28, 250);
		employeeWageBuilder.addCompanyEmpWage("Accenture", 500, 22, 200);
		employeeWageBuilder.computeEmpWage();
	}
	
}

