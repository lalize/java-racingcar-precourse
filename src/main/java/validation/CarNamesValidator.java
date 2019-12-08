package validation;

import java.util.List;

public class CarNamesValidator implements Validator<List<String>> {
	private static final int MIN_NAME_COUNT = 2;
	private static final String OVERLAP_MESSAGE = "같은 이름이 둘 이상 존재합니다.";
	private static final String COUNT_MESSAGE = "이름의 수가 " + MIN_NAME_COUNT + " 미만이다.";

	private final Validator<String> carNameValidator;

	public CarNamesValidator(Validator<String> carNameValidator) {
		this.carNameValidator = carNameValidator;
	}

	@Override
	public void validate(List<String> names) {
		checkOverlap(names);
		checkCount(names);
		names.forEach(carNameValidator::validate);
	}

	private void checkOverlap(List<String> names) {
		boolean isOverlap = names.stream().distinct().count() != names.size();
		if (isOverlap) {
			throw new IllegalArgumentException(OVERLAP_MESSAGE);
		}
	}

	private void checkCount(List<String> names) {
		if (names.size() < MIN_NAME_COUNT) {
			throw new IllegalArgumentException(COUNT_MESSAGE);
		}
	}
}
