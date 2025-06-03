package employeeWage;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program ");
        EmployeeWageComputation empWage = new EmployeeWageComputation();

        empWage.checkAttendance();
        
        empWage.calculateDailyWage();

        empWage.calculatePartTimeWage();

        empWage.calculateUsingSwitch();

        empWage.calculateMonthlyWage();

        empWage.calculateTotalWageWithCondition();

        empWage.computeEmployeeWage();
	}
	
}
