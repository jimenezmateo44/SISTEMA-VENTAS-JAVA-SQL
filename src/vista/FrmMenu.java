package vista;

import java.awt.Dimension;

/**
 *
 * @author mateojimenez
 */
public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Ventas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnNuevoUsuario = new javax.swing.JMenuItem();
        btnGestionarUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnNuevoProducto = new javax.swing.JMenuItem();
        btnGestionarProductos = new javax.swing.JMenuItem();
        btnActualizarStock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnNuevoCliente = new javax.swing.JMenuItem();
        btnGestionarClientes = new javax.swing.JMenuItem();
        btnNuevaCategoria = new javax.swing.JMenu();
        btnNuevaCategoria1 = new javax.swing.JMenuItem();
        btnGestionarCategorias = new javax.swing.JMenuItem();
        btnNuevaVenta = new javax.swing.JMenu();
        btnNuevaVenta1 = new javax.swing.JMenuItem();
        btnGestionarVentas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        btnReportesClientes = new javax.swing.JMenuItem();
        btnReportesCategorias = new javax.swing.JMenuItem();
        btnReportesProductos = new javax.swing.JMenuItem();
        btnReportesVentas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        btnVerHistorial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem19.setText("jMenuItem19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(150, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        btnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnNuevoUsuario);

        btnGestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        btnGestionarUsuario.setText("Gestionar Usuarios");
        btnGestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnGestionarUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        btnNuevoProducto.setText("Nuevo Producto");
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        jMenu2.add(btnNuevoProducto);

        btnGestionarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        btnGestionarProductos.setText("Gestionar Productos");
        btnGestionarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarProductosActionPerformed(evt);
            }
        });
        jMenu2.add(btnGestionarProductos);

        btnActualizarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnActualizarStock.setText("Actualizar Stock");
        btnActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarStockActionPerformed(evt);
            }
        });
        jMenu2.add(btnActualizarStock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        jMenu3.add(btnNuevoCliente);

        btnGestionarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        btnGestionarClientes.setText("Gestionar Clientes");
        jMenu3.add(btnGestionarClientes);

        jMenuBar1.add(jMenu3);

        btnNuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        btnNuevaCategoria.setText("Categoria");
        btnNuevaCategoria.setPreferredSize(new java.awt.Dimension(150, 50));

        btnNuevaCategoria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevaCategoria1.setText("Nueva Categoria");
        btnNuevaCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoria1ActionPerformed(evt);
            }
        });
        btnNuevaCategoria.add(btnNuevaCategoria1);

        btnGestionarCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        btnGestionarCategorias.setText("Gestionar Categorias");
        btnGestionarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarCategoriasActionPerformed(evt);
            }
        });
        btnNuevaCategoria.add(btnGestionarCategorias);

        jMenuBar1.add(btnNuevaCategoria);

        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        btnNuevaVenta.setText("Facturar");
        btnNuevaVenta.setPreferredSize(new java.awt.Dimension(150, 50));

        btnNuevaVenta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        btnNuevaVenta1.setText("Nueva Venta");
        btnNuevaVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVenta1ActionPerformed(evt);
            }
        });
        btnNuevaVenta.add(btnNuevaVenta1);

        btnGestionarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        btnGestionarVentas.setText("Gestionar Ventas");
        btnGestionarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarVentasActionPerformed(evt);
            }
        });
        btnNuevaVenta.add(btnGestionarVentas);

        jMenuBar1.add(btnNuevaVenta);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        btnReportesClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        btnReportesClientes.setText("Reportes Clientes");
        btnReportesClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesClientesActionPerformed(evt);
            }
        });
        jMenu6.add(btnReportesClientes);

        btnReportesCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        btnReportesCategorias.setText("Reportes Categorias");
        btnReportesCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesCategoriasActionPerformed(evt);
            }
        });
        jMenu6.add(btnReportesCategorias);

        btnReportesProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        btnReportesProductos.setText("Reportes Productos");
        btnReportesProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesProductosActionPerformed(evt);
            }
        });
        jMenu6.add(btnReportesProductos);

        btnReportesVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        btnReportesVentas.setText("Reportes Ventas");
        jMenu6.add(btnReportesVentas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        btnVerHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        btnVerHistorial.setText("Ver Historial");
        btnVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistorialActionPerformed(evt);
            }
        });
        jMenu7.add(btnVerHistorial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        jMenu8.add(btnCerrarSesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarUsuarioActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarStockActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnReportesClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesClientesActionPerformed

    private void btnReportesCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesCategoriasActionPerformed

    private void btnVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerHistorialActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnNuevaVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaVenta1ActionPerformed

    private void btnNuevaCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaCategoria1ActionPerformed

    private void btnGestionarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarProductosActionPerformed

    private void btnGestionarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarCategoriasActionPerformed

    private void btnGestionarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarVentasActionPerformed

    private void btnReportesProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesProductosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnActualizarStock;
    private javax.swing.JMenuItem btnCerrarSesion;
    private javax.swing.JMenuItem btnGestionarCategorias;
    private javax.swing.JMenuItem btnGestionarClientes;
    private javax.swing.JMenuItem btnGestionarProductos;
    private javax.swing.JMenuItem btnGestionarUsuario;
    private javax.swing.JMenuItem btnGestionarVentas;
    private javax.swing.JMenu btnNuevaCategoria;
    private javax.swing.JMenuItem btnNuevaCategoria1;
    private javax.swing.JMenu btnNuevaVenta;
    private javax.swing.JMenuItem btnNuevaVenta1;
    private javax.swing.JMenuItem btnNuevoCliente;
    private javax.swing.JMenuItem btnNuevoProducto;
    private javax.swing.JMenuItem btnNuevoUsuario;
    private javax.swing.JMenuItem btnReportesCategorias;
    private javax.swing.JMenuItem btnReportesClientes;
    private javax.swing.JMenuItem btnReportesProductos;
    private javax.swing.JMenuItem btnReportesVentas;
    private javax.swing.JMenuItem btnVerHistorial;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
