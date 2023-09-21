package IUT-Blagnac;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

     /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test the return with empty parameter
     */
    public void testHelloEmptyParameter()
    {
        assertEquals("Hello World!", App.hello());
    }

    /**
     * Test the return with a parameter
     */
    public void testHelloParameter()
    {
        assertEquals("Hello JMB!", App.hello("Hello JMB!"));
    }
}
