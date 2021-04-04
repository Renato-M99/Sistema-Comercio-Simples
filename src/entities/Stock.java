package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	
	private double balance;
	private List <Product> products = new ArrayList<>();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	public Stock() {
	}

	public Stock(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	public void setBalance() {
		double inBalance = 0.0;
		for (Product p : products) {
			inBalance += p.getPrice();
		}
		this.balance = inBalance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void productsInStock() {
		for (Product p : products) {
			System.out.println(p + sdf.format(p.getMoment()));
		}
	}
	
	
	
	
	
	

}
