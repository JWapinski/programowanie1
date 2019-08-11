package day1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ZadaniaTest {

    @DisplayName("Test ABS")
    @Test
    void test1() {
        Assertions.assertEquals(Zadania.calcAbs(-100),100);
    }

}