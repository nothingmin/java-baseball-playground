import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private final Input input;
    private final ResultView resultView;

    private boolean isCorrect = false;
    public Game(Input input, ResultView resultView) {
        this.input = input;
        this.resultView = resultView;
    }

    public void startGame(){
        RandomNumbers randomNumbers = new RandomNumbers();
        while(!isCorrect) {
            ArrayList<Integer> inputNumbers = input.inputNumbers();
            ArrayList<Integer> result = randomNumbers.compare(inputNumbers);
            Integer strike = result.get(0);
            isCorrect = checkCorrect(strike);
            resultView.printResult(result);
        }
    }

    private boolean checkCorrect(Integer strike) {
        return strike == 3;
    }
}
