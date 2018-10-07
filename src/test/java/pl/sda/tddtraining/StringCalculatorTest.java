package pl.sda.tddtraining;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    void shouldReturnZeroOnEmptyString() {
        String data = "";

        int result = StringCalculator.adding(data);

        Assertions.assertEquals(0,result);
    }

    @Test
    void shouldReturnNumberOnNumber() {
        String data = "1";

        int result = StringCalculator.adding(data);

        Assertions.assertEquals(1,result);
    }
    @Test
    void shouldReturnZeroOnBlank() {
        String data = " ";

        int result = StringCalculator.adding(data);

        Assertions.assertEquals(0,result);
    }

    @Test
    void shouldReturnNumberOnNumberWithWhiteSpace() {
        String data = "1 ";

        int result = StringCalculator.adding(data);

        Assertions.assertEquals(1,result);
    }


    @Test
    void shouldReturnZeroOnNull() {
        String data =  null;

        int result = StringCalculator.adding(data);

        Assertions.assertEquals(0,result);
    }

}