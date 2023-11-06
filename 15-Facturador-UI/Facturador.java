import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel etq_titulo_cliente = new JLabel();
        etq_titulo_cliente.setText("DATOS CLIENTE: ");
        etq_titulo_cliente.setFont(new Font ("Arial", Font.BOLD, 20));
        etq_titulo_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_titulo_cliente, restricciones);

        //Datos clientes

        JLabel etq_cedula_cliente= new JLabel();
        etq_cedula_cliente.setText("CEDULA: ");
        etq_cedula_cliente.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_cedula_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula_cliente, restricciones);

        JTextField campo_cedula_cliente = new JTextField();
        campo_cedula_cliente.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1; //CELDAS HORIZONTALES
        restricciones.gridheight = 1;// CELDA VERTICAL
        restricciones.weightx = 50;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
       //restricciones.insets = new Insets(5,0,0,0);
        contenedor.add(campo_cedula_cliente, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton btn_buscar_cliente = new JButton();
        btn_buscar_cliente.setText("BUSCAR");
        btn_buscar_cliente.setBackground(Color.lightGray);
        btn_buscar_cliente.setForeground(Color.DARK_GRAY);
        restricciones.gridx = 2;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        //restricciones.insets = new Insets(5,0,0,0);
        contenedor.add(btn_buscar_cliente, restricciones);
        restricciones.insets = new Insets(0,0,0,0);
        
        JLabel etq_nombres_cliente = new JLabel();
        etq_nombres_cliente.setText("NOMBRES: ");
        etq_nombres_cliente.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_nombres_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 50;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_nombres_cliente, restricciones);

        JLabel etq_direccion = new JLabel();
        etq_direccion.setText("DIRECCION: ");
        etq_direccion.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_direccion.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 50;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_direccion, restricciones);

        //Datos vendedores

        JLabel etq_titulo_vendedor = new JLabel();
        etq_titulo_vendedor.setText("DATOS VENDEDOR: ");
        etq_titulo_vendedor.setFont(new Font ("Arial", Font.BOLD, 20));
        etq_titulo_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_titulo_vendedor, restricciones);

        JLabel etq_cedula_vendedor = new JLabel();
        etq_cedula_vendedor.setText("CEDULA: ");
        etq_cedula_vendedor.setFont(new Font ("Arial", Font.BOLD, 15));
        etq_cedula_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula_vendedor, restricciones);

        JTextField campo_cedula_vendedor = new JTextField();
        campo_cedula_vendedor.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 50;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        //restricciones.insets = new Insets(5,0,0,0);
        contenedor.add(campo_cedula_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton btn_buscar_vendedor = new JButton();
        btn_buscar_vendedor.setText("BUSCAR");
        btn_buscar_vendedor.setBackground(Color.lightGray);
        btn_buscar_vendedor.setForeground(Color.DARK_GRAY);
        restricciones.gridx = 2;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        //restricciones.insets = new Insets(5,0,0,0);
        contenedor.add(btn_buscar_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);



        add(contenedor);
        setVisible(true);
        revalidate();
    }
    
}
