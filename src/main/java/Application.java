import controller.RacingCarController;
import domain.car.Cars;

public class Application {
	public static void main(String[] args) {
		RacingCarController racingCarController = new RacingCarController();
		racingCarController.run();
	}
}
