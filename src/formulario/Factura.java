
package formulario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Factura extends javax.swing.JFrame {
   
   
   
    
     DefaultTableModel modelo;
    Connection co = conexion.conectar();


   
    public Factura() {
        initComponents();
        setLocationRelativeTo(null);
        llenarcombo();       
        horafecha();
        seriefactura();
        
      
        
    }
    
    
    
  
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbhora = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbserie = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidencliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombrecliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdireccioncliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttelefonocliente = new javax.swing.JTextField();
        txtbuscarcliente = new javax.swing.JButton();
        btnlimpiarcliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comboproducto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtvalorproducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spicantidad = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtstockproducto = new javax.swing.JTextField();
        btnagregarproducto = new javax.swing.JButton();
        btneliminarproducto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txttotalproducto = new javax.swing.JTextField();
        btnlimpiarproductos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablafactura = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txttotalfactura = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factura");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbhora.setText("jLabel14");

        jLabel13.setText("HORA:");

        lbfecha.setText("jLabel12");

        jLabel11.setText("FECHA:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("FACTURA N°");

        lbserie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbserie.setText("jLabel17");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbserie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(lbfecha)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbhora)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbhora)
                    .addComponent(jLabel13)
                    .addComponent(lbfecha)
                    .addComponent(jLabel11)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lbserie))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 102, 0))); // NOI18N

        jLabel1.setText("IDENTIFICACION:");

        jLabel2.setText("NOMBRE:");

        txtnombrecliente.setEditable(false);

        jLabel3.setText("DIRECCION / CORREO:");

        txtdireccioncliente.setEditable(false);

        jLabel4.setText("TELEFONO:");

        txttelefonocliente.setEditable(false);

        txtbuscarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar32.png"))); // NOI18N
        txtbuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarclienteActionPerformed(evt);
            }
        });

        btnlimpiarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar32.png"))); // NOI18N
        btnlimpiarcliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlimpiarcliente.setIconTextGap(0);
        btnlimpiarcliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnlimpiarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttelefonocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtidencliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlimpiarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 194, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidencliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(txtbuscarcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiarcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelefonocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 0))); // NOI18N

        jLabel5.setText("PRODUCTO:");

        comboproducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboproductoItemStateChanged(evt);
            }
        });
        comboproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboproductoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboproductoMouseReleased(evt);
            }
        });

        jLabel6.setText("VALOR UNITARIO:");

        txtvalorproducto.setEditable(false);

        jLabel7.setText("CANTIDAD:");

        spicantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spicantidadStateChanged(evt);
            }
        });
        spicantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spicantidadMouseClicked(evt);
            }
        });

        jLabel8.setText("STOCK / EXISTENCIA:");

        txtstockproducto.setEditable(false);
        txtstockproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockproductoActionPerformed(evt);
            }
        });

        btnagregarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar32.png"))); // NOI18N
        btnagregarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarproductoActionPerformed(evt);
            }
        });

        btneliminarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exit32.png"))); // NOI18N
        btneliminarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarproductoActionPerformed(evt);
            }
        });

        jLabel9.setText("TOTAL:");

        txttotalproducto.setEditable(false);
        txttotalproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalproductoActionPerformed(evt);
            }
        });

        btnlimpiarproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar32.png"))); // NOI18N
        btnlimpiarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarproductosActionPerformed(evt);
            }
        });

        tablafactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "CANTIDAD", "VALOR UNITARIO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablafactura);
        if (tablafactura.getColumnModel().getColumnCount() > 0) {
            tablafactura.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablafactura.getColumnModel().getColumn(2).setPreferredWidth(80);
            tablafactura.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablafactura.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jLabel10.setText("ID PRODUCTO:");

        txtidproducto.setEditable(false);
        txtidproducto.setEnabled(false);

        jLabel12.setText("Total A Pagar:");

        txttotalfactura.setEditable(false);

        jLabel14.setText("SubTotal:");

        txtsubtotal.setEditable(false);

        jLabel15.setText("IVA:");

        txtiva.setEditable(false);

        jButton1.setText("generar venta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtvalorproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboproducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtstockproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spicantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotalproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(btnagregarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlimpiarproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel14))
                    .addComponent(jLabel15)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttotalfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(txtstockproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtvalorproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(spicantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txttotalproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btneliminarproducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpiarproductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnagregarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txttotalfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarclienteActionPerformed
        // TODO add your handling code here:
        buscarcliente();
    }//GEN-LAST:event_txtbuscarclienteActionPerformed

    
    
    
    
    
    
    private void btnlimpiarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarclienteActionPerformed
      
        limpiarcliente();
    }//GEN-LAST:event_btnlimpiarclienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            buscarstock();
            //actualizarstock();
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }

        Impresion impre = new Impresion();
        impre.setVisible(true);
        
        //mandar los datos del formulario al panel para imprimir
        Impresion.lbserie2.setText(lbserie.getText());
        Impresion.lbcliente1.setText(txtnombrecliente.getText());
        Impresion.lbidenticacion2.setText(txtidencliente.getText());
        Impresion.lbtelefono2.setText(txttelefonocliente.getText());
        Impresion.lbdireccion2.setText(txtdireccioncliente.getText());
        Impresion.lbtotal2.setText(txttotalfactura.getText());
        Impresion.lbtotal3.setText(txttotalfactura.getText());
        Impresion.lbfecha2.setText(lbfecha.getText());
        Impresion.lbhora2.setText(lbhora.getText());
        
       
        //enviar datos de la tabla a otra
        for(int i=0;i<tablafactura.getRowCount();i++){
             String datos[]=new String[5];
            datos[0]=tablafactura.getValueAt(i,0).toString();
            datos[1]=tablafactura.getValueAt(i,1).toString();
            datos[2]=tablafactura.getValueAt(i,2).toString();
            datos[3]=tablafactura.getValueAt(i,3).toString();
            datos[4]=tablafactura.getValueAt(i,4).toString();
            Impresion.modelo2.addRow(datos);            
        }

        guardarfactura();
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnlimpiarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarproductosActionPerformed
        // TODO add your handling code here:
        limpiartabla();
        limpiarproducto();
        calculartotaltabla();
    }//GEN-LAST:event_btnlimpiarproductosActionPerformed

    private void txttotalproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalproductoActionPerformed

    }//GEN-LAST:event_txttotalproductoActionPerformed

    private void btneliminarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarproductoActionPerformed
        // TODO add your handling code here:
        elimimarfila();
        
        limpiarproducto();
        calculartotaltabla();
    }//GEN-LAST:event_btneliminarproductoActionPerformed

    private void btnagregarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarproductoActionPerformed
        agregarproductotabla();

    }//GEN-LAST:event_btnagregarproductoActionPerformed

    private void txtstockproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockproductoActionPerformed

    }//GEN-LAST:event_txtstockproductoActionPerformed

    private void spicantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spicantidadMouseClicked

    }//GEN-LAST:event_spicantidadMouseClicked

    private void spicantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spicantidadStateChanged

        cantidad();
    }//GEN-LAST:event_spicantidadStateChanged

    private void comboproductoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboproductoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboproductoMouseReleased

    private void comboproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboproductoMouseClicked

    }//GEN-LAST:event_comboproductoMouseClicked

    private void comboproductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboproductoItemStateChanged

        buscarproducto();
    }//GEN-LAST:event_comboproductoItemStateChanged
    
    
   //asignar la hora y fecha a los label 
   
    public void horafecha(){
       Calendar Hora = Calendar.getInstance();
       Calendar Fecha = Calendar.getInstance();
       
       int hora,minutos,segundos,dia,mes,ano;
       String fechaActual,horaactual;
       
       hora=Hora.get(Calendar.HOUR_OF_DAY);
       minutos =Hora.get(Calendar.MINUTE);
       segundos = Hora.get(Calendar.SECOND);
       horaactual = hora +":"+minutos+":"+segundos;
       
       dia = Fecha.get(Calendar.DATE);
       mes= Fecha.get(Calendar.MONTH);
       ano= Fecha.get(Calendar.YEAR);
       fechaActual = dia+"/"+(mes+1)+"/"+ano;
       lbfecha.setText(fechaActual);
       lbhora.setText(horaactual);
               
    }
    
    
    
    // cacular el total de la venta 
    public void calculartotaltabla(){
       double suma = 0;
       double iva =0;
       double subtotal = 0;
       
        for (int i =0; i< tablafactura.getRowCount();i++){
          double renglon;
            renglon= Double.parseDouble(tablafactura.getValueAt(i,4).toString());
              
            suma = suma + renglon;
            iva=suma*0.21;
             subtotal = suma-iva;
            
            
        }
        txtsubtotal.setText(String.valueOf(subtotal));
        txtiva.setText(String.valueOf(iva));
        txttotalfactura.setText(String.valueOf(suma));
        
    }
 
    
    
//limpiar campos y dejar listo para agregar otro producto
    public void limpiarproducto(){
        spicantidad.setValue(0);
       comboproducto.setSelectedIndex(0);
       txtstockproducto.setText("");
       txtidproducto.setText("");
       txttotalproducto.setText("");
       txtvalorproducto.setText("");
       }
    
    
    //limpiar las cajas de texto del cliente
    public void limpiarcliente(){
        txtidencliente.setText("");
        txtnombrecliente.setText("");
                txtdireccioncliente.setText("");
                txttelefonocliente.setText("");
       }
    
    
//buscar cliente por cedula en la caja de texto identificacion
    public void buscarcliente(){
        String sql ="select * from clientes where identificacion=?";
    
   
        try {
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setString(1,txtidencliente.getText());
            ResultSet rs = ps.executeQuery();
            if(txtidencliente.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "campo esta vacio");
            }else{
            if (rs.next()) {
                txtidencliente.setText(String.valueOf(rs.getInt("identificacion")));
                txtnombrecliente.setText(rs.getString("nombre"));
                txtdireccioncliente.setText(rs.getString("direccion"));
                txttelefonocliente.setText(rs.getString("telefono"));
                
            }else{
                JOptionPane.showMessageDialog(null, "cliente no encontrado");
                limpiarcliente();
            }
            
            }
        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null,"Error, "+ e.getMessage());
        }
    }
    
    


//llenar combobox con la colomna  deproductos de la base de datos
    public void llenarcombo(){
        String sql ="select nombreproducto from productos order by nombreproducto ASC";
         
                        try {
                PreparedStatement ps = co.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                comboproducto.addItem("Seleccione un producto");
                while(rs.next()){
                    comboproducto.addItem(rs.getString("nombreproducto"));
                    
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                
            }
            
            
    }
    
    //borrar todos los registro de la tabla factura
    public void limpiartabla(){
      
      DefaultTableModel model =(DefaultTableModel)tablafactura.getModel();
      model.setRowCount(0);
    
        }
    
    

//buscar datos del producto seleccionado en el combobox
    public void buscarproducto(){
        String sql ="select idproducto,nombreproducto,precioproducto,stockproducto from productos where nombreproducto=?";
    
   
        try {
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setString(1, (String) comboproducto.getSelectedItem());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtidproducto.setText(String.valueOf(rs.getInt("idproducto")));
                txtstockproducto.setText(String.valueOf(rs.getInt("stockproducto")));
                txtvalorproducto.setText(String.valueOf(rs.getInt("precioproducto")));
            }
           } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null,"Error, "+ e.getMessage());
        }
    }
    
    
    

//calcular el total por el precio unitario del producto y la cantidad escogida en el spinner
 public void cantidad(){
     int preciounitario = Integer.parseInt(txtvalorproducto.getText());
     int cant = Integer.parseInt(spicantidad.getValue().toString());
     int total= preciounitario*cant;
     
     txttotalproducto.setText(String.valueOf(total));
 }
 
 //eliminar la fila seleccionada de la tabla factura
 public void elimimarfila(){
        if(tablafactura.getSelectedRow()>=0){
            DefaultTableModel tm = (DefaultTableModel)tablafactura.getModel();
            int rp = JOptionPane.showConfirmDialog(this,"Desea eliminar este producto?","sistema",JOptionPane.INFORMATION_MESSAGE);
            if(rp==JOptionPane.YES_OPTION){
                tm.removeRow(tablafactura.getSelectedRow());
                
                
                
            }
        }
    }
   
 
 //mandar los datos de las cajas de texto a la tabla
 public void agregarproductotabla(){
     
        int stock =Integer.parseInt(txtstockproducto.getText());
        int cantidad = Integer.parseInt(spicantidad.getValue().toString());        
        int id = Integer.parseInt(txtidproducto.getText());
        String nombreproducto= String.valueOf(comboproducto.getSelectedItem());
        double preciounitario= Double.parseDouble(txtvalorproducto.getText());       
        double total = Double.parseDouble(txttotalproducto.getText());       
               
        if(stock>=cantidad){
          
            for(int i=0;i<tablafactura.getRowCount();i++){
            if(tablafactura.getValueAt(i,1).equals(nombreproducto)){
               JOptionPane.showMessageDialog(null,"el producto ya esta registrado");
               modelo.removeRow(i);
            }
        }
                
        Object[]datos=new Object[5];
        modelo=(DefaultTableModel)tablafactura.getModel();
        datos[0]=id;
        datos[1]=nombreproducto;
        datos[2]=cantidad;
        datos[3]=preciounitario;
        datos[4]=total;
        modelo.addRow(datos); 
              
        
        limpiarproducto();
        calculartotaltabla();    
        
        }  else{
            JOptionPane.showMessageDialog(null,"la cantidad que solicita es mayor a la cantidad existente");
        }
        }

 
 
 //actualizar el stock de los productos en la tabla cuando se genere la factura
 public void buscarstock() throws SQLException{
     int stocktotal=0;
     for(int i=0;i<tablafactura.getRowCount();i++){
         int cantidad = Integer.parseInt(tablafactura.getValueAt(i,2 ).toString());
         int id = Integer.parseInt(tablafactura.getValueAt(i,0).toString());
         String sql ="select stockproducto from productos where idproducto='"+id+"'";
         
         try{
             PreparedStatement pps=co.prepareStatement(sql);
             ResultSet rs = pps.executeQuery();
             if (rs.next()) {
                int stock= rs.getInt("stockproducto");
                stocktotal=stock-cantidad;
                //actualizar el stock de los productos 
               PreparedStatement ps=co.prepareStatement("update productos set stockproducto='"+stocktotal+"' where idproducto ='"+id+"'");
                   ps.executeUpdate(); 
                
            }
             
         }catch (SQLException e) {
              
               JOptionPane.showMessageDialog(null,"Error,  "+ e.getMessage());
          }
     }
 }
 
 // generar serie de la factura
 
public void seriefactura(){
         Statement st;
         ResultSet rs;
    
         int incremento =0;
    
    String sql="SELECT MAX(idfactura) FROM factura";
         try {
            
            st = co.createStatement();
            rs = st.executeQuery(sql);
             if(rs.next()) {                
                         
                 int serie = rs.getInt("MAX(idfactura)");
                 incremento = incremento + 1;
                  int seriea=serie+incremento;
                  lbserie.setText("0000"+String.valueOf(seriea)); 
                               
                 }else{                  
                       lbserie.setText("00001");   
             
             }
                
             
        }catch (Exception ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
       
}
}
    
      //guardar datos de factura
    public void guardarfactura(){
    String sql ="INSERT INTO factura(idfactura,identificacion_cliente,nombre_cliente,fecha_factura,telefono_cliente,direccion_cliente,total_factura) VALUES (?,?,?,?,?,?,?)";
    
   
        try {
            PreparedStatement pst=co.prepareStatement(sql);
            
            pst.setInt(1,Integer.parseInt(lbserie.getText()));
            pst.setInt(2,Integer.parseInt(txtidencliente.getText()));
            pst.setString(3,txtnombrecliente.getText());
            pst.setString(4,lbfecha.getText());
           pst.setString(5,txttelefonocliente.getText());
           pst.setString(6,txtdireccioncliente.getText());
           pst.setDouble(7,Double.parseDouble(txttotalfactura.getText()));
           
            pst.execute();
            
                   
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error,  "+ e.getMessage());
        }
}
    
    
    
    
       
        

 
 
 
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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Factura().setVisible(true);
        });
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarproducto;
    private javax.swing.JButton btneliminarproducto;
    private javax.swing.JButton btnlimpiarcliente;
    private javax.swing.JButton btnlimpiarproductos;
    private javax.swing.JComboBox<String> comboproducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbfecha;
    public static javax.swing.JLabel lbhora;
    public static javax.swing.JLabel lbserie;
    private javax.swing.JSpinner spicantidad;
    public static javax.swing.JTable tablafactura;
    private javax.swing.JButton txtbuscarcliente;
    public static javax.swing.JTextField txtdireccioncliente;
    public static javax.swing.JTextField txtidencliente;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtiva;
    public static javax.swing.JTextField txtnombrecliente;
    private javax.swing.JTextField txtstockproducto;
    private javax.swing.JTextField txtsubtotal;
    public static javax.swing.JTextField txttelefonocliente;
    public static javax.swing.JTextField txttotalfactura;
    private javax.swing.JTextField txttotalproducto;
    private javax.swing.JTextField txtvalorproducto;
    // End of variables declaration//GEN-END:variables
}
