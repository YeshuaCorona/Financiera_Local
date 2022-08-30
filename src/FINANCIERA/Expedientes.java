/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINANCIERA;
import java.io.IOException;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Metodos_Sql.ConexionBD;
import java.sql.ResultSet;
import metodos2.Exportar;


public class Expedientes extends javax.swing.JFrame {
    Exportar obj;
    ConexionBD con = new ConexionBD();
    Connection cn = con.conectar();
    Statement orden;
    ResultSet r;
    DefaultTableModel model;
    
    public Expedientes() {
        initComponents();
         this.setTitle("Expedientes");
        this.setLocation(600, 200);
        mostrartabla();
    }
    
   
    
    
  void mostrartabla(){
  DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("id");// aqui cambias los nombres de los campos que quieres en la tabla
  modelo.addColumn("Nombre cliente");
   modelo.addColumn("Numero de cliente");
    modelo.addColumn("Cat_Actividad");
     modelo.addColumn("Numero de credito");
      modelo.addColumn("CatCaja");
       modelo.addColumn("Tipo de Credito");
        modelo.addColumn("Tipo Cartera");
         modelo.addColumn("Monto Otorgado");
          modelo.addColumn("Numero de Contrato");
           modelo.addColumn("Monto_Auto");
            modelo.addColumn("Monto Ejercido");
             modelo.addColumn("Cat_Cod_Inv");
              modelo.addColumn("Status Contable");
               modelo.addColumn("CatSta");
                modelo.addColumn("Montos Otor");
                 modelo.addColumn("Cartera");
                  modelo.addColumn("Castiga");
                   modelo.addColumn("PequePro");
                   modelo.addColumn("Fecha Apertura");
                  modelo.addColumn("Fecha Vencimiento");
                   modelo.addColumn("Fecha_ministra");
       tabladatos.setModel(modelo);
       
       String sql;
        sql = "SELECT * FROM campos";
    String datos[] = new String [22];
    Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
             datos[2]=rs.getString(3);
              datos[3]=rs.getString(4);
               datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                 datos[6]=rs.getString(7);
                  datos[7]=rs.getString(8);
                   datos[8]=rs.getString(9);
                    datos[9]=rs.getString(10);
                     datos[10]=rs.getString(11);
                      datos[11]=rs.getString(12);
                       datos[12]=rs.getString(13);
                        datos[13]=rs.getString(14);
                         datos[14]=rs.getString(15);
                          datos[15]=rs.getString(16);
                           datos[16]=rs.getString(17);
                            datos[17]=rs.getString(18);
                             datos[18]=rs.getString(19);
                             datos[19]=rs.getString(20);
                             datos[20]=rs.getString(21);
                             datos[21]=rs.getString(22);
                             modelo.addRow(datos);
            }
            tabladatos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Expedientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }

  public void buscarAlumno (String texto){
  try{
      String [] titulos = {"id" , "Nombre cliente" , "Numero de cliente", "Cat_Actividad", "Numero de credito", "CatCaja", "Tipo de Credito", "Tipo Cartera", "Monto Otorgado", "Numero de Contrato", "Monto_Auto", "Monto Ejercido", "Cat_Cod_Inv", "Status Contable", "catsta", "montootor", "Cartera", "Castiga", "pequePro", "Fecha Apertura", "Fecha Vencimiento", "Fecha_ministra"};
      String filtro = ""+texto+"%";
      String SQL= "SELECT * FROM campos WHERE nomcre LIKE "+'"'+filtro+'"';
      System.out.println(SQL);
      model = new DefaultTableModel(null,titulos);
      orden = cn.prepareStatement(SQL);
      ResultSet rs = orden.executeQuery(SQL);
     String [] fila = new String [22];
      while(rs.next()){
          fila[0]=rs.getString("id");
          fila[1]=rs.getString("ndc");
          fila[2]=rs.getString("nc");
          fila[3]=rs.getString("ac");
          fila[4]=rs.getString("nomcre");
          fila[5]=rs.getString("catcaja");
          fila[6]=rs.getString("tipocre");
          fila[7]=rs.getString("tipocar");
          fila[8]=rs.getString("montomi");
          fila[9]=rs.getString("numcontra");
          fila[10]=rs.getString("montoauto");
          fila[11]=rs.getString("montoeje");
          fila[12]=rs.getString("catinv");
          fila[13]=rs.getString("stascon");
          fila[14]=rs.getString("catsta");
          fila[15]=rs.getString("montootor");
          fila[16]=rs.getString("carte");
          fila[17]=rs.getString("castiga");
          fila[18]=rs.getString("pequepro");
          fila[19]=rs.getString("ca1");
          fila[20]=rs.getString("ca2");
          fila[21]=rs.getString("ca3");
      
          model.addRow(fila);
      }
      tabladatos.setModel(model);
      rs.close();
      orden.close();
      
  } catch (Exception e){
      System.err.println(""+e.getMessage());
  
  }
  
  
  }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        datosexportar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtbusqueda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txbuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1480, 310));

        jLabel1.setText("Registro de expedientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        datosexportar.setText("Exportar a Excel");
        datosexportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosexportarActionPerformed(evt);
            }
        });
        getContentPane().add(datosexportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 120, 30));

        jButton3.setText("Volver");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 70, 30));

        txtbusqueda.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbusquedaCaretUpdate(evt);
            }
        });
        getContentPane().add(txtbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 130, 20));

        jLabel2.setText("Busqueda por ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 20));

        txbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbuscarActionPerformed(evt);
            }
        });
        txbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 90, -1));

        jLabel3.setText("Numero de Credito");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
    frm_sistema Expedientes =new frm_sistema();
     Expedientes.setVisible(true);
     this.dispose();
        
        
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void datosexportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosexportarActionPerformed
    
        try{
            obj =new Exportar();
            obj.exportarExcel(tabladatos);
    
    }catch (IOException ex){
    
    
    }
        
        
    }//GEN-LAST:event_datosexportarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtbusquedaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbusquedaCaretUpdate
     String valor = txtbusqueda.getText();
     if(valor.isEmpty()){
     tabladatos.clearSelection();
     
     }else{
         for (int i = 0; i<tabladatos.getRowCount(); i++){
             if(tabladatos.getValueAt(i, 0).equals(valor)){
          
             tabladatos.changeSelection(i, 0, false, false);
             
             }
         }
         
     }
    }//GEN-LAST:event_txtbusquedaCaretUpdate

    private void txbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbuscarKeyReleased
     String buscar = txbuscar.getText();
     buscarAlumno(buscar);
    }//GEN-LAST:event_txbuscarKeyReleased

    private void txbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbuscarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expedientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datosexportar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txbuscar;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables
}
