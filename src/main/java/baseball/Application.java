package baseball;

import baseball.domain.GameNumbers;
import baseball.domain.PlayResult;
import baseball.domain.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean startNewGame = true;
        while(startNewGame){
            startNewGame();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            Scanner scanner = new Scanner(System.in);
            startNewGame = scanner.nextInt() == 1;
        }
    }

    private static void startNewGame() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> randomNumbers = randomNumberGenerator.generate();
        GameNumbers gameNumbers = new GameNumbers(randomNumbers);
        PlayResult playResult = new PlayResult();
        while(!playResult.isCorrect()){
            GameNumbers inputGameNumbers = getInputGameNumbers();
            playResult = gameNumbers.play(inputGameNumbers);
            playResult.showResult();
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    private static GameNumbers getInputGameNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        for (String input : scanner.nextLine().split("")) {
            inputNumbers.add(Integer.parseInt(input));
        }
        return new GameNumbers(inputNumbers);
    }
}
