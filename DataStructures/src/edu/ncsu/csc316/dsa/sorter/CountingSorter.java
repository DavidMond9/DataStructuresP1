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
        E min = data[0];
        E max = data[0];
        for(int i = 0; i < data.length - 1; i++) {
        	if(data[i].getId() < min.getId()) {
        		min = data[i];
        	}
        	if(data[i].getId() > max.getId()) {
        		max = data[i];
        	}
        }
        int k = max.getId() - min.getId()+1;
        int[] B = new int[k];
        for(int i = 0; i < data.length - 1; i++) {
        	B[data[i].getId() - min.getId()] = B[data[i].getId() - min.getId()] + 1;
        }
        for(int i = 1; i < k - 1; i++) {
        	B[i] = B[i-1] + B[i];
        }
        @SuppressWarnings("unchecked")
        E[] F = (E[])(new Identifiable[data.length]);
        for(int i = data.length - 1; i > 0; i++) {
        	F[B[data[i].getId() - min.getId()] - 1] = data[i];
        	B[data[i].getId() - min.getId()] = B[data[i].getId() - min.getId()] - 1;
        }
        data = F;
    }
}
