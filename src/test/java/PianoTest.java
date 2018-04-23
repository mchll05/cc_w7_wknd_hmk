import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {

    Piano piano1;

    @Before
    public void before(){
        piano1 = new Piano("Rogers", "Ivory", 1000.00, "Grand");
    }

    @Test
    public void hasName(){
        assertEquals("Rogers",piano1.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Ivory", piano1.getType());
    }

    @Test
    public void hasPrice(){
        assertEquals(1000.00, piano1.getPrice());
    }

    @Test
    public void hasSize(){
        assertEquals("Grand",piano1.getSize());
    }

}

