package employeeWage;

import java.util.Random;

public class EmployeeWageComputation{
	// Class Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HOURS_IN_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWageComputation empWage = new EmployeeWageComputation();

        // UC1: Check Attendance
        empWage.checkAttendance();

        // UC2: Daily Wage Calculation
        empWage.calculateDailyWage();

        // UC3: Add Part Time
        empWage.calculatePartTimeWage();

        // UC4: Solve using Switch
        empWage.calculateUsingSwitch();

        // UC5: Monthly Wage
        empWage.calculateMonthlyWage();

        // UC6: Total wage with hours or days condition
        empWage.calculateTotalWageWithCondition();

        // UC7: Refactor to Class Method
        empWage.computeEmployeeWage();
    }

    public void checkAttendance() {
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1)
            System.out.println("UC1 - Employee is Present");
        else
            System.out.println("UC1 - Employee is Absent");
    }

    public void calculateDailyWage() {
        int empHrs = 8; // assuming full time
        int wage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("UC2 - Daily Wage: " + wage);
    }

    public void calculatePartTimeWage() {
        int empHrs = 8; // part time
        int wage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("UC3 - Part Time Wage: " + wage);
    }

    public void calculateUsingSwitch() {
        int empHrs = 0;
        int empType = new Random().nextInt(3); // 0, 1, 2

        switch (empType) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        int wage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("UC4 - Wage using Switch Case: " + wage);
    }

    public void calculateMonthlyWage() {
        int totalWage = 0;
        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++) {
            int empHrs = getWorkingHours();
            totalWage += empHrs * EMP_RATE_PER_HOUR;
        }
        System.out.println("UC5 - Monthly Wage: " + totalWage);
    }

    public void calculateTotalWageWithCondition() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empHrs = getWorkingHours();
            totalEmpHrs += empHrs;
        }
        int totalWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("UC6 - Wage with Condition: " + totalWage);
    }

    // UC7: Refactored Class Method
    public void computeEmployeeWage() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empHrs = getWorkingHours();
            totalEmpHrs += empHrs;
        }
        int totalWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("UC7 - Final Computed Employee Wage: " + totalWage);
    }

    // Utility method for getting hours
    private int getWorkingHours() {
        int empType = new Random().nextInt(3);
        switch (empType) {
            case IS_PART_TIME:
                return 4;
            case IS_FULL_TIME:
                return 8;
            default:
                return 0;
        }
    }
}