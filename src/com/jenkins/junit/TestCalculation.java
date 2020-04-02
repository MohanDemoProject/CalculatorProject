/**
 * 
 */
package com.jenkins.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jenkins.demo.DoCalculation;

/**
 * TestCalculation class used to cover test cases of calculator application 
 * of class {@link DoCalculation}
 * 
 * @author Mohan
 *
 */
public class TestCalculation {

	@Test
	public void test() {
		
		assertEquals(3, DoCalculation.addition(1, 2));;
		
	}

}
