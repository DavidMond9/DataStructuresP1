package edu.ncsu.csc316.dsa.sorter;

import java.util.Comparator;

/**
 * InsertionSorter uses the insertion sort algorithm to sort data.
 * 
 * @author Dr. King
 */
public class InsertionSorter<E extends Comparable<E>> implements Sorter<E> {
    public void sort(E[] data) { 
        for (int i = 1; i < data.length; i++) {
            E x = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].compareTo(x) > 0) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = x;
        }
    }
	private class NaturalOrder implements Comparator<E> {
	    public int compare(E first, E second) {
	        return ((Comparable<E>) first).compareTo(second);
	    }
	}
	
}
