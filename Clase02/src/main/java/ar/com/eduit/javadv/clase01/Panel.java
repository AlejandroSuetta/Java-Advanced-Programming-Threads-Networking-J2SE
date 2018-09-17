package ar.com.eduit.javadv.clase01;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Panel extends javax.swing.JFrame {
    private HiloCrono hCrono;
    
    private Thread tRepro;
    
    public Panel() {
        initComponents();
        
        //Date date = new Date();
        //txtHora.setText(date.toString());
        
        //Calendar cal = Calendar.getInstance();
        //txtHora.setText(cal.getTime().toString());
        
        //LocalDateTime ldt =LocalDateTime.now();
        //txtHora.setText(ldt.toString());
        
        new Thread(new HiloHora(new Control(txtHora))).start();
        
        hCrono = new HiloCrono(new Control(txtCronometro));
        new Thread(hCrono).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtCronometro = new javax.swing.JTextField();
        btnStar = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnMusicPlay = new javax.swing.JButton();
        btnMusicPause = new javax.swing.JButton();
        btnMusicStop = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hora:");

        txtHora.setEditable(false);
        txtHora.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        jLabel2.setText("Cronómetro:");

        txtCronometro.setEditable(false);
        txtCronometro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCronometro.setText("0");
        txtCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCronometroActionPerformed(evt);
            }
        });

        btnStar.setText("Star");
        btnStar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarActionPerformed(evt);
            }
        });

        btnPause.setText("Pause");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel3.setText("Musica:");

        btnMusicPlay.setText("Play");
        btnMusicPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicPlayActionPerformed(evt);
            }
        });

        btnMusicPause.setText("Pause");
        btnMusicPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicPauseActionPerformed(evt);
            }
        });

        btnMusicStop.setText("Stop");
        btnMusicStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(38, 38, 38)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnStar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMusicPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMusicPause, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMusicStop, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStar)
                    .addComponent(btnPause)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMusicPlay)
                    .addComponent(btnMusicPause)
                    .addComponent(btnMusicStop))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarActionPerformed
        //Evento Star
        hCrono.start();
    }//GEN-LAST:event_btnStarActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        //Evento Pause
        hCrono.pause();
    }//GEN-LAST:event_btnPauseActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCronometroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCronometroActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Evento Reset
        hCrono.reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnMusicPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicPlayActionPerformed
        //Evento PlayMusic
        if(tRepro == null || !tRepro.isAlive()){
            tRepro = new Thread(new HiloRepro());
            tRepro.start(); //Esta en estado Runable
            //System.out.println(tRepro.getState());
            return;
        }
        if(tRepro != null && tRepro.isAlive()){
            tRepro.resume();
            //System.out.println(tRepro.getState());
        }
    }//GEN-LAST:event_btnMusicPlayActionPerformed

    private void btnMusicPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicPauseActionPerformed
        //Evento MusicPause
        if(tRepro != null && tRepro.isAlive()){ //no se puede poner .isAlive(), xq el objeto es null y da nullPointerException
            tRepro.suspend(); //En suspended esta enm el estado Timed_Waited
            //System.out.println(tRepro.getState());
        }
    }//GEN-LAST:event_btnMusicPauseActionPerformed

    private void btnMusicStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicStopActionPerformed
        //Evento Stop
        if(tRepro != null){
            tRepro.stop(); //Esta en estado Terminated
            //System.out.println(tRepro.getState());
        }
    }//GEN-LAST:event_btnMusicStopActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMusicPause;
    private javax.swing.JButton btnMusicPlay;
    private javax.swing.JButton btnMusicStop;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCronometro;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
