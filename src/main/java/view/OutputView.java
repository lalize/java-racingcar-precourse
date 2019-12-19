package view;

import java.util.List;
import java.util.stream.Collectors;

import domain.car.Car;
import domain.winner.Winner;
import util.StringUtil;

public class OutputView {
	private static final String LINE = "-";
	private static final String CAR_FORMAT = "%s : %s\n";
	private static final String WINNER_DELIMITER = ", ";
	private static final String WINNERS_FORMAT = "%s가 최종 우승했습니다.\n";

	public static void renderCar(Car car) {
		System.out.printf(CAR_FORMAT, car.getName(), StringUtil.repeat(LINE, car.getPosition()));
	}

	public static void renderWinners(List<Winner> winners) {
		String winnerNames = winners.stream()
				.map(Winner::getName)
				.collect(Collectors.joining(WINNER_DELIMITER));
		System.out.printf(WINNERS_FORMAT, winnerNames);
	}
}
