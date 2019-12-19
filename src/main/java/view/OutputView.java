package view;

import domain.car.Car;
import util.StringUtil;

public class OutputView {
	private static final String LINE = "-";
	private static final String CAR_FORMAT = "%s : %s\n";

	public static void renderCar(Car car) {
		System.out.printf(CAR_FORMAT, car.getName(), StringUtil.repeat(LINE, car.getPosition()));
	}
}
