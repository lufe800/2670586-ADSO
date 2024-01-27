import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.*;

public class Promedio extends JFrame{
    private double notas = 0;
    private int creditos = 0;
    private int indiceItems = 0;
    private int totalFactura;
    private Materia [] materias;
    private JPanel contenedorItems;
    private JLabel listaJLabels [];
	private JLabel etq_calcular_promedio;
	private JLabel etq_materia;
	private JLabel etq_credito_estudiante;
	private JLabel etq_nota_estudiante;
    private JLabel etq_resumen;
    private JLabel etq_total;
	private JTextField input_campo_materia;
	private JTextField input_campo_credito;
	private JTextField input_campo_nota;
    private JButton btn_registrar_nota;
	private JButton btn_limpiar;


    public Promedio(){
        materias = new Materia[50];
        this.listaJLabels = new JLabel[50];

        initComponent();
    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

		setTitle("Promedio Ponderado");
		setSize( 600, 600);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		
		setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_promedio.png") ) );

		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 20) );
        contPrincipal.setBackground(Color.WHITE);
		GridBagConstraints restriccion = new GridBagConstraints();

        etq_calcular_promedio = new JLabel("CALCULAR PROMEDIO");
		etq_calcular_promedio.setFont( new Font("Arial", Font.BOLD, 35) );
		etq_calcular_promedio.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 1;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.CENTER;
		contPrincipal.add( etq_calcular_promedio, restriccion );

        JPanel contDatosMateria = new JPanel();
		contDatosMateria.setLayout(new GridBagLayout());
		contDatosMateria.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
        contDatosMateria.setBackground(Color.decode("#e6e6e6"));
        restriccion.gridx=0;
        restriccion.gridy=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weighty=1;
        restriccion.weightx=100;
        restriccion.fill=GridBagConstraints.BOTH;
        contPrincipal.add(contDatosMateria,restriccion);


		etq_materia = new JLabel("Materia:");
        etq_materia.setFont( new Font("Arial", Font.PLAIN, 20) );
		restriccion.gridy = 1;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 20;
		restriccion.fill = GridBagConstraints.CENTER;
		contDatosMateria.add( etq_materia, restriccion );

		input_campo_materia = new JTextField();
		input_campo_materia.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 1;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 30;
		restriccion.fill = GridBagConstraints.HORIZONTAL;
		contDatosMateria.add( input_campo_materia, restriccion );
        

		etq_credito_estudiante = new JLabel("Creditos:");
        etq_credito_estudiante.setFont( new Font("Arial", Font.PLAIN, 20) );
        restriccion.gridy = 2;
		restriccion.gridy = 1;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 20;
		restriccion.fill = GridBagConstraints.CENTER;
		contDatosMateria.add( etq_credito_estudiante, restriccion );

		input_campo_credito = new JTextField();
		input_campo_credito.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 1;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 30;
		restriccion.insets = new Insets(10, 0, 10, 0);
		restriccion.fill = GridBagConstraints.HORIZONTAL;
		contDatosMateria.add( input_campo_credito, restriccion );
        restriccion.insets = new Insets(0, 0, 0, 0);

		etq_nota_estudiante = new JLabel("Nota:");
        etq_nota_estudiante.setFont( new Font("Arial", Font.PLAIN, 20) );
		restriccion.gridy = 2;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 20;
		restriccion.fill = GridBagConstraints.CENTER;
		contDatosMateria.add( etq_nota_estudiante, restriccion );

		input_campo_nota = new JTextField();
		input_campo_nota.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 2;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 30;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.HORIZONTAL;
		contDatosMateria.add( input_campo_nota, restriccion );
        restriccion.insets = new Insets(0, 0, 0, 0);

	
		btn_registrar_nota = new JButton("REGISTRAR");
        btn_registrar_nota.setBackground(new Color(0,0,245));
        btn_registrar_nota.setForeground(Color.WHITE);
		btn_registrar_nota.setFocusable(false);
		restriccion.gridy = 2;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 1;
		restriccion.weightx = 40; 
		restriccion.fill = GridBagConstraints.CENTER;
		contDatosMateria.add( btn_registrar_nota, restriccion );

		etq_resumen = new JLabel("RESUMEN");
        etq_resumen.setFont( new Font("Arial", Font.BOLD, 20) );
		restriccion.gridy = 3;
		restriccion.gridx = 0;
		restriccion.gridheight = 2;
		restriccion.gridwidth = 4;
		restriccion.weighty = 1;
		restriccion.weightx = 100;
		restriccion.insets = new Insets(10, 0, 10, 0);
		restriccion.fill = GridBagConstraints.CENTER;
		contPrincipal.add( etq_resumen, restriccion );

        Border borderGray = BorderFactory.createMatteBorder(2, 2, 1, 1, Color.decode("#D5D5D5"));

		contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(borderGray);
        
        restriccion.gridy = 5;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 83;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 0, 0, 10);
        contPrincipal.add( scrollPane, restriccion );
                
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);

    

    GridBagConstraints constItems = new GridBagConstraints();
        
        for (int i=0; i<this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.CENTER );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderGris );
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }

        etq_total = new JLabel("Total: 0.0");
        etq_total.setHorizontalAlignment( JLabel.CENTER );
        etq_total.setFont( new Font("Arial", Font.BOLD, 25) );
        etq_total.setOpaque(true);
        etq_total.setBackground( Color.white );
        etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 1;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 0, 10);
        contPrincipal.add( etq_total, restriccion );

        btn_limpiar = new JButton("LIMPIAR");
        btn_limpiar.setBackground(Color.RED);
        btn_limpiar.setForeground(Color.WHITE);
		btn_limpiar.setFocusable(false);
		restriccion.gridy =7;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 1;
		restriccion.weightx = 25;
		restriccion.fill = GridBagConstraints.CENTER;
		contPrincipal.add( btn_limpiar, restriccion );

        add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

		ActionListener evento_click_registrarNota = new ActionListener() {
			public void actionPerformed(ActionEvent event){
				imprimir();
			}
		}; 
		btn_registrar_nota.addActionListener(evento_click_registrarNota);

        
    }

	public void imprimir(){
		String materia = input_campo_materia.getText();
		int creditos = Integer.parseInt(input_campo_credito.getText());
		double notas = Double.parseDouble(input_campo_nota.getText());

		for(int i=0; i<materias.length; i++){
			if(materias[i] != null){
				if(i < materias.length){
					materias[i] = new Materia(materia, creditos, notas);
				}
				notas += materias[i].getNotas() * materias[i].getCreditos();
				creditos += materias[i].getCreditos();
				indiceItems++;
			}
			String text = materias[i].getNombre() + " -> Creditos: " + materias[i].getCreditos() + "-> Nota: " + materias[i].getNotas();
			this.listaJLabels[indiceItems].setText(text);
		}
			
	

		double promedio = notas / creditos;
        etq_total.setText("Total: " + promedio);
	}


}