import java.util.Arrays;

public class StringCalculator {

    private final String[] strings;

    public StringCalculator(String[] strings) {
        this.strings = strings;
    }

    public void calculate(){
        int result = 0;
        for (int i=0; i<strings.length;i += 2){
            if(i == 0){
                result = Integer.parseInt(strings[i]);
                i++;
            }
            String operation = strings[i];
            int number = Integer.parseInt(strings[i+1]);

            switch (operation){
                case "+":  result += number;
                    break;
                case "-":  result -= number;
                    break;
                case "*":  result *= number;
                    break;
                case "/":  result /= number;
                    break;
                default:
                    break;
            }
        }
        System.out.println("result = " + result);
    }

}
