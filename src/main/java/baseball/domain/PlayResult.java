package baseball.domain;

public class PlayResult {
    private int strike;
    private int ball;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void addStatus(NumberStatus status) {
        if(status.isStrike()){
            strike += 1;
        }
        if(status.isBall()){
            ball += 1;
        }
    }
}
