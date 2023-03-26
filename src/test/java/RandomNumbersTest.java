import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class RandomNumbersTest {

    @Test
    void generateRandomNumbers() {
        RandomNumbers randomNumbers = new RandomNumbers();
        ArrayList<Integer> integers = randomNumbers.generateRandomNumbers();
        System.out.println("integers = " + integers);
        assertThat(integers.size()).isEqualTo(3);
        HashSet<Integer> integerHashSet = new HashSet<>(integers);
        assertThat(integerHashSet.size()).isEqualTo(3);
    }

    @Test
    void compare() {
        RandomNumbers randomNumbers = new RandomNumbers();
        Integer firstNum = randomNumbers.numbers.get(0);
        Integer secondNum = randomNumbers.numbers.get(1);
        Integer thirdNum = randomNumbers.numbers.get(2);

        ArrayList<Integer> threeStrike = randomNumbers.compare(randomNumbers.numbers);
        assertThat(threeStrike.get(0)).isEqualTo(3);
        assertThat(threeStrike.get(1)).isEqualTo(0);

        ArrayList<Integer> twoStrike = randomNumbers.compare(new ArrayList<>(Arrays.asList(firstNum,secondNum, 0)));
        assertThat(twoStrike.get(0)).isEqualTo(2);
        assertThat(twoStrike.get(1)).isEqualTo(0);

        ArrayList<Integer> twoBall = randomNumbers.compare(new ArrayList<>(Arrays.asList(secondNum,firstNum, 0)));
        assertThat(twoBall.get(0)).isEqualTo(0);
        assertThat(twoBall.get(1)).isEqualTo(2);
    }
}