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
        assertThat(gameNumbers.compare(new GameNumber(1, 1))).isEqualTo(NumberStatus.BALL);
    }
    @Test
    void compare_strike(){
        GameNumbers gameNumbers = new GameNumbers(Arrays.asList(1,2,3));
        assertThat(gameNumbers.compare(new GameNumber(1, 0))).isEqualTo(NumberStatus.STRIKE);
    }
    @Test
    void play_nothing(){
        GameNumbers gameNumbers = new GameNumbers(Arrays.asList(1,2,3));
        GameNumbers input = new GameNumbers(Arrays.asList(4, 5, 6));
        PlayResult playResult = gameNumbers.play(input);
        assertThat(playResult.getStrike()).isEqualTo(0);
        assertThat(playResult.getBall()).isEqualTo(0);
    }
    @Test
    void play_3strike(){
        GameNumbers gameNumbers = new GameNumbers(Arrays.asList(1,2,3));
        GameNumbers input = new GameNumbers(Arrays.asList(1,2,3));
        PlayResult playResult = gameNumbers.play(input);
        assertThat(playResult.getStrike()).isEqualTo(3);
    }
    @Test
    void play_1ball(){
        GameNumbers gameNumbers = new GameNumbers(Arrays.asList(1,2,3));
        GameNumbers input = new GameNumbers(Arrays.asList(4,5,1));
        PlayResult playResult = gameNumbers.play(input);
        assertThat(playResult.getBall()).isEqualTo(1);
    }
    @Test
    void play_1ball1strike(){
        GameNumbers gameNumbers = new GameNumbers(Arrays.asList(1,2,3));
        GameNumbers input = new GameNumbers(Arrays.asList(4,2,1));
        PlayResult playResult = gameNumbers.play(input);
        assertThat(playResult.getStrike()).isEqualTo(1);
        assertThat(playResult.getBall()).isEqualTo(1);
    }
}
