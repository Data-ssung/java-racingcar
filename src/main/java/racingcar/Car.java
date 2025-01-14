package racingcar;

public class Car {
    private static final int NAME_LENGTH_LIMIT_VALUE = 5;
    private final String name;
    int position;

    public Car(String name) {
        this(name,0);
    }

    public Car(String name, int position) {
        validateName(name);
        this.name = name;
        this.position = position;
    }

    private void validateName(String name){
        if (name.length() > NAME_LENGTH_LIMIT_VALUE) {
            throw new IllegalArgumentException("이름 길이가 5를 초과합니다.");
        }
    }

    public void go(boolean isMovable) {
        if (isMovable) {
            position += 1;
        }
    }

    public int whichOneIsBiggerThan(int position) {
        return Math.max(this.position, position);
    }

    public boolean isInPosition(int position) {
        return this.position == position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
