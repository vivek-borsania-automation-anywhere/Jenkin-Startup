import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp() Method called - MainTest");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown() Method called - MainTest");
    }

    @Test
    public void main1() {

        System.out.println("main() Method called - MainTest");
        assertEquals(1,1);
    }
    @Test
    public void main2() {

        System.out.println("main() Method called - MainTest");
        assertEquals("Vivek","Vivek");
    }
}