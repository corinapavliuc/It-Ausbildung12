import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void garlandLength() {
        Tree tree =new Tree();
        System.out.println(tree.garlandLength(new int[]{1,4,2,3,5}));
    }
    @ParameterizedTest
    @MethodSource("wireLength")
    void WireLengthCount(int expectedLength, int [] bublesNumber) {
        Tree tree = new Tree();
        assertEquals(expectedLength, tree.garlandLength((bublesNumber)));
    }
        static Stream<Arguments> wireLength() {
            return Stream.of(
                    Arguments.arguments(4,new int[]{1,2,3,4,5}),
                    Arguments.arguments(11,new int[]{7,3,2,6,8}),
                    Arguments.arguments(12,new int[]{3,4,8,2,1}),
                    Arguments.arguments(21,new int[]{3,7,10,2,8}),
                    Arguments.arguments(5,new int[]{0,1,0,2,1})

            );
        }
    }
