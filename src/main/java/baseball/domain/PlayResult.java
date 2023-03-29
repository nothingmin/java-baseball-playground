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

    public void showResult() {
        String result = "";
        if(getBall() == 0 && getStrike() == 0){
            result = "낫싱";
        }

        if(getBall() != 0 && getStrike() != 0) {
            result = getBall() + "볼" + " " + getStrike() +"스트라이크";
        }

        if(getBall() != 0){
            result = getBall() + "볼 ";
        }

        if(getStrike() != 0){
            result =  getStrike() + "스트라이크";
        }


        System.out.println(result);
    }

    public boolean isCorrect() {
        return getStrike() == 3;
    }
}
