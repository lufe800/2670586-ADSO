public class Equipos{

    String nombre;
    int anioFundacion;
    int cantGanados;
    int cantEmpatados;
    int cantPerdidos;
    Jugador[] listadoJudadores;

    public Equipos(String nombre, int anioFundacion, int cantGanados, int cantEmpatados, int cantPerdidos){
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.cantGanados = cantGanados;
        this.cantEmpatados = cantEmpatados;
        this.cantPerdidos = cantPerdidos;
        this.listadoJugadores = new String[11];

    }

    public String getNombre(){
        return nombre;
    }

    public int getAnioFundacion(){
        return anioFundacion;
    }

    public int getCantGanados(){
        return cantGanados;
    }

    public int getCanEmpatados(){
        return cantEmpatados;
    }

    public int getPerdidos(){
        return cantPerdidos;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAnioFundacion(int anioFundacion){
        this.anioFundacion = anioFundacion;
    }

    public void setCantGanados(int cantGanados){
        this.cantGanados = cantGanados;
    }

    public void setCantEmpatados(int cantEmpatados){
        this.cantEmpatados = cantEmpatados;
    }

    public void setCantPerdidos(int cantPerdidos){
        this.cantPerdidos = cantPerdidos;
    }


    public void agregarJugador(Jugador jugador){
        if(jugador<11){
            listadoJudadores[jugador];
            jugador++;
        }
    }

    public void eliminar(Jugador jugador)

    
}