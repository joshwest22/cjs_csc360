package Payroll;

public class StuffTypeFirst implements StuffType
{

	public double getBReaD(int sourdough, int yeast)
	{
		int expression = 0;
		switch(expression) {
		  case 1:
		    System.out.println("It's so beautiful outside...");
		    break;
		  case 42:
			  System.out.println("I know kung fu");
		    break;
		  default:
		    expression = 0;
		}

		/*The Ultimate Answer to Life, The Universe and Everything is...42! */
		return sourdough * yeast;
	}

}
