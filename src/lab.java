
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class lab extends javax.swing.JFrame {

    /**
     * Creates new form lab
     */
    public lab() {
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

        JDialog_Agregar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTextField_CrearPoder = new javax.swing.JTextField();
        JTextField_CrearNombre = new javax.swing.JTextField();
        JTextField_CrearDebilidad = new javax.swing.JTextField();
        JTextField_CrearFuerza = new javax.swing.JTextField();
        JTextField_AFisica = new javax.swing.JTextField();
        JTextField_CrearAMental = new javax.swing.JTextField();
        JTextField_CrearPuntosVida = new javax.swing.JTextField();
        JButton_Crear = new javax.swing.JButton();
        JComboBox_Universo = new javax.swing.JComboBox<>();
        JDialog_Listar = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree_Arbol = new javax.swing.JTree();
        jLabel10 = new javax.swing.JLabel();
        JDialog_Simular = new javax.swing.JDialog();
        JButton_Agregar = new javax.swing.JButton();
        JButton_Listar = new javax.swing.JButton();
        JButton_Simular = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu_Agregar = new javax.swing.JMenu();
        JMenu_Listar = new javax.swing.JMenu();
        JMenu_Simulacion = new javax.swing.JMenu();

        JDialog_Agregar.setPreferredSize(new java.awt.Dimension(695, 656));
        JDialog_Agregar.setResizable(false);
        JDialog_Agregar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Autography", 1, 48)); // NOI18N
        jLabel1.setText("Crear");
        JDialog_Agregar.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 15, 91, -1));

        jLabel2.setText("Ingrese el nombre: ");
        JDialog_Agregar.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 95, -1, -1));

        jLabel3.setText("Ingrese el poder: ");
        JDialog_Agregar.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 133, -1, -1));

        jLabel4.setText("Ingrese la debilidad: ");
        JDialog_Agregar.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 174, -1, -1));

        jLabel5.setText("Ingrese el universo: ");
        JDialog_Agregar.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel6.setText("Ingrese la fuerza: ");
        JDialog_Agregar.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 290, -1, -1));

        jLabel7.setText("Ingrese la agilidad fisica: ");
        JDialog_Agregar.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 344, -1, 26));

        jLabel8.setText("Ingrese la agilidad mental: ");
        JDialog_Agregar.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 401, -1, -1));

        jLabel9.setText("Ingrese los puntos de vida: ");
        JDialog_Agregar.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 450, -1, -1));

        JTextField_CrearPoder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CrearPoderActionPerformed(evt);
            }
        });
        JDialog_Agregar.getContentPane().add(JTextField_CrearPoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 130, 388, -1));

        JTextField_CrearNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CrearNombreActionPerformed(evt);
            }
        });
        JDialog_Agregar.getContentPane().add(JTextField_CrearNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 89, 388, -1));

        JTextField_CrearDebilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CrearDebilidadActionPerformed(evt);
            }
        });
        JDialog_Agregar.getContentPane().add(JTextField_CrearDebilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 171, 388, -1));

        JTextField_CrearFuerza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CrearFuerzaActionPerformed(evt);
            }
        });
        JDialog_Agregar.getContentPane().add(JTextField_CrearFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 284, 185, -1));

        JTextField_AFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_AFisicaActionPerformed(evt);
            }
        });
        JDialog_Agregar.getContentPane().add(JTextField_AFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 346, 159, -1));

        JTextField_CrearAMental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CrearAMentalActionPerformed(evt);
            }
        });
        JDialog_Agregar.getContentPane().add(JTextField_CrearAMental, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 398, 200, -1));

        JTextField_CrearPuntosVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CrearPuntosVidaActionPerformed(evt);
            }
        });
        JDialog_Agregar.getContentPane().add(JTextField_CrearPuntosVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 447, 200, -1));

        JButton_Crear.setText("Crear");
        JButton_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_CrearMouseClicked(evt);
            }
        });
        JButton_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_CrearActionPerformed(evt);
            }
        });
        JDialog_Agregar.getContentPane().add(JButton_Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 190, 80));

        JComboBox_Universo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DC", "Marvel" }));
        JDialog_Agregar.getContentPane().add(JComboBox_Universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, 30));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personajes");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("DC");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Marvel");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Capcom");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("MK");
        treeNode1.add(treeNode2);
        JTree_Arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(JTree_Arbol);

        jLabel10.setFont(new java.awt.Font("American Typewriter", 0, 48)); // NOI18N
        jLabel10.setText("Listar");

        javax.swing.GroupLayout JDialog_ListarLayout = new javax.swing.GroupLayout(JDialog_Listar.getContentPane());
        JDialog_Listar.getContentPane().setLayout(JDialog_ListarLayout);
        JDialog_ListarLayout.setHorizontalGroup(
            JDialog_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialog_ListarLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel10)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        JDialog_ListarLayout.setVerticalGroup(
            JDialog_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialog_ListarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDialog_ListarLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout JDialog_SimularLayout = new javax.swing.GroupLayout(JDialog_Simular.getContentPane());
        JDialog_Simular.getContentPane().setLayout(JDialog_SimularLayout);
        JDialog_SimularLayout.setHorizontalGroup(
            JDialog_SimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JDialog_SimularLayout.setVerticalGroup(
            JDialog_SimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButton_Agregar.setText("Agregar");
        JButton_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_AgregarMouseClicked(evt);
            }
        });
        JButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(JButton_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 272, 121));

        JButton_Listar.setText("Listar");
        JButton_Listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_ListarMouseClicked(evt);
            }
        });
        getContentPane().add(JButton_Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 272, 146));

        JButton_Simular.setText("Simular");
        JButton_Simular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_SimularMouseClicked(evt);
            }
        });
        getContentPane().add(JButton_Simular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 286, 152));

        JMenu_Agregar.setText("Agregar");
        JMenu_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenu_AgregarActionPerformed(evt);
            }
        });
        jMenuBar1.add(JMenu_Agregar);

        JMenu_Listar.setText("Listar");
        JMenu_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenu_ListarActionPerformed(evt);
            }
        });
        jMenuBar1.add(JMenu_Listar);

        JMenu_Simulacion.setText("Simulacion");
        JMenu_Simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenu_SimulacionActionPerformed(evt);
            }
        });
        jMenuBar1.add(JMenu_Simulacion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButton_AgregarActionPerformed

    private void JButton_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_AgregarMouseClicked
        // TODO add your handling code here:
        abrir_Dialog(JDialog_Agregar);
    }//GEN-LAST:event_JButton_AgregarMouseClicked

    private void JButton_ListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_ListarMouseClicked
        // TODO add your handling code here:
        abrir_Dialog(JDialog_Listar);
    }//GEN-LAST:event_JButton_ListarMouseClicked

    private void JButton_SimularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_SimularMouseClicked
        // TODO add your handling code here:
        abrir_Dialog(JDialog_Simular);
    }//GEN-LAST:event_JButton_SimularMouseClicked

    private void JMenu_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenu_AgregarActionPerformed
        // TODO add your handling code here:
        abrir_Dialog(JDialog_Agregar);
    }//GEN-LAST:event_JMenu_AgregarActionPerformed

    private void JMenu_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenu_ListarActionPerformed
        // TODO add your handling code here:
         abrir_Dialog(JDialog_Listar);
    }//GEN-LAST:event_JMenu_ListarActionPerformed

    private void JMenu_SimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenu_SimulacionActionPerformed
        // TODO add your handling code here:
        abrir_Dialog(JDialog_Simular);
    }//GEN-LAST:event_JMenu_SimulacionActionPerformed

    private void JTextField_CrearPoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CrearPoderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_CrearPoderActionPerformed

    private void JTextField_CrearNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CrearNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_CrearNombreActionPerformed

    private void JTextField_CrearDebilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CrearDebilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_CrearDebilidadActionPerformed

    private void JTextField_CrearFuerzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CrearFuerzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_CrearFuerzaActionPerformed

    private void JTextField_AFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_AFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_AFisicaActionPerformed

    private void JTextField_CrearAMentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CrearAMentalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_CrearAMentalActionPerformed

    private void JTextField_CrearPuntosVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CrearPuntosVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_CrearPuntosVidaActionPerformed

    private void JButton_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_CrearActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JButton_CrearActionPerformed

    private void JButton_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_CrearMouseClicked
        // TODO add your handling code here:
        
         DefaultComboBoxModel modelo
                = (DefaultComboBoxModel) JComboBox_Universo.getModel();
         modelo.addElement("DC");
         modelo.addElement("Marvel");
         JComboBox_Universo.setModel(modelo);
         
         int existe = -1;
         
         
        DefaultTreeModel m = (DefaultTreeModel) JTree_Arbol.getModel();
        DefaultMutableTreeNode raiz
                = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo_personaje;
        nodo_personaje = new DefaultMutableTreeNode(new Personaje(JTextField_CrearNombre.getText(),JTextField_CrearPoder.getText(),JTextField_CrearDebilidad.getText(),JComboBox_Universo.getSelectedItem().toString(),Integer.parseInt(JTextField_CrearFuerza.getText()),Integer.parseInt(JTextField_AFisica.getText()),Integer.parseInt(JTextField_CrearAMental.getText()),Integer.parseInt(JTextField_CrearPuntosVida.getText())));
        
        
        for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().
                        equals(JComboBox_Universo.getSelectedItem().toString())) {
                    DefaultMutableTreeNode p
                            = new DefaultMutableTreeNode(JTextField_CrearNombre.getText()
                            );
        
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                    existe = 1;
                } //fin if
            } //fin for 
        if (existe == -1) {
            JOptionPane.showMessageDialog(JDialog_Agregar, "Ingrese un superheroe dentro de los universos estipulados");
        }
        
//        DefaultMutableTreeNode nodo_universo;
//        nodo_universo = new DefaultMutableTreeNode(JComboBox_Universo.getSelectedItem().toString());
//        if (existe == -1) {
//                DefaultMutableTreeNode n
//                        = new DefaultMutableTreeNode(JComboBox_Universo.getSelectedItem().toString());
//                DefaultMutableTreeNode p
//                        = new DefaultMutableTreeNode(
//                                JComboBox_Universo.getSelectedItem().toString());
//                n.add(p);
//                raiz.add(n);
//            }  // fin if          
//            m.reload();
//        nodo_universo.add(nodo_personaje);
//        raiz.add(nodo_universo);
//        m.reload();
        
        JDialog_Agregar.setVisible(false);
    }//GEN-LAST:event_JButton_CrearMouseClicked

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
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Agregar;
    private javax.swing.JButton JButton_Crear;
    private javax.swing.JButton JButton_Listar;
    private javax.swing.JButton JButton_Simular;
    private javax.swing.JComboBox<String> JComboBox_Universo;
    private javax.swing.JDialog JDialog_Agregar;
    private javax.swing.JDialog JDialog_Listar;
    private javax.swing.JDialog JDialog_Simular;
    private javax.swing.JMenu JMenu_Agregar;
    private javax.swing.JMenu JMenu_Listar;
    private javax.swing.JMenu JMenu_Simulacion;
    private javax.swing.JTextField JTextField_AFisica;
    private javax.swing.JTextField JTextField_CrearAMental;
    private javax.swing.JTextField JTextField_CrearDebilidad;
    private javax.swing.JTextField JTextField_CrearFuerza;
    private javax.swing.JTextField JTextField_CrearNombre;
    private javax.swing.JTextField JTextField_CrearPoder;
    private javax.swing.JTextField JTextField_CrearPuntosVida;
    private javax.swing.JTree JTree_Arbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void abrir_Dialog(JDialog jd){
        jd.setModal(true);
        jd.pack();
        jd.setLocationRelativeTo(this);
        jd.setVisible(true); 
    }
    
    DefaultMutableTreeNode nodo_seleccionado;
    Personaje personaje_seleccionada;

}
