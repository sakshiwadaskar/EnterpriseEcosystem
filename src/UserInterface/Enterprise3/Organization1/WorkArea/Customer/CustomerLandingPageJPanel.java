/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Enterprise3.Organization1.WorkArea.Customer;

import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.Personnel.Enterprise1.Organization2.SalesPersonProfile;
import TheBusiness.UserAccountManagement.UserAccount;
import UserInterface.Enterprise1.Organization1.WorkArea.FrontDeskStaff.WorkResp1.ManageBookingsJPanel;
import UserInterface.Enterprise2.Organization1.WorkArea.SalesRepresentative.WorkResp1.ManageProductsJPanel;
import UserInterface.Enterprise3.Organization1.WorkArea.Customer.WorkResp1.BookARoomJPanel;
import UserInterface.Enterprise3.Organization1.WorkArea.Customer.WorkResp2.ViewMyBookingsJPanel;
import UserInterface.Main.ChangePasswordJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aadityakasbekar
 */
public class CustomerLandingPageJPanel extends javax.swing.JPanel {

    Business business;
    javax.swing.JPanel CardSequencePanel;
    CustomerProfile customerProfile;
    UserAccount userAcc;

    /**
     * Creates new form CustomerLandingPageJPanel
     */
    public CustomerLandingPageJPanel(Business b, CustomerProfile cp, JPanel clp) {
        initComponents();
        this.business = b;
        this.customerProfile = cp;
        this.CardSequencePanel = clp;

        txtOrganization.setText("Bookings.com");
        txtName.setText(customerProfile.getPerson().getName());
        txtEnterprise.setText("Booking Holdings Inc.");
        txtRole.setText(customerProfile.getRole());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        lblOrganization = new javax.swing.JLabel();
        txtOrganization = new javax.swing.JTextField();
        lblEnterprise = new javax.swing.JLabel();
        txtEnterprise = new javax.swing.JTextField();
        btnBookARoom = new javax.swing.JButton();
        btnManageBookings = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 300));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Welcome to Booking.com");

        lblName.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        lblRole.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Role:");

        txtRole.setEditable(false);
        txtRole.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        lblOrganization.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblOrganization.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganization.setText("Organization:");

        txtOrganization.setEditable(false);
        txtOrganization.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterprise.setText("Enterprise:");

        txtEnterprise.setEditable(false);
        txtEnterprise.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        btnBookARoom.setBackground(new java.awt.Color(0, 153, 255));
        btnBookARoom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBookARoom.setForeground(new java.awt.Color(255, 255, 255));
        btnBookARoom.setText("Book A Room");
        btnBookARoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookARoomActionPerformed(evt);
            }
        });

        btnManageBookings.setBackground(new java.awt.Color(0, 153, 255));
        btnManageBookings.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnManageBookings.setForeground(new java.awt.Color(255, 255, 255));
        btnManageBookings.setText("View my bookings");
        btnManageBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBookingsActionPerformed(evt);
            }
        });

        btnChangePassword.setBackground(new java.awt.Color(0, 153, 255));
        btnChangePassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setText("Change my password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOrganization)
                            .addComponent(lblEnterprise))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblRole)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnChangePassword)
                        .addGap(18, 18, 18)
                        .addComponent(btnBookARoom)
                        .addGap(18, 18, 18)
                        .addComponent(btnManageBookings)
                        .addGap(65, 65, 65)))
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblName))
                            .addGap(18, 18, 18)
                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblRole))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrganization)
                            .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnterprise))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageBookings)
                    .addComponent(btnBookARoom)
                    .addComponent(btnChangePassword))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBookingsActionPerformed
        ViewMyBookingsJPanel viewMyBookingsPanel = new ViewMyBookingsJPanel(business, customerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ViewMyBookingsJPanel", viewMyBookingsPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnManageBookingsActionPerformed

    private void btnBookARoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookARoomActionPerformed
        BookARoomJPanel bookARoomPanel = new BookARoomJPanel(business, customerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("BookARoomJPanel", bookARoomPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBookARoomActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:

        userAcc = business.getUserAccountDirectory().findUserAccount(customerProfile.getPerson().getPersonId());

        ChangePasswordJPanel changePasswordPanel = new ChangePasswordJPanel(business, userAcc);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ChangePasswordJPanel", changePasswordPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnChangePasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookARoom;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnManageBookings;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrganization;
    private javax.swing.JTextField txtRole;
    // End of variables declaration//GEN-END:variables
}
