/**
 * 
 */
package prj5;
import CS2114.Shape;

/**
 * Create a bar object that represents data
 * @author a0053
 * @author fanyy94
 * @author bria96
 * @version Jun 28, 2017
 *
 */
public class Bar extends Shape
{
    public static final int MAX_LENGTH = 100;
    public static final int HEIGHT = 10;
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