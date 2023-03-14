package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void size(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest()
    @ValueSource(ints = {1,2,3})
    void contains(int candidate){
        assertThat(numbers.contains(candidate)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"true:false", "2:true", "5:false"}, delimiter = ':')
    void contains_include_falsy(String input, Boolean expected){
        try {
            int parsed = Integer.parseInt(input);
            assertThat(numbers.contains(parsed)).isEqualTo(expected);
        }catch (Exception e){
            assertThat(e).isInstanceOf(NumberFormatException.class);
        }
    }
}
