package com.google;

public class Equilibrium {

	public static void main(String args[]) {
		int[] a = { -7, 1, 5, 2, -4, 3, 0 };
		int i = solution(a);
		System.out.println(i);
	}

	public static int solution(int[] A) {
		int sumOfArray = 0;
		int sumOfLeft = 0;

		for (int i = 0; i < A.length; i++) {
			sumOfArray += A[i];
		}
		for (int i = 0; i < A.length; i++) {
			sumOfArray -= A[i];
			if (sumOfLeft == sumOfArray) {
				return i;
			}
			sumOfLeft += A[i];
		}
		return -1;
	}
}