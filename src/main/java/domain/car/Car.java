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

	public String getName() {
		return name.get();
	}

	public int getPosition() {
		return position.get();
	}

	private boolean hasSignal() {
		return RandomGenerator.next() >= SIGNAL;
	}

	public void moveIfHasSignal() {
		if (hasSignal()) {
			position.plusOne();
		}
	}

	public int comparePositionTo(Car that) {
		return position.compareTo(that.position);
	}

	public boolean equalsPosition(Car that) {
		return position.equals(that.position);
	}
}
