package utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDatos {
   
    Connection conexion;
    Statement manipularDB;
    Persona litapersonas[];
    public com.sun.jdi.connect.spi.Connection getConexion;
    
    public BaseDatos(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_java";
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion exitosa.");
        } catch (SQLException ex) {
            System.out.println("Error en conexion a BD:");
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void imprimirPersonas(){
        ResultSet registros = null;
	try {
	    String consulta = "SELECT * FROM personas";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
	        do{
	            System.out.println(registros.getRow()+" => "+registros.getString("nombres"));
	        }while(registros.next());
	    }else{
	        System.out.println("No se encuentran clientes registrados.");
	    }
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
    }
    
    public Persona[] extraerPersonas(){
        try {
            Persona arreglo [] = new Persona[100];
            String consulta = "SELECT * FROM personas";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                int i = 0;
                do{
                    String documento = registros.getString("cedula");
                    String nombres = registros.getString("nombres");
                    String apellidos = registros.getString("apellidos");
                     String direccion = registros.getString("direccion");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("email");
                    
                    arreglo[i] = new Persona(documento, nombres, apellidos,direccion, telefono, correo);
                    i++;
                }while(registros.next());
                
                return arreglo;
            }else{
                return arreglo;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public boolean insertarPersona(String cedula, String nombres, String apellidos, String direccion, String telefono, String email){
        boolean respuesta = false;
        try {
            String consulta = "INSERT INTO personas (cedula, nombres, apellidos, direccion, telefono, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+email+"')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Insertado con exito");
        }else{
            System.out.println("No se pudo insertar");
        }
        return respuesta;
    }
    
     public Persona buscarPersona(String cedula, Persona listaPersona[]){
         Persona resultado = null;
         
        try{
            String consulta = "SELECT * FROM personas WHERE cedula = '" +cedula+ "' ";
            
            ResultSet registro = manipularDB.executeQuery(consulta);
            
            for(int i=0; i<listaPersona.length && listaPersona[i] != null; i++){
                String documento = listaPersona[i].getDocumento();
                String nombres = listaPersona[i].getNombres();
                String apellidos = listaPersona[i].getApellidos();
                String direccion = listaPersona[i].getDireccion();
                String telefono = listaPersona[i].getTelefono();
                String correo = listaPersona[i].getCorreo();
                
                resultado = new Persona(documento, nombres, apellidos,direccion, telefono, correo);
                break;   
            }    
        }catch (SQLException e){
            System.out.println("Error al buscar registros: "+e.getMessage());
        }
          return resultado;
    }
    
    public boolean actualizarPersona(String cedula, String nombres, String apellidos, String direccion, String telefono, String email){
        boolean respuesta = false;
        try {
            String consulta = "UPDATE personas SET nombres='"+nombres+"', apellidos='"+apellidos+"', direccion='"+direccion+"', telefono='"+telefono+"', email='"+email+"' WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Editado con exito");
        }else{
            System.out.println("No se pudo Editar");
        }
        return respuesta;
    }
   
        
    
    public boolean eliminarPersona(String cedula){
        boolean respuesta = false;
        try {
            String consulta = "DELETE FROM personas WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
    }
    
    
     public Connection getConexion(){
        return conexion;
    }
    
    public Statement getManipularDB(){
        return manipularDB;
    }
    
}