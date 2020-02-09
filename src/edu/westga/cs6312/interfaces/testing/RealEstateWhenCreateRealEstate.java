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
public class RealEstateWhenCreateRealEstate {

	/**
	 * Test 3-parameter constructor with the following values:
	 * 
	 * location = Front Royal
	 * landArea = 43560
	 * structureArea = 1200
	 * 
	 * Expect the above values reported (as doubles so with .0)
	 */
	@Test
	public void testCreateNewRealEstate3ParameterInFrontRoyalWithLand43560Structure1200() {
		RealEstate theRealEstate = new RealEstate("Front Royal", 43560, 1200);
		String report = theRealEstate.toString();
		assertEquals("Location: Front Royal -- Land Area: 43560.0 sq. ft. -- Structure Area: 1200.0 sq. ft.", report);
	}
	
	/**
	 * Test 2-parameter constructor with the following values:
	 * 
	 * location = Marietta
	 * landArea = 43560
	 * 
	 * Expect the above values and structureArea = 0 (as doubles so with .0)
	 */
	@Test
	public void testCreateNewRealEstate2ParameterInMariettaWithLand43560NoStructure() {
		RealEstate theRealEstate = new RealEstate("Marietta", 43560);
		String report = theRealEstate.toString();
		assertEquals("Location: Marietta -- Land Area: 43560.0 sq. ft. -- Structure Area: 0.0 sq. ft.", report);
	}
	
	/**
	 * Test 3-parameter constructor with structure area at max value
	 * 
	 * location = Montgomery
	 * landArea = 10000
	 * structureArea = 10000
	 * 
	 * Expect the above values reported (as doubles so with .0)
	 */
	@Test
	public void testCreateNewRealEstateLand10000Structure10000() {
		RealEstate theRealEstate = new RealEstate("Montgomery", 10000, 10000);
		String report = theRealEstate.toString();
		assertEquals("Location: Montgomery -- Land Area: 10000.0 sq. ft. -- Structure Area: 10000.0 sq. ft.", report);
	}
	
	/**
	 * Test 3-parameter constructor with with blank string (not NULL) location
	 * 
	 * location = blank string (NOT null)
	 * landArea = 1
	 * structureArea = 1
	 * 
	 * Expect the above values reported (as doubles so with .0)
	 */
	@Test
	public void testCreateNewRealEstateBlankLocationWithLand1Structure1() {
		RealEstate theRealEstate = new RealEstate("", 1, 1);
		String report = theRealEstate.toString();
		assertEquals("Location:  -- Land Area: 1.0 sq. ft. -- Structure Area: 1.0 sq. ft.", report);
	}
	
	/**
	 * Test 3-parameter constructor with negative land area.  Expect exception.
	 * 
	 * location = Auburn
	 * landArea = -1
	 * structureArea = 500
	 * 
	 * Expect exception: "Invalid land area"
	 */
	@Test
	public void testCreateNewRealEstateWithLandNeg1ExpectException() {
		String report = "";
		try {
			RealEstate theRealEstate = new RealEstate("Auburn", -1, 500);
		} catch (IllegalArgumentException exception) {
			report = exception.getMessage();
		}
		assertEquals("Invalid land area", report);
	}
	
	/**
	 * Test 3-parameter constructor with null location.  Expect error.
	 * 
	 * location = null
	 * landArea = 1200
	 * structureArea = 500
	 * 
	 * Expect exception: "Invalid location"
	 */
	@Test
	public void testCreateNewRealEstateInNullLocationExpectException() {
		String report = "";
		try {
			RealEstate theRealEstate = new RealEstate(null, 1200, 500);
		} catch (IllegalArgumentException exception) {
			report = exception.getMessage();
		}
		assertEquals("Invalid location", report);
	}
	
	/**
	 * Test 3-parameter constructor with negative structure area.  Expect error.
	 * 
	 * location = Columbus
	 * landArea = 1200
	 * structureArea = -500
	 * 
	 * Expect exception: "Invalid structure area"
	 */
	@Test
	public void testCreateNewRealEstateWithNegStructureAreaExpectException() {
		String report = "";
		try {
			RealEstate theRealEstate = new RealEstate("Columbus", 1200, -500);
		} catch (IllegalArgumentException exception) {
			report = exception.getMessage();
		}
		assertEquals("Invalid structure area", report);
	}
	
	/**
	 * Test 3-parameter constructor with structure area greater than land area.  Expect error.
	 * 
	 * location = Carrollton
	 * landArea = 1200
	 * structureArea = 1500
	 * 
	 * Expect exception: "Structure area exceeds land area"
	 */
	@Test
	public void testCreateNewRealEstateMoreStructureAreaThanLandAreaExpectException() {
		String report = "";
		try {
			RealEstate theRealEstate = new RealEstate("Carrollton", 1200, 1500);
		} catch (IllegalArgumentException exception) {
			report = exception.getMessage();
		}
		assertEquals("Structure area exceeds land area", report);
	}

	
	
	

}
