package sorting;

import static org.junit.Assert.assertTrue;

import java.util.Comparator;
import java.util.List;

import org.bagheledu.sorting.RefrenceSorter;
import org.bagheledu.sorting.SortDirection;
import org.bagheledu.sorting.SortingAlgo;
import org.junit.Test;

public abstract class NumberTestBase {

	public abstract SortingAlgo getAlgo();

	@Test
	public void testASCQuickSortOne() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcOneData(), SortDirection.ASC,
				this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 3 && sortedList.get(1) == 5 && sortedList.get(2) == 5 && sortedList.get(3) == 7
				&& sortedList.get(4) == 10);
	}

	@Test
	public void testDESCQuickSortOne() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcOneData(),
				SortDirection.DESC, this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});

		assertTrue(sortedList.get(0) == 10 && sortedList.get(1) == 7 && sortedList.get(2) == 5 && sortedList.get(3) == 5
				&& sortedList.get(4) == 3);
	}

	@Test
	public void testASCQuickSortTwo() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcTwoData(), SortDirection.ASC,
				this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 5 && sortedList.get(1) == 5 && sortedList.get(2) == 5 && sortedList.get(3) == 5
				&& sortedList.get(4) == 5);
	}

	@Test
	public void testDESCQuickSortTwo() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcTwoData(),
				SortDirection.DESC, this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 5 && sortedList.get(1) == 5 && sortedList.get(2) == 5 && sortedList.get(3) == 5
				&& sortedList.get(4) == 5);
	}

	@Test
	public void testASCQuickSortThree() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcDataThree(),
				SortDirection.ASC, this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(
				sortedList.get(0) == 1 && sortedList.get(1) == 3 && sortedList.get(2) == 5 && sortedList.get(3) == 7);
	}

	@Test
	public void testDESCQuickSortThree() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcDataThree(),
				SortDirection.DESC, this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(
				sortedList.get(0) == 7 && sortedList.get(1) == 5 && sortedList.get(2) == 3 && sortedList.get(3) == 1);
	}

	@Test
	public void testASCQuickSortFour() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcDataFour(),
				SortDirection.ASC, this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 10 && sortedList.get(1) == 20 && sortedList.get(2) == 30
				&& sortedList.get(3) == 40);
	}

	@Test
	public void testDESCQuickSortFour() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcDataFour(),
				SortDirection.DESC, this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 40 && sortedList.get(1) == 30 && sortedList.get(2) == 20
				&& sortedList.get(3) == 10);
	}

	@Test
	public void testASCQuickSortFive() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcDataFive(),
				SortDirection.ASC, this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 5 && sortedList.get(1) == 10 && sortedList.get(2) == 20
				&& sortedList.get(3) == 30 && sortedList.get(4) == 40);
	}

	@Test
	public void testDESCQuickSortFive() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcDataFive(),
				SortDirection.DESC, this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 40 && sortedList.get(1) == 30 && sortedList.get(2) == 20
				&& sortedList.get(3) == 10 && sortedList.get(4) == 5);
	}

	@Test
	public void testASCQuickSortSix() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcDataSix(), SortDirection.ASC,
				this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 10 && sortedList.get(1) == 10 && sortedList.get(2) == 10
				&& sortedList.get(3) == 20 && sortedList.get(4) == 20);
	}

	@Test
	public void testDESCQuickSortSix() {
		List<Integer> sortedList = new RefrenceSorter<Integer>().sort(IntegerTestData.gettcDataSix(),
				SortDirection.DESC, this.getAlgo(), new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
		assertTrue(sortedList.get(0) == 20 && sortedList.get(1) == 20 && sortedList.get(2) == 10
				&& sortedList.get(3) == 10 && sortedList.get(4) == 10);
	}

}
