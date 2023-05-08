package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

		Random rnd = new Random();
		private int code;
		private String name;
		private String description;
		private double price;
		private double iva;
		
		public Prodotto(String name, String description, double price, double iva) {
			code = rnd.nextInt(99999999);
			setName(name);
			setDescription(description);
			setPrice(price);
			setIva(iva);
		}
//		code
		public int getCode() {
			this.code = rnd.nextInt();
			return this.code;
		}
//		name
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
//		description
		public String getDescription(){
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
//		price
		public double gerPrice() {
			return this.price;
		}
		public void setPrice(double price){
			this.price = price;
		}
//		iva
		public double getIva() {
			return this.iva;
		}
		public void setIva(double iva){
			this.iva = iva;
		}
//		price + iva
		public double getPriceWithIva() {
			return price + (price * iva / 100);
		}
//		full name
		public String getFullName() {
			String fullName = getCode() + " " + getName();
			return fullName;
		}

		@Override
		public String toString() {
			return "Full name: " + getFullName()
					+ "\n Iva: " + getIva()
					+ "\n Price with iva: " + getPriceWithIva() + "Euro";
		}
		
}
