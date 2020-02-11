package edu.westga.cs6312.interfaces.model;

/**
 * This is the appraisal interface to require objects to have the getEstimate
 * method defined within them
 * 
 * @author J. Allen Burton
 * @version Feb 11, 2020
 *
 */
public interface Appraisal {
	/**
	 * This abstract method will be required in classes implementing the Appraisal
	 * interface. This method will need to return an appraisal value as appropriate
	 * for the implementing class.
	 * 
	 * @return the value of the estimate
	 *
	 * Precondition: 	none
	 *
	 * Postcondition: 	value of double returned determined by implementing
	 *         			class
	 */
	double getEstimate();
}
