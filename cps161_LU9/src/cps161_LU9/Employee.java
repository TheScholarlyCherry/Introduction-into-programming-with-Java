package cps161_LU9;
import java.time.LocalDate;

public class Employee {
	private String name;
	private LocalDate dateHired;
	protected int protectedVar;
	int packageVar;

	public static void announcement() {
	System.out.println("Hello from Employee class.");
	}
	
	public abstract void displayPay();
	
	public Employee(String name, LocalDate hiredDate ) 
	{
		this.name = name;
		this.dateHired = hiredDate;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public LocalDate getDateHired() 
	{
		return dateHired;
	}
	public void setDateHired(LocalDate dateHired) 
	{
		this.dateHired = dateHired;
	}
	
	public String toString() 
	{
		return "Employee [name=" + name + ", dateHired=" + dateHired + "]";
	}
	
	public boolean equals(Employee employee) 
	{
		return name.equals(employee.name)&& dateHired.equals(employee.dateHired);
	}
	
	public boolean equals(Object object) 
	{
		if (object == null) 
		{
			return false;
		}else if(getClass()!=object.getClass())
		{
			return false;
		} else 
		{
			Employee employee = (Employee)object;
			return name.equals(employee.name)&&dateHired.equals(employee.dateHired);
		}
	}
}
