package study;

import org.assertj.core.internal.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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

    @Test
    void sub_parenthesis(){
        String given = "(1,2)";
        String sub = given.substring(1, given.length() - 1);
        assertThat(sub).isEqualTo("1,2");
    }

    @Test
    void get_index(){
        String given = "abc";
        char c = given.charAt(0);
        assertThat(c).isEqualTo('a');
    }

    @Test
    @DisplayName(value = "charAt StringIndexOutOfBoundsException 발생")
    void get_out_of_bound(){
        String given = "abc";

        assertThatThrownBy(()->{
            char c = given.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}

