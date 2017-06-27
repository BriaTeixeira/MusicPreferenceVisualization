/**
 * 
 */
package musicpreference;

/**
 * @author Bria
 *
 */
public class SongList extends LinkedList<Song>
{
    /**
     * constructor
     */
    public SongList()
    {
        super();
    }

    /**
     * sort by title
     */
    public void sortTitle()
    {
        if (this.getLength() > 1)
        {
            for (int i = 1; i <this.getLength(); i++)
            {
                for (int j = i; j > 0; j--)
                {
                    if (this.getEntry(j).compareTitle(this.getEntry(j-1)) < 0)
                    {
                        swap(j, j-1);
                    }

                }
            }
        }
    }
    /**
     * sort by Artist
     */
    public void sortArtist()
    {
        if (this.getLength() > 1)
        {
            for (int i = 1; i <this.getLength(); i++)
            {
                for (int j = i; j > 0; j--)
                {
                    if (this.getEntry(j).compareArtist(this.getEntry(j-1)) < 0)
                    {
                        swap(j, j-1);
                    }

                }
            }
        }
    }
    /**
     * sort by Year
     */
    public void sortYear()
    {
        if (this.getLength() > 1)
        {
            for (int i = 1; i <this.getLength(); i++)
            {
                for (int j = i; j > 0; j--)
                {
                    if (this.getEntry(j).compareYear(this.getEntry(j-1)) < 0)
                    {
                        swap(j, j-1);
                    }

                }
            }
        }
    }
    /**
     * sort by Genre
     */
    public void sortGenre()
    {
        if (this.getLength() > 1)
        {
            for (int i = 1; i <this.getLength(); i++)
            {
                for (int j = i; j > 0; j--)
                {
                    if (this.getEntry(j).compareGenre(this.getEntry(j-1)) < 0)
                    {
                        swap(j, j-1);
                    }

                }
            }
        }
    }
}
