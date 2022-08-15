package org.bagheledu.sorting;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PrintTreeUtil<T> {

	private Map<Integer, List<StringBuilder>> btreeMap = new HashMap<>();

	public void printFullBinaryTree(List<T> inputList) {

		assertTrue("Input List can not be null!", inputList != null);
		printRootNode(inputList);

		for (Entry<Integer, List<StringBuilder>> entry : btreeMap.entrySet()) {
			for (StringBuilder builder : entry.getValue()) {
				System.out.println(builder);
			}
		}
	}

	private void printRootNode(List<T> inputList) {
		StringBuilder treeview = new StringBuilder();
		treeview.append(inputList.get(0).toString() + "(0)");
		List<StringBuilder> rows = new ArrayList<>();
		rows.add(treeview);
		btreeMap.put(0, rows);

		printChildren(0, inputList, 0, 1);

		System.out.println("");

	}

	private void printTreeShape(int nodeIndex, List<T> inputList, int basePosition, int level) {

		if (hasChidlren(nodeIndex, inputList)) {

			T leftNode = inputList.get(2 * nodeIndex + 1);
			T rightNode = null;
			if (hasRightNode(nodeIndex, inputList)) {
				rightNode = inputList.get(2 * nodeIndex + 2);
			}

			int treeRowBarLength = rightNode != null ? rightNode.toString().length() + leftNode.toString().length()
					: leftNode.toString().length();

			StringBuilder rowZerobuilder = new StringBuilder();
			if (btreeMap.get(level) != null && btreeMap.get(level).size() == 3) {
				rowZerobuilder.append(getCharPadding(3 + basePosition + treeRowBarLength / 2));
			} else {
				rowZerobuilder.append(getCharPadding(1 + basePosition + treeRowBarLength / 2));
			}

			rowZerobuilder.append("|");

			StringBuilder rowOnebuilder = new StringBuilder();

			int barPaddingLength = basePosition;

			if (btreeMap.get(level) != null && btreeMap.get(level).size() == 3) {
				barPaddingLength = basePosition - treeRowBarLength / 2;
			}

			for (int i = 0; i < barPaddingLength; i++) {
				rowOnebuilder.append(" ");
			}

			for (int i = 0; i < treeRowBarLength + 2; i++) {
				rowOnebuilder.append("=");
			}

			StringBuilder rowTwobuilder = new StringBuilder();
			int doublePipePadding = basePosition;

			if (btreeMap.get(level) != null && btreeMap.get(level).size() == 3) {
				doublePipePadding = basePosition - treeRowBarLength / 2;
			}
			for (int i = 0; i < doublePipePadding; i++) {
				rowTwobuilder.append(" ");
			}

			rowTwobuilder.append("|");

			if (rightNode != null) {
				rowTwobuilder.append(getCharPadding(treeRowBarLength));
				rowTwobuilder.append("|");
			}

			if (btreeMap.get(level) == null) {
				btreeMap.put(level, new ArrayList<>());
			}

			if (btreeMap.get(level).size() == 4) {
				btreeMap.get(level).get(0)
						.append(getCharPadding(getBarLength(nodeIndex - 1, inputList) * 2) + rowZerobuilder);
				btreeMap.get(level).get(1)
						.append(getCharPadding(getBarLength(nodeIndex - 1, inputList) + 3) + rowOnebuilder);
				btreeMap.get(level).get(2)
						.append(getCharPadding(getBarLength(nodeIndex - 1, inputList) + 3) + rowTwobuilder);
			} else {
				btreeMap.get(level).add(rowZerobuilder);
				btreeMap.get(level).add(rowOnebuilder);
				btreeMap.get(level).add(rowTwobuilder);
			}

		}

	}

	private void printChildren(int nodeIndex, List<T> inputList, int basePosition, int level) {

		printTreeShape(nodeIndex, inputList, basePosition, level);

		if (!btreeMap.containsKey(level)) {
			btreeMap.put(level, new ArrayList<>());
		}
		int leftIndex = nodeIndex * 2 + 1;
		int rightIndex = nodeIndex * 2 + 2;

		addLeftSpacePaddingFromPreviousNodeUpToRoot(getBarLength(nodeIndex, inputList) / 2 + 2, level);
		StringBuilder builder = new StringBuilder();
		builder.append(getLeftNode(nodeIndex, inputList, basePosition));
		if (hasRightNode(nodeIndex, inputList)) {
			builder.append(getRightNode(nodeIndex, inputList, getBarLength(nodeIndex, inputList)));
		}

		if (btreeMap.get(level).size() == 4) {
			btreeMap.get(level).get(3).append(builder);
		} else {
			btreeMap.get(level).add(builder);
		}

		if (hasChidlren(leftIndex, inputList)) {
			addBarFromPreviousNode(getBarLength(nodeIndex, inputList), level);
			printChildren(leftIndex, inputList, 0, level + 1);
			if (hasChidlren(rightIndex, inputList)) {
				printChildren(rightIndex, inputList, 0, level + 1);

			}
		}

	}

	private void addBarFromPreviousNode(int padding, int level) {
		String lefPadding = getBars(padding);
		if (btreeMap.get(level) != null) {
			btreeMap.get(level).get(1).insert(1, lefPadding);
		}
	}

	private void addLeftSpacePaddingFromPreviousNodeUpToRoot(int padding, int level) {
		String lefPadding = getCharPadding(padding);
		for (int j = level; j >= 0; j--) {
			if (btreeMap.get(j) != null) {
				for (int i = 0; i < btreeMap.get(j).size(); i++) {
					btreeMap.get(j).get(i).insert(0, lefPadding);
				}
			}
		}
	}

	private int getBarLength(int nodeIndex, List<T> inputList) {
		T leftNode = inputList.get(2 * nodeIndex + 1);
		T rightNode = null;
		if (hasRightNode(nodeIndex, inputList)) {
			rightNode = inputList.get(2 * nodeIndex + 1);
		}
		int treeRowBarLength = rightNode != null ? rightNode.toString().length() + leftNode.toString().length()
				: leftNode.toString().length();
		return treeRowBarLength;
	}

	private void printLeftNode(int nodeIndex, List<T> inputList, int leftChildPosition, StringBuilder childView) {
		int leftIndex = nodeIndex * 2 + 1;
		String leftNode = inputList.get(leftIndex).toString() + "(" + leftIndex + ")";
		childView.append(getCharPadding(leftChildPosition - leftNode.length() - 1) + "" + leftNode);
	}

	private String getLeftNode(int nodeIndex, List<T> inputList, int leftSpacePadding) {
		int leftIndex = nodeIndex * 2 + 1;
		String leftNode = inputList.get(leftIndex).toString() + "(" + leftIndex + ")";
		return getCharPadding(leftSpacePadding) + "" + leftNode;
	}

	private void printRightNode(int nodeIndex, List<T> inputList, int childPosition, StringBuilder childView) {
		int rightIndex = 2 * nodeIndex + 2;
		childView.append(getCharPadding(childPosition) + "" + inputList.get(rightIndex).toString() + "(" + rightIndex
				+ ")" + "\n");
	}

	private String getRightNode(int nodeIndex, List<T> inputList, int paddingSpaces) {
		int rightIndex = 2 * nodeIndex + 2;
		return getCharPadding(paddingSpaces) + inputList.get(rightIndex).toString() + "(" + rightIndex + ")";
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

	private boolean hasLeftNode(int nodeIndex, List<T> inputList) {
		return (2 * nodeIndex + 1 < inputList.size()) ? true : false;
	}

	private void printKids(int nodeIndex, List<T> inputList, int childPosition, int level) {
		if (!btreeMap.containsKey(level)) {
			btreeMap.put(level, new ArrayList<>());
		}
		StringBuilder row1 = null;
		StringBuilder row2 = null;
		StringBuilder row3 = null;
		StringBuilder row4 = null;
		if (btreeMap.get(level).size() == 0) {
			row1 = new StringBuilder();
			row2 = new StringBuilder();
			row3 = new StringBuilder();
			row4 = new StringBuilder();
		} else {
			row1 = btreeMap.get(level).get(0);
			row2 = btreeMap.get(level).get(1);
			row3 = btreeMap.get(level).get(2);
			row4 = btreeMap.get(level).get(3);

		}
		row1.append(getCharPadding(childPosition + 1) + "/\\");
		row2.append(getCharPadding(childPosition) + "/  \\");
		String thirdLeftPipes = getCharPadding(childPosition - 1) + "/    \\";
		row3.append(thirdLeftPipes);
		row4.append(getLeftNode(nodeIndex, inputList, thirdLeftPipes.length() - 4));

		if (hasRightNode(nodeIndex, inputList)) {
			row4.append(getRightNode(nodeIndex, inputList, 4));
		}
		if (btreeMap.get(level).size() == 0) {
			btreeMap.get(level).add(row1);
			btreeMap.get(level).add(row2);
			btreeMap.get(level).add(row3);
			btreeMap.get(level).add(row4);
		} else {
			btreeMap.get(level).set(0, row1);
			btreeMap.get(level).set(1, row2);
			btreeMap.get(level).set(2, row3);
			btreeMap.get(level).set(3, row4);
		}

		int nextLevel = level + 1;

		int leftIndex = nodeIndex * 2 + 1;
		if (hasChidlren(leftIndex, inputList)) {
			printKids(leftIndex, inputList, childPosition - 4, nextLevel);
			int rightIndex = nodeIndex * 2 + 2;
			if (hasChidlren(rightIndex, inputList)) {
				printKids(rightIndex, inputList, 4, nextLevel);
			}
		}
	}

	private String getPadding(int paddingSpace) {
		StringBuilder pad = new StringBuilder();
		for (int i = 0; i < paddingSpace; i++) {
			pad.append("\t");
		}
		return pad.toString();
	}

	private String getCharPadding(int paddingSpace) {
		StringBuilder pad = new StringBuilder();
		for (int i = 0; i < paddingSpace; i++) {
			pad.append(" ");
		}
		return pad.toString();
	}

	private String getBars(int count) {
		StringBuilder pad = new StringBuilder();
		for (int i = 0; i < count; i++) {
			pad.append("=");
		}
		return pad.toString();
	}

	public void printBinaryTree(List<T> inputList) {
		int maxpaddingSpace = 0;
		StringBuilder treeview = new StringBuilder();
		maxpaddingSpace = inputList.size() * 2;
		String rootView = getCharPadding(maxpaddingSpace - 0) + "" + inputList.get(0).toString() + "(0)";
		treeview.append(rootView);

		List<StringBuilder> rows = new ArrayList<>();
		rows.add(treeview);
		btreeMap.put(0, rows);

		if (hasChidlren(0, inputList)) {
			printKids(0, inputList, rootView.length() - (inputList.get(0).toString() + "(0)").length(), 1);
		}

		for (Entry<Integer, List<StringBuilder>> entry : btreeMap.entrySet()) {
			for (StringBuilder builder : entry.getValue()) {
				System.out.println(builder);
			}
		}
	}

	private int getBasePosition(List<T> inputList, int nodeIndex) {
		int basePosition = 0;
		if (hasChidlren(0, inputList)) {
			T leftNode = inputList.get(2 * nodeIndex + 1);
			T rightNode = null;
			if (hasRightNode(0, inputList)) {
				rightNode = inputList.get(2 * nodeIndex + 2);
			}
			basePosition = rightNode != null && rightNode.toString().length() > leftNode.toString().length()
					? rightNode.toString().length()
					: leftNode.toString().length();

		}
		return basePosition;
	}

	public static void main(String[] args) {
		PrintTreeUtil<Integer> p = new PrintTreeUtil<>();
		// p.printBinaryTree(gettc2Data());
		p.printFullBinaryTree(gettcOneData());
	}

	public static List<Integer> gettcOneData() {
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 600000000);
		tcList.add(1, 545000009);
		tcList.add(2, 1000000000);
		tcList.add(3, 1000000000);
		tcList.add(4, 700000000);
		tcList.add(5, 900000000);
		tcList.add(6, 1000000000);
		tcList.add(7, 900000000);
		tcList.add(8, 1000000000);
		tcList.add(9, 1000000000);
		return tcList;
	}

	public static List<Integer> gettc2Data() {
		List<Integer> tcList = new ArrayList<Integer>();
		tcList.add(0, 2);
		tcList.add(1, 5);
		tcList.add(2, 4);
		tcList.add(3, 8);
		tcList.add(4, 7);
		tcList.add(5, 9);
		return tcList;
	}

}
