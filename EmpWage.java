//calculation of empwage using switch
public class UC4EmpWageSwitch{
	public static void main(String aargs[]){
        SwitchCaseWage wage = new SwitchCaseWage();
        wage.calculate();
	}
}

class SwitchCaseWage{
	final static int absent=0;
    final static int isFullTime=1;
    final static int isPartTime=2;
    int empRatePerHour = 20;
    int empHours = 0;
    public void calculate(){
    	for(int Day=1;Day<=20;Day++) {
    	int salary = 0;
    	int check=(int)(Math.floor(Math.random()*10)%3);
        switch(check){
        	case isPartTime :
        		System.out.println("Day   "+Day +"   HalfTime");
        		empHours = 4;
                break;
            case isFullTime :
            	System.out.println("Day   "+Day +"   FullTime");
            	empHours = 8;
                break;
            default :
            	System.out.println("Day   "+Day +"   Absent");
            	empHours=0;
        }
        salary=empRatePerHour*empHours;
        System.out.println("Sallery=  "+salary);
    }
}
}
