package com.Srihari.MavenFrameWork.uiActions;

public class Grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[10][10];

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("*", +a[i][j]);
			}
			System.out.println();
		}
	}

}
