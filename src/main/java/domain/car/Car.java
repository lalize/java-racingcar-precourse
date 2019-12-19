package domain.car;

public class Car {
	private static final int INITIAL_POSITION = 0;

	private final Name name;
	private final Position position = new Position(INITIAL_POSITION);

	public Car(String name) {
		this.name = new Name(name);
	}
}
