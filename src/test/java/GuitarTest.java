import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarTest {

    Guitar guitar1;

    @Before
    public void before(){
        guitar1 = new Guitar("Fender", "Electric", 200.00, 3);
    }

    @Test
    public void hasName(){
        assertEquals("Fender",guitar1.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", guitar1.getType());
    }

    @Test
    public void hasPrice(){
        assertEquals(200.00, guitar1.getPrice());
    }

    @Test
    public void hasStringNum(){
        assertEquals(3, guitar1.getStringNum());
    }
}
