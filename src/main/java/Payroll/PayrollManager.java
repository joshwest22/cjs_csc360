package Payroll;

public class PayrollManager
{
	int numEmployees; 
	Employee[] employeesArray;
	int currentIndex = 0;
	/**
	 * @param numEmployees
	 * @param employeesArray
	 */
	public PayrollManager(int numEmployees)
	{
		//super();
		this.numEmployees = numEmployees;
		this.employeesArray = new Employee[numEmployees];
	}
	
	public double[] payAllEmployees()
	{
		double[] employeePayments = new double[numEmployees];
		for (int i = 0; i < numEmployees; i++) 
		{
			  employeePayments[i] = employeesArray[i].getWeeklyPay();
		}
		return employeePayments;
	}
	
	public void addNewEmployee(Employee newEmployee)
	{
		employeesArray[currentIndex] = newEmployee;
		this.currentIndex = this.currentIndex + 1;
	}
	
	public void setEmployeeHours(int employeeIndex, int hoursWorked) 
	{
		employeesArray[employeeIndex].setHoursWorked(hoursWorked);
	}
	
	public Employee[] getEmployeeList() 
	{
		return employeesArray;
	}
	
}
