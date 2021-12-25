package queue;

import javax.swing.JOptionPane;

public class Gui extends javax.swing.JFrame {

    //  double λ = 0, u = 0, λ2 = 0.0, u2 = 0.0, λ3 = 0.0, u3 = 0.0, T = 0;
    // int k = 0, k2 = 0, n = 0, n2 = 0, n3 = 0, c = 0, c2 = 0;
    DD Dc1; 
    DD Dc2;

    public Gui() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        this.setTitle("Queues Determinator");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jText_λ = new javax.swing.JTextField();
        jText_u = new javax.swing.JTextField();
        jText_K = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtext_M = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jtext_t = new javax.swing.JTextField();
        jtext_n = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        check_ti2 = new javax.swing.JCheckBox();
        check_n2 = new javax.swing.JCheckBox();
        check_w2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        getResults = new javax.swing.JButton();
        getGraph = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        WMM1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        WQMM1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        LMM1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        LQMM1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        λMM1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        P0MM1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        SPECIAL = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        λmm1 = new javax.swing.JTextField();
        λtimemm1 = new javax.swing.JComboBox<>();
        utimemm1 = new javax.swing.JComboBox<>();
        umm1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        wmm1 = new javax.swing.JTextField();
        wtimemm1 = new javax.swing.JComboBox<>();
        nmm1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ptimemm1 = new javax.swing.JComboBox<>();
        pmm1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        getSpecialResult = new javax.swing.JButton();
        getResultMM1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        getResults1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jText_λ2 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jText_n2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jText_u2 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jText_c = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jText_L = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jText_LQ = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jText_W = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jText_WQ = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jText_P0 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jText_Pn = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jText_Pci1 = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        getResults2 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jText_λ3 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jText_n3 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jText_u3 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jText_c2 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jText_K2 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        getResults3 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jText_L1 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jText_LQ1 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jText_W1 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jText_WQ1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jText_P01 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jText_Pn1 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jText_Pci2 = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel3.setText("FILL THIS DATA");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel4.setText("µ");

        jText_λ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_λActionPerformed(evt);
            }
        });

        jText_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_uActionPerformed(evt);
            }
        });

        jText_K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_KActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel5.setText("k");

        jLabel6.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel6.setText("M");

        jLabel2.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel2.setText("λ");

        jtext_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_MActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_λ, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtext_M, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_u, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_K, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jText_λ, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtext_M, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_u, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jText_K, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(102, 102, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jtext_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_tActionPerformed(evt);
            }
        });

        jtext_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_nActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel18.setText("n");

        jLabel7.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel7.setText("t");

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        check_ti2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        check_ti2.setText("ti");
        check_ti2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_ti2ActionPerformed(evt);
            }
        });

        check_n2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        check_n2.setText("n(t)");
        check_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_n2ActionPerformed(evt);
            }
        });

        check_w2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        check_w2.setText("Wq(n)");
        check_w2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_w2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(check_ti2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(check_n2)
                .addGap(18, 18, 18)
                .addComponent(check_w2)
                .addGap(14, 14, 14))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_w2)
                    .addComponent(check_n2)
                    .addComponent(check_ti2))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel1.setText("Check The Results");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtext_n, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(jtext_t, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtext_n, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtext_t, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jPanel17.setBackground(new java.awt.Color(153, 153, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getResults.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResults.setText("Get Results");
        getResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResultsActionPerformed(evt);
            }
        });

        getGraph.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getGraph.setText("Get Graph");
        getGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getResults)
                .addGap(148, 148, 148)
                .addComponent(getGraph)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getResults)
                    .addComponent(getGraph))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deterministic", null, jPanel1, "");

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel29.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel29.setText("w");

        WMM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WMM1ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Noto Mono", 0, 36)); // NOI18N
        jLabel35.setText("min");

        jLabel37.setFont(new java.awt.Font("Noto Mono", 0, 36)); // NOI18N
        jLabel37.setText("min");

        WQMM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WQMM1ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel30.setText("wq");

        jLabel33.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel33.setText("L");

        LMM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LMM1ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel34.setText("Lq");

        LQMM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LQMM1ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Noto Mono", 0, 36)); // NOI18N
        jLabel38.setText("C");

        jLabel39.setFont(new java.awt.Font("Noto Mono", 0, 36)); // NOI18N
        jLabel39.setText("C");

        λMM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                λMM1ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel40.setText("λ");

        P0MM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P0MM1ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel41.setText("P0");

        jLabel42.setFont(new java.awt.Font("Noto Mono", 0, 24)); // NOI18N
        jLabel42.setText("/min");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel23.setText("Special Case Result :");

        SPECIAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPECIALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel33)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LMM1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(WMM1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(λMM1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel42)
                    .addComponent(jLabel35))
                .addGap(106, 106, 106)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel41))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addComponent(LQMM1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addComponent(WQMM1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37))
                    .addComponent(P0MM1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel23)
                .addGap(37, 37, 37)
                .addComponent(SPECIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LQMM1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LMM1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WQMM1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(P0MM1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(WMM1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(λMM1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPECIAL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        WMM1.getAccessibleContext().setAccessibleName("WMM1");
        WMM1.getAccessibleContext().setAccessibleDescription("");
        WQMM1.getAccessibleContext().setAccessibleName("WQMM1");
        LMM1.getAccessibleContext().setAccessibleName("LMM1");
        LQMM1.getAccessibleContext().setAccessibleName("LQMM1");
        λMM1.getAccessibleContext().setAccessibleName("λMM1");
        SPECIAL.getAccessibleContext().setAccessibleName("SPECIAL");

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel31.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel31.setText("λ");

        λmm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                λmm1ActionPerformed(evt);
            }
        });

        λtimemm1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        λtimemm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min", "Sec" }));
        λtimemm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                λtimemm1ActionPerformed(evt);
            }
        });

        utimemm1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        utimemm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min", "Sec" }));
        utimemm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utimemm1ActionPerformed(evt);
            }
        });

        umm1.setAutoscrolls(false);
        umm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umm1ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel32.setText("µ");

        jLabel36.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel36.setText("w");

        wmm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wmm1ActionPerformed(evt);
            }
        });

        wtimemm1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        wtimemm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min", "Sec" }));
        wtimemm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtimemm1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel31)
                .addGap(15, 15, 15)
                .addComponent(λmm1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(λtimemm1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addGap(15, 15, 15)
                .addComponent(umm1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utimemm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addGap(15, 15, 15)
                .addComponent(wmm1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wtimemm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(λmm1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(umm1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(λtimemm1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(wtimemm1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(utimemm1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wmm1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );

        jLabel31.getAccessibleContext().setAccessibleName("λtimemm1");
        λmm1.getAccessibleContext().setAccessibleName("λmm1");
        λtimemm1.getAccessibleContext().setAccessibleName("timemm1");
        utimemm1.getAccessibleContext().setAccessibleName("utimemm1");
        umm1.getAccessibleContext().setAccessibleName("umm1");
        wmm1.getAccessibleContext().setAccessibleName("wmm1");
        wtimemm1.getAccessibleContext().setAccessibleName("wtimemm1");

        nmm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmm1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Customers");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("With P");

        ptimemm1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ptimemm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "<=" }));
        ptimemm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptimemm1ActionPerformed(evt);
            }
        });

        pmm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmm1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setText("%");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Data of Special Case");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel19)
                .addGap(304, 304, 304))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel20)
                        .addGap(15, 15, 15)
                        .addComponent(ptimemm1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nmm1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pmm1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ptimemm1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(nmm1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmm1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        nmm1.getAccessibleContext().setAccessibleName("nmm1");
        ptimemm1.getAccessibleContext().setAccessibleName("ptimemm1");
        pmm1.getAccessibleContext().setAccessibleName("pmm1");

        jLabel24.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel24.setText("FILL THIS DATA");

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getSpecialResult.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getSpecialResult.setText("Special case Result");
        getSpecialResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSpecialResultActionPerformed(evt);
            }
        });

        getResultMM1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResultMM1.setText("Get Results");
        getResultMM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResultMM1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(getResultMM1)
                .addGap(116, 116, 116)
                .addComponent(getSpecialResult)
                .addGap(10, 10, 10))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(getSpecialResult)
                .addComponent(getResultMM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getResultMM1.getAccessibleContext().setAccessibleName("getResultMM1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        jTabbedPane1.addTab("M/M/1", jPanel4);
        jPanel4.getAccessibleContext().setAccessibleName("M/M/1");

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel12.setText("L");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel13.setText("Lq");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel14.setText("W");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel15.setText("Wq");

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel16.setText("Pk");

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel17.setText("Pn");

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jLabel25.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel25.setText("FILL THIS DATA");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel8.setText("λ");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel9.setText("n");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel10.setText("µ");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel11.setText("k");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4))
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getResults1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResults1.setText("Get Results");
        getResults1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResults1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getResults1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getResults1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel25))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(191, 191, 191))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        jTabbedPane1.addTab("M/M/1/k", jPanel5);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel46.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel46.setText("FILL THIS DATA");

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel47.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel47.setText("λ");

        jText_λ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_λ2ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel48.setText("n");

        jText_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_n2ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel49.setText("µ");

        jText_u2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_u2ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel50.setText("c");

        jText_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jText_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jText_λ2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel49)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_u2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_c, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jText_λ2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel49)
                            .addComponent(jText_u2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_c, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel26.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel26.setText("L");

        jText_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_LActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel27.setText("Lq");

        jText_LQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_LQActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel28.setText("W");

        jText_W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_WActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel43.setText("Wq");

        jText_WQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_WQActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel44.setText("Pci");

        jText_P0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_P0ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel45.setText("Pn");

        jText_Pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_PnActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel51.setText("1/P0");

        jText_Pci1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Pci1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_L, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(jText_W, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jText_Pci1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel27)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_LQ, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_WQ, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Pn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel51)
                        .addGap(28, 28, 28)
                        .addComponent(jText_P0, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jText_LQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jText_WQ, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jText_W, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jText_Pci1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel45)
                                .addComponent(jText_Pn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_P0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getResults2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResults2.setText("Get Results");
        getResults2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResults2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getResults2)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getResults2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addGap(137, 137, 137)
                                    .addComponent(jLabel46)))
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("M/M/C", jPanel12);

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel53.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel53.setText("λ");

        jText_λ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_λ3ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel54.setText("n");

        jText_n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_n3ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel55.setText("µ");

        jText_u3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_u3ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel56.setText("c");

        jText_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_c2ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel64.setText("K");

        jText_K2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_K2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_λ3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_u3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel64)
                .addGap(18, 18, 18)
                .addComponent(jText_K2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jText_λ3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_u3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel64)
                    .addComponent(jText_K2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jLabel52.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel52.setText("FILL THIS DATA");

        jPanel24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getResults3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResults3.setText("Get Results");
        getResults3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResults3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(getResults3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getResults3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel57.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel57.setText("L");

        jText_L1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_L1ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel58.setText("Lq");

        jText_LQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_LQ1ActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel59.setText("W");

        jText_W1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_W1ActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel60.setText("Wq");

        jText_WQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_WQ1ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel61.setText("Pci");

        jText_P01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_P01ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel62.setText("Pn");

        jText_Pn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Pn1ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel63.setText("1/P0");

        jText_Pci2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Pci2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jText_W1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_L1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jText_Pci2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_Pn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_LQ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_WQ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel63)
                        .addGap(18, 18, 18)
                        .addComponent(jText_P01, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                                    .addComponent(jText_L1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))
                                .addComponent(jLabel58))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(8, 8, 8))))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jText_LQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jText_WQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_Pn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_W1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_Pci2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_P01, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel52))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("M/M/C/K", jPanel22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jText_Pci2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Pci2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Pci2ActionPerformed

    private void jText_Pn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Pn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Pn1ActionPerformed

    private void jText_P01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_P01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_P01ActionPerformed

    private void jText_WQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_WQ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_WQ1ActionPerformed

    private void jText_W1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_W1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_W1ActionPerformed

    private void jText_LQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_LQ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_LQ1ActionPerformed

    private void jText_L1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_L1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_L1ActionPerformed

    private void getResults3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResults3ActionPerformed
        try {
            double λ3 = 0.0, u3 = 0.0;
            int k2 = 0, c2 = 0, n3 = 0;
            MMCK lck6;
            if (!jText_λ3.getText().equals("")) {
                String s = jText_λ3.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ3 = first / second;
                } else {
                    λ3 = Double.parseDouble(jText_λ3.getText());
                }
            }
            if (!jText_u3.getText().equals("")) {
                String s = jText_u3.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u3 = first / second;
                } else {
                    u3 = Double.parseDouble(jText_u3.getText());
                }
            }
            if (!jText_c2.getText().equals("")) {
                c2 = Integer.parseInt(jText_c2.getText());
            }
            if (!jText_n3.getText().equals("")) {
                n3 = Integer.parseInt(jText_n3.getText());
            }
            if (!jText_K2.getText().equals("")) {
                k2 = Integer.parseInt(jText_K2.getText());
            }

            if ((λ3 > 0) && (u3 > 0) && (c2 > 0) && (k2 > 0)) {
                System.out.println("c = " + c2);
                lck6 = new MMCK(λ3, u3, c2, k2);
                double L = lck6.L();
                jText_L1.setText(Double.toString(getPercesoin(L)));
                double Lq = lck6.Lq();
                jText_LQ1.setText(Double.toString(getPercesoin(Lq)));
                double W = lck6.W();
                jText_W1.setText(Double.toString(getPercesoin(W)));
                double Wq = lck6.Wq();
                jText_WQ1.setText(Double.toString(getPercesoin(Wq)));
                double Pci = lck6.Pci();
                jText_Pci2.setText(Double.toString(getPercesoin(Pci)));
                if (n3 == 0) {
                    double Pn = lck6.p0();
                    Pn = 1 / Pn;
                    jText_Pn1.setText(Double.toString(getPercesoin(Pn)));
                } else if (n3 >= 0) {
                    double Pn = lck6.Pn(n3);
                    jText_Pn1.setText(Double.toString(getPercesoin(Pn)));
                } else {
                    JOptionPane.showMessageDialog(null, "N should be a Positive Number");
                }
                double P0 = lck6.p0();
                jText_P01.setText(Double.toString(getPercesoin(P0)));
            } else {
                JOptionPane.showMessageDialog(null, "( λ, u, c, k ) Are Required as Positive Numbers .. !");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getResults3ActionPerformed

    private void jText_K2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_K2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_K2ActionPerformed

    private void jText_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_c2ActionPerformed

    private void jText_u3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_u3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_u3ActionPerformed

    private void jText_n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_n3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_n3ActionPerformed

    private void jText_λ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_λ3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_λ3ActionPerformed

    private void getResults2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResults2ActionPerformed
        try {
            double λ2 = 0.0, u2 = 0.0;
            int n2 = 0, c = 0;
            MMCK2 mmc;
            if (!jText_λ2.getText().equals("")) {
                String s = jText_λ2.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ2 = first / second;
                } else {
                    λ2 = Double.parseDouble(jText_λ2.getText());
                }
            }
            if (!jText_u2.getText().equals("")) {
                String s = jText_u2.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u2 = first / second;
                } else {
                    u2 = Double.parseDouble(jText_u2.getText());
                }
            }
            if (!jText_c.getText().equals("")) {
                c = Integer.parseInt(jText_c.getText());
            }
            if (!jText_n2.getText().equals("")) {
                n2 = Integer.parseInt(jText_n2.getText());
            }

            if ((λ2 > 0) && (u2 > 0) && (c > 0)) {
                mmc = new MMCK2(λ2, u2, c);
                double L = mmc.L();
                jText_L.setText(Double.toString(getPercesoin(L)));
                double Lq = mmc.Lq();
                jText_LQ.setText(Double.toString(getPercesoin(Lq)));
                double W = mmc.W();
                jText_W.setText(Double.toString(getPercesoin(W)));
                double Wq = mmc.Wq();
                jText_WQ.setText(Double.toString(getPercesoin(Wq)));
                double Pci = mmc.Pci();
                jText_Pci1.setText(Double.toString(getPercesoin(Pci)));
                double Pn;
                if (n2 >= 0) {
                    Pn = mmc.Pn(n2);
                    jText_Pn.setText(Double.toString(getPercesoin(Pn)));
                } else {
                    JOptionPane.showMessageDialog(null, "n Should be positive");
                }
                double P0 = mmc.p0();
                jText_P0.setText(Double.toString(getPercesoin(P0)));
            } else {
                JOptionPane.showMessageDialog(null, "( λ, u, c ) Are Required as Positive Numbers .. !");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getResults2ActionPerformed

    private void jText_Pci1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Pci1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Pci1ActionPerformed

    private void jText_PnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_PnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_PnActionPerformed

    private void jText_P0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_P0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_P0ActionPerformed

    private void jText_WQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_WQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_WQActionPerformed

    private void jText_WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_WActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_WActionPerformed

    private void jText_LQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_LQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_LQActionPerformed

    private void jText_LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_LActionPerformed

    private void jText_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_cActionPerformed

    private void jText_u2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_u2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_u2ActionPerformed

    private void jText_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_n2ActionPerformed

    private void jText_λ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_λ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_λ2ActionPerformed

    private void getResults1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResults1ActionPerformed

        try {
            int k = 0, n = 0;
            double λ = 0.0, u = 0.0;
            if (!jTextField5.getText().equals("")) {
                String s = jTextField5.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(jTextField5.getText());
                }
            }
            if (!jTextField7.getText().equals("")) {
                String s = jTextField7.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u = first / second;
                } else {
                    u = Double.parseDouble(jTextField7.getText());
                }
            }

            if (!jTextField8.getText().equals("")) {
                k = Integer.parseInt(jTextField8.getText());
            }
            if (!jTextField6.getText().equals("")) {
                n = Integer.parseInt(jTextField6.getText());
            }

            if ((k > 0) && (λ > 0) && (u > 0)) {
                MMK MK = new MMK(k, λ, u);
                double L = MK.L();
                jTextField9.setText(Double.toString(getPercesoin(L)));
                double Lq = MK.Lq();
                jTextField10.setText(Double.toString(getPercesoin(Lq)));
                double W = MK.W();
                jTextField11.setText(Double.toString(getPercesoin(W)));
                double Wq = MK.Wq();
                jTextField12.setText(Double.toString(getPercesoin(Wq)));
                double PK = MK.PK();
                jTextField13.setText(Double.toString(getPercesoin(PK)));
                if (n >= 0) {
                    double Pn = MK.Pn(n);
                    jTextField14.setText(Double.toString(getPercesoin(Pn)));
                } else {
                    JOptionPane.showMessageDialog(null, "n should be a positive number");
                }
            } else {
                JOptionPane.showMessageDialog(null, "( λ & u & k ) Are required as a positive Numbers");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getResults1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void getResultMM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResultMM1ActionPerformed
        try {
            double λ = 0.0, u = 0.0, w = 0.0;
            MM1 mm1;
            if (!λmm1.getText().equals("")) {
                String s = λmm1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(λmm1.getText());
                }
            }
            if (!umm1.getText().equals("")) {
                String s = umm1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u = first / second;
                } else {
                    u = Double.parseDouble(umm1.getText());
                }
            }
            if (!wmm1.getText().equals("")) {
                w = Double.parseDouble(wmm1.getText());
            }

            // If we has just λ and u
            if ((λ > 0) && (u > 0) && (w == 0)) {
                //                System.out.println("in one");
                mm1 = new MM1(λ, u);

                // Check on Time
                if (λtimemm1.getSelectedIndex() == 0) // Hour
                {
                    mm1.λ_HourToMin();
                } else if (λtimemm1.getSelectedIndex() == 2) // Seconds
                {
                    mm1.λ_SecToMin();
                }

                if (utimemm1.getSelectedIndex() == 0) // Hour
                {
                    mm1.u_HourToMin();
                } else if (utimemm1.getSelectedIndex() == 2) // Seconds
                {
                    mm1.u_SecToMin();
                }

                mm1.has_λ_u();

                LMM1.setText(mm1.getL()); // L
                LQMM1.setText(mm1.getLq()); // Lq
                WMM1.setText(mm1.getW()); // Lq
                WQMM1.setText(mm1.getWq()); // Lq
                λMM1.setText(mm1.getλ());
                P0MM1.setText(mm1.getP0());

            } else if ((λ == 0.0) && (u > 0) && (w > 0)) { // Get λ - has u & w

                mm1 = new MM1(λ, u);

                // Check on Time
                if (utimemm1.getSelectedIndex() == 0) // Hour
                {
                    mm1.u_HourToMin();
                } else if (utimemm1.getSelectedIndex() == 2) // Seconds
                {
                    mm1.u_SecToMin();
                }

                if (wtimemm1.getSelectedIndex() == 0) // Hour
                {
                    mm1.w_HourToMin();
                } else if (wtimemm1.getSelectedIndex() == 2) // Seconds
                {
                    mm1.W_SecToMin();
                }
                float temp = mm1.getλ_has_u_W(w);

                λMM1.setText(String.valueOf(temp));

            } else {
                JOptionPane.showMessageDialog(null, "No suffiecent Positive Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }

        // System.out.println(λtimemm1.getSelectedIndex());
        //     MM1 o = new MM1(λ,u);
        // System.out.println(umm1.getText());
        //System.out.println(λmm1.getText());
    }//GEN-LAST:event_getResultMM1ActionPerformed

    private void getSpecialResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSpecialResultActionPerformed
        try {
            double λ = 0.0, p = 0.0, u = 0.0;
            int n = 0;
            MM1 mm1;
            if (!λmm1.getText().equals("")) {
                String s = λmm1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(λmm1.getText());
                }
            }
            if (!pmm1.getText().equals("")) {
                p = Double.parseDouble(pmm1.getText());
            }
            if (!nmm1.getText().equals("")) {
                n = Integer.parseInt(nmm1.getText());
            }

            if (n > 0 && p > 0 && λ > 0) { // special case - Get U - Has Probability with customers
                String state; // > or < or <=
                mm1 = new MM1(λ, u);
                if (ptimemm1.getSelectedIndex() == 0) {
                    state = ">";
                } else if (ptimemm1.getSelectedIndex() == 1) {
                    state = "<";
                } else {
                    state = "<=";
                }

                u = mm1.getU_has_customers_with_probability(n, p, state);

                String result;
                if (state.equals(">")) {
                    result = "u < " + u;
                } else if (state.equals("<")) {
                    result = "u >= " + u;
                } else {
                    result = "u > " + u;
                }

                SPECIAL.setText(result);
            } else {
                JOptionPane.showMessageDialog(null, "No suffiecent Positive Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getSpecialResultActionPerformed

    private void pmm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmm1ActionPerformed

    private void ptimemm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptimemm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptimemm1ActionPerformed

    private void nmm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmm1ActionPerformed

    private void wtimemm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wtimemm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wtimemm1ActionPerformed

    private void wmm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wmm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wmm1ActionPerformed

    private void umm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umm1ActionPerformed

    private void utimemm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utimemm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utimemm1ActionPerformed

    private void λtimemm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_λtimemm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_λtimemm1ActionPerformed

    private void λmm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_λmm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_λmm1ActionPerformed

    private void SPECIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPECIALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPECIALActionPerformed

    private void P0MM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P0MM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P0MM1ActionPerformed

    private void λMM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_λMM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_λMM1ActionPerformed

    private void LQMM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LQMM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LQMM1ActionPerformed

    private void LMM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LMM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LMM1ActionPerformed

    private void WQMM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WQMM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WQMM1ActionPerformed

    private void WMM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WMM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WMM1ActionPerformed

    private void getGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getGraphActionPerformed

        try {
            double λ = 0.0, u = 0.0;
            int M = 0, K = 0, length = 0;
            DD dq;
            if (!jText_λ.getText().equals("")) {
                String s = jText_λ.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(jText_λ.getText());
                }
            }
            if (!jText_u.getText().equals("")) {
                String s = jText_u.getText();
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u = first / second;
                } else {
                    u = Double.parseDouble(jText_u.getText());
                }
            }
            if (!jText_K.getText().equals("")) {
                K = Integer.parseInt(jText_K.getText());
            }
            if (!jtext_M.getText().equals("")) {
                M = Integer.parseInt(jtext_M.getText());
            }

            // If we has just λ and u
            if ((λ > 0) && (u > 0) && (K > 0) && (M == 0) && (u < λ)) {
                final Chart demo = new Chart(u, λ, K);
                demo.displayChart();
            } else if ((λ > 0) && (u > 0) && (K > 0) && (M > 0) && (u >= λ)) {
                final Chart demo = new Chart(u, λ, K, M);
                demo.displayChart();
            } else if (M == 0 && (λ > 0) && (u > 0) && (K > 0) && (λ <= u)) {
                JOptionPane.showMessageDialog(null, "M is required when ( λ <= u )");
            } else {
                JOptionPane.showMessageDialog(null, "You Should write a possitive λ & u & K ...!!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getGraphActionPerformed

    private void getResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResultsActionPerformed
        try {
            double λd = 0, ud = 0;
            double wqn = -1, ti = -1, nt = -1;
            int n = 0, m = 0, kd = 0, T = 0, n_of_checked_results = 0;
            String errors = "";

            if (!jText_λ.getText().equals("")) {
                String s = jText_λ.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λd = first / second;
                } else {
                    λd = Double.parseDouble(jText_λ.getText());
                }
            }
            if (!jText_u.getText().equals("")) {
                String s = jText_u.getText();
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    ud = first / second;
                } else {
                    ud = Double.parseDouble(jText_u.getText());
                }
            }
            if (!jtext_t.getText().equals("")) {
                T = Integer.parseInt(jtext_t.getText());
            }
            if (!jtext_n.getText().equals("")) {
                n = Integer.parseInt(jtext_n.getText());
            }
            if (!jText_K.getText().equals("")) {
                kd = Integer.parseInt(jText_K.getText());
            }
            if (!jtext_M.getText().equals("")) {
                m = Integer.parseInt(jtext_M.getText());
            }

            // Case 1
            if (m == 0 && (λd > 0) && (ud > 0) && (kd > 0) && λd > ud) {

                Dc1 = new DD((double) ud, λd, kd);

                ti = Dc1.get_ti();

                if (check_ti2.isSelected()) {
                    n_of_checked_results++;
                } else {
                    ti = -1;
                }

                if (check_n2.isSelected()) {
                    n_of_checked_results++;
                    if (T == 0) {
                        errors = "Please Enter positive Integer in (t) field";
                    } else {
                        nt = Dc1.get_nt(T);
                        //                        System.out.println("nt = " + nt + " T = " + T + " λd = " + λd + " U = " + ud);

                    }
                }
                if (check_w2.isSelected()) {
                    n_of_checked_results++;
                    if (n == 0) {
                        if (errors.equals("")) {
                            errors = "Please Enter positive Integer in (n) Field";
                        } else {
                            errors += " & n field";
                        }
                    } else {
                        wqn = Dc1.get_Wqn((double) n);
                    }
                }

                if (n_of_checked_results == 0) {
                    errors = "Please check any result you want";
                }

                if (errors.equals("")) {
                    Result re = new Result(nt, wqn, ti);
                    re.setVisible(true);
                    re.pack();
                    re.setLocationRelativeTo(null);
                    re.setDefaultCloseOperation(2);
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

                // Case Number 2
            } else if ((m > 0) && (λd > 0) && (ud > 0) && (kd > 0) && (ud >= λd)) {
                Dc2 = new DD((double) ud, λd, kd, m);
                double nt2 = -1, wqn2 = -1, ti2 = -1;

                ti2 = Dc2.get_ti_2();

                if (check_ti2.isSelected()) {
                    n_of_checked_results++;
                }

                if (check_n2.isSelected()) {
                    n_of_checked_results++;
                    if (T == 0) {
                        errors = "Please Enter positive Integer in (t) field";
                    } else {
                        nt2 = Dc2.get_nt_2(T);
                        //System.out.println("nt = " + nt + " T = " + T + " λd = " + λd + " U = " + ud);
                    }
                }
                if (check_w2.isSelected()) {
                    n_of_checked_results++;
                    System.out.println("one");
                    if (n == 0) {
                        if (errors.equals("")) {
                            errors = "Please Enter positive Integer in (n) Field";
                        } else {
                            errors += " & n field";
                        }
                    } else {

                        wqn2 = Dc2.get_Wqn_2((double) n);

                    }
                }
                if (n_of_checked_results == 0) {
                    errors = "Please check any result you want";
                }

                if (errors.equals("")) {
                    Result re = new Result(nt2, wqn2, ti2);
                    re.setVisible(true);
                    re.pack();
                    re.setLocationRelativeTo(null);
                    re.setDefaultCloseOperation(2);
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

            } else if ((m > 0) && (λd > 0) && (ud > 0) && (kd > 0)) {
                JOptionPane.showMessageDialog(null, "Can\'t have M with ( λ > u )");

            } else if (m == 0 && (λd > 0) && (ud > 0) && (kd > 0) && (λd <= ud)) {
                JOptionPane.showMessageDialog(null, "M is required when ( λ <= u )");
            } else {
                JOptionPane.showMessageDialog(null, "No Sufficient Positive Valid Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getResultsActionPerformed

    private void check_w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_w2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_w2ActionPerformed

    private void check_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_n2ActionPerformed

    private void check_ti2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_ti2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_ti2ActionPerformed

    private void jtext_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_nActionPerformed

    private void jtext_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_tActionPerformed

    private void jtext_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_MActionPerformed

    private void jText_KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_KActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_KActionPerformed

    private void jText_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_uActionPerformed

    private void jText_λActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_λActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_λActionPerformed

    public static double getPercesoin(double d) {
        return Double.parseDouble(String.format("%.2f", d));
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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LMM1;
    private javax.swing.JTextField LQMM1;
    private javax.swing.JTextField P0MM1;
    private javax.swing.JTextField SPECIAL;
    private javax.swing.JTextField WMM1;
    private javax.swing.JTextField WQMM1;
    private javax.swing.JCheckBox check_n2;
    private javax.swing.JCheckBox check_ti2;
    private javax.swing.JCheckBox check_w2;
    private javax.swing.JButton getGraph;
    private javax.swing.JButton getResultMM1;
    private javax.swing.JButton getResults;
    private javax.swing.JButton getResults1;
    private javax.swing.JButton getResults2;
    private javax.swing.JButton getResults3;
    private javax.swing.JButton getSpecialResult;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jText_K;
    private javax.swing.JTextField jText_K2;
    private javax.swing.JTextField jText_L;
    private javax.swing.JTextField jText_L1;
    private javax.swing.JTextField jText_LQ;
    private javax.swing.JTextField jText_LQ1;
    private javax.swing.JTextField jText_P0;
    private javax.swing.JTextField jText_P01;
    private javax.swing.JTextField jText_Pci1;
    private javax.swing.JTextField jText_Pci2;
    private javax.swing.JTextField jText_Pn;
    private javax.swing.JTextField jText_Pn1;
    private javax.swing.JTextField jText_W;
    private javax.swing.JTextField jText_W1;
    private javax.swing.JTextField jText_WQ;
    private javax.swing.JTextField jText_WQ1;
    private javax.swing.JTextField jText_c;
    private javax.swing.JTextField jText_c2;
    private javax.swing.JTextField jText_n2;
    private javax.swing.JTextField jText_n3;
    private javax.swing.JTextField jText_u;
    private javax.swing.JTextField jText_u2;
    private javax.swing.JTextField jText_u3;
    private javax.swing.JTextField jText_λ;
    private javax.swing.JTextField jText_λ2;
    private javax.swing.JTextField jText_λ3;
    private javax.swing.JTextField jtext_M;
    private javax.swing.JTextField jtext_n;
    private javax.swing.JTextField jtext_t;
    private javax.swing.JTextField nmm1;
    private javax.swing.JTextField pmm1;
    private javax.swing.JComboBox<String> ptimemm1;
    private javax.swing.JTextField umm1;
    private javax.swing.JComboBox<String> utimemm1;
    private javax.swing.JTextField wmm1;
    private javax.swing.JComboBox<String> wtimemm1;
    private javax.swing.JTextField λMM1;
    private javax.swing.JTextField λmm1;
    private javax.swing.JComboBox<String> λtimemm1;
    // End of variables declaration//GEN-END:variables
}
