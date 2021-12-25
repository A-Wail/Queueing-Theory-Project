
package queue;

/**
 *
 * @author Mansour
 */
public class Result extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    double wq , nt , ti  ;
    public Result() {
        initComponents();
    }
    public Result (double wq , double nt , double ti ){
            initComponents();
        this.wq = wq ; 
        this.nt= nt ; 
        this.ti = ti ; 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_ti = new javax.swing.JLabel();
        jLabel_wqn = new javax.swing.JLabel();
        jLabel_nt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField_wqn = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextField_nt = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextField_ti = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ti.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_ti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ti.setText("ti");
        getContentPane().add(jLabel_ti, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 63, 32, -1));

        jLabel_wqn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_wqn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wqn.setText("Wq(n)");
        getContentPane().add(jLabel_wqn, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 173, -1, -1));

        jLabel_nt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_nt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_nt.setText("n(t)");
        getContentPane().add(jLabel_nt, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 122, -1, -1));

        jTextField_wqn.setEditable(false);
        jTextField_wqn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextField_wqn);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 168, 136, 44));

        jTextField_nt.setEditable(false);
        jTextField_nt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_nt.setMinimumSize(new java.awt.Dimension(6, 37));
        jScrollPane2.setViewportView(jTextField_nt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 114, 136, 43));

        jTextField_ti.setEditable(false);
        jTextField_ti.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(jTextField_ti);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 63, 136, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Slide1.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if(ti != -1)
            jTextField_ti.setText(String.valueOf(ti));
        else
            jTextField_ti.setText("Unchecked");
        if(wq != -1)
        jTextField_nt.setText(String.valueOf(wq));
        else
            jTextField_nt.setText("Unchecked");
        if(nt != -1)
        jTextField_wqn.setText(String.valueOf(nt));
        else
            jTextField_wqn.setText("Unchecked");


    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_nt;
    private javax.swing.JLabel jLabel_ti;
    private javax.swing.JLabel jLabel_wqn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextField_nt;
    private javax.swing.JTextPane jTextField_ti;
    private javax.swing.JTextPane jTextField_wqn;
    // End of variables declaration//GEN-END:variables
}
