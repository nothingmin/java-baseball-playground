package baseball.domain;


import java.util.ArrayList;
import java.util.List;

public class GameNumbers {

    private final List<GameNumber> gameNumbers;

    public GameNumbers(List<Integer> answers) {
        ArrayList<GameNumber> gameNumbers = new ArrayList<>();
        for (int i = 0; i < answers.size(); i++) {
            gameNumbers.add(new GameNumber(answers.get(i), i));
        }
        this.gameNumbers = gameNumbers;
    }

    public NumberStatus compare(GameNumber gameNumber) {
        return gameNumbers.stream()
                .map(answer -> answer.compare(gameNumber))
                .filter(result -> !result.isNothing())
                .findFirst()
                .orElse(NumberStatus.NOTHING);
    }

    public PlayResult play(GameNumbers input) {
        PlayResult playResult = new PlayResult();
        for (GameNumber gameNumber : gameNumbers) {
            NumberStatus status = input.compare(gameNumber);
            playResult.addStatus(status);
        }
        return playResult;
    }
}
