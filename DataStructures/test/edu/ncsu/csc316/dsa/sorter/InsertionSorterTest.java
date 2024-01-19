package edu.ncsu.csc316.dsa.sorter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InsertionSorterTest {

	private int[] dataAscending = { 1, 2, 3, 4, 5 };
	private int[] dataDescending = { 5, 4, 3, 2, 1 };
	private int[] dataRandom = { 4, 1, 5, 3, 2 };

	private InsertionSorter integerSorter;

	@Before
	public void setUp() {
		integerSorter = new InsertionSorter();
	}

	@Test
	public void testSortIntegers() {
		integerSorter.sort(dataAscending);
		assertEquals(1, dataAscending[0]);
		assertEquals(2, dataAscending[1]);
		assertEquals(3, dataAscending[2]);
		assertEquals(4, dataAscending[3]);
		assertEquals(5, dataAscending[4]);

		integerSorter.sort(dataDescending);
		assertEquals(1, dataDescending[0]);
		assertEquals(2, dataDescending[1]);
		assertEquals(3, dataDescending[2]);
		assertEquals(4, dataDescending[3]);
		assertEquals(5, dataDescending[4]);

		integerSorter.sort(dataRandom);
		assertEquals(1, dataRandom[0]);
		assertEquals(2, dataRandom[1]);
		assertEquals(3, dataRandom[2]);
		assertEquals(4, dataRandom[3]);
		assertEquals(5, dataRandom[4]);
	}

	@Test
	public void testSortStudent() {
		// TODO: Add test cases.
		// You will also need to go back and update the existing test cases
		// since the design of the software will change to allow generic types
	}
}
