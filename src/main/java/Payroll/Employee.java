package Payroll;

public class Employee
{
	String name; 
	int hourlyRate; 
	int hoursWorked;
	PaymentType employeePaymentType;
	/**
	 * @param name
	 * @param hourlyRate
	 * @param hoursWorked
	 */
	public Employee(String name, int hourlyRate, int hoursWorked, PaymentType employeePaymentType)
	{
		//super();
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.employeePaymentType = employeePaymentType;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the hourlyRate
	 */
	public int getHourlyRate()
	{
		return hourlyRate;
	}
	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(int hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	/**
	 * @return the hoursWorked
	 */
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(int hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	
	public double getWeeklyPay()
	{
		return employeePaymentType.getAmountPaid(hoursWorked, hourlyRate);
	}

}
