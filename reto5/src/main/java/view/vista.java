/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ReportesController;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.vo.InfoProyectosVo;
import model.vo.LiderVo;
import model.vo.ProyectosProveedorVo;

/**
 *
 * @author jupgo
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    ReportesController reporte;

    public vista() {
        initComponents();
        reporte = new ReportesController();
        tablaDatos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        primerInformeL = new javax.swing.JLabel();
        segundoInformeL = new javax.swing.JLabel();
        TercerInformeL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(241, 238, 253));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        primerInformeL.setBackground(new java.awt.Color(204, 204, 255));
        primerInformeL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        primerInformeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        primerInformeL.setText("Primer informe");
        primerInformeL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        primerInformeL.setOpaque(true);
        primerInformeL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primerInformeLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                primerInformeLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                primerInformeLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                primerInformeLMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                primerInformeLMouseReleased(evt);
            }
        });
        jPanel5.add(primerInformeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 69));

        segundoInformeL.setBackground(new java.awt.Color(204, 204, 255));
        segundoInformeL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        segundoInformeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        segundoInformeL.setText("Segundo informe");
        segundoInformeL.setAutoscrolls(true);
        segundoInformeL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        segundoInformeL.setOpaque(true);
        segundoInformeL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                segundoInformeLMousePressed(evt);
            }
        });
        jPanel5.add(segundoInformeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 69));

        TercerInformeL.setBackground(new java.awt.Color(204, 204, 255));
        TercerInformeL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TercerInformeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TercerInformeL.setText("Tercer Informe");
        TercerInformeL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TercerInformeL.setOpaque(true);
        TercerInformeL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TercerInformeLMousePressed(evt);
            }
        });
        jPanel5.add(TercerInformeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 69));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 210));
        jPanel5.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MISION TIC - RETO 5 - JUAN PABLO GONZÁLEZ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        tablaDatos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDatos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaDatos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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


    private void primerInformeLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerInformeLMouseEntered


    }//GEN-LAST:event_primerInformeLMouseEntered

    private void primerInformeLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerInformeLMouseExited

    }//GEN-LAST:event_primerInformeLMouseExited

    private void primerInformeLMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerInformeLMouseReleased


    }//GEN-LAST:event_primerInformeLMouseReleased
    DefaultTableModel modelTabla = new DefaultTableModel();
    private void primerInformeLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerInformeLMousePressed
        modelTabla.setRowCount(0);
        modelTabla.setColumnCount(0);
        ArrayList<LiderVo> liderArr = reporte.retornoLider();

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);

        modelTabla.addColumn("Id");
        modelTabla.addColumn("Nombre");
        modelTabla.addColumn("Primer Apellido");
        modelTabla.addColumn("Ciudad de residencia");

        tablaDatos.setModel(modelTabla);

        ((DefaultTableCellRenderer) tablaDatos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < 4; i++) {
            tablaDatos.getColumnModel().getColumn(i).setCellRenderer(Alinear);
        }

        String[] lider = new String[4];

        for (int i = 0; i < liderArr.size(); i++) {

            lider[0] = Integer.toString(liderArr.get(i).getID_Lider());
            lider[1] = liderArr.get(i).getNombre();
            lider[2] = liderArr.get(i).getPrimer_Apellido();
            lider[3] = liderArr.get(i).getCiudad_Residencia();

            modelTabla.addRow(lider);
        }

        tablaDatos.setVisible(true);

    }//GEN-LAST:event_primerInformeLMousePressed

    private void primerInformeLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerInformeLMouseClicked


    }//GEN-LAST:event_primerInformeLMouseClicked

    private void segundoInformeLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundoInformeLMousePressed
        modelTabla.setRowCount(0);
        modelTabla.setColumnCount(0);

        ArrayList<InfoProyectosVo> proyectosArr = reporte.retornoProyectos();

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);

        modelTabla.addColumn("Id");
        modelTabla.addColumn("Constructora");
        modelTabla.addColumn("Número de habitaciones");
        modelTabla.addColumn("Ciudad");

        tablaDatos.setModel(modelTabla);

        ((DefaultTableCellRenderer) tablaDatos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < 4; i++) {
            tablaDatos.getColumnModel().getColumn(i).setCellRenderer(Alinear);
        }

        String[] proyecto = new String[4];

        for (int i = 0; i < proyectosArr.size(); i++) {

            proyecto[0] = Integer.toString(proyectosArr.get(i).getID_Proyecto());
            proyecto[1] = proyectosArr.get(i).getConstructora();
            proyecto[2] = proyectosArr.get(i).getNumero_Habitaciones();
            proyecto[3] = proyectosArr.get(i).getCiudad();

            modelTabla.addRow(proyecto);
        }

        tablaDatos.setVisible(true);


    }//GEN-LAST:event_segundoInformeLMousePressed

    private void TercerInformeLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TercerInformeLMousePressed
        modelTabla.setRowCount(0);
        modelTabla.setColumnCount(0);
        ArrayList<ProyectosProveedorVo> proyectosProveedorArr = reporte.retornoProyectosProveedor();

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);

        modelTabla.addColumn("Id");
        modelTabla.addColumn("Constructora");
        modelTabla.addColumn("Banco Vinculado");

        tablaDatos.setModel(modelTabla);

        ((DefaultTableCellRenderer) tablaDatos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < 3; i++) {
            tablaDatos.getColumnModel().getColumn(i).setCellRenderer(Alinear);
        }

        String[] proyectoProveedor = new String[3];

        for (int i = 0; i < proyectosProveedorArr.size(); i++) {

            proyectoProveedor[0] = Integer.toString(proyectosProveedorArr.get(i).getID_Compra());
            proyectoProveedor[1] = proyectosProveedorArr.get(i).getConstructora();
            proyectoProveedor[2] = proyectosProveedorArr.get(i).getBanco();

            modelTabla.addRow(proyectoProveedor);
        }

        tablaDatos.setVisible(true);
    }//GEN-LAST:event_TercerInformeLMousePressed

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TercerInformeL;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel primerInformeL;
    private javax.swing.JLabel segundoInformeL;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}