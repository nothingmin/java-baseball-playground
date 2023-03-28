package baseball.domain;

public class GameNumber {
    private final int position;
    private final int number;

    public GameNumber(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public NumberStatus compare(GameNumber given) {

        return NumberStatus.NOTHING;
    }
}
