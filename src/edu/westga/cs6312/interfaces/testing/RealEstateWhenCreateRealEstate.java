package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * Test class for RealEstate constructors
 * 
 * @author J. Allen Burton
 * @version Feb 8, 2020
 *
 */
class RealEstateWhenCreateRealEstate {

	/**
	 * Test 3-parameter constructor with the following values:
	 * 
	 * location = Front Royal
	 * landArea = 43560
	 * structureArea = 1200
	 * 
	 * Expect the above values reported
	 */
	@Test
	void testCreateNewRealEstate3ParameterInFrontRoyalWithLand43560Structure1200() {
		RealEstate theRealEstate = new RealEstate("Front Royal", 43560, 1200);
		String report = theRealEstate.toString();
		assertEquals("Location: Front Royal -- Land Area: 43560 sq. ft. -- Structure Area: 1200 sq. ft.", report);
	}
	
	/**
	 * Test 3-parameter constructor with the following values:
	 * 
	 * location = Marietta
	 * landArea = 43560
	 * 
	 * Expect the above values and structureArea = 0
	 */
	@Test
	void testCreateNewRealEstate2ParameterInMariettaWithLand43560NoStructure() {
		RealEstate theRealEstate = new RealEstate("Marietta", 43560);
		String report = theRealEstate.toString();
		assertEquals("Location: Marietta -- Land Area: 43560 sq. ft. -- Structure Area: 0 sq. ft.", report);
	}
	
	/**
	 * Test 3-parameter constructor with the following values:
	 * 
	 * location = blank string (NOT null)
	 * landArea = 1
	 * structureArea = 1
	 * 
	 * Expect the above values reported
	 */
	@Test
	void testCreateNewRealEstate3ParameterInAuburnWithLand0Structure0() {
		RealEstate theRealEstate = new RealEstate("", 1, 1);
		String report = theRealEstate.toString();
		assertEquals("Location:  -- Land Area: 1 sq. ft. -- Structure Area: 1 sq. ft.", report);
	}

}
