package miniprojectcollection;

import java.util.Scanner;

public class MovieMain {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("============= Movie Details =============================");
		String ch;
		MovieApp app=new MovieApp();
		do
		{
		
		System.out.println("\t\t 1)View All Movie Information.\r\n"
				+ "\t\t 2)Insert Movie info by Movie Id.\r\n"
				+ "\t\t 3)view Movie information By Id.\r\n"
				+ "\t\t 4)Update Movie Ticket Price info by Id.\r\n"
				+ "\t\t 5)delete Movie info by Id.\r\n"
				+ "\t\t 6)delete All Movie information.");
		System.out.println("=============================================================");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1:	app.ViewAllMovieInfo();
		break;
		case 2:	app.AddMovieInfo();
		break;
		case 3:	app.ViewMovieInfoById();
		break;
		case 4:	app.UpdateTicketPriceById();
		break;
		case 5:	app.DeleteAllMovieInfo();
		break;
	    default:System.out.println("Wrong choice!!"); 		   
		
	    
	    
		}
		
		System.out.println("Do you want to continue? (Yes / No)");
		 ch=sc.next();
		}
		while(ch.equals("Yes")||ch.equals("yes"));
		System.out.println("====================================================================");

		System.out.println("Bye....");
	
		System.out.println("====================================================================");


	}

}
