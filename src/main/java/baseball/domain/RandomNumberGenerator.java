package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    private final ArrayList<Integer> numbers;

    public RandomNumberGenerator() {
        this.numbers = new ArrayList<Integer>();
    }

    public List<Integer> generate() {
        while(numbers.size() != 3){
            numbers.add(uniqueRandomNumber());
        }
        return numbers;
    }

    private int uniqueRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(9) + 1;
        while(numbers.contains(randomNumber)){
            randomNumber = random.nextInt(9) + 1;
        }
        return randomNumber;
    }
}
