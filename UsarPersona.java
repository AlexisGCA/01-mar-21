
import ico.fes.Persona; // equivalente #include<> para python from paq import

public class UsarPersona{

   public static void main(String [] args){
   System.out.println("Programa usar persona");
   Persona per1 = new Persona();
   Persona per2 = new Persona();

   System.out.println(per1.getNombre() );

   per2.setNombre("Alexis");
   System.out.println(per2.getNombre() );

   }
}
