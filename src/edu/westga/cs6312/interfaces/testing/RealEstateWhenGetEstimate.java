package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * This class will serve to test the getEstimate method in the RealEstate class
 * 
 * @author J. Allen Burton
 * @version Feb 9, 2020
 *
 */
public class RealEstateWhenGetEstimate {

	/**
	 * Test getting estimate for fairly generic area values
	 * 
	 * Land Area: 1000
	 * Structure area: 500
	 * 
	 * Expected estimate: 60000
	 */
	@Test
	public void testGetEstimateWhenLand1000Structure500() {
		RealEstate theRealEstate = new RealEstate("Lexington", 1000, 500);
		double report = theRealEstate.getEstimate();
		assertEquals(60000, report);
	}
	
	/**
	 * Test getting estimate for property with no structure
	 * 
	 * Land Area: 1000
	 * Structure area: 0
	 * 
	 * Expected estimate: 10000
	 */
	@Test
	public void testGetEstimateWhenLand1000NoStructure() {
		RealEstate theRealEstate = new RealEstate("Winchester", 1000);
		double report = theRealEstate.getEstimate();
		assertEquals(10000, report);
	}
	
	/**
	 * Test getting estimate for property with max structure area
	 * 
	 * Land Area: 1000
	 * Structure area: 1000
	 * 
	 * Expected estimate: 110000
	 */
	@Test
	public void testGetEstimateWhenLand1000Structure1000() {
		RealEstate theRealEstate = new RealEstate("Huntsville", 1000, 1000);
		double report = theRealEstate.getEstimate();
		assertEquals(110000, report);
	}

}
