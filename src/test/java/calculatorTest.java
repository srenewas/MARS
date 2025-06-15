import com.seenu.Junit.calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorTest {

    calculator cal = new calculator();

    @Test
    void testAdd(){
        int result = cal.add(101,102);
        assertEquals(203, result);
    }
    @Test
    void testConcat(){
        String concat = cal.concat("seenu","igly");
        assertEquals("seenuigly",concat);
    }
}
