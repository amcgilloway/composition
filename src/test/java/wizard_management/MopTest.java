package wizard_management;

import static org.junit.Assert.*;
import org.junit.*;

public class MopTest {

    Mop mop;

    @Before
    public void before(){
        mop = new Mop("Hygenic");
    }

    @Test
    public void hasBrand(){
        assertEquals("Hygenic", mop.getBrand());
    }

}