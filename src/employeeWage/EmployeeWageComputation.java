package employeeWage;

import java.util.Random;

public class EmployeeWageComputation{
	
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HOURS_IN_MONTH = 100;

    public void checkAttendance() {
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
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
                empHrs = 8;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        int wage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Wage using Switch Case: " + wage);
    }

    public void calculateMonthlyWage() {
        int totalWage = 0;
        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++) {
            int empHrs = getWorkingHours();
            totalWage += empHrs * EMP_RATE_PER_HOUR;
        }
        System.out.println("Monthly Wage: " + totalWage);
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
        System.out.println("Wage with Condition: " + totalWage);
    }

    
    public void computeEmployeeWage() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empHrs = getWorkingHours();
            totalEmpHrs += empHrs;
        }
        int totalWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Final Computed Employee Wage: " + totalWage);
    }

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