package domain.round;

import java.util.Iterator;

public class Round implements Iterator<Integer> {
	private static final int MIN = 1;
	private static final String MIN_ERROR = "횟수가 " + MIN + "미만 이다.";

	private int round;

	public Round(int round) {
		validate(round);
		this.round = round;
	}

	public static void validate(int round) {
		if (round < MIN) {
			throw new IllegalArgumentException(MIN_ERROR);
		}
	}

	@Override
	public boolean hasNext() {
		return round >= MIN;
	}

	@Override
	public Integer next() {
		return round--;
	}
}
