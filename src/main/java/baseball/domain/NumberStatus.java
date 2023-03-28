package baseball.domain;

public enum NumberStatus {
    BALL, STRIKE, NOTHING;

    public boolean isNothing() {
        return this == NOTHING;
    }
}
