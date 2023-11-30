package Arrays;
import java.util.Scanner;
public class ArrayTask1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the size");
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("enter the inputs");
			for(int i=0;i<size;i++)
			{
			 a[i]=sc.nextInt();
			}
			System.out.println("enter the outputs");

			for(int i=0;i<size;i++)
			{
				System.out.println(a[i]);
			}
		}

			}


	}
