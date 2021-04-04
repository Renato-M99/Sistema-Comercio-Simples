package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Account {

	private String name;
	private String login;
	private String password;
	private Date birthday;
	private Date whenSignedUp;
	
	private static SimpleDateFormat birth = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat when = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	public Account() {
	}

	public Account(String name, String login, String password, Date birthday) {
		this.name = name;
		this.login = login;
		this.password = password;
		this.birthday = birthday;
		this.whenSignedUp = new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getWhenSignedUp() {
		return whenSignedUp;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public abstract void editAcc();
	public abstract void removeAcc();
	
	@Override
	public String toString() {//show
		return " - " + name + " ("+ birth.format(birthday)+ "), login:" + login + ", cadastro em: " + when.format(whenSignedUp);
	}

}
