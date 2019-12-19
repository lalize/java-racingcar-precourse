package view;

import java.util.Scanner;

public class InputView {
	private static final Scanner SCANNER = new Scanner(System.in);
	private static final String GET_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String CAR_NAMES_DELIMITER = ",";

	public static String[] getCarNames() {
		System.out.println(GET_CAR_NAMES_MESSAGE);
		return SCANNER.nextLine().split(CAR_NAMES_DELIMITER);
	}
}
