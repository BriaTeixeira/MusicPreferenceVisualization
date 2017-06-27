/**
 * 
 */
package musicpreference;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Bria
 *
 */
public class ShapeBuilder
{
    
    /**
     * Create a new ShapeBuilder object
     */
    public ShapeBuilder() throws FileNotFoundException
    { 
        songs();
        survey();
    }
    
    public void addSong(Song song, int x, int y)
    {
        TextShape title = new textShape(song.getTitle());
        Window.add(title);
        title.move(x + DisplayWindow.width/2 - box/2, y + DisplayWindow.titleHeight);
        
        for (Hobby hobby : Hobby.values())
        {
            int i = 0;
            int length = Song.getHeardRatio(hobby)*Bar.MAX_LENGTH;
            Bar bar = new Bar(length);
            Window.add(bar, x - length, y + i*Bar.HEIGHT);
            i++;
        }
        for (Hobby hobby : Hobby.values())
        {
            int i = 0;
            int length = Song.getLikeRatio(hobby)*Bar.MAX_LENGTH;
            Bar bar = new Bar(length);
            Window.add(bar, x + DisplayWindow.width, y + i*Bar.HEIGHT);
            i++;
        }
        
    }
    
    public void addAll(int index)
    {
        Song[] list = songlist.toArray();
        int x;
        int y;
        for (int i = index; i < index + 9; i++)
        {
            if (i<list.length)
                switch (i)
                {
                case 0:
                    x = DisplayWindow.getWidth()/4;
                    y = DisplayWindow.getHeight()/4;
                case 1:
                    x = 2*DisplayWindow.getWidth()/4;
                    y = DisplayWindow.getHeight()/4;
                case 2:
                    x = 3*DisplayWindow.getWidth()/4;
                    y = DisplayWindow.getHeight()/4;
                case 3:
                    x = DisplayWindow.getWidth()/4;
                    y = 2*DisplayWindow.getHeight()/4;
                case 4:
                    x = 2*DisplayWindow.getWidth()/4;
                    y = 2*DisplayWindow.getHeight()/4;
                case 5:
                    x = 3*DisplayWindow.getWidth()/4;
                    y = 2*DisplayWindow.getHeight()/4;
                case 6:
                    x = DisplayWindow.getWidth()/4;
                    y = 3*DisplayWindow.getHeight()/4;
                case 7:
                    x = 2*DisplayWindow.getWidth()/4;
                    y = 3*DisplayWindow.getHeight()/4;
                case 8:
                    x = 3*DisplayWindow.getWidth()/4;
                    y = 3*DisplayWindow.getHeight()/4;
                }
            addSong(list[i], x, y);
        }
        
    }
    
    private void survey() throws FileNotFoundException
    {
        File file = new File("MusicSurveyDataSum1Updated");
        Scanner scanner = new Scanner(file);
        Scanner line = null;
        ArrayList<String> temp;
        int column;
        int inner;
        int row;
        boolean proceed;
        String hobby;

        while (scanner.hasNextLine())
        {
            proceed = true;
            line = new Scanner(scanner.nextLine());
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
                switch (hobby.toLowerCase())
                {
                case "reading":
                    row = 0;
                    break;
                case "art":
                    row = 4;
                    break;
                case "sports":
                    row = 8;
                    break;
                case "music":
                    row = 12;
                    break;
                }
                
                column = 0;
                inner = 0;
                
                while (line.hasNext())
                {
                    String string = line.next();
                    if (string.equals("yes"))
                    {
                        count[row][column]++; // indices of the song class
                                                   // static array
                    }
                    if (string.equals("no"))
                    {
                        count[row + 1][column]++;
                    }
                    inner++;

                    string = line.next();
                    if (string.equals("yes"))
                    {
                        count[row + 2][column]++; // indices of the song
                                                       // class static array
                    }
                    if (string.equals("no"))
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
    
    private void songs() throws FileNotFoundException
    {
        File file = new File("SongList.csv");
        Scanner scanner = new Scanner(file);
        Scanner line = null;
        boolean proceed;
        int column = 0;
    
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
                column++;
                SongList.add(new Song(temp.get(0), temp.get(1), temp.get(2), temp.get(3), column);
            }
        }
        scanner.close();
        line.close();
    }
}
