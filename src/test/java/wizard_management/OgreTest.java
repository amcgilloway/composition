package wizard_management;

import static org.junit.Assert.*;
import org.junit.*;

public class OgreTest {

    Ogre ogre;

    @Before
    public void before(){
        ogre = new Ogre("Freddie");
    }

    @Test
    public void hasName(){
        assertEquals("Freddie", ogre.getName());
    }
}