package com.Mathobot;

public class Mathobot {
	// avg of int,double
	//mean, mood ,median, statistical functions, equation, physics, chemistry, trigonometry, algebra, Matrix, 
	public double Mean(int [] array)
	{
		double avg=0;
		int sum=0;
		for (int i : array) {
			sum+=i;
		}
		avg=(double)sum/(array.length);
		
		return avg;
	}
	

}
