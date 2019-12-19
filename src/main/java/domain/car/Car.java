package domain.car;

public class Car {
	private final Name name;
	private int position = 0;

	public Car(String name) {
		this.name = new Name(name);
	}
}
