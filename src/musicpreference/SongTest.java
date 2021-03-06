/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * Test the methods implemented in the Song class.
 * 
 * @author a0053
 * @author fanyy94
 * @author bria96
 * @version Jun 28, 2017
 *
 */
public class SongTest extends TestCase
{
    private Song song;
    private Song song2;
    private Song song3;

    /**
     * Set up each test method before it executes.
     */
    public void setUp()
    {
        song = new Song("No One", "Alicia Keys", "2007", "R&B", 0);
    }

    // --------------------------------------------------------------

    /**
     * Test constructor and getter methods.
     */
    public void testConstructor()
    {
        assertEquals("No One", song.getTitle());
        assertEquals("Alicia Keys", song.getArtist());
        assertEquals("R&B", song.getGenre());
        assertEquals("2007", song.getYear());
        assertEquals(0, song.getCol());
    }

    /**
     * Test compareArtist(Song)
     */
    public void testCompareArtist()
    {
        song2 = new Song("Run", "Snow Patrol", "2003", "pop", 1);
        assertTrue(song.compareArtist(song2) < 0);
        assertTrue(song2.compareArtist(song) > 0);

        song3 = new Song("Girl On Fire", "Alicia Keys", "2003", "R&B", 2);
        assertEquals(0, song.compareArtist(song3));

    }

    /**
     * Test compareTitle(Song)
     */
    public void testCompareTitle()
    {
        song2 = new Song("Run", "Snow Patrol", "2003", "pop", 1);
        assertTrue(song.compareTitle(song2) < 0);
        assertTrue(song2.compareTitle(song) > 0);

        song3 = new Song("No One", "Cold", "2000", "Alternative Metal", 2);
        assertEquals(0, song.compareTitle(song3));
    }

    /**
     * Test compareGenre(Song)
     */
    public void testCompareGenre()
    {
        song2 = new Song("Run", "Snow Patrol", "2003", "pop", 1);
        assertTrue(song.compareGenre(song2) < 0);
        assertTrue(song2.compareGenre(song) > 0);

        song3 = new Song("Single Ladies", "Beyonce", "2009", "R&B", 2);
        assertEquals(0, song.compareGenre(song3));
    }

    /**
     * Test compareYear(Song)
     */
    public void testCompareYear()
    {
        song2 = new Song("Run", "Snow Patrol", "2003", "pop", 1);
        assertTrue(song.compareYear(song2) > 0);
        assertTrue(song2.compareYear(song) < 0);

        song3 = new Song("Umbrella", "Rihanna", "2007", "R&B", 2);
        assertEquals(0, song.compareYear(song3));
    }

    /**
     * Test compareTo(Song)
     */
    public void testCompareTo()
    {
        song2 = new Song("Run", "Snow Patrol", "2003", "pop", 1);
        assertTrue(song.compareTo(song2) < 0);
        assertTrue(song2.compareTo(song) > 0);

        song3 = new Song("No One", "Cold", "2000", "Alternative Metal", 2);
        assertTrue(song.compareTo(song3) < 0);
        assertTrue(song3.compareTo(song) > 0);

        Song song4 = new Song("No One", "Alicia Keys", "2007", "R&B", 3);
        assertEquals(0, song.compareTo(song4));
    }

}