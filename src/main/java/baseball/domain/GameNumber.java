package baseball.domain;

import java.util.Objects;

public class GameNumber {
    private final int position;
    private final int number;

    public GameNumber(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public NumberStatus compare(GameNumber given) {
        if(given.equals(this)){
            return NumberStatus.STRIKE;
        }
        if(given.isSameNumber(this.number)){
            return NumberStatus.BALL;
        }
        return NumberStatus.NOTHING;

    }

    private boolean isSameNumber(int number) {
        return this.number == number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameNumber that = (GameNumber) o;
        return position == that.position && number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }
}
