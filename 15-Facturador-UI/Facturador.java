import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.awt.geom.Line2D;
public class Facturador extends JFrame {

    public Facturador(){
        initComponents();
    }
    public void initComponents(){
        setTitle ("FACTURA");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));
        setSize(545, 690);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));    

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel etq_titulo_cliente = new JLabel();
        etq_titulo_cliente.setText("DATOS CLIENTE: ");
        etq_titulo_cliente.setFont(new Font ("Arial", Font.BOLD, 20));
        etq_titulo_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = ;
        restricciones.gridy = 0;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,0);
        contenedor.add(etq_titulo_cliente, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        //Datos clientes

        JLabel etq_cedula_cliente= new JLabel();
        etq_cedula_cliente.setText("CEDULA: ");
        etq_cedula_cliente.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_cedula_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,0,20,0);
        contenedor.add(etq_cedula_cliente, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JTextField campo_cedula_cliente = new JTextField();
        campo_cedula_cliente.setColumns(15);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 2; //CELDAS HORIZONTALES
        restricciones.gridheight = 1;// CELDA VERTICAL
        restricciones.weightx = 60;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(campo_cedula_cliente, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton btn_buscar_cliente = new JButton();
        btn_buscar_cliente.setText("BUSCAR");
        btn_buscar_cliente.setBackground(Color.LIGHT_GRAY);
        btn_buscar_cliente.setForeground(Color.DARK_GRAY);
        restricciones.gridx = 3;
        restricciones.gridy = 1;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(btn_buscar_cliente, restricciones);
        restricciones.insets = new Insets(0,0,0,0);
        
        JLabel etq_nombres_cliente = new JLabel();
        etq_nombres_cliente.setText("NOMBRES: ");
        etq_nombres_cliente.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_nombres_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 40;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(etq_nombres_cliente, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_campo_nombresC = new JLabel();
        etq_campo_nombresC.setText("------");
        etq_campo_nombresC.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_campo_nombresC.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 60;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(etq_campo_nombresC, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_direccion = new JLabel();
        etq_direccion.setText("DIRECCION: ");
        etq_direccion.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_direccion.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 40;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(etq_direccion, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_campo_direccion = new JLabel();
        etq_campo_direccion.setText("------");
        etq_campo_direccion.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_campo_direccion.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 60;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(etq_campo_direccion, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        //Datos vendedores

        JLabel etq_titulo_vendedor = new JLabel();
        etq_titulo_vendedor.setText("DATOS VENDEDOR: ");
        etq_titulo_vendedor.setFont(new Font ("Arial", Font.BOLD, 20));
        etq_titulo_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(etq_titulo_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_cedula_vendedor = new JLabel();
        etq_cedula_vendedor.setText("CEDULA: ");
        etq_cedula_vendedor.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_cedula_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(etq_cedula_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JTextField campo_cedula_vendedor = new JTextField();
        campo_cedula_vendedor.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 60;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(campo_cedula_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton btn_buscar_vendedor = new JButton();
        btn_buscar_vendedor.setText("BUSCAR");
        btn_buscar_vendedor.setBackground(Color.lightGray);
        btn_buscar_vendedor.setForeground(Color.DARK_GRAY);
        restricciones.gridx = 3;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(btn_buscar_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_nombres_vendedor = new JLabel();
        etq_nombres_vendedor.setText("NOMBRES: ");
        etq_nombres_vendedor.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_nombres_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 40;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(etq_nombres_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_campo_nombresV = new JLabel();
        etq_campo_nombresV.setText("------");
        etq_campo_nombresV.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_campo_nombresV.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx = 1;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 60;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(etq_campo_nombresV, restricciones);
        restricciones.insets = new Insets(0,0,0,0);
    
        // Scroll productos

        JLabel etq_titulo_productos = new JLabel();
        etq_titulo_productos.setText("LISTA PRODUCTOS FACTURADOS:");
        etq_titulo_productos.setFont(new Font ("ARIAL", Font.BOLD, 20));
        etq_titulo_productos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,5,20,5);
        contenedor.add(etq_titulo_productos, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        // Datos productos

        JLabel etq_id_producto= new JLabel();
        etq_id_producto.setText("ID: ");
        etq_id_producto.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_id_producto.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_id_producto, restricciones);

        JTextField campo_id_producto = new JTextField();
        campo_id_producto.setColumns(10);
        restricciones.gridx = 0;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1; //CELDAS HORIZONTALES
        restricciones.gridheight = 1;// CELDA VERTICAL
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
       //restricciones.insets = new Insets(5,0,0,0);
        contenedor.add(campo_id_producto, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_nombre_producto= new JLabel();
        etq_nombre_producto.setText("NOMBRE: ");
        etq_nombre_producto.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_nombre_producto.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill =GridBagConstraints.BOTH;
        contenedor.add(etq_nombre_producto, restricciones);

        JTextField campo_nombre_producto = new JTextField();
        campo_nombre_producto.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 9;
        restricciones.gridwidth = 2; //CELDAS HORIZONTALES
        restricciones.gridheight = 1;// CELDA VERTICAL
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        //restricciones.insets = new Insets(0,0,5,0);
        contenedor.add(campo_nombre_producto, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_cantidad= new JLabel();
        etq_cantidad.setText("CANT. ");
        etq_cantidad.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_cantidad.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 2;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cantidad, restricciones);

        JTextField campo_cantidad = new JTextField();
        campo_cantidad.setColumns(10);
        restricciones.gridx = 2;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1; //CELDAS HORIZONTALES
        restricciones.gridheight = 1;// CELDA VERTICAL
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
       //restricciones.insets = new Insets(5,0,0,0);
        contenedor.add(campo_cantidad, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton btn_add_producto = new JButton();
        btn_add_producto.setText("ADD");
        btn_add_producto.setBackground(Color.LIGHT_GRAY);
        btn_add_producto.setForeground(Color.DARK_GRAY);
        restricciones.gridx = 3;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(btn_add_producto, restricciones);
        
        JPanel newPanel = new JPanel(new GridLayout(20, 1));

        for (int i = 0; i < 20; i++) {
            JLabel label = new JLabel();
            label.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE)); 
            newPanel.add(label);
        }
    


        JLabel etq_productos = new JLabel();
        etq_productos.setText("----");
        etq_productos.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_productos.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(etq_productos);
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 90;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(scroll, restricciones);
        contenedor.add(newPanel); 

        JLabel etq_total = new JLabel();
        etq_total.setText("Total: $ 0");
        etq_total.setFont(new Font ("Arial", Font.BOLD, 20));
        etq_total.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx = 3;
        restricciones.gridy = 11;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_total, restricciones);
        
        

        add(contenedor);
        setVisible(true);
        revalidate();
    }

    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(() -> {
    //         new Facturador();
    //     });
    // }
    
}

