import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void calculate(){
        String input = "1 + 2 * 3";
        StringCalculator calculator = new StringCalculator(input.split(" "));
        int result = calculator.calculate();
        assertThat(result).isEqualTo(9);
    }
}