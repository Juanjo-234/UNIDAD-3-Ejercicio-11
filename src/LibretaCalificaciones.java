import java.util.ArrayList;
import java.util.List;

public class LibretaCalificaciones {
    private String nombre;
    private List<Double>notas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public LibretaCalificaciones(String nombre){
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    void agregarNota(double nota){
        if(nota < 0.0 || nota >10.0){
            System.out.println("Ingrese una nota entre 0 y 10.");
        }else{
            notas.add(nota);
            System.out.println("Nota: " + nota);
        }
    }

    public double obtenerPromedio(){

        if (notas.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

}
