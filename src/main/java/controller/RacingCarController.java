package controller;

import domain.car.Cars;
import domain.round.Round;
import view.InputView;
import view.OutputView;

public class RacingCarController {
	private final Cars cars;
	private final Round round;

	public RacingCarController() {
		cars = new Cars(InputView.getCarNames());
		round = new Round(InputView.getRound());
	}

	private void racing() {
		while (round.hasNext()) {
			cars.move();
			cars.forEach(OutputView::renderCar);
			round.next();
		}
	}

	private void result() {
		OutputView.renderWinners(cars.getWinners());
	}

	public void run() {
		racing();
		result();
	}
}
