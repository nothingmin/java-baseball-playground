import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {

    private final Scanner scanner;
    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public ArrayList<Integer> inputNumbers(){
        String value = "";
        while(value.length() != 3){
            System.out.print("Input Number : ");
            value = scanner.nextLine();
        }
        return Arrays.stream(value.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean inputExit(){
        while(true){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                    "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. : ");
            String value = scanner.nextLine();
            if (value.length() != 1){
                continue;
            }
            if(value.equals("1")){
                return false;
            }
            if(value.equals("2")){
                return true;
            }
        }
    }
}
