
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BuscaMinas extends JFrame {
  JLabel etiqueta_minas;
  
  JLabel etiqueta_tiempo;
  
  JButton btn_happy;
  
  JButton[][] tablero;
  
  int[][] tablero_interno;
  
  int minas;
  
  public BuscaMinas() {
    this.minas = 20;
    this.tablero_interno = new int[9][9];

    initComponents();
  }
  
  public void initComponents() {
    setTitle("BuscaMinas");
    setDefaultCloseOperation(3);
    setSize(300, 400);
    setLocationRelativeTo((Component)null);
    setResizable(false);
    Image icono = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_bomba.png"));
    setIconImage(icono);

    JPanel contenedor = new JPanel();
    GridBagLayout capa = new GridBagLayout();
    contenedor.setLayout(capa);
    contenedor.setBorder(new EmptyBorder(10, 10, 10, 10));
    GridBagConstraints restriccion = new GridBagConstraints();
    
    this.etiqueta_minas = new JLabel("0" + this.minas, 0);
    this.etiqueta_minas.setOpaque(true);
    this.etiqueta_minas.setBackground(Color.BLACK);
    this.etiqueta_minas.setForeground(Color.red);
    this.etiqueta_minas.setFont(new Font("Arial", 1, 30));
    this.etiqueta_minas.setBorder(new EmptyBorder(5, 10, 5, 10));
    restriccion.gridx = 0;
    restriccion.gridy = 0;
    restriccion.gridwidth = 3;
    restriccion.gridheight = 1;
    restriccion.weightx = 1;
    restriccion.weighty = 1;
    restriccion.fill = 10;
    contenedor.add(this.etiqueta_minas, restriccion);

    this.btn_happy = new JButton();
    Image img_iniciar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_happy.png"));
    img_iniciar = img_iniciar.getScaledInstance(25, 25, 4);
    this.btn_happy.setIcon(new ImageIcon(img_iniciar));
    this.btn_happy.setFocusable(false);
    this.btn_happy.setBorder(new EmptyBorder(10, 10, 10, 10));
    restriccion.gridx = 3;
    restriccion.gridy = 0;
    restriccion.gridwidth = 3;
    restriccion.gridheight = 1;
    restriccion.weightx = 1.0D;
    restriccion.weighty = 1.0D;
    restriccion.fill = 10;
    contenedor.add(this.btn_happy, restriccion);

    this.etiqueta_tiempo = new JLabel("000", 0);
    this.etiqueta_tiempo.setOpaque(true);
    this.etiqueta_tiempo.setBackground(Color.BLACK);
    this.etiqueta_tiempo.setForeground(Color.red);
    this.etiqueta_tiempo.setFont(new Font("Arial", 1, 30));
    this.etiqueta_tiempo.setBorder(new EmptyBorder(5, 10, 5, 10));
    restriccion.gridx = 6;
    restriccion.gridy = 0;
    restriccion.gridwidth = 3;
    restriccion.gridheight = 1;
    restriccion.weightx = 1;
    restriccion.weighty = 1;
    restriccion.fill = 10;
    contenedor.add(this.etiqueta_tiempo, restriccion);

    this.tablero = new JButton[9][9];
    for (int i = 0; i < this.tablero_interno.length; i++) {
      for (int j = 0; j < (this.tablero_interno[0]).length; j++) {
        Image img_blanco = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_espacio.png"));
        img_blanco = img_blanco.getScaledInstance(20, 20, 4);
        this.tablero[i][j] = new JButton();
        this.tablero[i][j].setIcon(new ImageIcon(img_blanco));
        this.tablero[i][j].setFocusable(false);
        restriccion.gridx = j;
        restriccion.gridy = i + 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        restriccion.fill = 1;
        contenedor.add(this.tablero[i][j], restriccion);
        final int fila = i;
        final int columna = j;
      } 
    } 
    add(contenedor);
    revalidate();
    setVisible(true);
  }
}
