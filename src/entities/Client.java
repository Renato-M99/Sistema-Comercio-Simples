package entities;

import java.util.Date;

public class Client extends Account {

	private ShoppingCart shopping;

	public Client() {
		super();
	}

	public Client(String name, String login, String password, Date birthday, ShoppingCart shopping) {
		super(name, login, password, birthday);
		this.setShopping(shopping);
	}

	@Override
	public void editAcc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAcc() {
		// TODO Auto-generated method stub

	}

	public ShoppingCart getShopping() {
		return shopping;
	}

	public void setShopping(ShoppingCart shopping) {
		this.shopping = shopping;
	}

}
