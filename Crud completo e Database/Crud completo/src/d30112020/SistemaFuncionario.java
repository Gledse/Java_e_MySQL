/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d30112020;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gledse_Jamisse
 */
public class SistemaFuncionario extends javax.swing.JFrame {

    public SistemaFuncionario() {
        initComponents();
    }
    Vector x = new Vector();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboIdade = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        radMasculino = new javax.swing.JRadioButton();
        radFemenino = new javax.swing.JRadioButton();
        radOutro = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        butVisualizar = new javax.swing.JButton();
        butRemover = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        butGravar = new javax.swing.JButton();
        butDeletar = new javax.swing.JButton();
        butActualizar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("crud completo - Gledse Jamisse");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel1.setText("Nome");

        jLabel2.setText("Idade");

        jLabel3.setText("ID");

        cboIdade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a idade", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        cboIdade.setToolTipText("Selecione a idade");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        buttonGroup1.add(radMasculino);
        radMasculino.setText("Masculino");
        radMasculino.setToolTipText("Escolha");

        buttonGroup1.add(radFemenino);
        radFemenino.setText("Femenino");
        radFemenino.setToolTipText("Escolha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(radFemenino)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radMasculino)
                    .addComponent(radFemenino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(cboIdade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radOutro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(85, 85, 85)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(radOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        butVisualizar.setText("Visualizar");
        butVisualizar.setToolTipText("Visualizar");
        butVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVisualizarActionPerformed(evt);
            }
        });

        butRemover.setBackground(new java.awt.Color(255, 51, 0));
        butRemover.setForeground(new java.awt.Color(255, 51, 51));
        butRemover.setText("Remover da tabela");
        butRemover.setToolTipText("Remover da tabela");
        butRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butVisualizar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butVisualizar)
                    .addComponent(butRemover))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Capturar.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Idade", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabela.setToolTipText("Selecione a linha para remover da tabela");
        jScrollPane1.setViewportView(tblTabela);

        butGravar.setText("Gravar");
        butGravar.setToolTipText("Gravar");
        butGravar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGravarActionPerformed(evt);
            }
        });

        butDeletar.setBackground(new java.awt.Color(204, 0, 0));
        butDeletar.setForeground(new java.awt.Color(255, 51, 51));
        butDeletar.setText("Deletar");
        butDeletar.setToolTipText("Deletar");
        butDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeletarActionPerformed(evt);
            }
        });

        butActualizar.setText("Actualizar");
        butActualizar.setToolTipText("Actualizar");
        butActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butActualizarActionPerformed(evt);
            }
        });

        butCancelar.setText("Cancelar");
        butCancelar.setToolTipText("Cancelar");
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butGravar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(butGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butCancelar)
                        .addGap(4, 4, 4)
                        .addComponent(butActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butDeletar)))
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(498, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public boolean existeCodigo(int cod){
        
       Objecto k;
       boolean y = false;
        for (int i = 0; i < x.size(); i++) {
            k = (Objecto)x.get(i);
            if(cod == k.getId()){
                y = true;
                i = x.size();
            }
        }return y;
    } 
    private void butGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGravarActionPerformed
        
        Objecto o;
        o = new Objecto();
        

        int cod = Integer.parseInt(txtId.getText());
        String nome = txtNome.getText();
        
        if( existeCodigo(cod) == false && nome != ""){
            
            o.setNome(nome);
            o.setId(cod);
            o.setIdade((String)cboIdade.getSelectedItem());
            
            if(radMasculino.isSelected ()){
                    o.setSexo("Masculino");
                }else{
                    if (radFemenino.isSelected()){
                        o.setSexo("Femenino");
                   }
                }
            x.addElement(o);
        
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
        
            String sql = "insert into usuario(id, nome, idade, sexo) values(?,?,?,?)";
        
            try {
            
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, o.getId());
                stmt.setString(2, o.getNome());
                stmt.setString(3, o.getIdade());
                stmt.setString(4, o.getSexo());
                stmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Os dados foram gravados com sucesso");
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar os dados"+ e.toString());
            }finally {
                ConnectionFactory.closeConnection(con, stmt);
            }
        }    
    }//GEN-LAST:event_butGravarActionPerformed

    private void butDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeletarActionPerformed
  
       Objecto o;
       o = new Objecto();
       
       int resp = JOptionPane.showConfirmDialog(this,"Deseja realmente remover?","Confirma",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       
       if(resp == JOptionPane.YES_OPTION){
          //((DefaultTableModel)tblTabela.getModel()).removeRow(tblTabela.getSelectedRow());
          
          int cod = Integer.parseInt(txtId.getText());
        
          Connection con = ConnectionFactory.getConnection();
          PreparedStatement stmt = null;
        
          String sql = "Delete from usuario where id = ?";
        
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Os dados foram apagados com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar os dados" + e.toString());
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        } 
       }
       else if(resp == JOptionPane.NO_OPTION){
       } 
    }//GEN-LAST:event_butDeletarActionPerformed

    private void butActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butActualizarActionPerformed

        Objecto o;
       o = new Objecto();
       
       int resp = JOptionPane.showConfirmDialog(this,"Deseja realmente Actualizar?","Confirma",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       
       if(resp == JOptionPane.YES_OPTION){
          //((DefaultTableModel)tblTabela.getModel()).removeRow(tblTabela.getSelectedRow());
          
          int cod = Integer.parseInt(txtId.getText());
          String nome = txtNome.getText();
          o.setNome(nome);
          o.setIdade((String)cboIdade.getSelectedItem());
            
            if(radMasculino.isSelected ()){
                    o.setSexo("Masculino");
                }else{
                    if (radFemenino.isSelected()){
                        o.setSexo("Femenino");
                   }
                }
            x.addElement(o);
        
          Connection con = ConnectionFactory.getConnection();
          PreparedStatement stmt = null;
        
          String sql = "update usuario set nome = ?, idade = ?, sexo = ? where id = ?";
        
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, o.getNome());
            stmt.setString(2, o.getIdade());
            stmt.setString(3, o.getSexo());
            stmt.setInt(4, cod);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Os dados foram actualizados com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar os dados" + e.toString());
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        } 
       }
       else if(resp == JOptionPane.NO_OPTION){
       }
       
    }//GEN-LAST:event_butActualizarActionPerformed

    private void butVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVisualizarActionPerformed

       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int cod = Integer.parseInt(txtId.getText());
        
        String sql = "select * from usuario where id = ?";
        
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Objecto ob = new Objecto();
                
                ob.setId(rs.getInt("id"));
                ob.setNome(rs.getString("nome"));
                ob.setIdade(rs.getString("idade"));
                ob.setSexo(rs.getString("sexo"));
                x.add(ob);
                
                DefaultTableModel val = (DefaultTableModel)tblTabela.getModel();
                val.addRow(new String []{ob.getId()+"",ob.getNome(),ob.getIdade(),ob.getSexo()});
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao visualizar os dados"+ e.toString());
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
                
    }//GEN-LAST:event_butVisualizarActionPerformed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed

        txtId.setText("");
        txtNome.setText("");
        cboIdade.setSelectedIndex(-1);
        radMasculino.setSelected(false);
        radFemenino.setSelected(false);
        radOutro.setSelected(true);
    }//GEN-LAST:event_butCancelarActionPerformed

    private void butRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemoverActionPerformed

       int resp = JOptionPane.showConfirmDialog(this,"Deseja realmente remover?","Confirma",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       
       if(resp == JOptionPane.YES_OPTION){
          ((DefaultTableModel)tblTabela.getModel()).removeRow(tblTabela.getSelectedRow());
       }
       else if(resp == JOptionPane.NO_OPTION){
       }
    }//GEN-LAST:event_butRemoverActionPerformed
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butActualizar;
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butDeletar;
    private javax.swing.JButton butGravar;
    private javax.swing.JButton butRemover;
    private javax.swing.JButton butVisualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboIdade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radFemenino;
    private javax.swing.JRadioButton radMasculino;
    private javax.swing.JRadioButton radOutro;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
