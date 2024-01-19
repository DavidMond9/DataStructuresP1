package edu.ncsu.csc316.dsa.sorter;

import edu.ncsu.csc316.dsa.data.Identifiable;

/**
 * CountingSorter uses the counting sort algorithm to sort data
 * @author Dr. King
 *
 * @param <E> the generic type of data to sort
 */
public class CountingSorter<E extends Identifiable> implements Sorter<E> {
    
    public void sort(E[] data) {
        // TODO Your code here
        // Since we constrained E to be Identifiable,
        // we can now access the .getId() method of E objects
        // from within this sort method
    }
}
