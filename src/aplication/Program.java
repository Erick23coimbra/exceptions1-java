package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.DomainException;
import model.entities.Reservation;

public class Program {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner (System.in);
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 try 
		 {
			 System.out.print("Room Number: ");
			 int number = sc.nextInt();
			 System.out.print("Check-in Date (dd/mm/aaaa): ");
			 Date checkIn = sdf.parse(sc.next());
			 System.out.print("Check-out Date (dd/mm/aaaa): ");
			 Date checkOut = sdf.parse(sc.next());
			 
			 
			 Reservation reservation = new Reservation(number, checkIn, checkOut);
			 System.out.println("Reservation: " + reservation);
			 
			 System.out.println("");
			 System.out.println("Enter data to update the reservation:");
			 System.out.print("Check-in Date (dd/mm/aaaa): ");
			 checkIn = sdf.parse(sc.next());
			 System.out.print("Check-out Date (dd/mm/aaaa): ");
			 checkOut = sdf.parse(sc.next());
			 reservation.updateDates(checkIn, checkOut);
			 System.out.println("Reservation: " + reservation);
		 }
		 catch (ParseException e) {
			 System.out.println("Invalid date format");
		 }
		 catch (DomainException e) {
			 System.out.println("Error in reservation" + e.getMessage());
		 }
		  catch(RuntimeException e ) {
			  System.out.println("Unexpected error");
			  
		  }
	
	 
	 
	 
	 
	 
	 sc.close();
	}

}
