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
        bar = new Bar(50.0);
        
        assertEquals(50.0, bar.getWidth(), 0.1);
        assertEquals(25, bar.getHeight());
    }
    
    

}
