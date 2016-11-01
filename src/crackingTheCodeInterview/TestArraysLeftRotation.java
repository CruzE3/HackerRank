package crackingTheCodeInterview;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestArraysLeftRotation {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOneElementZeroRotations() {
		int[] nums = { 15 };
		int numberOfRotations = 0;
		int[] actuals = ArraysLeftRotation.rotate(nums, numberOfRotations);
		assertArrayEquals(nums, actuals);
	}
	
	@Test
	public void testOneElementOneRotation() {
		int[] nums = { 15 };
		int numberOfRotations = 1;
		int[] actuals = ArraysLeftRotation.rotate(nums, numberOfRotations);
		assertArrayEquals(nums, actuals);		
	}
	
	@Test
	public void testOneElementTwoRotations() {
		int[] nums = { 15 };
		int numberOfRotations = 2;
		int[] actuals = ArraysLeftRotation.rotate(nums, numberOfRotations);
		assertArrayEquals(nums, actuals);		
	}
	
	@Test
	public void testTwoElementsZeroRotations() {
		int[] nums = { 9, 71 };
		int numberOfRotations = 0;
		int[] actuals = ArraysLeftRotation.rotate(nums, numberOfRotations);
		assertArrayEquals(nums, actuals);		
	}
	
	@Test
	public void testTwoElementsOneRotations() {
		int[] nums = { 9, 71 };
		int numberOfRotations = 1;
		int[] actuals = ArraysLeftRotation.rotate(nums, numberOfRotations);
		int[] expecteds = { 71, 9 };
		assertArrayEquals(expecteds, actuals);		
	}
	
	@Test
	public void testFiveElementsFourRotations() {
		int[] nums = { 1, 2, 3, 4, 5 };
		int numberOfRotations = 4;
		int[] actuals = ArraysLeftRotation.rotate(nums, numberOfRotations);
		int[] expecteds = { 5, 1, 2, 3, 4 };
		assertArrayEquals(expecteds, actuals);		
	}
}
