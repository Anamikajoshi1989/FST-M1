package activities;

import java.lang.reflect.Array;

public class Activity2 
{
	public static void main(String args[])
	{
		int[] number= {10, 77, 10, 54, -11, 10};
		int[] number1= {10, 77, 30, 54, -11, 10};
		boolean flag=checkSum(number);
		boolean flag1=checkSum(number1);
		System.out.println("Checking if sum value is 30 "+flag);
		System.out.println("Checking if sum value is 30 "+flag1);

	}
	public static boolean checkSum(int num[]) 
	{
		int sum=0;		

		for (int i=0;i<num.length;i++)
		{
			if(num[i]==10)			
				//System.out.println("Inside if loop");
				sum=sum+num[i];			

		}
		if (sum==30)
			return true;

		return false;
	}
}
