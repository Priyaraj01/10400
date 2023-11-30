package Conditions;
import java.util.Scanner;
public class ForLoopExample {
		public static void main(String[] args) {
		   try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the number");
			   int n=sc.nextInt();//5
			   for(int i=1;i<=10;i++)//1<=10 2<=10
			   {
				   System.out.println(n+"*"+i+"="+n*i);//
				                      //5*1=5
				                      //5*2=10
			   }
		}
		   

		}

	}
