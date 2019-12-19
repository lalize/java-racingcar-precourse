package domain.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import domain.winner.Winner;

public class Cars implements Iterable<Car> {
	private static final String NAMES_OVERLAP_ERROR = "중복된 이름이 존재한다.";

	private final List<Car> cars = new ArrayList<>();

	public Cars(String[] names) {
		validate(names);
		initialize(names);
	}

	private void initialize(String[] names) {
		for (String name : names) {
			cars.add(new Car(name));
		}
	}

	public static void validate(String[] names) {
		Set<String> distinctNames = new HashSet<>(Arrays.asList(names));
		if (distinctNames.size() != names.length) {
			throw new IllegalArgumentException(NAMES_OVERLAP_ERROR);
		}
	}

	public Car getMaxPositionCar() {
		return cars.stream().max(Car::comparePositionTo).orElse(null);
	}

	public List<Winner> getWinners() {
		Car maxPositionCar = getMaxPositionCar();
		return cars.stream()
				.filter(car -> car.equalsPosition(maxPositionCar))
				.map(Winner::new)
				.collect(Collectors.toList());
	}

	public void move() {
		cars.forEach(Car::moveIfHasSignal);
	}

	@Override
	public Iterator<Car> iterator() {
		return cars.iterator();
	}
}
