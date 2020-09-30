//marhassler branch

/**
 * Dieses Programm macht es moeglich TV Serien in eine Liste hinzuzufuegen und dann hintereinander auszulesen.
 *
 *
 * @author  Hassler Marco
 * @version 1.0
 * @since   2020-09-20
 */
public class Beispiel
{
    /**
     * Hier werden die Serien erschaffen und in der Datenbank hinzugefuegt
     */
public static void main(String[] args) 
{
    Datenbank db = new Datenbank();
    TVShows show1 = new TVShows("Death Note", "19-7-2007", "Horror");
    TVShows show2 = new TVShows("Darling in the Franxx", "12-6-2018", "Action");
    db.addShow(show1);
    db.addShow(show2);
    db.printShows();
}

    
}
