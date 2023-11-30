package Conditions;
import java.util.Scanner;
public class FactorsExample1 {
  public static void main(String[] args) {
				try (Scanner sc = new Scanner(System.in)) {
					System.out.println("enter the number");
					int n=sc.nextInt();
					int start=1;
					while(start<=n)
					{
						if(start%3==0)
							
						{
							System.out.println(start);
						}
						start++;
					}
				}

			}

	}
