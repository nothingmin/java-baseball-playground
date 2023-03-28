package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberGeneratorTest {
    @Test
    void generate_random_numbers(){
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> numbers = randomNumberGenerator.generate();
        HashSet<Integer> numberSet = new HashSet<>(numbers);
        assertThat(numberSet.size()).isEqualTo(3);
        for (Integer number : numbers) {
            assertThat(number).isLessThan(10);
            assertThat(number).isGreaterThan(0);
        }
    }
}
