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

public class SorterBuubleStringTest {

	@Test
	public void testASCBubbleStringOne() {
		Sorter<String> intSorter = new RefrenceSorter<String>();
		List<String> tcList = new ArrayList<String>();
		tcList.add(0, "Z");
		tcList.add(1, "Y");
		tcList.add(2, "X");

		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0).equals("X") && tcList.get(1).equals("Y") && tcList.get(2).equals("Z"));
	}

	@Test
	public void testASCBubbleStringTwo() {
		Sorter<String> intSorter = new RefrenceSorter<String>();
		List<String> tcList = new ArrayList<String>();
		tcList.add(0, "A");
		tcList.add(1, "A");
		tcList.add(2, "A");

		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0).equals("A") && tcList.get(1).equals("A") && tcList.get(2).equals("A"));
	}

	@Test
	public void testASCBubbleStringThree() {
		Sorter<String> intSorter = new RefrenceSorter<String>();
		List<String> tcList = new ArrayList<String>();
		tcList.add(0, "A");
		tcList.add(1, "Z");
		tcList.add(2, "A");

		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0).equals("A") && tcList.get(1).equals("A") && tcList.get(2).equals("Z"));
	}

	@Test
	public void testASCBubbleStringFour() {
		Sorter<String> intSorter = new RefrenceSorter<String>();
		List<String> tcList = new ArrayList<String>();
		tcList.add(0, "Aa");
		tcList.add(1, "Z");
		tcList.add(2, "A");

		intSorter.sort(tcList, SortDirection.ASC, SortingAlgo.BUUBLE_SORT, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0).equals("A") && tcList.get(1).equals("Aa") && tcList.get(2).equals("Z"));
	}

	@Test
	public void testDESCBubbleStringFour() {
		Sorter<String> intSorter = new RefrenceSorter<String>();
		List<String> tcList = new ArrayList<String>();
		tcList.add(0, "A");
		tcList.add(1, "Z");
		tcList.add(2, "A");

		intSorter.sort(tcList, SortDirection.DESC, SortingAlgo.BUUBLE_SORT, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0).equals("Z") && tcList.get(1).equals("A") && tcList.get(2).equals("A"));
	}

	@Test
	public void testDESCBubbleStringFive() {
		Sorter<String> intSorter = new RefrenceSorter<String>();
		List<String> tcList = new ArrayList<String>();
		tcList.add(0, "A");
		tcList.add(1, "C");
		tcList.add(2, "B");

		intSorter.sort(tcList, SortDirection.DESC, SortingAlgo.BUUBLE_SORT, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		assertTrue(tcList.get(0).equals("C") && tcList.get(1).equals("B") && tcList.get(2).equals("A"));
	}

}
