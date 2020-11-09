package racing_car;

import racing_car.strategy.RandomStrategy;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCarList {

    private List<Car> racingCarList;

    public RacingCarList(List<String> users) {
        racingCarList = Collections.unmodifiableList(users
                .stream()
                .map(user -> new Car(user, new RandomStrategy()))
                .collect(Collectors.toList()));
    }

    public LabRecord moveCars() {
        racingCarList
                .forEach(Car::move);
        return new LabRecord(
                racingCarList
                        .stream()
                        .map(Car::exportRecord)
                        .collect(Collectors.toList())
        );
    }
}
