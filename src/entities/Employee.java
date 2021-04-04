package entities;

import java.util.Date;

import entities.enums.Position;

public class Employee extends Account {

	private Position position;

	public Employee() {
		super();
	}

	public Employee(String name, String login, String password, Date birthday, Position position) {
		super(name, login, password, birthday);
		this.setPosition(position);
	}

	@Override
	public void editAcc() {

	}

	@Override
	public void removeAcc() {
		// TODO Auto-generated method stub

	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Sailor: " + super.toString();
	}
}
