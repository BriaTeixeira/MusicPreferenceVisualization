/**
 * 
 */
package musicpreference;

import java.awt.Color;

import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * Create a Window for displaying the survey results.
 * @author Bria
 *
 */
public class DisplayWindow 
{
    private Window window;
    private TextShape legend;
    private ShapeBuilder builder;
    private int index;
    
    private Button quitButton;
    private Button nextButton;
    private Button prevButton;
    private Button sortArtist;
    private Button sortTitle;
    private Button sortYear;
    private Button sortGenre;
    
    private Shape left1;
    private Shape left2;
    private Shape left3;
    private Shape mid1;
    private Shape mid2;
    private Shape mid3;
    private Shape right1;
    private Shape right2;
    private Shape right3;
    
    public static final int C_WIDTH = 5;
    public static final int C_HEIGHT = 40;
    public static final int T_HEIGHT = 20;
    public static final int T_WIDTH = 20;
    /**
     * Create a new DisplayWindow determined by a list of songs.
     * @param builder A ShapeBuilder object.
     */
    public DisplayWindow()
    {
        window = new Window("Project 5");
        
        int xInc = window.getWidth() / 6;
        int yInc = window.getHeight() / 4;
        left1 = new Shape(xInc, yInc, C_WIDTH, C_HEIGHT, Color.BLACK);
        left2 = new Shape(xInc, 2*yInc, C_WIDTH, C_HEIGHT, Color.BLACK);
        left3 = new Shape(xInc, 3*yInc, C_WIDTH, C_HEIGHT, Color.BLACK);
        mid1 = new Shape(3*xInc, yInc, C_WIDTH, C_HEIGHT, Color.BLACK);
        mid2 = new Shape(3*xInc, 2*yInc, C_WIDTH, C_HEIGHT, Color.BLACK);
        mid3 = new Shape(3*xInc, 3*yInc, C_WIDTH, C_HEIGHT, Color.BLACK);
        right1 = new Shape(5*xInc, yInc, C_WIDTH, C_HEIGHT, Color.BLACK);
        right2 = new Shape(5*xInc, 2*yInc, C_WIDTH, C_HEIGHT, Color.BLACK);
        right3 = new Shape(5*xInc, 3*yInc, C_WIDTH, C_HEIGHT, Color.BLACK);
        
        window.addShape(left1);
        window.addShape(left2);
        window.addShape(left3);
        window.addShape(mid1);
        window.addShape(mid2);
        window.addShape(mid3);
        window.addShape(right1);
        window.addShape(right2);
        window.addShape(right3);
        
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
        
        legend = new TextShape(6*xInc, window.getHeight() / 2, 
                "Hobby Legend", Color.BLACK);
        legend.setBackgroundColor(Color.WHITE);
        window.addShape(legend);
        
        index = 0;
        //builder.addAll(index);
        prevButton.disable();
        
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
     * Gets the next nine songs in the SongList and displays
     * glyphs representing the corresponding data. If less than
     * nine songs remain in the list only the information for 
     * the remaining songs are displayed.
     */
    public void clickedNext(Button button)
    {
        builder.addAll(index + 9);
        index += 9;
        prevButton.enable();
        
        if (index >= builder.getList().getLength() - 9) {
            nextButton.disable();
        }
    }
    
    /**
     * Gets the previous nine songs in the SongList and 
     * displays glyphs representing the corresponding data.
     */
    public void clickedPrev(Button button)
    {
        builder.addAll(index - 9);
        index -= 9;
        nextButton.enable();
        
        if (index < 9) {
            prevButton.disable();
        }
    }
    
    /**
     * Sorts the SongList by Artist and then displays the
     * data or the first nine songs in the sorted list.
     */
    public void clickedSortArtist(Button button)
    {
        builder.getList().sortArtist();
        builder.setList(builder.getList());
        builder.addAll(0);
    }
    
    /**
     * Sorts the SongList by Title and then displays the
     * data or the first nine songs in the sorted list.
     */
    public void clickedSortTitle(Button button)
    {
        builder.getList().sortTitle();
        builder.setList(builder.getList());
        builder.addAll(0);
    }
    
    /**
     * Sorts the SongList by Year and then displays the
     * data or the first nine songs in the sorted list.
     */
    public void clickedSortYear(Button button)
    {
        builder.getList().sortYear();
        builder.setList(builder.getList());
        builder.addAll(0);
    }
    
    /**
     * Sorts the SongList by Genre and then displays the
     * data or the first nine songs in the sorted list.
     */
    public void clickedSortGenre(Button button)
    {
        builder.getList().sortGenre();
        builder.setList(builder.getList());
        builder.addAll(0);
    }
    
    public Window getWindow()
    {
    	return window;
    }
    
}


