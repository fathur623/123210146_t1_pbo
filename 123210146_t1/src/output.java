
public class output extends javax.swing.JFrame {

    public output() {
        initComponents();
        onama.setText(form.nama);
        onim.setText(form.nim);
        okelas.setText(form.kelas);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lnama = new javax.swing.JLabel();
        onama = new javax.swing.JTextField();
        lnim = new javax.swing.JLabel();
        onim = new javax.swing.JTextField();
        lkelas = new javax.swing.JLabel();
        okelas = new javax.swing.JTextField();
        bback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lnama.setText("Nama :");

        onama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onamaActionPerformed(evt);
            }
        });

        lnim.setText("Nim    :");

        lkelas.setText("Kelas :");

        bback.setText("Back");
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lnim)
                            .addComponent(lkelas)
                            .addComponent(lnama))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(onama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okelas))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnama)
                    .addComponent(onama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnim)
                    .addComponent(onim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lkelas)
                    .addComponent(okelas))
                .addGap(18, 18, 18)
                .addComponent(bback)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onamaActionPerformed
        String nama = onama.getText();
    }//GEN-LAST:event_onamaActionPerformed

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
        form page = new form();
        page.setVisible(true);
    }//GEN-LAST:event_bbackActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new output().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bback;
    private javax.swing.JLabel lkelas;
    private javax.swing.JLabel lnama;
    private javax.swing.JLabel lnim;
    private javax.swing.JTextField okelas;
    private javax.swing.JTextField onama;
    private javax.swing.JTextField onim;
    // End of variables declaration//GEN-END:variables
}
