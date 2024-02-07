
package principal;

public class CalcularPromedio extends javax.swing.JFrame {
     Materia [] materias;
     int notas;

    
    public CalcularPromedio() {
        this.materias = new Materia[50];
        initComponents();
        setTitle("Calcular Promedio");
        setVisible(true);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etq_materia = new javax.swing.JLabel();
        campo_materia = new javax.swing.JTextField();
        etq_creditos = new javax.swing.JLabel();
        campo_creditos = new javax.swing.JTextField();
        etq_nota = new javax.swing.JLabel();
        campo_nota = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        etq_resumen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etq_resultado = new javax.swing.JLabel();
        etq_total = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 600));
        setResizable(false);

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        etq_titulo.setText("CALCULAR PROMEDIO");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        etq_materia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_materia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_materia.setText("Creditos:");

        campo_materia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        etq_creditos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_creditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_creditos.setText("Materia:");

        campo_creditos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        etq_nota.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_nota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nota.setText("Nota:");

        campo_nota.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_registrar.setBackground(new java.awt.Color(0, 0, 255));
        btn_registrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.setActionCommand("");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(etq_creditos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etq_nota)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campo_nota, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(campo_materia))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_materia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campo_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_materia)
                    .addComponent(etq_creditos)
                    .addComponent(campo_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nota)
                    .addComponent(campo_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        etq_resumen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_resumen.setText("RESUMEN");

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());

        etq_resultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_resultado.setText("----");
        jScrollPane1.setViewportView(etq_resultado);

        etq_total.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_total.setText("Total: 0.0");

        btn_limpiar.setBackground(new java.awt.Color(204, 0, 0));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.setActionCommand("");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(etq_titulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(etq_resumen)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etq_total, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(etq_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_resumen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String nombre = campo_materia.getText();
        double creditos = Double.parseDouble(campo_creditos.getText());
        double nota = Double.parseDouble(campo_nota.getText());
        
        for(int i=0; i<materias.length; i++){
            if(materias[i] == null){
                materias[i] = new Materia(nombre, creditos, nota);
                notas += nota * creditos;
                creditos += creditos;
                break;  
            }
            
        }
        String html ="<html>";
        for(int i=0; i<materias.length; i++){
            if(i==0 || materias[i] != null){
                html += materias[i].getNombre()+ " -> Creditos: "+materias[i].getCreditos()+ " -> Nota: "+materias[i].getNota()+"<br>";
            }
        }
        
        html += "</html>";
        etq_resultado.setText(html);
        double promedio = notas / creditos;
        etq_total.setText("Total: "+promedio);
        
        campo_materia.setText("");
        campo_creditos.setText("");
        campo_nota.setText("");
        campo_materia.requestFocus();
        
        
      
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        campo_materia.setText("");
        campo_creditos.setText("");
        campo_nota.setText("");
        etq_resultado.setText(" ");
        etq_total.setText(" ");
    }//GEN-LAST:event_btn_limpiarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_creditos;
    private javax.swing.JTextField campo_materia;
    private javax.swing.JTextField campo_nota;
    private javax.swing.JLabel etq_creditos;
    private javax.swing.JLabel etq_materia;
    private javax.swing.JLabel etq_nota;
    private javax.swing.JLabel etq_resultado;
    private javax.swing.JLabel etq_resumen;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel etq_total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
