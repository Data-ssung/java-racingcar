package racingCar;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String carName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public int gameNumber() {
        System.out.println("횟수는 몇 회인가요?");
        return scanner.nextInt();
    }
}