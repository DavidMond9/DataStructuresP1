package edu.ncsu.csc316.dsa.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the StudentIDComparator test class.
 */
public class StudentIDComparatorTest {

	private Student sOne;
	private Student sTwo;

	private StudentIDComparator comparator;

	@Before
	public void setUp() {
		/**
		 * Tests the set up for the comparator comparator.
		 */
		sOne = new Student("OneFirst", "OneLast", 1, 1, 1.0, "oneUnityID");
		sTwo = new Student("TwoFirst", "TwoLast", 2, 2, 2.0, "twoUnityID");

		comparator = new StudentIDComparator();
	}

	@Test
	/**
	 * Tests the actual comparator.
	 */
	public void testCompare() {
		assertTrue(comparator.compare(sOne, sTwo) < 0);
		assertFalse(comparator.compare(sTwo, sOne) < 0);

	}


}
