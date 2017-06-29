package prj5;

/**
 * Displays the window containing survey results.
 * 
 * @author a0053
 * @author fanyy94
 * @author bria96
 * @version Jun 28, 2017
 * 
 */
public class Input
{
    /**
     * Provide the main method which displays the window created in the
     * DisplayWindow class.
     */
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        String file1 = "SongList2017S.csv";
        String file2 = "MusicSurveyData2017S.csv";

        if (args.length == 3)
        {
            file1 = args[1];
            file2 = args[2];
        }

        GUIDisplayWindow display = new GUIDisplayWindow(file1, file2);
    }

}
