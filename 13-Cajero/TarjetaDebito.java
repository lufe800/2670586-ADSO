import java.util.Date;
public class TarjetaDebito{

    String nombrePropietario;
    String numeroTarjeta;
    String nombreBanco;
    int cantidadDineroTarjeta;
    int cantidadPermitidoRetirar;
    String ultimasTransacciones [];
    String clave;
    String estado;

    public TarjetaDebito(String nombrePropietario, String numeroTarjeta, String nombreBanco, int cantidadDineroTarjeta, int cantidadPermitidoRetirar, String clave, String estado){
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.cantidadDineroTarjeta = cantidadDineroTarjeta;
        this.cantidadPermitidoRetirar = cantidadPermitidoRetirar;
        this.clave = clave;
        this.estado = "ACTIVA";
        ultimasTransacciones = new String[0];
    }

    public void imprimirDetalleTarjeta(){
		System.out.println("--------------------------------------");
		System.out.println("  nombrePropietario: "+nombrePropietario);
		System.out.println("  numeroTarjeta: "+numeroTarjeta);
		System.out.println("  nombreBanco: "+nombreBanco);
		System.out.println("  cantidadDineroTarjeta: "+cantidadDineroTarjeta);
		System.out.println("  cantidadPermitadoRetirar: "+cantidadPermitadoRetirar);
        System.out.println("  clave: "+clave);
        System.out.println("  estado: "+estado);
		System.out.println("  Historial Transacciones: ");
		for (int i=0; i<ultimasTransacciones.length;i++) {
			if (ultimasTransacciones[i]!=null) {
				System.out.println("       => "+ultimasTransacciones[i]);
			}
		}
		System.out.println("--------------------------------------");
	}

    public aumentarSaldo(int monto){
        Date fecha = new Date();
        cantidadDineroTarjeta += monto;
        String transaccion = fecha.toString()+ "CONSIGNACION"+ monto + " - "+ " EXITOSA."; 
        agregarTransaccion(transaccion);
    }

    public disminuirSaldo(int monto){
        Date fecha = new Date();
        cantidadDineroTarjeta -= monto;
        String transaccion = fecha.toString()+ "RETIRO"+ monto + " - "+ " EXITOSO."; 
        agregarTransaccion(transaccion);
    }

    public void agregarTransaccion(String transaccion){
        String[] nuevasTransacciones = new String[ultimasTransacciones.length + 1];
        for (int i = 0; i < ultimasTransacciones.length; i++) {
            nuevasTransacciones[i] = ultimasTransacciones[i];
        }
        nuevasTransacciones[ultimasTransacciones.length] = transaccion;
        ultimasTransacciones = nuevasTransacciones;
    }
    




}

