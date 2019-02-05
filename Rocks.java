
/**
 * Abstract class Rocks - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Rocks
{
    Igneous IGN;
    Metamorphic META;
    Sedimentary SED;
    
    public Rocks(){ //Constructor
    }
    
    public void Iggy(){
        IGN.Molten();// Going to the Igneous interface
    }
    
    public void META(){
      META.Foliation();  
    };
    
    public void SED(){
     SED.Formed(); 
    }
    
    abstract void Display();
}
