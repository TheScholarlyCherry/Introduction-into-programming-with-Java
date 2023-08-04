package cps161_LU9;

import java.time.LocalDate;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Brandon", LocalDate.now());
		
		System.out.println(employee);
		
		Employee hourlyE = new HourlyEmployee("YEEEEEESH", LocalDate.of(2022, 1, 1), 80, 30);
		
		System.out.println(hourlyE.toString());
		Employee.announcement();
		//hourlyE.displayPay();
		
		Employee SalaryEmployee = new SalaryEmployee("OogaOogga", LocalDate.of(2022, 5, 1), 80_000);
		System.out.println(SalaryEmployee);
		// salaryE.displayPay();
	}
}
