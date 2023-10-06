class compoundInterest
{
		public static void main(String args[])
		{
			double principal = 10000;
			double time = 5;
			double interest_rate = 10.25;
			
			double CI = principal*(Math.pow((1+interest_rate/100),time));
			System.out.println("The Compound Interest is "+CI);
		}
}			