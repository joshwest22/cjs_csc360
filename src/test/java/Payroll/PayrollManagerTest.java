package Payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollManagerTest
{
	MyStuffDoer myPayrollManager;
	MyNoun mark;
	MyNoun ted; 
	MyNoun bill;
	StuffType hourly;
	StuffType salary; 
	StuffType contractor;

	@BeforeEach
	void setUp() throws Exception
	{
		hourly = new StuffType1();
		salary = new StuffTypeA();
		contractor = new StuffTypeFirst();
		mark = new MyNoun("Mark Jacobs",10,0,hourly);
		ted = new MyNoun("Ted Smith",15,0,salary);
		bill = new MyNoun("Bill Excellent",5,0,contractor);
		myPayrollManager = new MyStuffDoer(3);
		
	}
	
	@Test
	void testAddNewEmployee()
	{
		myPayrollManager.addNewEmployee(mark);
		myPayrollManager.addNewEmployee(ted);
		myPayrollManager.addNewEmployee(bill);
		assertEquals("Mark Jacobs",myPayrollManager.getEmployeeList()[0].getName());
		assertEquals("Ted Smith",myPayrollManager.getEmployeeList()[1].getName());
		assertEquals("Bill Excellent",myPayrollManager.getEmployeeList()[2].getName());
		//fail("Not yet implemented");
	}
	
	@Test
	void testSetEmployeeHours()
	{
		myPayrollManager.addNewEmployee(mark);
		myPayrollManager.addNewEmployee(ted);
		myPayrollManager.addNewEmployee(bill);
		myPayrollManager.setEmployeeHours(0,50); //Set the hourly worker Mark's hours to 50 
		myPayrollManager.setEmployeeHours(1,0); //Set the salary worker Ted's hours to zero, as salary workers don't typically even report their hours
		myPayrollManager.setEmployeeHours(2,47); //Set the contractor worker Bill's hours to 47
		assertEquals(50,myPayrollManager.getEmployeeList()[0].getHoursWorked());
		assertEquals(0,myPayrollManager.getEmployeeList()[1].getHoursWorked());
		assertEquals(47,myPayrollManager.getEmployeeList()[2].getHoursWorked());
		//fail("Not yet implemented");
	}

	@Test
	void testPayAllEmployees()
	{
		myPayrollManager.addNewEmployee(mark);
		myPayrollManager.addNewEmployee(ted);
		myPayrollManager.addNewEmployee(bill);
		myPayrollManager.setEmployeeHours(0,50);
		myPayrollManager.setEmployeeHours(1,0); 
		myPayrollManager.setEmployeeHours(2,47);
		double[]employeeAmounts = new double[3];
		employeeAmounts = myPayrollManager.doStuff();
		assertEquals(550,employeeAmounts[0]);
		assertEquals(600,employeeAmounts[1]);
		assertEquals(235,employeeAmounts[2]);
		//fail("Not yet implemented");
	}


}
