public  class Jugador{
    String cedula;
    String nombre;
    int edad;
    String posicion;


    public Jugador(String cedula, String nombre, int edad, String posicion){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getPosicion(){
        return posicion;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }

    public void imprimirDetalle(){

        System.out.println("|-------------------------------|");
        System.out.println("|     DETALLES DE JUGADORES      ");
        System.out.println("                                 ");
        System.out.println("|   Cedula: "+cedula);
        System.out.println("|   Nombre: "+nombre);
        System.out.println("|   edad: "+edad);
        System.out.println("|   Posición: "+posicion);
        System.out.println("|-------------------------------|");
        
    }

}