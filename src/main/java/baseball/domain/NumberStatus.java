package baseball.domain;

public enum NumberStatus {
    BALL, STRIKE, NOTHING;

    public boolean isNothing() {
        return this == NOTHING;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }
    public boolean isBall() {
        return this == BALL;
    }
}
