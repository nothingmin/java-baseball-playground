package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {
    @Test
    void nothing(){
        GameNumber number = new GameNumber(1,1);
        GameNumber given = new GameNumber(2,1);
        assertThat(number.compare(given)).isEqualTo(NumberStatus.NOTHING);
    }
    @Test
    void ball(){
        GameNumber number = new GameNumber(1,1);
        GameNumber given = new GameNumber(1,2);
        assertThat(number.compare(given)).isEqualTo(NumberStatus.BALL);
    }
}
