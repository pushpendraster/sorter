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

		for (int i = 0; i < inputList.size(); i++) {
			heapify(0, inputList.subList(0, inputList.size() - i), direction, algo, comparator);
			T indexT = inputList.get(0);
			inputList.set(0, inputList.get(inputList.size() - 1 - i));
			inputList.set(inputList.size() - 1 - i, indexT);
		}
		return inputList;
	}

	private void heapify(int rootIndex, List<T> inputList, SortDirection direction, SortingAlgo algo,
			Comparator<T> comparator) {

		if (hasChidlren(rootIndex, inputList)) {
			T root = inputList.get(rootIndex);
			T leftT = inputList.get(2 * rootIndex + 1);
			if (hasRightNode(rootIndex, inputList)) {
				T rightT = inputList.get(2 * rootIndex + 2);
				if (comparator.compare(leftT, rightT) >= 0 && comparator.compare(root, leftT) <= 0) {
					inputList.set(rootIndex, leftT);
					inputList.set(2 * rootIndex + 1, root);
					heapify(2 * rootIndex + 1, inputList, direction, algo, comparator);
				} else if (comparator.compare(rightT, leftT) >= 0 && comparator.compare(root, rightT) <= 0) {
					inputList.set(rootIndex, rightT);
					inputList.set(2 * rootIndex + 2, root);
					heapify(2 * rootIndex + 1, inputList, direction, algo, comparator);
				}
			} else if (comparator.compare(root, leftT) <= 0) {
				inputList.set(rootIndex, leftT);
				inputList.set(2 * rootIndex + 1, root);
				heapify(2 * rootIndex + 1, inputList, direction, algo, comparator);
			}

		}
	}

	private boolean hasChidlren(int nodeIndex, List<T> inputList) {
		return (2 * nodeIndex + 2 < inputList.size()) || (2 * nodeIndex + 1 < inputList.size()) ? true : false;
	}

	private boolean isChildNode(int nodeIndex, List<T> inputList) {
		return (nodeIndex - 1) / 2 >= 0 ? true : false;
	}

	private boolean isRootNode(int nodeIndex) {
		return nodeIndex == 0 ? true : false;
	}

	private boolean hasRightNode(int nodeIndex, List<T> inputList) {
		return (2 * nodeIndex + 2 < inputList.size()) ? true : false;
	}

	private void siftDown(List<T> inputList, SortDirection direction, SortingAlgo algo, Comparator<T> comparator) {

	}

}
