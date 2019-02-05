
/**
 * Write a description of class RockTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RockTest
{
   public static void main (String[] args) {
       Rocks rock1 = new Gneiss();
       rock1.META();
       System.out.println("I am Gneiss.I was formed through metamorphic foliated processes!");
       
       Rocks rock2 = new Granite();
       rock2.Iggy();
       System.out.println("I am Granite.I was formed through igneous intrusive processes!");
       
       Rocks rock3 = new Sandstone();
       rock3.SED();
       System.out.println("I am Sandstone.I was formed due to sedimentary processes!");
       
    }
}
