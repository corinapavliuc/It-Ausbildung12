import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    @ParameterizedTest// peredaeot in parametri va dadea singur cifre fara sa mai
    //// scrim de aceea punem a radoom si b raddom
    @MethodSource("validDate")
    void sumOfTwoNumbersTwoPositive(int expectedResult, int a, int b) {
        Sum sum = new Sum();
        assertEquals(expectedResult, sum.sumOfTwoNumbers(a, b));
    }

    static Stream<Arguments> validDate() {
        return Stream.of(
                Arguments.arguments(5, 2, 3), ////expectedResult va avea 5 ,int a va avea 2,
                //// int b va avea 3
                Arguments.arguments(-8, -1, -7),
                Arguments.arguments(0, 0, 0),
                Arguments.arguments(2, -5, 7),
                Arguments.arguments(3, 10, -7),
                Arguments.arguments(7, 0, 7),
                Arguments.arguments(-6, -6, 0)
        );
    }
}
//
//    @Test
//    void sumOfTwoNumbersTwoZeroes() {
//        Sum sum= new Sum();
//        assertEquals(0,sum.sumOfTwoNumbers(0,0));
//    }
//    @Test
//    void sumOfTwoNumbersFirstNegativSecondPositiv() {
//        Sum sum= new Sum();
//        assertEquals(2,sum.sumOfTwoNumbers(-5,7));
//    }
//    @Test
//    void sumOfTwoNumbersFirstPositivSecondNegativ() {
//        Sum sum= new Sum();
//        /// in expected scrim cat face 3 si -1 in total si e 2
//        assertEquals(2,sum.sumOfTwoNumbers(3,-1));
//    }
//}