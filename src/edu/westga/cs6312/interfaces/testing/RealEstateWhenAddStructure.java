package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * Test class for RealEstate class addStructure 
 * @author J. Allen Burton
 * @version Feb 8, 2020
 *
 */
public class RealEstateWhenAddStructure {

	/**
	 * Test adding structure area to zero previous
	 * 
	 * Original structure area: 0
	 * Added structure area: 500
	 * Expected structure area: 500.0
	 */
	@Test
	public void testAddStructure500ToPrevious0Expect500() {
		RealEstate theRealEstate = new RealEstate("Frankfort", 43560);
		theRealEstate.addStructureArea(500);
		String report = theRealEstate.toString();
		assertEquals("Location: Frankfort -- Land Area: 43560.0 sq. ft. -- Structure Area: 500.0 sq. ft.", report);
	}

	/**
	 * Test adding structure area to 1000 previous
	 * 
	 * Original structure area: 1000
	 * Added structure area: 500
	 * Expected structure area: 1500.0
	 */
	@Test
	public void testAddStructure500ToPrevious1000Expect1500() {
		RealEstate theRealEstate = new RealEstate("Frankfort", 43560, 1000);
		theRealEstate.addStructureArea(500);
		String report = theRealEstate.toString();
		assertEquals("Location: Frankfort -- Land Area: 43560.0 sq. ft. -- Structure Area: 1500.0 sq. ft.", report);
	}
	
	/**
	 * Test adding no structure area to 1000 previous
	 * 
	 * Original structure area: 1000
	 * Added structure area: 0
	 * Expected structure area: 1000.0
	 */
	@Test
	public void testAddStructure0ToPrevious1000Expect1000() {
		RealEstate theRealEstate = new RealEstate("Frankfort", 43560, 1000);
		theRealEstate.addStructureArea(0);
		String report = theRealEstate.toString();
		assertEquals("Location: Frankfort -- Land Area: 43560.0 sq. ft. -- Structure Area: 1000.0 sq. ft.", report);
	}
	
	/**
	 * Test adding more structure area than available land area.  Expect exception.
	 * 
	 * Land Area: 5000
	 * Original structure area: 4000
	 * Added structure area: 2000
	 * Expected exception: "Total structure area exceeds land area available"
	 */
	@Test
	public void testAddMoreStructureAreaThanAvailableLandAreaExpectException() {
		String report = "";
		try {
			RealEstate theRealEstate = new RealEstate("Columbus", 5000, 4000);
			theRealEstate.addStructureArea(2000);
		} catch (IllegalArgumentException exception) {
			report = exception.getMessage();
		}
		assertEquals("Total structure area excedes land area available", report);
	}
}
