import javax.swing.*;
import java.awt.*;

public class Principal{
    public static void main(String[] args) {

        //Dimension tamanio = new Dimension(600, 500); // si se va a usar varias ventanas reutilizar, se crea como objeto
        JFrame ventana_01 = new JFrame();

        ventana_01.setTitle("Primer Ventana");
        ventana_01.setVisible(true);
        ventana_01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana_01.setSize(300, 600);
        //ventana_01.setSize(tamanio);
        ventana_01.setResizable(false);
        ventana_01.setLocation(500, 100);
        ventana_01.setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        contenedor.setBackground( Color.PINK); // SE PUEDE HACER LA GAMA DE COLORES CON new color(rgb)
        contenedor.setVisible(true);


        JLabel etiqueta_titulo = new JLabel();
        etiqueta_titulo.setText("TITULO");
        etiqueta_titulo.setForeground(Color.BLACK);
        etiqueta_titulo.setBackground(Color.ORANGE);
        etiqueta_titulo.setOpaque(true);
        etiqueta_titulo.setFont(new Font("Snap ITC", Font.BOLD, 45));

        JLabel etiqueta_cedula = new JLabel();
        etiqueta_cedula.setText("Cedula: ");
        etiqueta_cedula.setFont(new Font("Arial", Font.PLAIN, 20)); 

        JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(11);

        JLabel etiqueta_nombre = new JLabel();
        etiqueta_nombre.setText("Nombre: ");
        etiqueta_nombre.setFont(new Font("Arial", Font.PLAIN, 20));

        JTextField campo_nombre = new JTextField();
        campo_nombre.setColumns(11);

        JLabel etiqueta_apellidos = new JLabel();
        etiqueta_apellidos.setText("Apellidos: ");
        etiqueta_apellidos.setFont(new Font("Arial", Font.PLAIN, 20));

        JTextField campo_apellido = new JTextField();
        campo_apellido.setColumns(11);

        JButton boton = new JButton();
        boton.setText("Enviar");


        contenedor.add(etiqueta_titulo);
        contenedor.add(etiqueta_cedula);
        contenedor.add(campo_cedula);
        contenedor.add(etiqueta_nombre);
        contenedor.add(campo_nombre);
        contenedor.add(etiqueta_apellidos);
        contenedor.add(campo_apellido);
        contenedor.add(boton);



        ventana_01.add(contenedor);
        ventana_01.revalidate();
        //ventana_01.repaint();
        //ventana_01.pack();



    
    }
}