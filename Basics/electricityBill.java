public class electricityBill
{
	public static void main(String args[])
	{
		int units_consumed = 290;
		double bill;
		
		if(units_consumed<=50)
		{
			bill = (units_consumed) *(0.50);
			System.out.println("The bill is "+bill);
		}
		
		else if(units_consumed<=150)
		{
			bill = ((units_consumed - 50) * (0.75)) + 25 ;
			System.out.println("The bill is "+bill);
		}

		else if(units_consumed<=250)
		{
			bill = ((units_consumed - 150) * (1.2)) + 25 +75;   
			System.out.println("The bill is "+bill);
		}

		else
		{
			bill = ((units_consumed-250) * (1.50)) + 25+75+120;
			bill = (1.2)*(bill);
			System.out.println("The bill is "+bill); 
		}
	}
}
		
