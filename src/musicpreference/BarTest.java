/**
 * 
 */
package prj5;
import student.TestCase;

/**
 * Test the construction of a Bar object.
 * @author a0053
 * @author fanyy94
 * @author bria96
 * @version Jun 28, 2017
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
        assertEquals(10, bar.getHeight());
    }
    
    

}
