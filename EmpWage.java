//Ability to manage emp wage of multiple companies using array

class CompanyEmpWage {
	
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maximumHoursPerMonth;
	public int totalWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maximumHoursPerMonth = maximumHoursPerMonth;
	}
	
	public void setTotalEmpWage(int totalWage){
		this.totalWage = totalWage;
	}
	
	public String toString() {
		return "Total Employee Wage for "+company+" is "+totalWage;
	}

}

public class UC10EmpWageBuilder{
	public static final int absent=1;
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	private int numOfCompany; 
	private CompanyEmpWage empWageArray[];  
	
	public UC10EmpWageBuilder() {  
		empWageArray=new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maximumHoursPerMonth) {
		empWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maximumHoursPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage() {
		for(int i=0;i<numOfCompany;i++) {
			empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
			System.out.println(empWageArray[i]);
			
		}
	}
	
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
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
               totalEmpHours += empHours;
               totalWorkingDays += 1;
 }
		 return totalEmpHours * companyEmpWage.empRatePerHour;

	}
	
	public static void main(String args[]) {
		UC10EmpWageBuilder employeeWageBuilder=new UC10EmpWageBuilder();
		employeeWageBuilder.addCompanyEmpWage("Amazon", 150, 20, 180);
		employeeWageBuilder.addCompanyEmpWage("Microsoft", 500, 24, 200);
		employeeWageBuilder.addCompanyEmpWage("Flipkart", 200, 26, 230);
		employeeWageBuilder.addCompanyEmpWage("Wipro", 120, 28, 250);
		employeeWageBuilder.addCompanyEmpWage("Accenture", 500, 22, 200);
		employeeWageBuilder.computeEmpWage();
		
	}
}
