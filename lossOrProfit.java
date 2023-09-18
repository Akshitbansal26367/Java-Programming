class lossOrProfit
{
	public static void main(String args[])
	{
		double cost_price = 234.55;
		double sale_price = 221.55;
		
		if(cost_price > sale_price)
		{
			double loss = cost_price - sale_price;
			double loss_percentage = (loss*100)/(cost_price);
			System.out.println("The loss percentage is "+(float)loss_percentage);
		}
		
		else
		{
			double profit = sale_price - cost_price ;
			double profit_percentage = (profit*100)/(cost_price);
			System.out.println("The profit percentage is "+(float)profit_percentage);
		}
	}
}