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
	 * Test 3-parameter constructor with the following values (normal values):
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
		assertEquals("Location: Front Royal\tLand Area: 43560.0 sq.ft.\tStructure Area: 1200.0 sq.ft.", report);
	}
	
	/**
	 * Test 3-parameter constructor with the following values (lower boundary values):
	 * 
	 * location = Carlsbad
	 * landArea = 0.01
	 * structureArea = 0.01
	 * 
	 * Expect the above values reported 
	 */
	@Test
	public void testCreateNewRealEstate3ParameterInCarlsbadWithLandP01StructureP01() {
		RealEstate theRealEstate = new RealEstate("Carlsbad", 0.01, 0.01);
		String report = theRealEstate.toString();
		assertEquals("Location: Carlsbad\tLand Area: 0.01 sq.ft.\tStructure Area: 0.01 sq.ft.", report);
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
		assertEquals("Location: Marietta\tLand Area: 43560.0 sq.ft.\tStructure Area: 0.0 sq.ft.", report);
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
		assertEquals("Location: Montgomery\tLand Area: 10000.0 sq.ft.\tStructure Area: 10000.0 sq.ft.", report);
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
		assertEquals("Location: \tLand Area: 1.0 sq.ft.\tStructure Area: 1.0 sq.ft.", report);
	}
}
