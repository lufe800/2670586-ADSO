public class Curso{

    String codigo;
    String nombre;
    String area;
    int duracion;
    String[] listaTemas;
    int numeroTemas;

    public Curso(String codigo, String nombre, String area, int duracion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.duracion = duracion;
        this.listaTemas = new String[15];
        this.numeroTemas = 0;

    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getArea(){
        return area;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAreaConocimiento(String area){
        this.area = area;
    }

    public void setDuracionHoras(int duracion){
        this.duracion = duracion;
    }

    public void imprimir(){
        System.out.println("|-------------------------------|");
        System.out.println("|      DETALLES DEL CURSO        ");
        System.out.println("                                 ");
        System.out.println("|   Codigo: "+codigo);
        System.out.println("|   Nombre: "+nombre);
        System.out.println("|   Area: "+area);
        System.out.println("|   Duración: "+duracion);
        System.out.println("|   Temas:                       ");
        for(int i=0; i<numeroTemas; i++){
            System.out.println(" - "+listaTemas[i]);
        }
        System.out.println("|                                ");
        System.out.println("|-------------------------------|");
    }

    public void agregarTema(String tema){
        if(numeroTemas<15){
            listaTemas[numeroTemas] = tema;
            numeroTemas++;
        }else{
            System.out.println("No se pueden agregar más cursos.");
        }
    }

    public void editarInfoCurso(String nombre, String area, int duracion){
        this.nombre = nombre;
        this.area= area;
        this.duracion = duracion;
    }

    public String getInfoCurso(){
        String texto = codigo+ " - "+nombre+ " - "+area+ " - "+duracion+ " horas ";
        return texto;
    }

    
}