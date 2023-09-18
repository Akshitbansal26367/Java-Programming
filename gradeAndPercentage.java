public class gradeAndPercentage
{
	public static void main(String args[])
	{
		float physics = 87, chemistry = 78, mathematics = 84, english = 84, physical_education = 93;
		float percentage = (physics+chemistry+mathematics+english+physical_education)/5;
		System.out.println("I scored "+percentage+"% in class 12th");
		
		if(percentage>90)
		System.out.println("Grade A");

		else if (percentage>80)
		System.out.println("Grade B");

		else if (percentage>70)
		System.out.println("Grade C");

		else if (percentage>60)
		System.out.println("Grade D");

		else if (percentage>40)
		System.out.println("Grade E");

		else
		System.out.println("Grade F");
	}
}