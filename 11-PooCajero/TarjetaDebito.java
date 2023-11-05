import java.util.Date;
public class TarjetaDebito{

    private String nombrePropietario;
    private String numeroTarjeta;
    private String nombreBanco;
    private int dineroDisponible;
    private int permitidoRetiro;
    private String ultimasTransacciones [];
    private String clave;
    private String estado;

    public TarjetaDebito(String nombrePropietario, String numeroTarjeta, String nombreBanco, int dineroDisponible, int permitidoRetiro, String clave){
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.dineroDisponible = dineroDisponible;
        this.permitidoRetiro = permitidoRetiro;
        this.clave = clave;
        this.estado = "ACTIVA";
        this.ultimasTransacciones = new String[10];
    }

    public void registrarTransaccion(String tipo, int monto, String estado){
		Date fecha = new Date();
		String texto = fecha.toString()+" - "+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;

		// Buscar un indice donde este vacio
		int indice = -1;
		for (int i=0; i<ultimasTransacciones.length; i++) {
			if (ultimasTransacciones[i]==null) {
				indice = i;
				break;
			}
		}
		
		if (indice != -1) {
			ultimasTransacciones[ indice ] = texto;
		}else{
			for (int i=0; i<ultimasTransacciones.length-1; i++) {
				ultimasTransacciones[i] = ultimasTransacciones[i+1];
			}
			ultimasTransacciones[ ultimasTransacciones.length-1 ] = texto;
		}
	}

    public void verHistorial(String pass){
        if(pass.equals(clave)){
            registrarTransaccion("HISTORIAL", 0, "OK");
            for(int i=0; i<ultimasTransacciones.length; i++){
                if(ultimasTransacciones[i] != null){
                    System.out.println("  => "+ultimasTransacciones);
                }
            }

        }else{
            System.out.println("===> ACCESO DENEGADO DESDE LA TARJETA <===");
            registrarTransaccion("HISTORIAL", 0, "ERROR");
        }
    }

    public boolean aumentarSaldo(int monto, String pass){
    
        if(pass.equals(clave)){
            if(monto>0){
                dineroDisponible += monto;
                System.out.println("===> TRANSACCION EXITOSA <===");
                registrarTransaccion("AUMENTOSALDO", monto, "OK");
                return true;
            }else{
                System.out.println("===> ERROR EN MONTO INGRESADO <===");
                registrarTransaccion("AUMENTOSALDO", monto, "ERROR");
                return false;
            }

        }else{
            System.out.println(" ===> ERROR EN PASSWORD AUTMENTO DE SALDO <===");
            registrarTransaccion("AUMENTOSALDO", monto, "ERROR");
            return false;
        }
    }

    public boolean disminuirSaldo(int monto, String pass ){

          if(pass.equals(clave)){
            if(monto>0 && monto <= permitidoRetiro){

                if(monto <= dineroDisponible){
                    dineroDisponible -= monto;
                    System.out.println("===> TRANSACCION EXITOSA <===");
                    registrarTransaccion("DISMINUCION", monto, "OK");
                    return true;    
                }else{
                    System.out.println("===> ERROR EN MONTO INGRESADO SUPERA DINERO <===");
                    registrarTransaccion("DISMINUCION", monto, "ERROR");
                    return false;
                }  
            }else{
                System.out.println("===> ERROR EN MONTO INGRESADO - FUERA DE RANGO <===");
                registrarTransaccion("AUMENTOSALDO", monto, "ERROR");
                return false;
            }
        }else{
            System.out.println("===> ERROR EN PASSWORD DISMINUCION DE SALDO <===");
            registrarTransaccion("DISMINUCION", monto, "ERROR");
            return false;
        }
    }


    public int getSaldo(String pass){
        if(pass.equals(clave)){
            registrarTransaccion("CONSULTASALDO", 0, "OK");
            return dineroDisponible;

        }else{
            registrarTransaccion("CONSULTASALDO", 0, "ERROR");
            return -1;
        }
    }

    public boolean validaEstadoActiva(){ 
        if(estado.equals("ACTIVA")){
            return true;
        }else{
            return false;
        }    
    }
    public boolean validarClave(String pass){ 
        if(pass.equals(clave)){
            return true;
        }else{
            return false;
        }    
    }

    public String getNumero(){
        return numeroTarjeta;
    }


}

