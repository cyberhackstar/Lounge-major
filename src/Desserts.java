


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Desserts extends javax.swing.JFrame {

    /**
     * Creates new form beers
     */
    public Desserts() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        j3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        j1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        j2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(58, 65, 65));
        jButton1.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add To Cart");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMinimumSize(new java.awt.Dimension(133, 36));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 325, -1, 40));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setText("Total amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 30));

        j3.setEditable(false);
        j3.setToolTipText("");
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 120, 30));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 239, 239));
        jLabel1.setText("QTY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(58, 65, 65));
        jButton2.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SOFT DRINK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 170, -1));

        jButton3.setBackground(new java.awt.Color(58, 65, 65));
        jButton3.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("HOT BEVERAGES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 170, -1));

        jButton4.setBackground(new java.awt.Color(58, 65, 65));
        jButton4.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("GENERATE BILL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 170, 52));

        c1.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        c1.setForeground(new java.awt.Color(212, 212, 212));
        c1.setText("CHOCOLATE CAKE");
        c1.setIconTextGap(6);
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, -1));

        c2.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        c2.setForeground(new java.awt.Color(211, 211, 211));
        c2.setText("CHEESE CAKE");
        c2.setIconTextGap(6);
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 270, -1));
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 30, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Total Amount");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 120, 30));
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 30, 30));

        jButton6.setBackground(new java.awt.Color(58, 65, 65));
        jButton6.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("MENU");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 391, 170, 52));

        jButton7.setBackground(new java.awt.Color(58, 65, 65));
        jButton7.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("BURGERS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resize/d3.png"))); // NOI18N
        jLabel4.setText("Total Amount");
        jLabel4.setToolTipText("");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 640, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
String item="0";
String cat="Desserts";
int q=0,qq=0,amt1=0,amt2=0;
 double total=0.0;
      String v1, v2;

        v1 = j1.getText();
        v2 = j2.getText();
        
        if (v1.isEmpty()) {
            q = 0;
        } else {
            q = Integer.parseInt(v1);
        }
        if (v2.isEmpty()) {
            qq = 0;
        } else {
            qq = Integer.parseInt(v2);
        }
       
        if(c2.isSelected())
            amt2=qq*160;
        if(c1.isSelected())
        {amt1=q*155;}

total=amt1+amt2;
j3.setText(" "+total);
         if(c1.isSelected())
         {
             try
        {Class.forName("java.sql.DriverManager");
         Connection con=DriverManager.getConnection("jdbc:MySQL://localhost:3306/scorpian","root","1616");
         String sql;
                 String scat="Chocolate Cake";

         sql="insert into menu values('"+cat+"','"+scat+"',"+q+","+amt1+")";
         Statement st=con.createStatement();
         st.executeUpdate(sql);
         JOptionPane.showMessageDialog(null,"Chocolate Cake added");

        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());
        }
         }
if(c2.isSelected())
         {
             try
        {Class.forName("java.sql.DriverManager");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
         String sql;
                 String sct="Cheese Cake";

         sql="insert into menu values('"+cat+"','"+sct+"',"+qq+","+amt2+")";
         Statement st=con.createStatement();
         st.executeUpdate(sql);
         JOptionPane.showMessageDialog(null,"Cheese Cake added");

        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());
        }
         }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Softdrink f=new Softdrink();
f.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Hotbeverages f=new Hotbeverages();
f.setVisible(true);
this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   Finalbill f=new Finalbill();
f.setVisible(true);
this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
   Burgers f=new Burgers();
f.setVisible(true);
this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
Menu f=new Menu();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
