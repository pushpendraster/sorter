package org.bagheledu.sorting;

import static org.junit.Assert.assertTrue;

import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import sorting.IntegerTestData;

public class HeapsortNumberTest {

	@Test
	public void testASCQuickSortOne() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcOneData(), SortDirection.ASC,
				SortingAlgo.HEAP_SORT, new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 3 && sortedList.get(1) == 5 && sortedList.get(2) == 5 && sortedList.get(3) == 7
				&& sortedList.get(4) == 10);
	}
}
