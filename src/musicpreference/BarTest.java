/**
 * 
 */
package musicpreference;
import student.TestCase;

/**
 * Test the construction of a Bar object.
 * @author Bria
 *
 */
public class BarTest extends TestCase
{
    private Bar bar;
    
    /**
     * Test that a new bar object has the correct dimensions.
     */
    public void testBar()
    {
        bar = new Bar(50);
        
        assertEquals(50, bar.getWidth());
        assertEquals(25, bar.getHeight());
    }

}
