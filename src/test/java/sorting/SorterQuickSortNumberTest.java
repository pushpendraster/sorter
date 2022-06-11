package sorting;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.bagheledu.sorting.RefrenceSorter;
import org.bagheledu.sorting.SortDirection;
import org.bagheledu.sorting.Sorter;
import org.bagheledu.sorting.SortingAlgo;
import org.junit.Test;

public class SorterQuickSortNumberTest {

	@Test
	public void testASCQuickSortOne() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 5);
		tcList.add(1, 5);
		tcList.add(2, 10);
		tcList.add(3, 3);
		tcList.add(4, 7);
		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 3 && tcList.get(1) == 5 && tcList.get(2) == 5 && tcList.get(3) == 7
				&& tcList.get(4) == 10);
	}

	@Test
	public void testASCQuickSortTwo() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 10);
		tcList.add(1, 5);
		tcList.add(2, 10);
		tcList.add(3, 3);
		tcList.add(4, 7);
		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 3 && tcList.get(1) == 5 && tcList.get(2) == 7 && tcList.get(3) == 10
				&& tcList.get(4) == 10);
	}

	@Test
	public void testASCQuickSortThree() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 1);
		tcList.add(1, 2);
		tcList.add(2, 3);
		tcList.add(3, 4);
		tcList.add(4, 5);
		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 1 && tcList.get(1) == 2 && tcList.get(2) == 3 && tcList.get(3) == 4
				&& tcList.get(4) == 5);
	}

	@Test
	public void testASCQuickSortFour() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 5);
		tcList.add(1, 4);
		tcList.add(2, 3);
		tcList.add(3, 2);
		tcList.add(4, 1);
		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 1 && tcList.get(1) == 2 && tcList.get(2) == 3 && tcList.get(3) == 4
				&& tcList.get(4) == 5);
	}

	@Test
	public void testASCQuickSortFive() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 5);
		tcList.add(1, 4);
		tcList.add(2, 3);
		tcList.add(3, 20);
		tcList.add(4, 1);
		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 1 && tcList.get(1) == 3 && tcList.get(2) == 4 && tcList.get(3) == 5
				&& tcList.get(4) == 20);
	}

	@Test
	public void testASCQuickSortSix() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 1);
		tcList.add(1, 1);
		tcList.add(2, 1);
		tcList.add(3, 1);
		tcList.add(4, 1);
		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 1 && tcList.get(1) == 1 && tcList.get(2) == 1 && tcList.get(3) == 1
				&& tcList.get(4) == 1);
	}

	@Test
	public void testASCQuickSortSeven() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 1);
		tcList.add(1, 2);
		tcList.add(2, 1);
		tcList.add(3, 2);
		tcList.add(4, 1);
		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 1 && tcList.get(1) == 1 && tcList.get(2) == 1 && tcList.get(3) == 2
				&& tcList.get(4) == 2);
	}

	@Test
	public void testASCQuickSortEight() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 5);
		tcList.add(1, 2);
		tcList.add(2, 10);
		tcList.add(3, 4);
		tcList.add(4, 1);
		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 1 && tcList.get(1) == 2 && tcList.get(2) == 4 && tcList.get(3) == 5
				&& tcList.get(4) == 10);
	}

	@Test
	public void testASCQuickSortNine() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 5);
		tcList.add(1, 10);
		tcList.add(2, 10);
		tcList.add(3, 4);
		tcList.add(4, 1);
		tcList.add(5, 8);
		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 1 && tcList.get(1) == 4 && tcList.get(2) == 5 && tcList.get(3) == 8
				&& tcList.get(4) == 10 && tcList.get(5) == 10);
	}

	@Test
	public void testDESCQuickSortNine() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 5);
		tcList.add(1, 10);
		tcList.add(2, 10);
		tcList.add(3, 4);
		tcList.add(4, 1);
		tcList.add(5, 8);
		intSorter.sort(tcList, SortDirection.DESC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 10 && tcList.get(1) == 10 && tcList.get(2) == 8 && tcList.get(3) == 5
				&& tcList.get(4) == 4 && tcList.get(5) == 1);
	}

	@Test
	public void testDESCQuickSortOne() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 5);
		tcList.add(1, 5);
		tcList.add(2, 10);
		tcList.add(3, 3);
		tcList.add(4, 7);
		intSorter.sort(tcList, SortDirection.DESC, SortingAlgo.QUICK_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0) == 10 && tcList.get(1) == 7 && tcList.get(2) == 5 && tcList.get(3) == 5
				&& tcList.get(4) == 3);
	}

}
