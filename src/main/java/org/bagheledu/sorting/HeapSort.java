package org.bagheledu.sorting;

import java.util.Comparator;
import java.util.List;

/**
 * Reference Implementation of heapsort on ArrayList.
 * 
 * @author Pushpendra Singh Baghel
 *
 * @param <T>
 */
public class HeapSort<T> implements Sorter<T> {

	@Override
	public List<T> sort(List<T> inputList, SortDirection direction, SortingAlgo algo, Comparator<T> comparator) {

		// build heap...
		for (int i = inputList.size() / 2 - 1; i >=0; i--) {
			heapify(i, inputList, direction, algo, comparator);
		}

		for (int i = inputList.size() - 1; i > 0; i--) {
			T temp = inputList.get(0);
			inputList.set(0, inputList.get(i));
			inputList.set(i, temp);
			heapify(0, inputList.subList(0, i), direction, algo, comparator);
		}
		return inputList;
	}

	private void heapify(int rootIndex, List<T> inputList, SortDirection direction, SortingAlgo algo,
			Comparator<T> comparator) {
		int largest = rootIndex;
		int insize = inputList.size();
		int l = rootIndex * 2 + 1;
		int r = rootIndex * 2 + 2;

		if (l < insize && ((SortDirection.ASC.equals(direction) && comparator.compare(inputList.get(l), inputList.get(largest)) >= 0)
				|| (SortDirection.DESC.equals(direction) && comparator.compare(inputList.get(l), inputList.get(largest)) <= 0))) {
			largest = l;
		}

		if (r < insize && ( (SortDirection.ASC.equals(direction) && comparator.compare(inputList.get(r), inputList.get(largest)) >= 0)
				|| (SortDirection.DESC.equals(direction) && comparator.compare(inputList.get(r), inputList.get(largest)) <= 0))) {
			largest = r;
		}

		if (largest != rootIndex) {
			T swap = inputList.get(rootIndex);
			inputList.set(rootIndex, inputList.get(largest));
			inputList.set(largest, swap);
			heapify(largest, inputList, direction, algo, comparator);
		}

	}
}
