public class Persona{

    // Atributos => Caracteristicas
    // es apropiado que los atributos sean privados

    int cedula;
    String nombres;
    String apellidos;
    int edad;
    int altura;
    double peso;

    //Metodos => Acciones
    // - Constructores

    public Persona(int dato1, String dato2, String dato3, int dato4, int dato5, double dato6){ // el constructor tambien es un metodo
        cedula = dato1;
        nombres = dato2;
        apellidos = dato3;
        edad = dato4;
        altura = dato5;
        peso = dato6; 

    }


    //Getters
    public int getCedula(){
        return cedula;
    }

    public String getNombres(){
        return nombres;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public int getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }


    // Setters

    public void setCedula(int dato){ // el dato es el nuevo dato que se va a modificar
        cedula = dato;

    }

    public void setNombres(String dato){ // el dato es el nuevo dato que se va a modificar
        nombres = dato;

    }

    public void setApellidos(String dato){ // el dato es el nuevo dato que se va a modificar
        apellidos = dato;

    }

    public void setEdad(int dato){ // el dato es el nuevo dato que se va a modificar
        edad = dato;

    }

    public void setAltura(int dato){ // el dato es el nuevo dato que se va a modificar
        altura = dato;

    }

    public void setPeso(double dato){ 
        peso = dato;

    }

    public void imprimirEstado(){
        System.out.println("|------------------------------|");
        System.out.println("|-Cedula: "+ cedula);
        System.out.println("|-Nombres: "+nombres);
        System.out.println("|-Apellidos: "+ apellidos);
        System.out.println("|-Edad: "+ edad);
        System.out.println("|-Altura: "+altura);
        System.out.println("|-Peso: "+peso);
        System.out.println("|------------------------------|");
    }
 
    public String getInfoInLine(){
        String texto = cedula+" - "+nombres+" "+apellidos+" - "+edad+" anios - "+altura+" cm - "+peso+" kg ";
        return texto;
    }


}