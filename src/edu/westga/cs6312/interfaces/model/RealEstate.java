package edu.westga.cs6312.interfaces.model;

/**
 * This class will model a piece of real estate
 * 
 * @author J. Allen Burton
 * @version Feb 8, 2020
 *
 */

public class RealEstate {
	private String location;
	private double landArea;
	private double structureArea;

	/**
	 * 3-parameter constructor for RealEstate objects
	 *
	 * @param location
	 * @param landArea
	 * @param structureArea
	 *
	 * Precondition: 	location != null 
	 * 					landArea > 0
	 * 					structureArea >= 0
	 *
	 *  Postcondition:
	 */
	public RealEstate(String location, double landArea, double structureArea) {
		if (location == null) {
			throw new IllegalArgumentException("Invalid location");
		}
		if (landArea <= 0) {
			throw new IllegalArgumentException("Invalid land area");
		}
		if (structureArea < 0) {
			throw new IllegalArgumentException("Invalid structure area");
		}
		this.location = location;
		this.landArea = landArea;
		this.structureArea = structureArea;
	}

	/**
	 * 
	 * 2-parameter constructor for RealEstate objects for use when no structure is
	 * built on the property. An object will be created with a structure area of
	 * zero.
	 *
	 * @param location
	 * @param landArea
	 *
	 * Precondition: 	location != null
	 * 					landArea > 0
	 *
	 * Postcondition:	a RealEstate object is created with structureArea set to zero
	 */
	public RealEstate(String location, double landArea) {
		this(location, landArea, 0);
	}
}
