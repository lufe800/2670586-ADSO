

public class Materia {

    String nombre;
    double creditos;
    double notas;

    public Materia(String nombre, int creditos, double notas){
        this.nombre = nombre;
        this.creditos = creditos;
        this.notas = notas;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }



    
}
