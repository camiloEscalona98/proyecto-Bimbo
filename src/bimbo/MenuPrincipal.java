/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import vista.ciudad.AgregarCiudad;
import vista.ciudad.ListarCiudad;
import vista.cliente.AgregarCliente;
import vista.cliente.ListarCliente;
import vista.comuna.AgregarComuna;
import vista.comuna.ListarComuna;
import vista.devolucion.AgregarDevolucion;
import vista.devolucion.ListarDevolucion;
import vista.distribuidor.AgregarDistribuidor;
import vista.distribuidor.ListarDistribuidor;
import vista.giro.AgregarGiro;
import vista.giro.ListarGiro;
import vista.gondolas.AgregarGondolas;
import vista.gondolas.ListarGondolas;
import vista.marca.AgregarMarca;
import vista.marca.ListarMarca;
import vista.producto.AgregarProducto;
import vista.producto.ListarProducto;
import vista.region.AgregarRegion;
import vista.region.ListarRegion;
import vista.rol.AgregarRol;
import vista.rol.ListarRol;
import vista.ruta.AgregarRuta;
import vista.ruta.ListarRuta;
import vista.tipo_devolucion.AgregarTipoDevolucion;
import vista.tipo_devolucion.ListarTipoDevolucion;
import vista.usuario.AgregarUsuario;
import vista.usuario.ListarUsuario;
import vista.vehiculo.AgregarVehiculo;
import vista.vehiculo.ListarVehiculo;
import vista.vendedor.AgregarVendedor;
import vista.vendedor.ListarVendedor;

/**
 *
 * @author camilo
 */
public class MenuPrincipal extends javax.swing.JFrame implements ActionListener, ItemListener {

    private JMenuBar menuBar;
    //menus
    private JMenu menuDevolucion;
    private JMenu menuVendedor;
   
    private JMenu menuCliente;
    private JMenu menuProducto;

    private JMenu menuRuta;
  

    private JMenuItem menuItemDevolucionAgregar;
    private JMenuItem menuItemDevolucionListar;

    private JMenuItem menuItemVendedorAgregar;
    private JMenuItem menuItemVendedorListar;



    private JMenuItem menuItemClienteAgregar;
    private JMenuItem menuItemClienteListar;

    private JMenuItem menuItemProductoAgregar;
    private JMenuItem menuItemProductoListar;

    private JMenuItem menuItemRutaAgregar;
    private JMenuItem menuItemRutaListar;

  

    public MenuPrincipal() {
        initComponents();
        construirMenu();
    }

    private void construirMenu() {
        //instanciamos el menu
        menuBar = new JMenuBar();
        menuDevolucion = new JMenu("Devoluciones");
        menuVendedor = new JMenu("Vendedores");
       
        menuCliente = new JMenu("Clientes");
        menuProducto = new JMenu("Productos");

      

        menuRuta = new JMenu("Rutas");

        menuItemDevolucionAgregar = new JMenuItem("Agregar Devolucion");
        menuItemDevolucionListar = new JMenuItem("Lista de Devoluciones");

        menuItemVendedorAgregar = new JMenuItem("Agregar Vendedor");
        menuItemVendedorListar = new JMenuItem("Lista de Vendedores");

   

        menuItemClienteAgregar = new JMenuItem("Agregar Cliente");
        menuItemClienteListar = new JMenuItem("Lista de Clientes");

        menuItemProductoAgregar = new JMenuItem("Agregar Producto");
        menuItemProductoListar = new JMenuItem("Lista de Productos");

     
        menuItemRutaAgregar = new JMenuItem("Agregar Ruta");
        menuItemRutaListar = new JMenuItem("Lista de Rutas");

        menuItemRutaAgregar.addActionListener(this);
        menuItemRutaListar.addActionListener(this);

        menuItemDevolucionAgregar.addActionListener(this);
        menuItemDevolucionListar.addActionListener(this);

        menuItemVendedorAgregar.addActionListener(this);
        menuItemVendedorListar.addActionListener(this);

     

        menuItemClienteAgregar.addActionListener(this);
        menuItemClienteListar.addActionListener(this);

        menuItemProductoAgregar.addActionListener(this);
        menuItemProductoListar.addActionListener(this);

      
        //devoluciones 
        menuBar.add(menuDevolucion);
        menuBar.add(menuVendedor);
        
        menuBar.add(menuCliente);
        menuBar.add(menuProducto);

       

        menuBar.add(menuRuta);

        menuDevolucion.add(menuItemDevolucionAgregar);
        menuDevolucion.add(menuItemDevolucionListar);

        menuVendedor.add(menuItemVendedorAgregar);
        menuVendedor.add(menuItemVendedorListar);

   

        menuCliente.add(menuItemClienteAgregar);
        menuCliente.add(menuItemClienteListar);

        menuProducto.add(menuItemProductoAgregar);
        menuProducto.add(menuItemProductoListar);

   

        menuRuta.add(menuItemRutaAgregar);
        menuRuta.add(menuItemRutaListar);

        this.setJMenuBar(menuBar);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1186, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItemDevolucionAgregar) {
            AgregarDevolucion agregarDevolucion = new AgregarDevolucion();
            agregarDevolucion.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            agregarDevolucion.setVisible(true);
        }
        if (e.getSource() == menuItemDevolucionListar) {
            ListarDevolucion listarDevolucion = new ListarDevolucion();
            listarDevolucion.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            listarDevolucion.setVisible(true);
        }
        if (e.getSource() == menuItemVendedorAgregar) {
            AgregarVendedor agregarvendedor = new AgregarVendedor();
            agregarvendedor.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            agregarvendedor.setVisible(true);
        }
        if (e.getSource() == menuItemVendedorListar) {
            ListarVendedor listarVendedor = new ListarVendedor();
            listarVendedor.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            listarVendedor.setVisible(true);
        }
       
        if (e.getSource() == menuItemClienteAgregar) {
            AgregarCliente agregarCliente = new AgregarCliente();
            agregarCliente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            agregarCliente.setVisible(true);
        }
        if (e.getSource() == menuItemClienteListar) {
            ListarCliente listarCliente = new ListarCliente();
            listarCliente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            listarCliente.setVisible(true);
        }
        if (e.getSource() == menuItemProductoAgregar) {
            AgregarProducto agregarProducto = new AgregarProducto();
            agregarProducto.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            agregarProducto.setVisible(true);
        }
        if (e.getSource() == menuItemProductoListar) {
            ListarProducto listarProducto = new ListarProducto();
            listarProducto.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            listarProducto.setVisible(true);
        }

      

        if (e.getSource() == menuItemRutaAgregar) {
            AgregarRuta agregarRuta = new AgregarRuta();
            agregarRuta.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            agregarRuta.setVisible(true);
        }
        if (e.getSource() == menuItemRutaListar) {
            ListarRuta listarRuta = new ListarRuta();
            listarRuta.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            listarRuta.setVisible(true);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
