class EmpWageBuilder{
	    final int absent=1;
	    final int isFullTime=1;
        final int isPartTime=2;
        private int empRatePerHour;
        private int totalDays;
        private int totalHours;
        private String company;
        private int totalSalary;
        
        EmpWageBuilder(String company,int empRatePerHour,int totalDays,int totalHours){
        	this.company = company;
	        this.empRatePerHour = empRatePerHour;
	        this.totalDays = totalDays;
	        this.totalHours = totalHours;
        }
        public void calculate(){
	        int hours = 0;
	        int days = 0;
	        int salary = 0;
	        int empHours;
	        while(hours<=totalHours && days<totalDays){
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
	                hours += empHours;
	                days += 1;
	                salary = empRatePerHour * empHours;
	                totalSalary = totalSalary + salary;
	        }
        }
    public String toString(){
	        return "Total Employee wage for " + company +" is " + (totalSalary);
	}
}
public class UC9EmpWageEachComp{
	public static void main(String args[]){
		    EmpWageBuilder Amazon=new EmpWageBuilder("Amazon",150,20,180);
			Amazon.calculate();
			System.out.println(Amazon);
			
			EmpWageBuilder Microsoft=new EmpWageBuilder("Microsoft",500,24,200);
        	Microsoft.calculate();
        	System.out.println(Microsoft);
        	
        	EmpWageBuilder Flipkart=new EmpWageBuilder("Flipkart",200,26,230);
        	Flipkart.calculate();
        	System.out.println(Flipkart);
        	
        	EmpWageBuilder Wipro=new EmpWageBuilder("Wipro",120,28,250);
        	Wipro.calculate();
        	System.out.println(Wipro);
        	
        	EmpWageBuilder Accenture=new EmpWageBuilder("Accenture",500,24,200);
        	Accenture.calculate();
        	System.out.println(Accenture);
	}
}
