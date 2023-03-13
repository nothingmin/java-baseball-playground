package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String given = "1,2";
        String[] split = given.split(",");
        assertThat(split).contains("1");
        assertThat(split).contains("2");
    }
    @Test
    void split_only_one(){
        String given = "1";
        String[] split = given.split(",");
        assertThat(split).containsExactly("1");
    }
}
