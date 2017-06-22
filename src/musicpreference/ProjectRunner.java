/**
 * 
 */
package musicpreference;

import java.io.FileNotFoundException;

/**
 * Displays the window containing survey results.
 * @author Bria
 *
 */
public class ProjectRunner
{
    /**
     * Provide the main method which displays the window created in the
     * DisplayWindow class.
     */
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        try {
        ShapeBuilder builder = new ShapeBuilder();
        DisplayWindow display = new DisplayWindow(builder);
        }
        catch (FileNotFoundException e) {
            System.exit(0);
        }
    }

}
