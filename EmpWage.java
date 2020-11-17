public class UC3PartTime {
	public static void main(String args[]){
        Wage wage=new Wage();
        wage.calculateWage();
	}
}


class Wage{
	final int absent=0;
	final int fullTime=1;
	final int partTime=2;
    final int empRatePerHour=20;
    int empHours;
    public void calculateWage(){
    	for(int Day=1;Day<=20;Day++) {
    	int salary=0;
    	int check=(int)(Math.floor(Math.random()*10)%3);
    	if(check==fullTime) {
    		System.out.println("Day "+Day);
    		empHours=8;	
    	}
    	else if(check==partTime) {
    		System.out.println("Day "+Day);
    		empHours=4;
            }
    	else if(check==absent) {
    		System.out.println("Day "+Day);
    		empHours=0;
    	}
    	salary=empRatePerHour*empHours;
    	System.out.println(salary);
    }
}
}
