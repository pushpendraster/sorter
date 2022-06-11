package org.bagheledu.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/***
 * 
 * @author pbaghel
 *
 * @param <T> Type of object to be sorted using this reference sorter.
 */
public class RefrenceSorter<T> implements Sorter<T> {

	/**
	 * This is generic sorting method which can sort all kind of java objects with
	 * provided comparator.
	 * 
	 * @return sorted list
	 * @param collection is the list tp be sorted using this method.
	 * @param algo       algorithm to be used for sorting the list.
	 * @param direction  direction ASC or DESC.
	 * @param comparator implementation of the comparator interface for the type of
	 *                   object in the list.
	 * @throws IllegalArgumentException for null collection or size less than or
	 *                                  equals to zero.
	 */
	public List<T> sort(List<T> collection, SortDirection direction, SortingAlgo algo, Comparator<T> comparator) {
		if (collection == null || direction == null || algo == null || comparator == null) {
			throw new IllegalArgumentException("you can't pass null as Argument");
		}
		List<T> sortedList = null;
		switch (algo) {
		case BUUBLE_SORT:
			sortedList = bubbleSort(collection, comparator, direction);
		case QUICK_SORT:
			sortedList = quickSort(collection, comparator, direction);
		case MERGE_SORT:
			sortedList = mergeSortAlgo(collection, comparator, direction);
		case INSERTION_SORT:
			sortedList = insertionSort(collection, comparator, direction);
		case SELECTION_SORT:
			sortedList = selectionSort(collection, comparator, direction);
		default:
			break;
		}
		return sortedList;
	}

	private List<T> bubbleSort(List<T> in, Comparator<T> comparator, SortDirection direction) {
		for (int i = 0; i < in.size() - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < in.size() - 1; j++) {
				T buubleVal = in.get(j);
				if ((direction.equals(SortDirection.ASC) && comparator.compare(in.get(j + 1), in.get(j)) < 0)
						|| (direction.equals(SortDirection.DESC) && comparator.compare(in.get(j + 1), in.get(j)) > 0)) {
					in.set(j, in.get(j + 1));
					in.set(j + 1, buubleVal);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		return in;
	}

	private List<T> quickSort(List<T> in, Comparator<T> comparator, SortDirection direction) {
		if (in == null) {
			throw new IllegalArgumentException("Input List can't be null.");
		} else if (in.size() > 1) {
			Integer pIndex = quickSortPartition(in, comparator, direction);
			quickSort(in.subList(0, pIndex + 1), comparator, direction);
			quickSort(in.subList(pIndex + 1, in.size()), comparator, direction);
		}
		return in;
	}

	private Integer quickSortPartition(List<T> in, Comparator<T> comparator, SortDirection direction) {
		Integer pIndex = 0;
		for (int i = 0; i < in.size() - 1; i++) {
			if ((direction.equals(SortDirection.ASC) && comparator.compare(in.get(i + 1), in.get(pIndex)) < 0)
					|| (direction.equals(SortDirection.DESC)
							&& comparator.compare(in.get(i + 1), in.get(pIndex)) > 0)) {
				T pIndexElement = in.get(i);
				in.set(i, in.get(i + 1));
				in.set(i + 1, pIndexElement);
				pIndex = i + 1;
			}
		}
		return pIndex;

	}

	private List<T> mergeSortAlgo(List<T> in, Comparator<T> comparator, SortDirection direction) {

		List<T> sortedList = new ArrayList<T>();
		if (in.size() > 1) {
			List<T> leftList = mergeSortAlgo(in.subList(0, in.size() / 2), comparator, direction);
			List<T> rightList = mergeSortAlgo(in.subList(in.size() / 2, in.size()), comparator, direction);

			int swapCounter = leftList.size() >= rightList.size() ? leftList.size() : rightList.size();

			int leftIndex = 0;
			int rightIndex = 0;

			for (int i = 0; i < swapCounter; i++) {
				if (leftIndex < leftList.size() && ((direction.equals(SortDirection.ASC)
						&& comparator.compare(leftList.get(leftIndex), rightList.get(rightIndex)) <= 0)
						|| (direction.equals(SortDirection.DESC)
								&& comparator.compare(leftList.get(leftIndex), rightList.get(rightIndex)) >= 0))) {

					sortedList.add(leftList.get(leftIndex));
					leftIndex++;
				} else {
					sortedList.add(rightList.get(rightIndex));
					rightIndex++;
				}

			}
			List<T> residualList = new ArrayList<T>();
			if (leftIndex < leftList.size()) {
				for (int l = leftIndex; l < leftList.size(); l++) {
					residualList.add(leftList.get(l));
				}
			}
			if (rightIndex < rightList.size()) {
				for (int r = rightIndex; r < rightList.size(); r++) {
					residualList.add(rightList.get(r));
				}
			}

			sortedList.addAll(mergeSortAlgo(residualList, comparator, direction));
		} else {
			sortedList.addAll(in);
		}
		return sortedList;
	}

	private List<T> insertionSort(List<T> in, Comparator<T> comparator, SortDirection direction) {

		// TODO 1.iterate over list
		// 2. Start Loop
		// 3. Compare element and current index with next element, provided current
		// index is not last index of the list.
		// 4. IF next element is lesser than current element than find the next element
		// sorted position left side of the index.
		// 4.1 Start reverse Loop over sublist of 0th and next index.
		// 4.2 if current index is less than next element than swap
		// 4.3 Else break the inner reverse loop.
		// 5. ELSE skip to next iteration.

		for (int i = 0; i < in.size() - 1; i++) {
			if ((direction.equals(SortDirection.ASC) && comparator.compare(in.get(i), in.get(i + 1)) >= 0)
					|| (direction.equals(SortDirection.DESC) && comparator.compare(in.get(i), in.get(i + 1)) <= 0)) {
				List<T> innerList = in.subList(0, i + 2);
				for (int j = innerList.size() - 1; j >= 1; j--) {
					if ((direction.equals(SortDirection.ASC)
							&& comparator.compare(innerList.get(j), innerList.get(j - 1)) <= 0)
							|| (direction.equals(SortDirection.DESC)
									&& comparator.compare(innerList.get(j), innerList.get(j - 1)) >= 0)) {
						T swapped = innerList.get(j);
						innerList.set(j, innerList.get(j - 1));
						innerList.set(j - 1, swapped);
					} else {
						break;
					}
				}
			}
		}

		return in;
	}

	/*
	 * This sort algorithm works on logical division of the list into sorted (left)
	 * and unsorted (right) regions. It starts with zero element in sorted region
	 * and than iterate over the unsorted region to find out minimum or maximum
	 * based on sorted direction. Once the minimum element is found that is moved to
	 * the beginning of the list in sorted region. This continues until all the
	 * elements have moved to the sorted region.
	 */
	private List<T> selectionSort(List<T> in, Comparator<T> comparator, SortDirection direction) {
		for (int j = 0; j < in.size(); j++) {
			int minIndex = j;
			for (int i = j + 1; i < in.size(); i++) {
				if ((direction.equals(SortDirection.ASC) && comparator.compare(in.get(minIndex), in.get(i)) >= 0)
						|| (direction.equals(SortDirection.DESC)
								&& comparator.compare(in.get(minIndex), in.get(i)) <= 0)) {
					minIndex = i;
				}
			}
			if (minIndex != j) {
				T minVal = in.get(minIndex);
				in.set(minIndex, in.get(j));
				in.set(j, minVal);
			}
		}
		return in;
	}

	private List<T> heapSort(List<T> in, Comparator<T> comparator, SortDirection direction) {

		return in;
	}
}