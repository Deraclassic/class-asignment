package Week_1_curriculum.Test_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void print() {
        HelloWorld hello = new HelloWorld();
        String actual = "Hello World";
        String expected = "Hello World";
        assertEquals(actual,expected);
    }
}