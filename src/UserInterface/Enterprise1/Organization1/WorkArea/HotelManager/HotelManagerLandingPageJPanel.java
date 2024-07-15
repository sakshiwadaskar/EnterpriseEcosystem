/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Enterprise1.Organization1.WorkArea.HotelManager;

import TheBusiness.Business.Business;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerProfile;
import TheBusiness.UserAccountManagement.UserAccount;
import UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.WorkResp1.ManageStaffJPanel;
import UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.WorkResp2.ManageSuppliesJPanel;
import UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.WorkResp3.RecruitStudentsJPanel;
import UserInterface.Main.ChangePasswordJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aadityakasbekar
 */
public class HotelManagerLandingPageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HotelManagerLandingPageJPanel
     */
    Business business;
    javax.swing.JPanel CardSequencePanel;
    HotelManagerProfile hotelManagerProfile;
    UserAccount userAcc;

    public HotelManagerLandingPageJPanel(Business b, HotelManagerProfile hmp, JPanel cardSequencePanel) {
        initComponents();
        business = b;
        this.hotelManagerProfile = hmp;
        this.CardSequencePanel = cardSequencePanel;

        txtOrganization.setText("JW Mariott");
        txtName.setText(hotelManagerProfile.getPerson().getName());
        txtEnterprise.setText("Mariott International Inc.");
        txtRole.setText(hotelManagerProfile.getRole());
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
        btnManageStaff = new javax.swing.JButton();
        btnManageSupplies = new javax.swing.JButton();
        btnRecruitStaff = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        lblEnterprise = new javax.swing.JLabel();
        txtEnterprise = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Welcome Hotel Manager");

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

        btnManageStaff.setBackground(new java.awt.Color(0, 153, 255));
        btnManageStaff.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnManageStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnManageStaff.setText("Manage Staff");
        btnManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStaffActionPerformed(evt);
            }
        });

        btnManageSupplies.setBackground(new java.awt.Color(0, 153, 255));
        btnManageSupplies.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnManageSupplies.setForeground(new java.awt.Color(255, 255, 255));
        btnManageSupplies.setText("Manage Supplies");
        btnManageSupplies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliesActionPerformed(evt);
            }
        });

        btnRecruitStaff.setBackground(new java.awt.Color(0, 153, 255));
        btnRecruitStaff.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRecruitStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnRecruitStaff.setText("Recruit Staff");
        btnRecruitStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecruitStaffActionPerformed(evt);
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

        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterprise.setText("Enterprise:");

        txtEnterprise.setEditable(false);
        txtEnterprise.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnChangePassword)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageStaff)
                            .addGap(18, 18, 18)
                            .addComponent(btnManageSupplies)
                            .addGap(36, 36, 36)
                            .addComponent(btnRecruitStaff))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEnterprise)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblOrganization)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblRole)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(lblOrganization)
                    .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEnterprise)
                        .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRole)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangePassword)
                    .addComponent(btnManageStaff)
                    .addComponent(btnManageSupplies)
                    .addComponent(btnRecruitStaff))
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStaffActionPerformed
        ManageStaffJPanel manageStaffPanel = new ManageStaffJPanel(business, hotelManagerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ManageStaffJPanel", manageStaffPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnManageStaffActionPerformed

    private void btnManageSuppliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliesActionPerformed
        ManageSuppliesJPanel manageSuppliesPanel = new ManageSuppliesJPanel(business, hotelManagerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ManageSuppliesJPanel", manageSuppliesPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnManageSuppliesActionPerformed

    private void btnRecruitStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecruitStaffActionPerformed
        RecruitStudentsJPanel recruitStudentsPanel = new RecruitStudentsJPanel(business, hotelManagerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("RecruitStudentsJPanel", recruitStudentsPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnRecruitStaffActionPerformed


    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:

        userAcc = business.getUserAccountDirectory().findUserAccount(hotelManagerProfile.getPerson().getPersonId());

        ChangePasswordJPanel changePasswordPanel = new ChangePasswordJPanel(business, userAcc);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ChangePasswordJPanel", changePasswordPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnChangePasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnManageSupplies;
    private javax.swing.JButton btnRecruitStaff;
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
