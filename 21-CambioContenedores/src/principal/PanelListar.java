
package principal;

import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Persona;


public class PanelListar extends javax.swing.JPanel {
    
    DefaultTableModel modelo;
    BaseDatos baseDatos;
    
    public PanelListar(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;

        initComponents();
        initAlterComponents();
        imprimirPersonas();
    }
    
    public void initAlterComponents(){ // el componente visual no debe mezclarse con la lógica
        modelo = (DefaultTableModel) tablaPersonas.getModel();
        
        tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(30);
        tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(300);
        tablaPersonas.getColumnModel().getColumn(3).setPreferredWidth(300);
        tablaPersonas.getColumnModel().getColumn(4).setPreferredWidth(100);
        tablaPersonas.getColumnModel().getColumn(5).setPreferredWidth(200);
        tablaPersonas.getColumnModel().getColumn(6).setPreferredWidth(200);
    }
    
    public void imprimirPersonas(){
        Persona lista [] = baseDatos.extraerPersonas();
        modelo.setRowCount(0);
        for(int i=0; i<lista.length && lista[i]!=null; i++){
            String documento = lista[i].getDocumento();
            String nombres = lista[i].getNombres();
            String apellidos = lista[i].getApellidos();
            String telefono = lista[i].getTelefono();
            String direccion = lista[i].getDireccion();
            String correo = lista[i].getCorreo();
            
            Object datos[] = new Object[]{(i+1),documento, nombres, apellidos, telefono, direccion, correo};
            modelo.addRow(datos);


        }
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE PERSONAS");

        tablaPersonas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Cédula", "Nombres", "Apellidos", "Teléfono", "Dirección", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
