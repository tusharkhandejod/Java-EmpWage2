class EmployeeAttendance{
	final static int present=1;
	public void checkAttendance(){
		int check=(int)(Math.floor(Math.random()*10)%2);
		if(present==check)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
				}
}
public class UC1EmpAttendence{
public static void main(String args[]) {
	System.out.println("      ");
	System.out.println("Welcome to the Employee Wage program");
	EmployeeAttendance attendance=new EmployeeAttendance();
	attendance.checkAttendance();
}
}
