/**
 * 
 */
package edu.westga.cs6312.interfaces.controller;

import edu.westga.cs6312.interfaces.view.RealEstateTUI;

/**
 * This class will serve as the driver for the RealEstate class application
 * 
 * @author J. Allen Burton
 * @version Feb 9, 2020
 *
 */
public class RealEstateDriver {

	/**
	 * This method is the entry point of the application
	 *
	 * @param args Command-line arguments, not used
	 */
	public static void main(String[] args) {
		RealEstateTUI userRealEstateTUI = new RealEstateTUI();
		userRealEstateTUI.run();

	}

}
