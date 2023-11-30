package Strings;
import java.util.Scanner;
public class ReplaceExampleTask2 {

	public static void main(String[] args) {
				try (Scanner sc = new Scanner(System.in)) {
					System.out.println("enter the sentence");
					String sentence=sc.nextLine();
					System.out.println(sentence.replace("D", "t"));
				}

			}

	}

