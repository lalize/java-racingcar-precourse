package domain.car;

public class Name {
	private static final int MAX_NAME_SIZE = 5;
	private static final String BLANK = " ";
	private static final String NAME_EMPTY_ERROR = "이름이 비어있다.";
	private static final String NAME_BLANK_ERROR = "이름에 공백이 존재한다.";
	private static final String NAME_SIZE_ERROR = "이름이 " + MAX_NAME_SIZE + "자를 초과한다.";
	
	private final String name;

	public Name(String name) {
		validate(name);
		this.name = name;
	}

	public static void validate(String name) {
		checkEmpty(name);
		checkBlank(name);
		checkSize(name);
	}

	private static void checkEmpty(String name) {
		if (name.isEmpty()) {
			throw new IllegalArgumentException(NAME_EMPTY_ERROR);
		}
	}

	private static void checkBlank(String name) {
		if (name.contains(BLANK)) {
			throw new IllegalArgumentException(NAME_BLANK_ERROR);
		}
	}

	private static void checkSize(String name) {
		if (name.length() > MAX_NAME_SIZE) {
			throw new IllegalArgumentException(NAME_SIZE_ERROR);
		}
	}
}
