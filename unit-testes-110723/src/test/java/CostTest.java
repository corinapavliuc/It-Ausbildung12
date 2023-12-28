import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CostTest {

    @Test
    void deliveryCostCalc() {
        Cost cost = new Cost();

        assertEquals(400, cost.deliveryCostCalc(45,false,false,"abicnii"));
    }
    @ParameterizedTest
    @MethodSource("validDate")
    void deliveryCostCalc(double distance, boolean big, boolean fragile,String Load) {
        Cost cost=new Cost();
        double actualCoast =cost.deliveryCostCalc(distance,big,fragile,Load)
    }
    static Stream<Arguments> validDate() {
        return Stream.of(
             new Object()

        );
    }
}
