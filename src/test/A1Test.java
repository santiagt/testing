import org.junit.jupiter.api.Test;

import static javax.print.attribute.standard.MediaSize.ISO.A1;
import static org.junit.jupiter.api.Assertions.*;

class A1Test {


    @Test
    void cut2Positions() {
        A1 test1 = new A1("Hello world");
        assertEquals("Hello world", test1.cut2Positions());
    }

    @Test
    void are2TheSame() {

        assertEquals(true, test1.are2TheSame());
    }
}