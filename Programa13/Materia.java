import java.util.ArrayList;
/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Materia{
    private String                nombre;
    private ArrayList<Estudiante> lista;
    
    
    public Materia(String  nombre){
        this.nombre = nombre;
        this.lista  = new ArrayList<Estudiante>();
    }
        
    public void insertar(Estudiante estudiante){
        lista.add(estudiante);
    }
    
    public ArrayList<Estudiante> listaEstMenorNota(){
        ArrayList<Estudiante> datos;
        datos = new ArrayList<Estudiante>();
        int minNota;
        int nota;
        minNota = 100;
        for( Estudiante est: lista){
            nota = est.obtenerNota();
            if(nota < minNota){
                datos = new ArrayList<Estudiante>();
                datos.add(est);
                minNota = nota;
            }else{
                if(nota == minNota){
                    datos.add(est);
                }
            }
        }
        return datos;
    }
    
    public double obtenerProm(){
        double prom = 0;
        return prom;
    }
    
    public String obtenerReporteRango(){
        String reporte = "";
        return reporte;
    }
    
    public int obtenerNotaDe(int ci){
        int nota = 0;
        return nota;
    }
    
    public double obtenerPorcApro(int x){
        double porc = 0.0;
        return porc;
    }
}