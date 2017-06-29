/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * Test methods implemented in SongList
 * 
 * @author a0053
 * @author fanyy94
 * @author bria96
 * @version Jun 28, 2017
 */
public class SongListTest extends TestCase
{
    private SongList test;
    private SongList empty;

    /**
     * Set up test methods before they execute
     */
    public void setUp()
    {
        test = new SongList();
        Song song1 = new Song("ATitle", "AArtist", "1980", "AGenre", 0);
        Song song2 = new Song("CTitle", "CArtist", "1990", "CGenre", 0);
        Song song3 = new Song("BTitle", "BArtist", "1970", "BGenre", 0);
        Song song4 = new Song("ETitle", "EArtist", "2000", "EGenre", 0);
        Song song5 = new Song("DTitle", "DArtist", "1900", "DGenre", 0);
        test.add(song1);
        test.add(song2);
        test.add(song3);
        test.add(song4);
        test.add(song5);
    }

    /**
     * test sort by title
     */
    public void testSortTitle()
    {
        empty = new SongList();
        empty.sortTitle();
        assertTrue(empty.isEmpty());
        
        test.sortTitle();
        assertEquals("ATitle", test.getEntry(0).getTitle());
        assertEquals("BTitle", test.getEntry(1).getTitle());
        assertEquals("CTitle", test.getEntry(2).getTitle());
        assertEquals("DTitle", test.getEntry(3).getTitle());
        assertEquals("ETitle", test.getEntry(4).getTitle());
    }

    /**
     * test sort by artists
     */
    public void testSortArtist()
    {
        empty = new SongList();
        empty.sortArtist();
        assertTrue(empty.isEmpty());
        
        test.sortArtist();
        assertEquals("AArtist", test.getEntry(0).getArtist());
        assertEquals("BArtist", test.getEntry(1).getArtist());
        assertEquals("CArtist", test.getEntry(2).getArtist());
        assertEquals("DArtist", test.getEntry(3).getArtist());
        assertEquals("EArtist", test.getEntry(4).getArtist());
    }

    /**
     * test sort by Genre
     */
    public void testSortGenre()
    {
        empty = new SongList();
        empty.sortGenre();
        assertTrue(empty.isEmpty());
        
        test.sortGenre();
        assertEquals("AGenre", test.getEntry(0).getGenre());
        assertEquals("BGenre", test.getEntry(1).getGenre());
        assertEquals("CGenre", test.getEntry(2).getGenre());
        assertEquals("DGenre", test.getEntry(3).getGenre());
        assertEquals("EGenre", test.getEntry(4).getGenre());
    }

    /**
     * test sort by year
     */
    public void testSortYear()
    {
        empty = new SongList();
        empty.sortYear();
        assertTrue(empty.isEmpty());
        
        test.sortYear();
        assertEquals("1900", test.getEntry(0).getYear());
        assertEquals("1970", test.getEntry(1).getYear());
        assertEquals("1980", test.getEntry(2).getYear());
        assertEquals("1990", test.getEntry(3).getYear());
        assertEquals("2000", test.getEntry(4).getYear());
    }

    /**
     * test toArray method
     */
    public void testToArray()
    {
        Object[] array = test.toArray();
        assertEquals(test.getEntry(0), array[0]);
        assertEquals(test.getEntry(1), array[1]);
        assertEquals(test.getEntry(2), array[2]);
        assertEquals(test.getEntry(3), array[3]);
        assertEquals(test.getEntry(4), array[4]);
    }

}
