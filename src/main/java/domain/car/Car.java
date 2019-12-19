package domain.car;

import util.RandomGenerator;

public class Car {
	private static final int INITIAL_POSITION = 0;
	private static final int SIGNAL = 4;

	private final Name name;
	private final Position position = new Position(INITIAL_POSITION);

	public Car(String name) {
		this.name = new Name(name);
	}

	private boolean hasSignal() {
		return RandomGenerator.next() >= SIGNAL;
	}

	public void moveIfHasSignal() {
		if (hasSignal()) {
			position.plusOne();
		}
	}
}
