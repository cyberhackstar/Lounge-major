/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.time.LocalDate;

/**
 *
 * @author bikku
 */
public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    public CheckIn() {
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

        jLabel1 = new javax.swing.JLabel();
        jt1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unique Code");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 140, -1));
        getContentPane().add(jt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 90, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check In");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(7, 14, 3, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jta1.setEditable(false);
        jta1.setBackground(new java.awt.Color(0, 0, 0));
        jta1.setColumns(20);
        jta1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jta1.setForeground(new java.awt.Color(255, 255, 255));
        jta1.setLineWrap(true);
        jta1.setRows(6);
        jScrollPane1.setViewportView(jta1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 360, 290, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Book");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(7, 14, 3, 14));
        jButton2.setName(""); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 393, 120, 50));
        jButton2.getAccessibleContext().setAccessibleDescription("");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Menu");
        jButton3.setToolTipText("");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(7, 14, 3, 14));
        jButton3.setName(""); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 393, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resize/21 (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


       
       int userId = Integer.parseInt(jt1.getText());

        // Connect to the MySQL database
        Connection conn = null;
        PreparedStatement stmt = null;
        PreparedStatement deleteStmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/scorpian", "root", "1616");

            // Prepare the SQL statement to fetch the booking details based on user ID
            String sql = "SELECT * FROM bookings WHERE unique_code = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, userId);

            // Execute the SQL statement
            rs = stmt.executeQuery();

            // Check if any bookings were found for the user
            if (rs.next()) {
                LocalDate bookingDate = rs.getDate("date_of_booking").toLocalDate();
                LocalDate currentDate = LocalDate.now();

                // Compare the booking date with the current date
                if (bookingDate.equals(currentDate)) {
                    // Successful check-in
                    JOptionPane.showMessageDialog(null,"Check-in successful! Enjoy your stay.");
                    jta1.append("Booking Id: "+ rs.getInt("booking_id"));
                    jta1.append("\nCustomer Name: "+ rs.getString("user_name"));
                    jta1.append("\nUnique Code: "+ rs.getInt("unique_code"));
                    jta1.append("\nTotal Seats: "+ rs.getInt("no_of_seats"));
                    jta1.append("\nBooking Date: "+ rs.getDate("date_of_booking"));
                    jta1.append("\nTotal Amount: "+ rs.getInt("booking_amount"));

                    String deleteSql = "DELETE FROM bookings WHERE unique_code = ?";
                    deleteStmt = conn.prepareStatement(deleteSql);
                    deleteStmt.setInt(1, userId);

                    int rowsAffected = deleteStmt.executeUpdate();

                    if (rowsAffected>0){
                        System.out.println("successful");
                    }
                    else {
                        System.out.println("Not deleted");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Your booking is for " + bookingDate + ". Please check-in on the correct date.");
                    jta1.append("Booking Id: "+ rs.getInt("booking_id"));
                    jta1.append("\nCustomer Name: "+ rs.getString("user_name"));
                    jta1.append("\nUnique Code: "+ rs.getInt("unique_code"));
                    jta1.append("\nTotal Seats: "+ rs.getInt("no_of_seats"));
                    jta1.append("\nBooking Date: "+ rs.getDate("date_of_booking"));
                    jta1.append("\nTotal Amount: "+ rs.getInt("booking_amount"));

                }
            } else {
                System.out.println("No bookings found for the Unique Code: " + userId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the database resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Booking f = new Booking();
        f.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu f = new Menu();
        f.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextArea jta1;
    // End of variables declaration//GEN-END:variables
}
