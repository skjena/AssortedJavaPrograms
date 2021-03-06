/* AP(r) Computer Science Assignment:
 * Copyright(c) 2013-2014 Suraj K. Jena
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Suraj Jena
 */
package apcs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/** This class sorts entered numbers using the BubbleSort algorithm
 * Takes in integer as well as double inputs
 * This class has been tested and verified by peers
 */
public class BubbleSort
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length");
		int n = Integer.parseInt(br.readLine());
		double[] a= new double[n];
		for(int j = 0; j<n; j++)
		{
			System.out.println("enter value");
			a[j] = Double.parseDouble(br.readLine());
		}
		double[] b = bubbleSort(a, n);
		display(b, n);
	}
	public static double[] bubbleSort(double[] a, int n)
	{
		double temp;
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	public static void display(double[] a, int n)
	{
		for(int j = 0; j<n; j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}