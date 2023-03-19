
public class form extends javax.swing.JFrame {
    public static String nama, nim, kelas;
    
    public form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lform = new javax.swing.JLabel();
        lnama = new javax.swing.JLabel();
        inama = new javax.swing.JTextField();
        lnim = new javax.swing.JLabel();
        inim = new javax.swing.JTextField();
        lkelas = new javax.swing.JLabel();
        cbkelas = new javax.swing.JComboBox<>();
        bsubmit = new javax.swing.JButton();
        blogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lform.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lform.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lform.setText("Menu Form");

        lnama.setText("Nama :");

        inama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inamaActionPerformed(evt);
            }
        });

        lnim.setText("Nim    :");

        lkelas.setText("Kelas :");

        cbkelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IF - A", "IF - B", "IF - C", "IF - D", "IF - E" }));

        bsubmit.setText("Submit");
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });

        blogout.setText("Logout");
        blogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(blogout)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bsubmit))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lnim)
                                .addComponent(lkelas)
                                .addComponent(lnama))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnama)
                    .addComponent(inama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnim)
                    .addComponent(inim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lkelas)
                    .addComponent(cbkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsubmit)
                    .addComponent(blogout))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inamaActionPerformed
        String nama = inama.getText();
    }//GEN-LAST:event_inamaActionPerformed

    private void inimActionPerformed(java.awt.event.ActionEvent evt){
        String nim = inim.getText();
    }
    
    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubmitActionPerformed
        if (evt.getSource() == bsubmit) {
            nama = inama.getText();
            nim = inim.getText();
            kelas = (String)cbkelas.getSelectedItem();
            output page = new output();
            page.setVisible(true);
        }
    }//GEN-LAST:event_bsubmitActionPerformed

    private void blogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogoutActionPerformed
        login page = new login();
        page.setVisible(true);
    }//GEN-LAST:event_blogoutActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blogout;
    private javax.swing.JButton bsubmit;
    private javax.swing.JComboBox<String> cbkelas;
    private javax.swing.JTextField inama;
    private javax.swing.JTextField inim;
    private javax.swing.JLabel lform;
    private javax.swing.JLabel lkelas;
    private javax.swing.JLabel lnama;
    private javax.swing.JLabel lnim;
    // End of variables declaration//GEN-END:variables
}
