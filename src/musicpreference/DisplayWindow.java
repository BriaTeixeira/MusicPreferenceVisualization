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
    
    private TextShape song1;
    private TextShape song2;
    private TextShape song3;
    private TextShape song5;
    private TextShape song6;
    private TextShape song7;
    private TextShape song8;
    private TextShape song9;
    
    /**
     * Create a new DisplayWindow determined by a list of songs.
     * @param builder A ShapeBuilder object.
     */
    public DisplayWindow(ShapeBuilder builder)
    {
        window = new Window("Music Preferences");
        
        int xInc = window.getWidth() / 4;
        int yInc = window.getHeight() / 4;
        left1 = new Shape(xInc, yInc, 3, 50, Color.BLACK);
        left2 = new Shape(xInc, 2*yInc, 3, 50, Color.BLACK);
        left3 = new Shape(xInc, 3*yInc, 3, 50, Color.BLACK);
        mid1 = new Shape(2*xInc, yInc, 3, 50, Color.BLACK);
        mid2 = new Shape(2*xInc, 2*yInc, 3, 50, Color.BLACK);
        mid3 = new Shape(2*xInc, 3*yInc, 3, 50, Color.BLACK);
        right1 = new Shape(3*xInc, yInc, 3, 50, Color.BLACK);
        right2 = new Shape(3*xInc, 2*yInc, 3, 50, Color.BLACK);
        right3 = new Shape(3*xInc, 3*yInc, 3, 50, Color.BLACK);
        
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
        Button prevButton = new Button("<- Previous");
        Button sortArtist = new Button("Sort By Artist Name");
        Button sortTitle = new Button("Sort By Song Title");
        Button sortYear = new Button("Sort By Release Year");
        Button sortGenre = new Button("Sort By Genre");
        
        window.addButton(quitButton, WindowSide.SOUTH);
        window.addButton(prevButton, WindowSide.NORTH);
        window.addButton(sortArtist, WindowSide.NORTH);
        window.addButton(sortTitle, WindowSide.NORTH);
        window.addButton(sortYear, WindowSide.NORTH);
        window.addButton(sortGenre, WindowSide.NORTH);
        window.addButton(nextButton, WindowSide.NORTH);
        
        legend = new TextShape(4*xInc, window.getHeight() / 2, "Hobby Legend", Color.BLACK);
        legend.setBackgroundColor(Color.WHITE);
        window.addShape(legend);
        
    }
    

}

