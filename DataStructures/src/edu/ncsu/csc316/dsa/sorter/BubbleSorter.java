package edu.ncsu.csc316.dsa.sorter;

import java.util.Comparator;

public class BubbleSorter<E extends Comparable<E>> extends AbstractComparisonSorter<E>{
	public BubbleSorter() {
		super(null);
	}
	public BubbleSorter(Comparator<E> comparator) {
		super(comparator);
	}
	
	public void sort(E[] data) {
		boolean r = true;
		while(r) {
			r = false;
			for(int i = 1; i < data.length; i++) {
				if(super.compare(data[i], data[i - 1]) < 0) {
					E x = data[i - 1];
					data[i - 1] = data[i];
					data[i] = x;
					r = true;
				}
			}
		}
	}
}
