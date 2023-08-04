package cps161_LU9;

import java.time.LocalDate;

public class SalaryEmployee extends Employee 
{
	private int salary;
	
	public static void announcement() {
		System.out.println("Hello from Salaryemployee class.");
		}
	
	public int getSalary() 
	{
		return salary;
	}
	
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	public void displayPay() 
	{
		System.out.println("pay info: " + salary/24.0);
	}
	
	public SalaryEmployee (String name, LocalDate hiredDate, int salary) 
	{
		super(name, hiredDate);
		this.salary = salary;
	}
	
	public SalaryEmployee(String name, int salary) 
	{
		this(name, LocalDate.now(), salary)	;
	}
	
}
