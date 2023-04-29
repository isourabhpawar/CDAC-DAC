package com.code;

public class MyMath {
	// providing only Maths Operations

	public static int add(int i, int j) {
		return (i + j);

	}

	public static int max(int i, int j) {
		if (i > j)
			return i;
		else
			return j;
	}

	public static int power(int x, int y) {
		int result = 1;
		for (int i = 1; i <= y; i++) {
			result = result * x;
		}
		return result;

	}

}
