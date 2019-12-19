package domain.car;

import java.util.Objects;

public class Position implements Comparable<Position> {
	private int position;

	public Position(int position) {
		this.position = position;
	}

	public void plusOne() {
		position++;
	}

	@Override
	public int compareTo(Position that) {
		return that.position - position;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Position that = (Position)o;
		return position == that.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position);
	}

	public int get() {
		return position;
	}
}
