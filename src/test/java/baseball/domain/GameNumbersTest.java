package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
public class GameNumbersTest {
    @Test
    void compare_nothing(){
        GameNumbers gameNumbers = new GameNumbers(Arrays.asList(1,2,3));
        assertThat(gameNumbers.compare(new GameNumber(4, 1))).isEqualTo(NumberStatus.NOTHING);
    }
    @Test
    void compare_ball(){
        GameNumbers gameNumbers = new GameNumbers(Arrays.asList(1,2,3));
        assertThat(gameNumbers.compare(new GameNumber(1, 2))).isEqualTo(NumberStatus.BALL);
    }
}
