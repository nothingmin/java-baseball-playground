import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Dealer {
    private int length = 3;
    private ArrayList<Integer> numbers = new ArrayList<>(3);
    private int min = 1;
    private int max = 10;

    public Dealer() {
        this.numbers = this.generateRandomNumbers();
    }
    public ArrayList<Integer> generateRandomNumbers(){
        ArrayList<Integer> randomNumbers = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            Integer num = generateNonDuplicateNumber();
            randomNumbers.add(num);
        }
        return randomNumbers;
    }

    private Integer generateNonDuplicateNumber() {
        Integer num = this.getRandomInt();
        while (this.numbers.contains(num)) {
            num = this.getRandomInt();
            System.out.println(this.numbers.contains(num));
        }
        return num;
    }

    private Integer getRandomInt(){
        return (int) (Math.random()*(max-min)) + min;
    }
}