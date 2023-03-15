import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values = value.split(" ");
        StringCalculator stringCalculator = new StringCalculator(values);
        int result = stringCalculator.calculate();
        System.out.println("result = " + result);
    }
}
