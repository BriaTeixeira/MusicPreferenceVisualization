/**
 * 
 */
package musicpreference;
import CS2114.Shape;

/**
 * @author Bria
 *
 */
public class Bar extends Shape
{
    public static final int MAX_LENGTH = 100;
    public static final int HEIGHT = 25;
    /**
     * Create a new Bar shape.
     * @param width The width of the bar -> to be determined by 
     * heard/like ratios.
     */
    public Bar(int width)
    {
        super(0, 0, width, HEIGHT);
    }

}
