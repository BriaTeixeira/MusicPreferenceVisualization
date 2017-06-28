/**
 * 
 */
package musicpreference;

/**
 * Store the information specific to different songs as well as provide
 * the functionality to get specific information and compare songs to
 * each other.
 * @author Bria
 *
 */
public class Song implements Comparable<Song>
{
    private String artist;
    private String title;
    private String genre;
    private String year;
    private final int column;
    
    /**
     * Create a new song object.
     * Each song constructor should assign the song's title,
     * artist, genre, and release year values to the
     * appropriate field as well as assign a column number
     * to use when storing data.
     * @param title The song's title.
     * @param artist The song's artist.
     * @param genre The song's genre.
     * @param year The year the song was released.
     * @param col The column we want the data to be stored in.
     */
    public Song(String title, String artist, String genre,
            String year, int col)
    {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        
        column = col;
    }
    
    // ----------------------------------------------------------------
    
    /**
     * Return the column index at which the data relevant to this song
     * will be stored.
     * @return the column index.
     */
    public int getCol()
    {
        return column;
    }
    /**
     * Get the song's Artist.
     * @return a string of the artist's name.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Get the song's Title.
     * @return a string of the song's title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Get the song's Genre.
     * @return a string of the song's genre.
     */
    public String getGenre()
    {
        return genre;
    }
    
    /**
     * Get the song's release year.
     * @return an integer representing the song's release year.
     */
    public String getYear()
    {
        return year;
    }
    
    /**
     * Compare two song's based on artist names.
     * @param song The song object we are comparing to.
     * @return a number less than 0 if the relationship is "less than",
     * a number greater than 0 if the relationship is "greater than", 
     * and 0 if the artist names are the same.
     */
    public int compareArtist(Song song)
    {
        return this.getArtist().compareTo(song.getArtist());
    }
    
    /**
     * Compare two song's based on titles.
     * @param song The song object we are comparing to.
     * @return a number less than 0 if the relationship is "less than",
     * a number greater than 0 if the relationship is "greater than", 
     * and 0 if the titles are the same.
     */
    public int compareTitle(Song song)
    {
        return this.getTitle().compareTo(song.getTitle());
    }
    
    /**
     * Compare two song's based on genre.
     * @param song The song object we are comparing to.
     * @return a number less than 0 if the relationship is "less than",
     * a number greater than 0 if the relationship is "greater than", 
     * and 0 if the genres are the same.
     */
    public int compareGenre(Song song)
    {
        return this.getGenre().compareTo(song.getGenre());
    }
    
    /**
     * Compare two song's based on release year.
     * @param song The song object we are comparing to.
     * @return a number less than 0 if the relationship is "less than",
     * a number greater than 0 if the relationship is "greater than", 
     * and 0 if the release years are the same.
     */
    public int compareYear(Song song)
    {
        return this.getYear().compareTo(song.getYear());
    }

    /**
     * Compare two song's based on title first and then artist if the titles
     * are the same.
     * @param song The song object we are comparing to.
     * @return a number less than 0 if the relationship is "less than",
     * a number greater than 0 if the relationship is "greater than", 
     * and 0 if the release years are the same.
     */
    public int compareTo(Song song)
    {
        if (this.getTitle() != song.getTitle()) {
            return this.getTitle().compareTo(song.getTitle());
        }
        if (this.getArtist() != song.getArtist()){
            return this.getArtist().compareTo(song.getArtist());
        }
        return 0;
    }

}
