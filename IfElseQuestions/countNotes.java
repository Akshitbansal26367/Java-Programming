public class countNotes
{
	public static void main(String args[])
	{
		int total_amount = 2655;
		int notes;
		
		if(total_amount>=500)
		{
			notes = total_amount/500;
			total_amount = total_amount%500;
			System.out.println("500 rs notes : "+notes);
		}
		
		if(total_amount>=200)
		{
			notes = total_amount/200;
			total_amount = total_amount%200;
			System.out.println("\n200 rs notes : "+notes);
		}

		if(total_amount>=100)
		{
			notes = total_amount/100;
			total_amount = total_amount%100;
			System.out.println("100 rs notes : "+notes);
		}

		if(total_amount>=50)
		{
			notes = total_amount/50;
			total_amount = total_amount%50;
			System.out.println("50 rs notes : "+notes);
		}
		
		if(total_amount>=10)
		{
			notes = total_amount/10;
			total_amount = total_amount%10;
			System.out.println("10 rs notes : "+notes);
		}

		else
		{
			notes = total_amount/5;
			total_amount = total_amount%5;
			System.out.println("5 rs notes : "+notes);
		}
	}
}
