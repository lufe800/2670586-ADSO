public class Perro{

    //Atributos
    private String nombre;
    private String propietario;
    private int edad;
    private String raza;
    private double peso;
    private int energia;

    //Metodo constructor. es usado para crear objetos de esa clase Instanciación
    // y su función es dar valor inicial a los atributos.

    public Perro(String dato1, String dato2, int dato3, String dato4, double dato5, int dato6){
        nombre = dato1;
        propietario = dato2;
        edad = dato3;
        raza = dato4;
        peso = dato5;
        energia = dato6;


    }
    public void imprimirDetalle(){
        System.out.println ("+--------------------------------------+");
        System.out.println ("| nombre: "+nombre);
        System.out.println ("| Propietario: "+ propietario);
        System.out.println ("| edad: "+edad+" meses( "+((double)edad/12)+" anios)");
        System.out.println ("| raza: "+raza);
        System.out.println ("| peso: "+peso);
        System.out.println ("| energia: "+energia);
        System.out.println ("+--------------------------------------+");

    }

    //getter retorna el contenido


    public String getNombre(){
        return nombre;

    }
    public String getPropietario(){
        return propietario;
    }

    public int getEdad(){
        return edad;
    }

    public String getRaza(){
        return raza;
    }

    public double getPeso(){
        return peso;
    }

    public int getEnergia(){
        return energia;
    }

    //setter modifica el contenido de un atributo

    public void setNombre(String dato){
        this.nombre = dato;
    }

    public void setPropietario(String dato){
        this.propietario = dato;
    }

    public void setEdad(int dato){
        this.edad = dato;
    }

    public void setRaza(String dato){
        this.raza = dato;
    }

    public void setPeso(double dato){
        this.peso = dato;
    }

    public void setEnergia(int dato){
        this.energia = dato;
    }

    public void comer(int gramos){
        // peso aumenta proporcional a los gramos consumidos

        peso += ((double)gramos/1000);

        // energia por cada 100g aumenta un nivel de energía
        energia += (gramos/100); 
    }




}