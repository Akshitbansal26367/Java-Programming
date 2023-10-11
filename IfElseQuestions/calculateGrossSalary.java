public class calculateGrossSalary
{
	public static void main(String args[])
	{
		float basic_salary = 22345;
		double hra, da;
		double gross_salary;

		if(basic_salary>=30000)
		{
			hra = 0.3;
			da = 0.95;
			gross_salary = (hra*basic_salary) + (da*basic_salary) + (basic_salary);
			System.out.println("Gross salary is "+gross_salary);
		}

		else if(basic_salary>=20000)
		{
			hra = 0.25;
			da = 0.9;
			gross_salary = (hra*basic_salary) + (da*basic_salary) + (basic_salary);
			System.out.println("Gross salary is "+gross_salary);
		}

		else
		{
			hra = 0.2;
			da = 0.8;
			gross_salary = (hra*basic_salary) + (da*basic_salary) + (basic_salary);
			System.out.println("Gross salary is "+gross_salary);
		}
	}
}
