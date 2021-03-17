import java.util.Scanner;

public class EmployeeCar {

    static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        long employeeNumber;
        String employeeName;
        double hourlySalary;
        double weeklyTime, regularTime, overtime;
        double regularPay, overtimePay, netPay;
        
        System.out.print("Enter Employee Number (00000): ");
        employeeNumber = scnr.nextLong();

        if( employeeNumber == 82500 )
            employeeName = "Helene Mukoko";
        else if( employeeNumber == 92746 )
            employeeName = "Raymond Kouma";
        else if( employeeNumber == 54080 )
            employeeName = "Henry Larson";
        else if( employeeNumber == 86285 )
            employeeName = "Gertrude Monay";
        else
            employeeName = "Unknown";
                
        System.out.print("Enter Hourly Salary: ");
        hourlySalary = scnr.nextDouble();
        System.out.print("Enter Weekly Time: ");
        weeklyTime = scnr.nextDouble();

        if(weeklyTime  < 40 ) {
            regularTime = weeklyTime;
            overtime = 0;
            regularPay = hourlySalary * regularTime;
            overtimePay = 0;
            netPay = regularPay;
        }
        else {
            regularTime = 40;
            overtime = weeklyTime - 40;
            regularPay = hourlySalary * 40;
            overtimePay = hourlySalary * overtime;
            netPay = regularPay + overtimePay;
        }
            
        System.out.println("======================");
        System.out.println("=//= BETHESDA CAR RENTAL =//=");
        System.out.println("==-=-= Employee Payroll =-=-==");
        System.out.println("-------------------------------------------");
        System.out.printf("Employee #:    %d\n", employeeNumber);
        System.out.printf("Employee Name: %s\n", employeeName);
        System.out.printf("Hourly Salary: %.2f\n", hourlySalary);
        System.out.printf("Weekly Time:   %.2f\n", weeklyTime);
        System.out.printf("Regular Pay:   %.2f\n", regularPay);
        System.out.printf("Overtime Pay:  %.2f\n", overtimePay);
        System.out.printf("Total Pay:     %.2f\n", netPay);
        System.out.println("======================");
    }
}