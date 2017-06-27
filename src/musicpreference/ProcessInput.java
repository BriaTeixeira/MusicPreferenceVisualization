import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author adam chang 905959822
 * 
 */
public class ProcessInput
{
    public static void method() throws FileNotFoundException
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
}
