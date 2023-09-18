class days
{
	public static void main(String args[])
	{
		int days = 453;
		int years = days/365;              
		int remaining_days = days%365;     
		int weeks = remaining_days/7;   
		int days1 = remaining_days%7; 
		System.out.println("Years : "+years+"\nWeeks : "+weeks+"\nDays  :  "+days1);
	}
}
