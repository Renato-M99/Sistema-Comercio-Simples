package entities;

import java.util.*;

public class ShoppingCart {

	private List<Product> itens = new ArrayList<Product>();

	public ShoppingCart() {
	}

	public ShoppingCart(List<Product> itens) {
		super();
		this.itens = itens;
	}

	public List<Product> getItens() {
		return itens;
	}

	public void addProduct(Product item) {
		itens.add(item);
	}

	public void removeProduct(Product item) {
		itens.remove(item);
	}

	public void editProduct(Product item) {

	}

	public Double total() {
		double sum = 0.0;
		for (Product added : itens) {
			sum += added.getPrice();
		}
		return sum;
	}

	public void resultList() {
		int index = 1;
		for (Product p : itens) {
			index += 1;
			System.out.println("Item #" + index + ": " + p);
		}
		System.out.printf("Total: $%.2f%n", total());
	}
}
