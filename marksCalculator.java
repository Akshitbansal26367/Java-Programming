class marksCalculator
{
	public static void main(String args[])
	{
		float physics = 87,maths = 84,chemistry = 78,english = 84,physical_education = 93;
		float total_marks = physics + maths + chemistry + english + physical_education;
		float average = (total_marks)/5;
		float percentage = average;
		System.out.println(total_marks+" marks out of 500 are obtained in class 12th"); 
		System.out.println(percentage+"% is obtained in class 12th");
	}
} 