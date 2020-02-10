package edu.westga.cs6312.interfaces.view;

import java.util.ArrayList;
import java.util.Scanner;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * This class will serve as the TUI allowing users to create and view new
 * RealEstate objects
 * 
 * @author J. Allen Burton
 * @version Feb 9, 2020
 *
 */
public class RealEstateTUI {
	private Scanner userInput;
	private ArrayList<RealEstate> userRealEstate;

	/**
	 * This will serve as the constructor to create the TUI object
	 *
	 * Precondition: none
	 *
	 * Postcondition: RealEstateTUI is created with a new Scanner object for user
	 * input and a new ArrayList of RealEstate objects ready to be populated.
	 */
	public RealEstateTUI() {
		this.userInput = new Scanner(System.in);
		this.userRealEstate = new ArrayList<RealEstate>();
	}

	/**
	 * This method will serve to run the application
	 *
	 * Precondition: none
	 *
	 * Postcondition: menu is displayed, choices are entered and executed, and
	 * repeated until quit is chosen
	 */
	public void run() {
		System.out.println("Welcome to the Real Estate Appraisal Application.");
		int userChoice;
		do {
			this.displayMenu();
			userChoice = this.getUserChoice();
			switch (userChoice) {
			case 1:
				this.addRealEstate();
				break;
			case 2:
				this.viewRealEstate();
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid choice. Please choose from the following options:");
			}
		} while (userChoice != 3);
		System.out.println("Thank you for using the Real Estate Appraisal Application.");

	}
	
	/**
	 * This method will display the menu of choices for the user
	 *
	 * Precondition: none
	 *
	 * Postcondition: displayed menu to console
	 */
	private void displayMenu() {
		System.out.println("\n\t-----------------------------------------");
		System.out.println("\t| 1 - Add real estate to the list       |");
		System.out.println("\t| 2 - Print the real estate in the list |");
		System.out.println("\t| 3 - Quit                              |");
		System.out.println("\t-----------------------------------------");
	}
	
	/**
	 * This method prompts the user to enter a number choice from the menu. The
	 * choice entered by the user is returned by the method.
	 * 
	 * @return menu choice entered by the user
	 *
	 *         Precondition: choice must be an integer
	 *
	 *         Postcondition: integer returned
	 */
	private int getUserChoice() {
		System.out.println("Please choose an option from the above menu and type the number of your choice:");
		return Integer.parseInt(this.userInput.nextLine());
	}
	
	/**
	 * This method will prompt the user to type information for the new real estate:
	 * --location name
	 * --land area
	 * --structure area
	 * The property information will then be added to the list of real estate
	 *
	 * Precondition: 
	 *
	 * Postcondition: 
	 */
	private void addRealEstate() {
		String location;
		double landArea;
		double structureArea;
		do {
			System.out.print("Please enter the location of the real estate: ");
			location = this.userInput.nextLine();
		} while (location.equals(""));
		do {
			System.out.print("Please enter the area in square feet of the lot: ");
			landArea = Double.parseDouble(this.userInput.nextLine());
		} while (landArea <= 0);
		do {
			System.out.print("Please enter the area in square feet of the structure: ");
			structureArea = Double.parseDouble(this.userInput.nextLine());
		} while (structureArea < 0 || structureArea > landArea);
		this.userRealEstate.add(new RealEstate(location, landArea, structureArea));
		
	}
	
	/**
	 * This method will print out a list of real estate properties showing 
	 * each one's location, land area, and structure area.
	 *
	 * Precondition: none
	 *
	 * Postcondition: printed list of RealEstate objects each listing location, land area, and structure area
	 */
	private void viewRealEstate() {
		for (RealEstate current : this.userRealEstate) {
			System.out.print(current.toString());
			System.out.format(" Appraised Value: $%.2f.", current.getEstimate());
		}
	}
}
