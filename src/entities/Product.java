package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	
	private String name;
	private Date moment;
	private Double price;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Product() {
	}

	public Product(String name, Date moment, Double price) {
		this.name = name;
		this.moment = moment;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + ", $" + String.format("%.2f", price);
	}
	
	

}
