package Payroll;

public class HourlyPaymentType implements PaymentType
{

	public double getAmountPaid(int hoursWorked, int hourlyRate)
	{
		//Returns weekly payment for an hourly worker
		// Hourly workers are paid their base rate for their first 40 hours
		//Any hours worked above this, they're paid 1.5 times their base pay
		if(hoursWorked > 40)
		{
			int overtimeHours = hoursWorked - 40;
			return (40*hourlyRate) + (overtimeHours * (1.5*hourlyRate));
		}
		else 
		{
			return hoursWorked * hourlyRate; 
		}
	}

}
