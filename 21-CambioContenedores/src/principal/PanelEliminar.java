
package principal;
import utils.BaseDatos;
import utils.Persona;

public class PanelEliminar extends javax.swing.JPanel {
    
    BaseDatos basedatos;
    
    public PanelEliminar(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoDocumentoEliminar = new javax.swing.JTextField();
        btnBuscarEliminar = new javax.swing.JButton();
        campoCorreoEliminar = new javax.swing.JTextField();
        campoTelefonoEliminar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoNombreEliminar = new javax.swing.JTextField();
        campoApellidosEliminar = new javax.swing.JTextField();
        campoDireccionEliminar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnCacelarEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(204, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("PANEL ELIMINAR");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Documento: ");

        campoDocumentoEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBuscarEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscarEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarEliminar.setText("BUSCAR");
        btnBuscarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDocumentoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnBuscarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoDocumentoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        campoCorreoEliminar.setEditable(false);
        campoCorreoEliminar.setBackground(new java.awt.Color(255, 255, 255));
        campoCorreoEliminar.setForeground(new java.awt.Color(0, 0, 0));
        campoCorreoEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoTelefonoEliminar.setEditable(false);
        campoTelefonoEliminar.setBackground(new java.awt.Color(255, 255, 255));
        campoTelefonoEliminar.setForeground(new java.awt.Color(0, 0, 0));
        campoTelefonoEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellidos: ");

        campoNombreEliminar.setEditable(false);
        campoNombreEliminar.setBackground(new java.awt.Color(255, 255, 255));
        campoNombreEliminar.setForeground(new java.awt.Color(0, 0, 0));
        campoNombreEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoApellidosEliminar.setEditable(false);
        campoApellidosEliminar.setBackground(new java.awt.Color(255, 255, 255));
        campoApellidosEliminar.setForeground(new java.awt.Color(0, 0, 0));
        campoApellidosEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoDireccionEliminar.setEditable(false);
        campoDireccionEliminar.setBackground(new java.awt.Color(255, 255, 255));
        campoDireccionEliminar.setForeground(new java.awt.Color(0, 0, 0));
        campoDireccionEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombres: ");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono: ");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dirección: ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Correo: ");

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCacelarEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnCacelarEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCacelarEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnCacelarEliminar.setText("CANCELAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(campoNombreEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCacelarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(campoDireccionEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTelefonoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoApellidosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(campoCorreoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombreEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campoApellidosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefonoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(campoDireccionEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoCorreoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnCacelarEliminar))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEliminarActionPerformed
        String documento = campoDocumentoEliminar.getText();
        if(documento != null){
             Persona temporal = basedatos.buscarPersona(documento); 
            if(temporal != null){
                campoNombreEliminar.setText(temporal.getNombres());
                campoApellidosEliminar.setText(temporal.getApellidos());
                campoTelefonoEliminar.setText(temporal.getTelefono());
                campoDireccionEliminar.setText(temporal.getDireccion());
                campoCorreoEliminar.setText(temporal.getCorreo()); 
                
                campoNombreEliminar.setEnabled(true);
                campoApellidosEliminar.setEnabled(true);
                campoTelefonoEliminar.setEnabled(true);
                campoDireccionEliminar.setEnabled(true);
                campoCorreoEliminar.setEnabled(true);
                btnEliminar.setEnabled(true);
            }else {
                Alerta ventana = new Alerta("La persona no existe. ");
                btnEliminar.setEnabled(false);
                campoDocumentoEliminar.setText("");
                campoNombreEliminar.setText("");
                campoApellidosEliminar.setText("");
                campoTelefonoEliminar.setText("");
                campoDireccionEliminar.setText("");
                campoCorreoEliminar.setText("");
            
            }
        }
           
    }//GEN-LAST:event_btnBuscarEliminarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String documento = campoDocumentoEliminar.getText();
        String nombres = campoNombreEliminar.getText();
        boolean eliminar = basedatos.eliminarPersona(documento);
        if(eliminar){
            Confirmacion ventana2 = new Confirmacion("Eliminado correctamente "+nombres);  
            btnEliminar.setEnabled(false);
            campoDocumentoEliminar.setText("");
            campoNombreEliminar.setText("");
            campoApellidosEliminar.setText("");
            campoTelefonoEliminar.setText("");
            campoDireccionEliminar.setText("");
            campoCorreoEliminar.setText("");
        }else {
            Alerta ventana3 = new Alerta("La persona no se pudo eliminar");  
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEliminar;
    private javax.swing.JButton btnCacelarEliminar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField campoApellidosEliminar;
    private javax.swing.JTextField campoCorreoEliminar;
    private javax.swing.JTextField campoDireccionEliminar;
    private javax.swing.JTextField campoDocumentoEliminar;
    private javax.swing.JTextField campoNombreEliminar;
    private javax.swing.JTextField campoTelefonoEliminar;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
