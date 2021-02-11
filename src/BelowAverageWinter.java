/*
 * Written by Donte Littlejohn
 */

import java.util.Scanner;

public class BelowAverageWinter {
	public static final int NUM_OF_DAYS = 10;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double[] temps = new double[NUM_OF_DAYS];
		double sum = 0.0;
		
		for(int i = 1; i <= NUM_OF_DAYS; i++) 
		{
			System.out.println("Please enter the temperature for day " + i);
			double temp = keyboard.nextDouble();
			keyboard.nextLine();
			
			sum += temp;
			temps[i - 1] = temp;
		}

		double avgTemp = sum/NUM_OF_DAYS;
		
		System.out.println("The average temperature was " + avgTemp);
		System.out.println("The days that were below average were");
		
		for(int i = 0; i < NUM_OF_DAYS; i++)
		{
			if(temps[i] < avgTemp)
			{
				System.out.println("Day " + (i+1) + " with " + temps[i]);
			}
		}
	}

}