package org.lessons.java.shop;
public class Main {

	public static void main(String[] args) {
		Prodotto product1 = new Prodotto("Iphone", "Description one", 200, 22);
		Prodotto product2 = new Prodotto("Samsung", "Description two", 100, 22);

		System.out.println(product1);
		System.out.println(product2);
	}

}
