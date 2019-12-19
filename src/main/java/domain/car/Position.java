package domain.car;

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
}
