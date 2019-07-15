/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TTT;

import java.awt.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class TTT1 extends javax.swing.JFrame {
 private String startGame ="X";
 private int xcount =0;
 private int ocount =0;
    /**
     * Creates new form TTT1
     */
    public TTT1() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
   private void gameScore()
   {
   
       jLabel3.setText(String.valueOf(xcount));
       jLabel5.setText(String.valueOf(ocount));
   
   }
   private void choose_a_Player()
   {
   if(startGame.equalsIgnoreCase("X"))
   {
       startGame = "O";
   }
   else{
   startGame="X";
   }
   }       
    private void winningGame(){
    String b1=jButton1.getText();
    String b2=jButton2.getText();
    String b3=jButton3.getText();
    
    String b4=jButton6.getText();
    String b5=jButton7.getText();
    String b6=jButton8.getText();
    
    String b7=jButton11.getText();
    String b8=jButton12.getText();
    String b9=jButton13.getText();
    
    if(b1==("X")&&b2==("X")&&b3==("X"))
    {
    JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xcount++;
    gameScore();
    jButton1.setBackground(Color.ORANGE);
    jButton2.setBackground(Color.ORANGE);
    jButton3.setBackground(Color.ORANGE);
    }
     if(b4==("X")&&b5==("X")&&b6==("X"))
    {
    JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xcount++;
    gameScore();
    jButton6.setBackground(Color.ORANGE);
    jButton7.setBackground(Color.ORANGE);
    jButton8.setBackground(Color.ORANGE);
    }
      if(b7==("X")&&b8==("X")&&b9==("X"))
    {
    JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xcount++;
    gameScore();
    jButton11.setBackground(Color.ORANGE);
    jButton12.setBackground(Color.ORANGE);
    jButton13.setBackground(Color.ORANGE);
    }
       if(b1==("X")&&b4==("X")&&b7==("X"))
    {
    JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xcount++;
    gameScore();
    jButton1.setBackground(Color.cyan);
    jButton6.setBackground(Color.cyan);
    jButton11.setBackground(Color.cyan);
    }
        if(b2==("X")&&b5==("X")&&b8==("X"))
    {
    JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xcount++;
    gameScore();
    jButton2.setBackground(Color.cyan);
    jButton7.setBackground(Color.cyan);
    jButton12.setBackground(Color.cyan);
    }
         if(b3==("X")&&b6==("X")&&b9==("X"))
    {
    JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xcount++;
    gameScore();
    jButton3.setBackground(Color.cyan);
    jButton8.setBackground(Color.cyan);
    jButton13.setBackground(Color.cyan);
    }
          if(b1==("X")&&b5==("X")&&b9==("X"))
    {
    JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xcount++;
    gameScore();
    jButton1.setBackground(Color.MAGENTA);
    jButton7.setBackground(Color.MAGENTA);
    jButton13.setBackground(Color.MAGENTA);
    }
           if(b3==("X")&&b5==("X")&&b7==("X"))
    {
    JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xcount++;
    gameScore();
    jButton3.setBackground(Color.MAGENTA);
    jButton7.setBackground(Color.MAGENTA);
    jButton11.setBackground(Color.MAGENTA);
    }
            if(b1==("O")&&b2==("O")&&b3==("O"))
    {
    JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    ocount++;
    gameScore();
    jButton1.setBackground(Color.ORANGE);
    jButton2.setBackground(Color.ORANGE);
    jButton3.setBackground(Color.ORANGE);
    }
             if(b4==("O")&&b5==("O")&&b6==("O"))
    {
    JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    ocount++;
    gameScore();
    jButton6.setBackground(Color.ORANGE);
    jButton7.setBackground(Color.ORANGE);
    jButton8.setBackground(Color.ORANGE);
    }
              if(b7==("O")&&b8==("O")&&b9==("O"))
    {
    JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    ocount++;
    gameScore();
    jButton11.setBackground(Color.ORANGE);
    jButton12.setBackground(Color.ORANGE);
    jButton13.setBackground(Color.ORANGE);
    }
                 if(b1==("O")&&b4==("O")&&b7==("O"))
    {
    JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    ocount++;
    gameScore();
    jButton1.setBackground(Color.cyan);
    jButton6.setBackground(Color.cyan);
    jButton11.setBackground(Color.cyan);
    }
            if(b2==("O")&&b5==("O")&&b8==("O"))
    {
    JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    ocount++;
    gameScore();
    jButton2.setBackground(Color.cyan);
    jButton7.setBackground(Color.cyan);
    jButton12.setBackground(Color.cyan);
    }
              if(b3==("O")&&b6==("O")&&b9==("O"))
    {
    JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    ocount++;
    gameScore();
    jButton3.setBackground(Color.cyan);
    jButton8.setBackground(Color.cyan);
    jButton13.setBackground(Color.cyan);
    }  
             if(b1==("O")&&b5==("O")&&b9==("O"))
    {
    JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    ocount++;
    gameScore();
    jButton1.setBackground(Color.MAGENTA);
    jButton7.setBackground(Color.MAGENTA);
    jButton13.setBackground(Color.MAGENTA);
    }  
    
            if(b3==("O")&&b5==("O")&&b7==("O"))
    {
    JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    ocount++;
    gameScore();
    jButton3.setBackground(Color.MAGENTA);
    jButton7.setBackground(Color.MAGENTA);
    jButton11.setBackground(Color.MAGENTA);
    }        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jbtnreset = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TTT");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setText("Player O:");
        jPanel23.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel24.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel27.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnreset.setText("Reset");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });
        jPanel28.add(jbtnreset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new java.awt.BorderLayout());

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel29.add(jbtnexit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel29);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed

          System.exit(0);
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        
        jButton11.setText(null);
        jButton12.setText(null);
        jButton13.setText(null);
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
    jButton1.setText(startGame);
   if(startGame.equalsIgnoreCase("X"))
   {
       jButton1.setForeground(Color.GREEN);
   }
   else{
       jButton1.setForeground(Color.BLUE);
   }   
   choose_a_Player();
   winningGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setText(startGame);
   if(startGame.equalsIgnoreCase("X"))
   {
       jButton2.setForeground(Color.GREEN);
   }
   else{
       jButton2.setForeground(Color.BLUE);
   }   
   choose_a_Player();
   winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jButton3.setText(startGame);
   if(startGame.equalsIgnoreCase("X"))
   {
       jButton3.setForeground(Color.GREEN);
   }
   else{
       jButton3.setForeground(Color.BLUE);
   }   
   choose_a_Player();
   winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.setText(startGame);
   if(startGame.equalsIgnoreCase("X"))
   {
       jButton6.setForeground(Color.GREEN);
   }
   else{
       jButton6.setForeground(Color.BLUE);
   }   
   choose_a_Player();
   winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
   if(startGame.equalsIgnoreCase("X"))
   {
       jButton7.setForeground(Color.GREEN);
   }
   else{
       jButton7.setForeground(Color.BLUE);
   }   
   choose_a_Player();
   winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         jButton8.setText(startGame);
   if(startGame.equalsIgnoreCase("X"))
   {
       jButton8.setForeground(Color.GREEN);
   }
   else{
       jButton8.setForeground(Color.BLUE);
   }   
   choose_a_Player();
   winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         jButton11.setText(startGame);
   if(startGame.equalsIgnoreCase("X"))
   {
       jButton11.setForeground(Color.GREEN);
   }
   else{
       jButton11.setForeground(Color.BLUE);
   }   
   choose_a_Player();
   winningGame();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         jButton12.setText(startGame);
   if(startGame.equalsIgnoreCase("X"))
   {
       jButton12.setForeground(Color.GREEN);
   }
   else{
       jButton12.setForeground(Color.BLUE);
   }   
   choose_a_Player();
   winningGame();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText(startGame);
   if(startGame.equalsIgnoreCase("X"))
   {
       jButton13.setForeground(Color.GREEN);
   }
   else{
       jButton13.setForeground(Color.BLUE);
   }   
   choose_a_Player();
   winningGame();
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(TTT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TTT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TTT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTT1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    // End of variables declaration//GEN-END:variables
}

