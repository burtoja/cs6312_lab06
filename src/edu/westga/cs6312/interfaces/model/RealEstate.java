package edu.westga.cs6312.interfaces.model;

/**
 * This class will model a piece of real estate keeping track of its
 * location, property area, and structure area
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
	 * @param location      the location of the piece of real estate
	 * @param landArea      the area in square feet of the property lot
	 * @param structureArea the area in square feet of the structure built on the
	 *                      property (0 indicates no structure on property)
	 *
	 *                      Precondition: 	location != null 
	 *                      				landArea > 0
	 *                      				structureArea >= 0
	 *
	 *                      Postcondition:
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
	 * @param location the location of the piece of real estate
	 * @param landArea the area in square feet of the property lot
	 *
	 *                 Precondition: 	location != null 
	 *                 					landArea > 0
	 *
	 *                 Postcondition: 	a RealEstate object is created with
	 *                 					structureArea set to zero
	 */
	public RealEstate(String location, double landArea) {
		this(location, landArea, 0);
	}

	/**
	 * This method allows the structure area to be set for the object
	 * 
	 * @param structureArea
	 *
 *                      Precondition: 	structureArea >= 0
	 *
 *                      Postcondition: 	object will have new structure area if
	 *                      			parameter sent is valid
	 */
	public void setStructureArea(double structureArea) {
		if (structureArea < 0) {
			throw new IllegalArgumentException("Invalid structure area");
		}
		this.structureArea = structureArea;
	}

	/**
	 * This method will return a string representation of the object variables
	 * 
	 * @return string representation of object variables
	 *
	 *         			Precondition: none
	 *
	 *         			Postcondition: object is not changed
	 */
	@Override
	public String toString() {
		return "Location: " + this.location + " -- Land Area: " + this.landArea + " sq. ft. -- Structure Area: "
				+ this.structureArea + " sq. ft.";
	}
}
