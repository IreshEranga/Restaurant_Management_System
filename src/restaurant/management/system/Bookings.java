/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant.management.system;

import dao.BookingDao;
import dao.DbOperations;
import dao.ReservationtableDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Booking;
import model.Reservationtable;

/**
 *
 * @author Kavini
 */
public class Bookings extends javax.swing.JFrame {
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobilePattern = "^[0-9]*$";

    /**
     * Creates new form Bookings
     */
    public Bookings() {
        initComponents();
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    public void validateFields(){
    String email = txtEmail.getText();
        String mobile = txtMobile.getText();
        if(email.matches(emailPattern) && mobile.matches(mobilePattern) && mobile.length()==10)
            btnUpdate.setEnabled(true);
        else
            btnUpdate.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAddReservation = new javax.swing.JButton();
        ComboBoxTableNo = new javax.swing.JComboBox<>();
        SpinnerGuests = new javax.swing.JSpinner();
        txtMobile = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCheckAvailability = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 70, 30, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        jLabel1.setText("Edit Booking");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 270, -1));

        btnAddReservation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnAddReservation.setText("Add Booking");
        btnAddReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReservationActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        getContentPane().add(ComboBoxTableNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 240, -1));

        SpinnerGuests.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(SpinnerGuests, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 240, -1));

        txtMobile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileKeyReleased(evt);
            }
        });
        getContentPane().add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 240, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 240, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 240, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 240, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Time :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Date :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Table No :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Number of Guests :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contact Number :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Emai :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ID :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        jLabel10.setText("Manage Bookings");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 270, -1));

        btnCheckAvailability.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCheckAvailability.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnCheckAvailability.setText("Check Availability");
        btnCheckAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAvailabilityActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 190, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("View Bookings");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Contact No.", "No. of Guests", "Table No.", "Date", "Time"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 700, 310));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Name :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblId.setText("00");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        txtTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 240, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        int a= JOptionPane.showConfirmDialog(null, "Do you want to close this ?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Admin().setVisible(true);
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReservationActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddReservation().setVisible(true);
    }//GEN-LAST:event_btnAddReservationActionPerformed

    private void btnCheckAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAvailabilityActionPerformed
        // TODO add your handling code here:
        String tableNo = (String) ComboBoxTableNo.getSelectedItem();
        Date date = jDateChooser2.getDate();
        String time = txtTime.getText();

        if (tableNo == null || date == null) {
            JOptionPane.showMessageDialog(null, "Please select a table, date, and time.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(date);

        String query = "SELECT * FROM booking WHERE tableNo = '" + tableNo + "' AND date = '" + formattedDate + "' AND time = '" + time + "'";
        ResultSet rs = DbOperations.getData(query);

        try {
            if (rs != null && rs.next()) {
                JOptionPane.showMessageDialog(null, "Table is not available at the selected time.");
            } else {
                JOptionPane.showMessageDialog(null, "Table is available.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCheckAvailabilityActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Booking booking = new Booking();
        int id = Integer.parseInt(lblId.getText());
        booking.setId(id);
        booking.setName(txtName.getText());
        booking.setEmail(txtEmail.getText());
        booking.setMobile(txtMobile.getText());
        booking.setGuests((int) SpinnerGuests.getValue());
        booking.setTableNo((String) ComboBoxTableNo.getSelectedItem());
        // Convert JDateChooser date to String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(jDateChooser2.getDate());
        booking.setDate(formattedDate);       
        booking.setTime(txtTime.getText());
        // Retrieve time from txtTime field
//        String time = txtTime.getText();
//        booking.setTime(time);

        BookingDao.update(booking);
        setVisible(false);
        new Bookings().setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtMobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtMobileKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        ArrayList<Booking> list = BookingDao.getAllRecords();
        Iterator<Booking> itr = list.iterator();
            while(itr.hasNext()){
            Booking bookingObj = itr.next();
            dtm.addRow(new Object[] {bookingObj.getId(),bookingObj.getName(),bookingObj.getEmail(),bookingObj.getMobile(),bookingObj.getGuests(),bookingObj.getTableNo(),bookingObj.getDate(),bookingObj.getTime()});
        }
    }//GEN-LAST:event_formComponentShown

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index = jTable2.getSelectedRow();
        TableModel model = jTable2.getModel();
        String id = model.getValueAt(index, 0).toString();
        lblId.setText(id);
        String name = model.getValueAt(index, 1).toString();
        txtName.setText(name);
        String email = model.getValueAt(index, 2).toString();
        txtEmail.setText(email);
        String mobile = model.getValueAt(index, 3).toString();
        txtMobile.setText(mobile);
        String guests = model.getValueAt(index, 4).toString();
        SpinnerGuests.setValue(Integer.parseInt(guests));
        String tableNo = model.getValueAt(index, 5).toString();
        String date = model.getValueAt(index, 6).toString();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            jDateChooser2.setDate(sdf.parse(date));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String time = model.getValueAt(index, 7).toString();
        txtTime.setText(time);
        
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        ComboBoxTableNo.removeAllItems();
        ComboBoxTableNo.addItem(tableNo);
        
        ArrayList<Reservationtable> reservationtableList = ReservationtableDao.getAllRecords();
        Iterator<Reservationtable> reservationtableItr = reservationtableList.iterator();
        while(reservationtableItr.hasNext()){
                Reservationtable reservationtableObj = reservationtableItr.next();
                if(!reservationtableObj.getName().equals(tableNo))
                    ComboBoxTableNo.addItem(reservationtableObj.getName());
            }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String id = lblId.getText();
        int a = JOptionPane.showConfirmDialog(null,"Do yo want to Delete booking ? ","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            BookingDao.delete(id);
            setVisible(false);
            new Bookings().setVisible(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTableNo;
    private javax.swing.JSpinner SpinnerGuests;
    private javax.swing.JButton btnAddReservation;
    private javax.swing.JButton btnCheckAvailability;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

}
