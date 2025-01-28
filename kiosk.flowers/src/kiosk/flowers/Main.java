package kiosk.flowers;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.println("Enter 1 for Roses or 2 for Tulips:");
	        int choice = input.nextInt();
	        input.nextLine(); 
	        System.out.println("Enter the color:");
	        String color = input.nextLine();

	        System.out.println("Enter the number:");
	        int num = input.nextInt(); 

	        Flowers flower;

	        if (choice == 1) {
	            flower = new Roses(color, num); 
	        } else if (choice == 2) {
	            flower = new Tulips(color, num); 
	        } else {
	            System.out.println("Invalid choice.");
	            input.close();
	            return;
	        }

	        flower.printColor();
	        flower.printNumFlowers();

	        input.close();
	}

}
