package Payroll;

public class SalaryPaymentType implements PaymentType
{

	public double getAmountPaid(int hoursWorked, int hourlyRate)
	{
		// Returns weekly payment amount for a salaried worker
		//Assumes stipulation that salaried employees are payed
		//At their rate for only 40 hours a week
		return 40 * hourlyRate;
	}

}
