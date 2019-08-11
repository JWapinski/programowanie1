package day1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @DisplayName("Test ABS")
    @Test
    void test1() {
        Assertions.assertEquals(MathUtils.calcAbs(-100),100);
        Assertions.assertEquals(MathUtils.calcAbs(2),2);
    }
    @DisplayName("calcFactorial")
    @Test
    void test2() {
        Assertions.assertThrows(WrongNumberException.class,() -> MathUtils.calcFactorial( -30));
        Assertions.assertEquals(MathUtils.calcFactorial(0),1);
        Assertions.assertEquals(MathUtils.calcFactorial(10),3628800);
        Assertions.assertEquals(MathUtils.calcFactorial(10),3628800);

    }
    @DisplayName("Test isPrimary")
    @Test
    void test3() {
        Assertions.assertThrows(WrongNumberException.class,() -> MathUtils.calcFactorial( -2));
        Assertions.assertTrue(MathUtils.isPrimary(11));
        Assertions.assertFalse(MathUtils.isPrimary(12));
    }

}