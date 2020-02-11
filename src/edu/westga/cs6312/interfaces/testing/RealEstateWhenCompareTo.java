package edu.westga.cs6312.interfaces.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.interfaces.model.RealEstate;

/**
 * This will serve as a test class for the RealEstate compareTo method
 * 
 * @author J. Allen Burton
 * @version Feb 10, 2020
 *
 */
public class RealEstateWhenCompareTo {

	/**
	 * Testing land area and structure areas value comparison. Identical areas and
	 * estimated values. Expect result of 0 indicating estimated values are equal
	 */
	@Test
	public void testIdenticalAreasExpectGetEstimate0() {
		RealEstate theRealEstate1 = new RealEstate("Tallassee", 2000, 1000);
		RealEstate theRealEstate2 = new RealEstate("Notasulga", 2000, 1000);
		assertEquals(0, theRealEstate1.compareTo(theRealEstate2));
	}

	/**
	 * Testing land area and structure areas value comparison. Differing land area
	 * and structure area but identical estimated value Expect result of 0
	 * indicating estimated values are equal
	 */
	@Test
	public void testDifferentAreasExpectGetEstimate0() {
		RealEstate theRealEstate1 = new RealEstate("Tallassee", 2000, 1000);
		RealEstate theRealEstate2 = new RealEstate("Notasulga", 1500, 1050);
		assertEquals(0, theRealEstate1.compareTo(theRealEstate2));
	}

	/**
	 * Testing land area and structure areas value comparison. Property 1 is more
	 * expensive than property 2 Expect result of 1 indicating the acting object is
	 * more expensive than the acted upon
	 */
	@Test
	public void testDifferentValuesExpectGetEstimate1() {
		RealEstate theMoreExpensiveRealEstate = new RealEstate("Tallassee", 5000, 1000);
		RealEstate theLessExpensiveRealEstate = new RealEstate("Notasulga", 2000, 500);
		assertEquals(1, theMoreExpensiveRealEstate.compareTo(theLessExpensiveRealEstate));
	}

	/**
	 * Testing land area and structure areas value comparison. Property 1 is less
	 * expensive than property 2 Expect result of -1 indicating the acting object is
	 * less expensive than the acted upon
	 */
	@Test
	public void testDifferentValuesExpectGetEstimateNeg1() {
		RealEstate theMoreExpensiveRealEstate = new RealEstate("Tallassee", 5000, 1000);
		RealEstate theLessExpensiveRealEstate = new RealEstate("Notasulga", 2000, 500);
		assertEquals(-1, theLessExpensiveRealEstate.compareTo(theMoreExpensiveRealEstate));
	}

}
