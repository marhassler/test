
/**
 * Hier werden die Serien definiert
 * @author  Hassler Marco
 * @version 1.0
 * @since   2020-09-20
 */

public class TVShows
{

    private String name;
    private String date;
    private String genre;

    /**
     * @param name  Erster Parameter des Konstruktors
     * @param date  Zweiter Parameter des Konstruktors
     * @param genre Dritter Parameter des Konstruktors
     */
    public TVShows(String name , String date , String genre)
    {
        this.name = name;
        this.date = date;
        this.genre = genre;
    }

    /**
     *  Hier ermoeglichen wir es uns das Objekt von der Sorte TVShows als String auszugeben
     */
    @Override
    public String toString()
    {
        return "Name : " + this.name + " Date : " + this.date + " Genre : "  + this.genre;
    }
}