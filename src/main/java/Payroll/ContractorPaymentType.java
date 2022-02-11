package Payroll;

public class ContractorPaymentType implements PaymentType
{

	public double getAmountPaid(int hoursWorked, int hourlyRate)
	{
		// Returns weekly payment amount for a contractor
		//Hourly rate times hours worked, no overtime
		return hoursWorked * hourlyRate;
	}

}
