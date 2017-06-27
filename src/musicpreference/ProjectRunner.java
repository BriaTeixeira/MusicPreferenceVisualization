package musicpreference;

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
        DisplayWindow display = new DisplayWindow();
        ShapeBuilder builder = new ShapeBuilder(display);
    }

}
