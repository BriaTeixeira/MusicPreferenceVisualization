/**
 * 
 */
package prj5;

import java.awt.Color;

import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * Create a Window for displaying the survey results.
 * 
 * @author a0053
 * @author fanyy94
 * @author bria96
 * @version Jun 28, 2017
 * 
 */
public class GUIDisplayWindow
{
    private Window window;
    private GUIShapeBuilder builder;
    private int index;

    private Button quitButton;
    private Button nextButton;
    private Button prevButton;
    private Button sortArtist;
    private Button sortTitle;
    private Button sortYear;
    private Button sortGenre;

    /**
     * Create a new DisplayWindow determined by a list of songs.
     * 
     * @param builder
     *            A ShapeBuilder object.
     */
    public GUIDisplayWindow(String name1, String name2)
    {
        window = new Window("Project 5");
        builder = new GUIShapeBuilder(window, name1, name2);

        Button quitButton = new Button("Quit");
        Button nextButton = new Button("Next ->");
        Button prevButton = new Button("<- Prev");
        Button sortArtist = new Button("Sort by Artist Name");
        Button sortTitle = new Button("Sort by Song Title");
        Button sortYear = new Button("Sort by Release Year");
        Button sortGenre = new Button("Sort by Genre");

        window.addButton(quitButton, WindowSide.SOUTH);
        quitButton.onClick(this, "clickedQuit");
        window.addButton(prevButton, WindowSide.NORTH);
        prevButton.onClick(this, "clickedPrev");
        window.addButton(sortArtist, WindowSide.NORTH);
        sortArtist.onClick(this, "clickedSortArtist");
        window.addButton(sortTitle, WindowSide.NORTH);
        sortTitle.onClick(this, "clickedSortTitle");
        window.addButton(sortYear, WindowSide.NORTH);
        sortYear.onClick(this, "clickedSortYear");
        window.addButton(sortGenre, WindowSide.NORTH);
        sortGenre.onClick(this, "clickedSortGenre");
        window.addButton(nextButton, WindowSide.NORTH);
        nextButton.onClick(this, "clickedNext");

        index = 0;

    }

    // --------------------------------------------------------------

    /**
     * Exit the system when the quit button is clicked.
     */
    public void clickedQuit(Button button)
    {
        System.exit(0);
    }

    /**
     * Gets the next nine songs in the SongList and displays glyphs representing
     * the corresponding data. If less than nine songs remain in the list only
     * the information for the remaining songs are displayed.
     */
    public void clickedNext(Button button)
    {
        window.removeAllShapes();
        builder.addAll(index + 9);
        index += 9;
        // prevButton.enable();

        if (index >= builder.getList().getLength() - 9)
        {
            nextButton.disable();
        }
    }

    /**
     * Gets the previous nine songs in the SongList and displays glyphs
     * representing the corresponding data.
     */
    public void clickedPrev(Button button)
    {
        window.removeAllShapes();
        builder.addAll(index - 9);
        index -= 9;
        // nextButton.enable();

        if (index < 9)
        {
            prevButton.disable();
        }
    }

    /**
     * Sorts the SongList by Artist and then displays the data or the first nine
     * songs in the sorted list.
     */
    public void clickedSortArtist(Button button)
    {
        window.removeAllShapes();
        builder.getList().sortArtist();
        builder.setList(builder.getList());
        builder.addAll(0);
    }

    /**
     * Sorts the SongList by Title and then displays the data or the first nine
     * songs in the sorted list.
     */
    public void clickedSortTitle(Button button)
    {
        window.removeAllShapes();
        builder.getList().sortTitle();
        builder.setList(builder.getList());
        builder.addAll(0);
    }

    /**
     * Sorts the SongList by Year and then displays the data or the first nine
     * songs in the sorted list.
     */
    public void clickedSortYear(Button button)
    {
        window.removeAllShapes();
        builder.getList().sortYear();
        builder.setList(builder.getList());
        builder.addAll(0);
    }

    /**
     * Sorts the SongList by Genre and then displays the data or the first nine
     * songs in the sorted list.
     */
    public void clickedSortGenre(Button button)
    {
        window.removeAllShapes();
        builder.getList().sortGenre();
        builder.setList(builder.getList());
        builder.addAll(0);
    }

    public Window getWindow()
    {
        return window;
    }

}