package edu.ncsu.csc316.dsa.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Student Class.
 */
public class StudentTest {
	
	private Student sOne;
	private Student sTwo;

	@Before
	/**
	 * Tests the set up for student.
	 */
	public void setUp() {
		sOne = new Student("OneFirst", "OneLast", 1, 1, 1.0, "oneUnityID");
		sTwo = new Student("TwoFirst", "TwoLast", 2, 2, 2.0, "twoUnityID");
	}

	@Test
	/**
	 * Tests student first name.
	 */
	public void testSetFirst() {
		sOne.setFirst("newOne");
		assertEquals("newOne", sOne.getFirst());
	}

	@Test
	/**
	 * Tests student last name.
	 */
	public void testSetLast() {
		sOne.setLast("newOne");
		assertEquals("newOne", sOne.getLast());
	}

	@Test
	/**
	 * Tests student ID.
	 */
	public void testSetId() {
		sOne.setId(100);
		assertEquals(100, sOne.getId());
	}

	@Test
	/**
	 * Tests student GPA.
	 */
	public void testSetGpa() {
		sOne.setGpa(3.51);
		assertEquals(3.51, sOne.getGpa(), 0.001);
	}
	
	@Test
	/**
	 * Tests student Unity ID.
	 */
	public void testSetUnityID() {
		sOne.setUnityID("oneUnity");
		assertEquals("oneUnity", sOne.getUnityID());
	}

	@Test
	/**
	 * Tests student CompareTo.
	 */
	public void testCompareTo() {
		assertTrue(sOne.compareTo(sTwo) < 0);
		assertTrue(sTwo.compareTo(sOne) > 0);
		assertTrue(sOne.compareTo(sOne) == 0);
		assertTrue(sTwo.compareTo(sTwo) == 0);
	}
	
	@Test
	/**
	 * Tests student toString.
	 */
	public void testToString() {
		assertEquals(sOne.toString(), "Student [first=OneFirst, last=OneLast, id=1, creditHours=1, gpa=1.0, unityID=oneUnityID]");
	}
}
