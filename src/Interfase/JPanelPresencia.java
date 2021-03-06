/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfase;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import operaciones.Operaciones;
import operaciones.clsFuncionario;


/**
 *
 * @author Usuario
 */
public class JPanelPresencia extends javax.swing.JPanel {
    private DefaultTableModel model;
    private Justificaciones justifica;
    private String[] cosa;
    private ArrayList borrados = new ArrayList();
    iCorregir corrige;
    int turno=0;
    int filaDeLaTabla = 0;

    /**
     * Creates new form JPanelPresencia
     */
    public JPanelPresencia() {
        initComponents();
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePresencia = new javax.swing.JTable();
        jFechaPesencia = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelLibre2 = new javax.swing.JLabel();
        jComboTurnoPresencia = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButtonGuardarPresencia = new javax.swing.JButton();
        jButtonGuardarPresencia1 = new javax.swing.JButton();
        jButtonCorregir = new javax.swing.JButton();
        jButtonCorregir1 = new javax.swing.JButton();

        jTablePresencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Chapa", "Nombre", "Apellido"
            }
        ));
        jTablePresencia.setName(""); // NOI18N
        jTablePresencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePresenciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePresencia);

        jFechaPesencia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jFechaPesencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFechaPesenciaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Fecha:");

        jLabelLibre2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabelLibre2.setText("Turno:");

        jComboTurnoPresencia.setEditable(true);
        jComboTurnoPresencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboTurnoPresencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matutino", "Vespertino", "Nocturno" }));
        jComboTurnoPresencia.setMinimumSize(null);
        jComboTurnoPresencia.setName(""); // NOI18N
        jComboTurnoPresencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTurnoPresenciaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Presencia");

        jButtonGuardarPresencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGuardarPresencia.setText("Guardar");

        jButtonGuardarPresencia1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGuardarPresencia1.setText("No Presente");
        jButtonGuardarPresencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarPresencia1ActionPerformed(evt);
            }
        });

        jButtonCorregir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCorregir.setText("Corregir");
        jButtonCorregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorregirActionPerformed(evt);
            }
        });

        jButtonCorregir1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCorregir1.setText("Cancelar");
        jButtonCorregir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorregir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 498, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jFechaPesencia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelLibre2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboTurnoPresencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCorregir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCorregir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonGuardarPresencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButtonGuardarPresencia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFechaPesencia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLibre2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboTurnoPresencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarPresencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardarPresencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCorregir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCorregir1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
        
    private void jFechaPesenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFechaPesenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaPesenciaActionPerformed

    public void rellenarTabla(String[] correccion){
        this.cosa = correccion;
        this.model.addRow(correccion);
        this.jTablePresencia.setModel(model);
    
    }
    
    private void jComboTurnoPresenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTurnoPresenciaActionPerformed
           int i=0;
           Operaciones operac = new Operaciones();
           ArrayList func = new ArrayList();
        
         turno = jComboTurnoPresencia.getSelectedIndex();
               
        func = operac.listarTurno(operac.normalizaSetTurno(turno));
            String[] titulos = {"Chapa", "Nombre", "Apellido"}; 
              model = new DefaultTableModel(null, titulos){
                  @Override
                  public boolean isCellEditable(int row, int column) {
                   //all cells false
                  return false;
                  }
              };
              String[] fila = new String[3];
              clsFuncionario claseFuncionario = new clsFuncionario();
              for (i=0; i<func.size(); i++){
              claseFuncionario = (clsFuncionario) func.get(i);
              
              fila[0] = Integer.toString(claseFuncionario.getChapa());
              fila[1] = claseFuncionario.getNombre();
              fila[2] = claseFuncionario.getApellido();
                                        
              model.addRow(fila);
              }
             this.jTablePresencia.setModel(model);
                
    }//GEN-LAST:event_jComboTurnoPresenciaActionPerformed

    private void jTablePresenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePresenciaMouseClicked
          String[] DatosDeBorrados = new String[3];
        
            if (evt.getClickCount() == 2 && !evt.isConsumed()){
            this.filaDeLaTabla = jTablePresencia.getSelectedRow();
            
            DatosDeBorrados[0] = (String) model.getValueAt(filaDeLaTabla, 0);
            DatosDeBorrados[1] = (String) model.getValueAt(filaDeLaTabla, 1);
            DatosDeBorrados[2] = (String) model.getValueAt(filaDeLaTabla, 2);
            
            this.borrados.add(DatosDeBorrados);
            
            model.removeRow(filaDeLaTabla);
            this.jTablePresencia.setModel(model);
        }
    }//GEN-LAST:event_jTablePresenciaMouseClicked

    private void jButtonGuardarPresencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarPresencia1ActionPerformed
        justifica = new Justificaciones();
        justifica.setVisible(true);
    }//GEN-LAST:event_jButtonGuardarPresencia1ActionPerformed

    private void jButtonCorregirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorregirActionPerformed
        this.corrige = new iCorregir(borrados, this);
        corrige.setLocationRelativeTo(null);
        corrige.setVisible(true);
    }//GEN-LAST:event_jButtonCorregirActionPerformed

    private void jButtonCorregir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorregir1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCorregir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonCorregir;
    private javax.swing.JButton jButtonCorregir1;
    private javax.swing.JButton jButtonGuardarPresencia;
    private javax.swing.JButton jButtonGuardarPresencia1;
    public javax.swing.JComboBox jComboTurnoPresencia;
    public javax.swing.JFormattedTextField jFechaPesencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLibre2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTablePresencia;
    // End of variables declaration//GEN-END:variables
}
