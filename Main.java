package com.gmail.kutepov89.sergey;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Garfild", 3);
		Cat cat2 = new Cat("Luska", 5);
		Cat cat3 = new Cat("Barsic", 8);
		Cat cat4 = new Cat("Timka", 5);
		Cat cat5 = new Cat("Tom", 2);
		
		CatNameComparator comp = new CatNameComparator();
		
//		Проверка реализации
		System.out.println(comp.compare(cat1, cat2) == -comp.compare(cat2, cat1));
		System.out.println(comp.compare(cat1, cat2) > 0 && comp.compare(cat2, cat5) > 0 && comp.compare(cat1, cat5) > 0);
		System.out.println(comp.compare(cat2, cat4) == 0 && (comp.compare(cat2, cat1) < 0 && comp.compare(cat4, cat1) < 0));
		System.out.println();

		Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };

		for (Cat cat : cats) {
			System.out.println(cat);
		}

		System.out.println();

		Arrays.sort(cats, comp);

		for (Cat cat : cats) {
			System.out.println(cat);
		}
	}

}
