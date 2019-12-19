package domain.winner;

import domain.car.Car;

public class Winner {
	private final Car winner;

	public Winner(Car winner) {
		this.winner = winner;
	}

	public String getName() {
		return winner.getName();
	}
}
