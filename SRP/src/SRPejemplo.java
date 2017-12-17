
/**
 *
 * @author AndresG
 */
public class SRPejemplo {
    public static void main(String[] args) {
        Media m = new AudioMedia();
        m.setDuracion(90);
        m.setNombre("Titanic");
        m.WriteTo(new fileWriter());
        m.printInfo();
        
        
        
        
    }
    
}
