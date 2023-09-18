public class profitOrLoss
{
	public static void main(String args[])
	{
		double cost_price = 234.556;
		double selling_price = 410.768;
		
		if(cost_price>selling_price)
		{
			double loss = cost_price - selling_price;
			double loss_percentage = (loss*100)/cost_price;
			System.out.println("Loss Percentage : "+(float)loss_percentage);
		} 
		
		else if(selling_price>cost_price)
		{
			double profit = selling_price - cost_price;
			double profit_percentage = (profit*100)/cost_price;
			System.out.println("Profit Percentage : "+(float)profit_percentage);
		} 

		else
			System.out.println("No profit no loss");
	}
}
	