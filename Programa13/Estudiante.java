
/**
 * Write a description of class B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante{
    private String nombre;
    private int ci;
    private int nota;
    
    public Estudiante(int ci, String nombre, int nota){
        this.ci     = ci;
        this.nombre = nombre;
        this.nota   = nota;
    }
    
    public int obtenerNota(){
        return nota;
    }
    
    public int obtenerCI(){
        return ci;
    }
    
    public String mostrar(){
        return ci + nombre + nota;
    }
}