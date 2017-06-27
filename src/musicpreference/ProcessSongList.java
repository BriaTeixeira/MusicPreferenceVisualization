import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class ProcessSongList
{
    public static void method() throws FileNotFoundException
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
