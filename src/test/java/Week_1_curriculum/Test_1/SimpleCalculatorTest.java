package Week_1_curriculum.Test_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add() {
        SimpleCalculator cal1 = new SimpleCalculator();
        int actual = cal1.add(2,2);
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    void multiply(){
        SimpleCalculator cal2 = new SimpleCalculator();
        int actual = cal2.add(9,10);
        int expected = 90;
        assertEquals(actual, expected);
    }
//    @Test
//     void print(){
//        SimpleCalculator print = new SimpleCalculator();
//        String actual = print.pr
//        String expected = "Hello World";
//        assertEquals(actual,expected);
//    }
}