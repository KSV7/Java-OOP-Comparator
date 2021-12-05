package com.gmail.kutepov89.sergey;

import java.util.Comparator;

public class CatNameComparator implements Comparator<Cat> {
	@Override
	public int compare(Cat o1, Cat o2) {
		if (o1.getName().length() > o2.getName().length()) {
			return 1;
		}
		if (o1.getName().length() < o2.getName().length()) {
			return -1;
		}
		return 0;
	}
}