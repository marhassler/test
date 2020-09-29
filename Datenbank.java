package ide_uebung;

import java.util.ArrayList;

/**
 * Hier werden die Serien erschaffen und in der Datenbank hinzugefuegt
 * @author  Hassler Marco
 * @version 1.0
 * @since   2020-09-20
 */

public class Datenbank
{
    /**
     * Hier werden die Serien gespeichert
     */
    private ArrayList<TVShows> showList = new ArrayList<>();
//Hier hat sich ein Kommentar eingeschlichen, mfg Nico1300

//Hier hat sich ein zweiter Kommentar eingeschlichen , mfg marhassler
    public Datenbank() 
    {
        
    }

    /**
     * Diese Methode fuegt unsere Serien in einer ArrayList ein
     *
     * @param show Der einzige Parameter der addShow Methode
     */
    public void addShow(TVShows show)
    {
        showList.add(show);
    }

    /**
     * Diese Methode gibt alle Serien die in der ArrayListe gespeichert wurden aus
     */

    public void printShows()
    {
        for(TVShows show : showList)
        {
            System.out.println(show);
        }
    }
    

}