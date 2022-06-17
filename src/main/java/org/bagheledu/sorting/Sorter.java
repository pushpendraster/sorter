package org.bagheledu.sorting;

import java.util.Comparator;
import java.util.List;

public interface Sorter<T> {

	public List<T> sort(List<T> inputList, SortDirection direction, SortingAlgo algo,
			Comparator<T> comparator);

}
