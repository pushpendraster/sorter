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

public class SorterBuubleNumberTest {

	@Test
	public void testASCBubbleNumberOne() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> testCase1List = new ArrayList<Integer>();
		testCase1List.add(0, 10);
		testCase1List.add(1, 5);
		testCase1List.add(2, 1);

		intSorter.sort(testCase1List, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(testCase1List.get(0) == 1 && testCase1List.get(1) == 5 && testCase1List.get(2) == 10);
	}
	
	
	@Test
	public void testASCBubbleNumberTwo() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> testCase1List = new ArrayList<Integer>();
		testCase1List.add(0, 1);
		testCase1List.add(1, 5);
		testCase1List.add(2, 1);

		intSorter.sort(testCase1List, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(testCase1List.get(0) == 1 && testCase1List.get(1) == 1 && testCase1List.get(2) == 5);
	}
	
	
	@Test
	public void testASCBubbleNumberThree() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> testCase1List = new ArrayList<Integer>();
		testCase1List.add(0, 1);
		testCase1List.add(1, 1);
		testCase1List.add(2, 1);

		intSorter.sort(testCase1List, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(testCase1List.get(0) == 1 && testCase1List.get(1) == 1 && testCase1List.get(2) == 1);
	}
	
	
	@Test
	public void testASCBubbleNumberFour() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> testCase1List = new ArrayList<Integer>();
		testCase1List.add(0, 1);
		testCase1List.add(1, 10);
		testCase1List.add(2, 5);

		intSorter.sort(testCase1List, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(testCase1List.get(0) == 1 && testCase1List.get(1) == 5 && testCase1List.get(2) == 10);
	}
	
	@Test
	public void testASCBubbleNumberFive() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> testCase1List = new ArrayList<Integer>();
		testCase1List.add(0, 1);
		testCase1List.add(1, 2);
		testCase1List.add(2, 2);
		testCase1List.add(3, 1);

		intSorter.sort(testCase1List, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(testCase1List.get(0) == 1 && testCase1List.get(1) == 1 && testCase1List.get(2) == 2 && testCase1List.get(3)==2);
	}

	
	@Test
	public void testASCBubbleNumberSix() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> testCase1List = new ArrayList<Integer>();
		testCase1List.add(0, 1);
		testCase1List.add(1, 1);
		testCase1List.add(2, 1);
		testCase1List.add(3, 2);

		intSorter.sort(testCase1List, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(testCase1List.get(0) == 1 && testCase1List.get(1) == 1 && testCase1List.get(2) == 1 && testCase1List.get(3)==2);
	}

	public void testASCBubbleNumberSeven() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> testCase1List = new ArrayList<Integer>();
		testCase1List.add(0, 1);
		testCase1List.add(1, 2);
		testCase1List.add(2, 3);
		testCase1List.add(3, 4);

		intSorter.sort(testCase1List, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(testCase1List.get(0) == 1 && testCase1List.get(1) == 2 && testCase1List.get(2) == 3 && testCase1List.get(3)==4);
	}

	@Test
	public void testDESCBubbleNumberOne() {
		Sorter<Integer> intSorter = new RefrenceSorter<Integer>();
		List<Integer> testCase1List = new ArrayList<Integer>();
		testCase1List.add(0, 5);
		testCase1List.add(1, 10);
		testCase1List.add(2, 1);

		intSorter.sort(testCase1List, SortDirection.DESC, SortingAlgo.BUUBLE_SORT, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(testCase1List.get(0) == 10 && testCase1List.get(1) == 5 && testCase1List.get(2) == 1);
	}
	


}
