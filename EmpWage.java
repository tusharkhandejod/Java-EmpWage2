//UC11EmployeeWageBuilder  Interface approach array

interface IComputeWage {
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maximumHoursPerMonth);
	public void computeEmpWage();
}

class CompanyEmpWageCal {
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maximumHoursPerMonth;
	public int totalWage;
	public CompanyEmpWageCal(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
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

public class UC11EmployeeWageBuilder implements IComputeWage{
	public static final int absent=1;
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	private int numOfCompany;
	private CompanyEmpWageCal empWageArray[];
	public UC11EmployeeWageBuilder() {
		empWageArray=new CompanyEmpWageCal[5];
	}
	@Override 
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
		empWageArray[numOfCompany]=new CompanyEmpWageCal(company,empRatePerHour,numOfWorkingDays,maximumHoursPerMonth);
		numOfCompany++;
	}

	@Override
	public void computeEmpWage() {
		for(int i=0;i<numOfCompany;i++) {
			empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
			System.out.println(empWageArray[i]);
		}	
		
	}
	private int computeEmpWage(CompanyEmpWageCal companyEmpWage) {
		int empHours=0, totalEmpHours=0, totalWorkingDays=0;
		 while(totalEmpHours<=companyEmpWage.maximumHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays){
             int check=(int)(Math.floor(Math.random()*10)%3);
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
               totalEmpHours+=empHours;
               totalWorkingDays += 1;
 }
		 return totalEmpHours * companyEmpWage.empRatePerHour;

	}
	public static void main(String args[]) {
		UC11EmployeeWageBuilder employeeWageBuilder=new UC11EmployeeWageBuilder();
		employeeWageBuilder.addCompanyEmpWage("Amazon", 150, 20, 180);
		employeeWageBuilder.addCompanyEmpWage("Microsoft", 500, 24, 200);
		employeeWageBuilder.addCompanyEmpWage("Flipkart", 200, 26, 230);
		employeeWageBuilder.addCompanyEmpWage("Wipro", 120, 28, 250);
		employeeWageBuilder.addCompanyEmpWage("Accenture", 500, 22, 200);
		employeeWageBuilder.computeEmpWage();
		
	}
}
