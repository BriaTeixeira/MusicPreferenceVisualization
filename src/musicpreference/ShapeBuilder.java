/**
 * 
 */
package musicpreference;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import CS2114.Shape;
import CS2114.SquareShape;
import CS2114.TextShape;
import CS2114.Window;

/**
 * @author Bria
 *
 */
public class ShapeBuilder
{
    private SongList songList;
    private DisplayWindow window;
    private int[][] count;
    
    /**
     * Create a new ShapeBuilder object
     */
    public ShapeBuilder(DisplayWindow window)
    {
    	songList = new SongList();
        this.window = window;
        try {
            songs();
            survey();
        }
        catch(FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    
    /**
     * Get the ratio of those who have heard the song to 
     * the number of students counted for the survey.
     * @param hobby Which hobby the data should contribute to
     * @param song The song we are getting the ratio for
     */
    private double getHeardRatio(Hobby hobby, Song song)
    {
        int row;
        if (hobby == Hobby.READ) {
            row = 0;
        }
        else if (hobby == Hobby.ART){
            row = 4;
        }
        else if (hobby == Hobby.SPORTS){
            row = 8;
        }
        else {
            row = 12;
        }
        return (double)count[row][song.getCol()] / 
            (count[row][song.getCol()] + count[row + 1][song.getCol()]);
    }
    
    /**
     * Get the ratio of those who like the song to 
     * the number of students counted for the survey.
     * @param hobby Which hobby the data should contribute to
     * @param song The song we are getting the ratio for
     */
    private double getLikeRatio(Hobby hobby, Song song)
    {
        int row;
        /*switch(hobby) {
            case READ: row = 0;
            case ART: row = 4;
            case SPORTS: row = 8;
            case MUSIC: row = 12;
        }*/
        if (hobby == Hobby.READ) {
            row = 0;
        }
        else if (hobby == Hobby.ART){
            row = 4;
        }
        else if (hobby == Hobby.SPORTS){
            row = 8;
        }
        else {
            row = 12;
        }
        return count[row+2][song.getCol()] / 
            (count[row+2][song.getCol()] + count[row + 3][song.getCol()]);
        
    }
    
    private void addSong(Song song, int x, int y)
    {
        TextShape title = new TextShape(0, 0, song.getTitle());
        window.getWindow().addShape(title);
        title.moveTo(x + DisplayWindow.C_WIDTH/2 - DisplayWindow.T_WIDTH/2, y + DisplayWindow.T_HEIGHT);
        
        for (Hobby hobby : Hobby.values())
        {
            int i = 0;
            double length = getHeardRatio(hobby, song)*Bar.MAX_LENGTH;
            Bar bar = new Bar((int)length);
            bar.moveTo(x - (int)length, y + i*Bar.HEIGHT);
            window.getWindow().addShape(bar); 
            i++;
        }
        for (Hobby hobby : Hobby.values())
        {
            int i = 0;
            double length = getLikeRatio(hobby, song)*Bar.MAX_LENGTH;
            Bar bar = new Bar((int)length);
            bar.moveTo(x + DisplayWindow.C_WIDTH, y + i*Bar.HEIGHT);
            window.getWindow().addShape(bar);
            i++;
        }
        
    }
    
    public void addAll(int index)
    {
        Song[] list = (Song[]) songList.toArray();
        int x;
        int y;
        for (int i = index; i < index + 9; i++)
        {
            if (i<list.length) {
                if (i%9 == 0) {
                    x = window.getWindow().getWidth() / 6;
                    y = window.getWindow().getHeight() / 4;
                }
                else if (i%9 == 1) {
                    x = 3*window.getWindow().getWidth()/6;
                    y = window.getWindow().getHeight()/4;
                }
                else if (i%9 == 2) {
                    x = 5*window.getWindow().getWidth()/6;
                    y = window.getWindow().getHeight()/4;
                }
                else if (i%9 == 3) {
                    x = window.getWindow().getWidth()/6;
                    y = 2*window.getWindow().getHeight()/4;
                }
                else if (i%9 == 4) {
                    x = 3*window.getWindow().getWidth()/6;
                    y = 2*window.getWindow().getHeight()/4;
                }
                else if (i%9 == 5) {
                    x = 5*window.getWindow().getWidth()/6;
                    y = 2*window.getWindow().getHeight()/4;
                }
                else if (i%9 == 6) {
                    x = window.getWindow().getWidth()/6;
                    y = 3*window.getWindow().getHeight()/4;
                }
                else if (i%9 == 7) {
                    x = 3*window.getWindow().getWidth()/6;
                    y = 3*window.getWindow().getHeight()/4;
                }
                else {
                    x = 5*window.getWindow().getWidth()/6;
                    y = 3*window.getWindow().getHeight()/4;
                }
                addSong(list[i], x, y);
            }
        }
        
    }
    
    /**
     * Get the SongList object stored in this class
     */
    public SongList getList()
    {
        return songList;
    }
    
    /**
     * Provides the ability to set the order of the list
     */
    public void setList(SongList list)
    {
        songList = list;
    }
    
    private void songs() throws FileNotFoundException
    {
        File file = new File("SongList2017S.csv");
        Scanner scanner = new Scanner(file);
        Scanner line = null;
        boolean proceed;
        int column = 0;
        
        scanner.nextLine();
    
        while (scanner.hasNextLine())
        {
            proceed = true;
            line = new Scanner(scanner.nextLine());
            line.useDelimiter(",");
            ArrayList<String> temp = new ArrayList<String>();
    
            while (line.hasNext())
            {    
                temp.add(line.next());
            }
            
            for (String string : temp)
            {
                if (string.trim().isEmpty())
                {
                    proceed = false;
                }
            }
    
            if (temp.size() == 4 && proceed)
            {
            	Song song = new Song(temp.get(0), temp.get(1), temp.get(2), temp.get(3), column);
                songList.add(song);
                column++;
            }
        }
        count = new int[16][column+1];
        scanner.close();
        line.close();
    }
    
    private void survey() throws FileNotFoundException
    {
        File file = new File("MusicSurveyData2017S.csv");
        Scanner scanner = new Scanner(file);
        Scanner line = null;
        ArrayList<String> temp;
        int column;
        int inner;
        int row = 0;
        boolean proceed;
        String hobby;
        
        scanner.nextLine();
        scanner.nextLine();

        while (scanner.hasNextLine())
        {
            proceed = true;
            line = new Scanner(scanner.nextLine());
            line.useDelimiter(",");
            temp = new ArrayList<String>();

            for (int i = 0; i < 5; i++)
            {
                temp.add(line.next());
            }

            for (String string : temp)
            {
                if (string.trim().isEmpty())
                {
                    proceed = false;
                }
            }

            if (proceed)
            {
                hobby = temp.get(4);
                if (hobby.equalsIgnoreCase("reading")) {
                    row = 0;
                }
                else if (hobby.equalsIgnoreCase("art")) {
                    row = 4;
                }
                else if (hobby.equalsIgnoreCase("sports")) {
                    row = 8;
                }
                else if (hobby.equalsIgnoreCase("music")) {
                    row = 12;
                }
                
                column = 0;
                inner = 0;
                
                while (line.hasNext())
                {
                    String string = line.next();
                    if (string.equalsIgnoreCase("yes"))
                    {
                        count[row][column]++; // indices of the song class
                                                   // static array
                    }
                    if (string.equalsIgnoreCase("no"))
                    {
                        count[row + 1][column]++;
                    }
                    inner++;

                    string = line.next();
                    if (string.equalsIgnoreCase("yes"))
                    {
                        count[row + 2][column]++; // indices of the song
                                                       // class static array
                    }
                    if (string.equalsIgnoreCase("no"))
                    {
                        count[row + 3][column]++;
                    }
                    inner++;
                    if (inner % 2 == 0)
                    {
                        column++;
                    }
                }
            }
        }
        scanner.close();
        line.close();
     }
}