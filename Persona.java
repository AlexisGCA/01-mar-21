
package ico.fes;

public class Persona{

    private String nombre;  // atributos
    private String apPaterno;
    private int edad;
    private String curp;

    public Persona(){  // método constructor
        nombre="No asignado";
    }

     /*
      Metodo de acceso
          para atributo nombre
       no recibe parámetros de entrada, pero regresa el valor de nombre
     */
    public String getNombre(){
        return this.nombre;

    }
    public void setNombre(String n ){
        this.nombre = n;
    }
}
