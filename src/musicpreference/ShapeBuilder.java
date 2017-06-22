/**
 * 
 */
package musicpreference;

import java.io.File;
import java.io.FileNotFoundException;
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
        File SongFile = new File("SongList.csv");
        File SurveyFile = new File("MusicSurveyDataSum1UPDATED.csv");
        Scanner songScanner = new Scanner(SongFile);
        Scanner surveyScanner = new Scanner(SurveyFile);
    }

}
