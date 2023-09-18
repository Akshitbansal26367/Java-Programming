class simpleInterest
{
	public static void main(String args[])
	{
		double principal = 5789.45;
		double interest_rate = 0.5;
		int time = 5;
		
		double simple_interest = (principal*interest_rate*time)/100;
		System.out.println("The Simple Interest is "+simple_interest);
	}
}