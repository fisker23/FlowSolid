/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flowsolid;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreas Fisker
 */
public class GUI extends javax.swing.JFrame {

    private WordPairControlInterface con;
    private int startSize; //Antal af ordpar ved starten
    private ArrayList<String> AnsweredQuestionList = new ArrayList<>();
    /**
     * Creat    es new form GUI
     */
    public GUI() {
        con = new Control();
        con.load("WordList.txt");
        startSize = con.size();
        initComponents();
        jLabelFeedback.setText("");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelQuestion = new javax.swing.JLabel();
        jTextFieldQuestion = new javax.swing.JTextField();
        jLabelAnswer = new javax.swing.JLabel();
        jTextFieldAnswer = new javax.swing.JTextField();
        jButtonNext = new javax.swing.JButton();
        jButtonGuess = new javax.swing.JButton();
        jButtonLookUp = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jLabelFeedback = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelQuestion.setText("Question");

        jTextFieldQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuestionActionPerformed(evt);
            }
        });

        jLabelAnswer.setText("Answer");

        jTextFieldAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnswerActionPerformed(evt);
            }
        });

        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonGuess.setText("Guess");
        jButtonGuess.setPreferredSize(new java.awt.Dimension(61, 31));
        jButtonGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuessActionPerformed(evt);
            }
        });

        jButtonLookUp.setText("Look Up");
        jButtonLookUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLookUpActionPerformed(evt);
            }
        });

        jButtonNew.setText("New");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jLabelFeedback.setText("Her skal feedback være!");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Language Trainer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelAnswer)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonLookUp, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(109, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelQuestion)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuestion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelAnswer))
                    .addComponent(jButtonGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLookUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelFeedback)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        jLabelFeedback.setText("");
        if(AnsweredQuestionList.size() != con.size()){
        String question = con.getRandomQuestion();
            if (AnsweredQuestionList.contains(question)){
                jButtonNextActionPerformed(evt);
            }
            else jTextFieldQuestion.setText(question);
        }
        else{
        jLabelFeedback.setText("Congratz! You have answered all questions!");
        jTextFieldQuestion.setText("");
        
        }
        jTextFieldAnswer.setText("");
        
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuessActionPerformed
        // TODO add your handling code here:
        if(
        con.checkGuess(jTextFieldQuestion.getText(), jTextFieldAnswer.getText())){
            AnsweredQuestionList.add(jTextFieldQuestion.getText());
            jLabelFeedback.setText("Korrekt");
        }
        else{
            jLabelFeedback.setText("False");
        }
        
    }//GEN-LAST:event_jButtonGuessActionPerformed

    private void jButtonLookUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLookUpActionPerformed
        // TODO add your handling code here:
        jTextFieldAnswer.setText(con.lookup(jTextFieldQuestion.getText()));
    }//GEN-LAST:event_jButtonLookUpActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        if(jButtonNew.getText().equals("New")){
            jButtonNew.setText("Save");
            jButtonGuess.setVisible(false);
            jButtonLookUp.setVisible(false);
            jButtonNext.setVisible(false);
            jTextFieldQuestion.setText("");
            jTextFieldAnswer.setText("");
        }
        else if(jButtonNew.getText().equals("Save")){
            if(jTextFieldAnswer.getText().equals("") || jTextFieldQuestion.getText().equals("")){
            jLabelFeedback.setText("New Question Not Added!");
            }
            else{
            con.add(jTextFieldQuestion.getText(), jTextFieldAnswer.getText());
            con.addLevel(jTextFieldQuestion.getText(), 1);
            jLabelFeedback.setText("New Question Added!");
            }
            jButtonNew.setText("New");
            jButtonGuess.setVisible(true);
            jButtonLookUp.setVisible(true);
            jButtonNext.setVisible(true);
            jTextFieldQuestion.setText("");
            jTextFieldAnswer.setText("");
        }
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jTextFieldAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnswerActionPerformed

    private void jTextFieldQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuestionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(con.size() > startSize){ //Tjekker om der er tilføjet nye ord.
        int Save = JOptionPane.showConfirmDialog(null, "Save before Exit?");
        if(Save == 0) con.save("WordList.txt");
        if(Save == 0 || Save == 1) dispose();
        }
        else dispose(); //Lukker uden at spørge om save, hvis der ikk er tilføjet nye ord.
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuess;
    private javax.swing.JButton jButtonLookUp;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JLabel jLabelFeedback;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JTextField jTextFieldAnswer;
    private javax.swing.JTextField jTextFieldQuestion;
    // End of variables declaration//GEN-END:variables
}
