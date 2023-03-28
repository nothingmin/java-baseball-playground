package baseball.domain;

public enum NumberStatus {
    BALL, STRIKE, NOTHING;

    public static boolean isNothing(NumberStatus result) {
        return result == NOTHING;
    }
}
