
import java.awt.Toolkit;
import db.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My
 */
public class options extends javax.swing.JFrame {


    /**
     * Creates new form options
     */
    public options() {
         this.setUndecorated(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        double width = toolkit.getScreenSize().getWidth();
        
        double height = toolkit.getScreenSize().getHeight();
        
        this.setSize((int)width, (int)height);
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

        jPanel1 = new javax.swing.JPanel();
        search_word = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SEARCH_WORD = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        w1 = new javax.swing.JLabel();
        frame = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        search_word.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search_word.setForeground(new java.awt.Color(255, 255, 255));
        search_word.setText("SEARCH THE WORD");
        jPanel1.add(search_word);
        search_word.setBounds(640, 330, 230, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\My\\Downloads\\red_bg.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 310, 620, 60);

        SEARCH_WORD.setText("SEARCH THE WORD");
        SEARCH_WORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_WORDActionPerformed(evt);
            }
        });
        jPanel1.add(SEARCH_WORD);
        SEARCH_WORD.setBounds(420, 310, 620, 60);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dict/dict_logo1.jpg"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(420, 75, 620, 200);

        w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dict/w1.jpg"))); // NOI18N
        jPanel1.add(w1);
        w1.setBounds(420, 75, 620, 630);

        frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dict/frame.jpg"))); // NOI18N
        jPanel1.add(frame);
        frame.setBounds(370, 0, 720, 780);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dict/bg.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1370, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SEARCH_WORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_WORDActionPerformed
        // TODO add your handling code here:
         search_word s1=new search_word();
             s1.setVisible(true);
             dispose(); 
       
        
    }//GEN-LAST:event_SEARCH_WORDActionPerformed

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
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SEARCH_WORD;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel frame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel search_word;
    private javax.swing.JLabel w1;
    // End of variables declaration//GEN-END:variables
}
