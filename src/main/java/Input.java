import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {

    private final Scanner scanner;
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public ArrayList<Integer> inputNumbers(){
        String value = "";
        while(value.length() != 3){
            System.out.print("숫자를 입력해 주세요 : ");
            value = scanner.nextLine();
        }
        return Arrays.stream(value.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean inputExit(){
        while(true){
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
