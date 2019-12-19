package domain.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
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
}
