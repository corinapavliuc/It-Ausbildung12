import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.sql.SQLOutput;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @ParameterizedTest
    @MethodSource("validData")
    void discountCalc(int expectedDiscount, int i, int after18) {
          Discount discount= new Discount();
           assertEquals(expectedDiscount,discount.discountCalc(i,after18));
        }

    static Stream<Arguments> validData() {
        return Stream.of(

                Arguments.arguments(2, 2, 0),// proverka esli pokupka do 18
                Arguments.arguments(2, 6, 0), // nachjotnaia do 18
                Arguments.arguments(2, 9, 1),// chjotnaja posle 18
                Arguments.arguments(4, 12, 1) // nachjotnaia posle  18

        );
    }
    @Test
    public void discountTest(){
        Discount discount = new Discount();
       int actualValue= discount.discountCalc(1,0);
       int expectedValue = 0;
       assertEquals(expectedValue,actualValue);
    }

@Test
    public void discountInvalid() {
        Discount discount = new Discount();
        System.out.println(discount.discountCalc(2,3));

    }

}