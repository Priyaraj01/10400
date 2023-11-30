package Exception;

import java.util.Scanner;

public class Studenttask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ID");
		System.out.println("enter the Name");
		int Id=sc.nextInt();
		String Name=sc.next();
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int m6=m1+m2+m3+m4+m5;
		System.out.println(m6);
		if(m6<50)
		{
			System.out.println("NotEligibleForInterview");
		}
		else
		{
			try
			{
			throw new Exception("EligibleForInterview");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}

}
