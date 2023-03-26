import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Input input = new Input();
        ResultView resultView = new ResultView();
        boolean exit = false;
        while(!exit){
            Game game = new Game(input, resultView);
            game.startGame();
            System.out.println(
                    "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                            "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            exit = input.inputExit();
        }
    }
}
