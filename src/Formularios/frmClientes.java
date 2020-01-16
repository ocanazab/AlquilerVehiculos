/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import gestion.Clientes;
import java.util.Iterator;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


//Imports para Hibernate
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import conexiones.HibernateUtil;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.exception.JDBCConnectionException;
import org.hibernate.exception.ConstraintViolationException;



/**
 *
 * @author nacho */


public class frmClientes extends javax.swing.JDialog {   
    
    //Variable pública para recibir datos del cuadro de dialogo de AddCliente.
    public static String Intercambio="";
    public static Boolean nuevoCliente=false;
    
    /**
     * Creates new form frmClientesModal
     */
    public frmClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargaDatosCombo();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        btnNuevoCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de clientes");
        setName("Clientes"); // NOI18N

        jLabel1.setText("Cliente");
        jLabel1.setName("labelCliente"); // NOI18N

        comboClientes.setName("ComboClientes"); // NOI18N
        comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesActionPerformed(evt);
            }
        });

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nuevocliente.png"))); // NOI18N
        btnNuevoCliente.setName("btnNuevoCliente"); // NOI18N
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");
        jLabel2.setName("labelNombre"); // NOI18N

        txtNombre.setName("txtNombre"); // NOI18N

        jLabel3.setText("Apellidos");
        jLabel3.setName("labelApellidos"); // NOI18N

        txtApellidos.setName("txtApellidos"); // NOI18N
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel4.setText("Dirección");
        jLabel4.setName("labelDireccion"); // NOI18N

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        txtDireccion.setName("txtDireccion"); // NOI18N
        jScrollPane1.setViewportView(txtDireccion);

        jLabel5.setText("Teléfono");
        jLabel5.setName("labelTelefono"); // NOI18N

        txtTelefono.setName("txtTelefono"); // NOI18N

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/borrar.png"))); // NOI18N
        btnEliminar.setToolTipText("");
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoCliente))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(btnNuevoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // Añadiré un nuevo elemento a la lista y lo selecionaré.
        // Habrá que introducir los datos que faltan y pulsar sobre el botón guardar.
        // Incluiré un flag de "nuevo cliente" para hacer un insert en la base de datos en lugar de un update.
        frmAddCliente frmnuevocli = new frmAddCliente(this,true);
        frmnuevocli.setVisible(true);
        comboClientes.addItem(Intercambio);
        nuevoCliente=true;
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Cierro el formulario
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Inicializo Hibernate
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        //Inicializo la transaccion
        Transaction tx = session.beginTransaction();
        
        
        
        //El id_cliente será su dni sin la letra        
        int idcliente = Integer.parseInt(comboClientes.getSelectedItem().toString().substring(0, 8));
        
        
        
        if (nuevoCliente){
            
            //El Cliente es nuevo, lo doy de alta en la base de datos.
            
            Clientes clinew = new Clientes();        
            
            clinew.setIdCliente(idcliente);
            clinew.setDni(comboClientes.getSelectedItem().toString());
            clinew.setNombre(txtNombre.getText());
            clinew.setApellidos(txtApellidos.getText());
            clinew.setDireccion(txtDireccion.getText());
            clinew.setTelefono(txtTelefono.getText());
        
            //Guardo los datos
            session.save(clinew);
        }else{
            
            //El cliente ya existe, actualizo los datos.
            
            Clientes cliupdate = (Clientes) session.get(Clientes.class, idcliente);
            
            cliupdate.setDni(comboClientes.getSelectedItem().toString());            
            cliupdate.setNombre(txtNombre.getText());
            cliupdate.setApellidos(txtApellidos.getText());
            cliupdate.setDireccion(txtDireccion.getText());
            cliupdate.setTelefono(txtTelefono.getText());
            
            session.update(cliupdate);
        }
        
        //Confirmo los cambios
        
        try{
            tx.commit();            
            //Cierro la sesion        
            session.close();
            JOptionPane.showMessageDialog(null, "Cliente guardado satisfactoriamente", "Operación correcta", JOptionPane.INFORMATION_MESSAGE);
            nuevoCliente=false;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getStackTrace(), "Error en la operación", JOptionPane.ERROR_MESSAGE);                
        }       
            
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientesActionPerformed
        // Al hacer click sobre un elemento, recuperar de la base de datos la información del cliente.
        comboClientes.addActionListener(new ActionListener(){
                        @Override public void actionPerformed(ActionEvent e) {cargaDatosCliente();}
        });    
    }//GEN-LAST:event_comboClientesActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Borro el registro seleccionado.
        SessionFactory factoria = HibernateUtil.getSessionFactory();
        Session conexion = factoria.openSession();
        
        Transaction trx = conexion.beginTransaction();
        
        //El id_cliente será su dni sin la letra        
        int idcliente = Integer.parseInt(comboClientes.getSelectedItem().toString().substring(0, 8));
        String dni=comboClientes.getSelectedItem().toString();
        int confirmacion;
        
        Clientes clienteborrar = (Clientes) conexion.load(Clientes.class,idcliente);          
        
        confirmacion=JOptionPane.showConfirmDialog(null, "¿Quieres borrar el cliente seleccionado?", "Advertencia", JOptionPane.QUESTION_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
        
        //Confirmacion puede ser 0=SI, 1=CANCEL
        if (confirmacion==0){
                try{
                conexion.delete(clienteborrar);
                trx.commit();
                comboClientes.removeItem(dni);
                JOptionPane.showMessageDialog(null, "Cliente eliminado satisfactoriamente", "Operación correcta", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getStackTrace(), "Error en la operación", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Operación cancelada", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
           
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmClientes dialog = new frmClientes(new javax.swing.JFrame(), true);                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });        
    }
    
    private void cargaDatosCombo(){
        //Obtengo los clientes de la base de datos y relleno el combo.
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session conexion = sesion.openSession();
        
        Query consulta = conexion.createQuery("from Clientes");
        List<Clientes> listaclientes = consulta.list();
        int numClientes=0;
        
        Iterator<Clientes> iterador = listaclientes.iterator();
        
        while (iterador.hasNext()){
            Clientes cliente = (Clientes) iterador.next();
            comboClientes.addItem(cliente.getDni());
        }
        //Añado un registro más y lo selecciono
        //comboClientes.addItem("Selecciona un cliente.");
        //numClientes=comboClientes.getItemCount();
        //comboClientes.setSelectedIndex(numClientes-1);
        
        conexion.close();
    }
    
    private void cargaDatosCliente(){
        //Obtengo información del cliente a través de su DNI
        
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session conexion= sesion.openSession();
        
        Clientes cli= new Clientes();
        int cod_cliente=0;
        
        cod_cliente=Integer.parseInt(comboClientes.getSelectedItem().toString().substring(0, 8));        
        
        try{
            cli=(Clientes) conexion.load(Clientes.class,cod_cliente);
            
            txtNombre.setText(cli.getNombre());
            txtApellidos.setText(cli.getApellidos());
            txtDireccion.setText(cli.getDireccion());
            txtTelefono.setText(cli.getTelefono());
            
        }catch(ObjectNotFoundException e){
            JOptionPane.showMessageDialog(null, "No existe el cliente", "Registro no encontrado", JOptionPane.ERROR_MESSAGE);            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en la operación", JOptionPane.ERROR_MESSAGE);            
        }
        conexion.close();
    }
    
    public Image getIconoFormulario(){
     Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/nuevocliente.png"));
     return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
