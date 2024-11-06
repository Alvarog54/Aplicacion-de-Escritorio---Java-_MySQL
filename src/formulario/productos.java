/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Liz cathry
 */
public class productos extends javax.swing.JFrame {
Connection co = conexion.conectar();
    /**
     * Creates new form productos
     */
    public productos() {
        initComponents();
        setLocationRelativeTo(null);
        listarproductos();
        
    }

   
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombreproducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtprecioproducto = new javax.swing.JTextField();
        btnagregarproducto = new javax.swing.JButton();
        btnactualizarproducto = new javax.swing.JButton();
        btneliminarproducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        txtstockproducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Productos");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Id Producto:");

        txtidproducto.setEditable(false);
        txtidproducto.setEnabled(false);
        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre Producto:");

        txtnombreproducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnombreproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreproductoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Precio (Valor Unitario):");

        txtprecioproducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnagregarproducto.setFont(new java.awt.Font("Lucida Console", 1, 10)); // NOI18N
        btnagregarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo_producto32.png"))); // NOI18N
        btnagregarproducto.setText("Agregar");
        btnagregarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarproductoActionPerformed(evt);
            }
        });

        btnactualizarproducto.setFont(new java.awt.Font("Lucida Console", 1, 10)); // NOI18N
        btnactualizarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar32.png"))); // NOI18N
        btnactualizarproducto.setText("Actualizar");
        btnactualizarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarproductoActionPerformed(evt);
            }
        });

        btneliminarproducto.setFont(new java.awt.Font("Lucida Console", 1, 10)); // NOI18N
        btneliminarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar32.png"))); // NOI18N
        btneliminarproducto.setText("Eliminar");
        btneliminarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarproductoActionPerformed(evt);
            }
        });

        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "NOMBRE PRODUCTO", "VALOR UNITARIO", "STOCK"
            }
        ));
        tablaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaproductos);
        if (tablaproductos.getColumnModel().getColumnCount() > 0) {
            tablaproductos.getColumnModel().getColumn(0).setMinWidth(60);
            tablaproductos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tablaproductos.getColumnModel().getColumn(0).setMaxWidth(60);
            tablaproductos.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        txtstockproducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Stock (Existencia):");

        btnlimpiar.setFont(new java.awt.Font("Lucida Console", 1, 10)); // NOI18N
        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar32.png"))); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtnombreproducto, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(txtprecioproducto)
                    .addComponent(txtstockproducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnactualizarproducto)
                    .addComponent(btnagregarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnagregarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnactualizarproducto)
                        .addGap(5, 5, 5)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btneliminarproducto)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtprecioproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtstockproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnlimpiar))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void btnagregarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarproductoActionPerformed
        // TODO add your handling code here:
        agregarproducto();
        limpiar();
        limpiartabla();
        listarproductos();
    }//GEN-LAST:event_btnagregarproductoActionPerformed

    
    //pasar el registro seleccionado a las cajas de texto
    private void tablaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductosMouseClicked
                                                   
        int filaseleccionada = tablaproductos.rowAtPoint(evt.getPoint());
        
        txtidproducto.setText(tablaproductos.getValueAt(filaseleccionada,0).toString());
        txtnombreproducto.setText(tablaproductos.getValueAt(filaseleccionada,1).toString());
        txtprecioproducto.setText(tablaproductos.getValueAt(filaseleccionada,2).toString());
        txtstockproducto.setText(tablaproductos.getValueAt(filaseleccionada,3).toString());
       
    }//GEN-LAST:event_tablaproductosMouseClicked

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        limpiartabla();
        listarproductos();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnactualizarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarproductoActionPerformed
        // TODO add your handling code here:
        actualizarproducto();
        limpiar();
        limpiartabla();
        listarproductos();
    }//GEN-LAST:event_btnactualizarproductoActionPerformed

    private void txtnombreproductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproductoKeyReleased
       
        limpiartabla();
        //enviar dato a buscar al metodo buscarproducto
         buscarproducto(txtnombreproducto.getText());
    }//GEN-LAST:event_txtnombreproductoKeyReleased

    private void btneliminarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarproductoActionPerformed
        // TODO add your handling code here:
        eliminarproducto();        
        limpiartabla();
        limpiar();
        listarproductos();
        
    }//GEN-LAST:event_btneliminarproductoActionPerformed

     //insertar nuevo producto a la base de datos
    public void agregarproducto(){
    String sql ="insert into productos(nombreproducto,precioproducto,stockproducto)values(?,?,?)";
    
   
        try {
            PreparedStatement pst=co.prepareStatement(sql);
            
            pst.setString(1,txtnombreproducto.getText());
            pst.setDouble(2,Double.parseDouble(txtprecioproducto.getText()));
            pst.setString(3,txtstockproducto.getText());
           
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"producto guardado");
          
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error, producto no guardado  "+ e.getMessage());
        }
}


//agregar los productos a la yabla 
public void listarproductos(){
     Statement st;
      ResultSet rs;
     DefaultTableModel modelo;
        String sql="select *from productos";
        try{
            
            st=co.createStatement();
            rs=st.executeQuery(sql);
            Object[]productos=new Object[5];
            modelo=(DefaultTableModel)tablaproductos.getModel();
            while(rs.next()){
                productos[0]=rs.getInt("idproducto");
                productos[1]=rs.getString("nombreproducto");
                productos[2]=rs.getString("precioproducto");
                productos[3]=rs.getString("stockproducto");
                
                modelo.addRow(productos);
            }
            tablaproductos.setModel(modelo);
        } catch (SQLException e) {
       
    }
    }

//actualizar producto en la base de datos

public void actualizarproducto(){ 
    try{
        
    
    PreparedStatement pps=co.prepareStatement("update productos set nombreproducto='"+txtnombreproducto.getText()+"',precioproducto='"+txtprecioproducto.getText()+"',stockproducto='"+txtstockproducto.getText()+"' where idproducto ='"+txtidproducto.getText()+"'");
    
    pps.executeUpdate();
    JOptionPane.showMessageDialog(null,"datos actualizados");
    
    }     catch (HeadlessException | SQLException e) {
              
               JOptionPane.showMessageDialog(null,"Error, Datos no guardados  "+ e.getMessage());
          }
            
        
    
   

}

//limpiar tabla productos
 public void limpiartabla(){
      
      DefaultTableModel model =(DefaultTableModel)tablaproductos.getModel();
      model.setRowCount(0);
    
        }
 
 //
 public void buscarproducto(String valor){
     Statement st;
      ResultSet rs;
     DefaultTableModel modelo;
        String sql="select *  from productos where nombreproducto like '%"+valor+"%'";
        try{
            
            st=co.createStatement();
            rs=st.executeQuery(sql);
            Object[]productos=new Object[5];
            modelo=(DefaultTableModel)tablaproductos.getModel();
            while(rs.next()){
                productos[0]=rs.getInt("idproducto");
                productos[1]=rs.getString("nombreproducto");
                productos[2]=rs.getString("precioproducto");
                productos[3]=rs.getString("stockproducto");
                
                modelo.addRow(productos);
            }
            tablaproductos.setModel(modelo);
        } catch (SQLException e) {
       
    }
    
 }
 
 //eliminar el producto seleccionado en la tabla
 public void eliminarproducto(){
    int fila =tablaproductos.getSelectedRow();
    
    try{
        String sql ="delete from productos where idproducto="+tablaproductos.getValueAt(fila, 0);
        Statement st=co.createStatement();
        int n =st.executeUpdate(sql);
        if(n>= 0){
            JOptionPane.showMessageDialog(null,"Producto Eliminado");
           
           
        }
    }     catch (HeadlessException | SQLException e) {
             JOptionPane.showMessageDialog(null,"Error, no se puedo eliminar el producto "+e.getMessage());
          }
}
    
    //limpiar las cajas de texto
    public void limpiar(){
    txtidproducto.setText("");
    txtnombreproducto.setText("");
    txtprecioproducto.setText("");
    txtstockproducto.setText("");
    
}
    
    
    
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
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new productos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizarproducto;
    private javax.swing.JButton btnagregarproducto;
    private javax.swing.JButton btneliminarproducto;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaproductos;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtnombreproducto;
    private javax.swing.JTextField txtprecioproducto;
    private javax.swing.JTextField txtstockproducto;
    // End of variables declaration//GEN-END:variables
}
