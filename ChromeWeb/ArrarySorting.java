package com.Srihari.MavenFrameWork.uiActions;

import java.util.Arrays;

public class ArrarySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 1234, 545, 6784, 567, 3456 };
		String[] strArray = { "Srihari", "Naidu", "Siddhu", "Deexi", "Bangaram" };

		System.out.println("Original numberic array" + Arrays.toString(intArray));
		Arrays.sort(intArray);

		System.out.println("Sorted array" + Arrays.toString(intArray));

		System.out.println("Original String array" + Arrays.toString(strArray));
		Arrays.sort(strArray);

		System.out.println("Sorted String array" + Arrays.toString(strArray));

	}

}
