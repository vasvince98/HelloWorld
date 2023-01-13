import org.junit.Test;
import org.vasvince.TestClass;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testAdding() {
        int result = TestClass.testFunction(5, 2);
        assertEquals(7, result);
    }

}
