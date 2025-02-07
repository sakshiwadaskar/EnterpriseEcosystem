/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.WorkResp3;

import TheBusiness.Business.Business;
import TheBusiness.CourseManagement.Course;
import TheBusiness.EducationManagement.StudentProfile;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerProfile;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelStaffDirectory;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.Personnel.Profile;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;
import UserInterface.Enterprise1.Organization1.WorkArea.HotelManager.HotelManagerLandingPageJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aadityakasbekar
 */
public class RecruitStudentsJPanel extends javax.swing.JPanel {

    Business business;
    javax.swing.JPanel CardSequencePanel;
    HotelManagerProfile hotelManagerProfile;

    /**
     * Creates new form RecruitStudentsJPanel
     */
    public RecruitStudentsJPanel(Business b, HotelManagerProfile hmp, JPanel cardSequencePanel) {
        initComponents();
        business = b;
        this.hotelManagerProfile = hmp;
        this.CardSequencePanel = cardSequencePanel;

        System.out.println("Lets Do some Recruitment");
        populateTable();

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
        lblSubTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllStudentTable = new javax.swing.JTable();
        lblSubTitle2 = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        lblStaffType = new javax.swing.JLabel();
        txtStaffType = new javax.swing.JTextField();
        btnHire = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Recruit New Staff");

        lblSubTitle1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSubTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitle1.setText("View All Applicants");

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        tblAllStudentTable.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        tblAllStudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Age", "Contact", "Acquired Credits"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllStudentTable);

        lblSubTitle2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSubTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitle2.setText("Hire Staff");

        lblStudentID.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblStudentID.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentID.setText("ID:");

        txtStudentID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        lblStaffType.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblStaffType.setForeground(new java.awt.Color(255, 255, 255));
        lblStaffType.setText("Staff Type:");

        txtStaffType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        btnHire.setBackground(new java.awt.Color(0, 153, 255));
        btnHire.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnHire.setForeground(new java.awt.Color(255, 255, 255));
        btnHire.setText("Hire");
        btnHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHireActionPerformed(evt);
            }
        });

        btnBack.setBackground(java.awt.Color.pink);
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                    .addComponent(lblSubTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHire)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblStudentID)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtStudentID))
                                .addComponent(lblSubTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblStaffType)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtStaffType))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSubTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSubTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudentID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStaffType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStaffType))
                .addGap(18, 18, 18)
                .addComponent(btnHire)
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireActionPerformed

        //        JOptionPane.showMessageDialog(this, "New Staff Member Hired!", "Info", JOptionPane.INFORMATION_MESSAGE);
        StudentProfile studentProfile = business.getStudentdirectory().findStudent(txtStudentID.getText());

        if (txtStudentID.getText().equals(studentProfile.getPerson().getPersonId())) {
            System.out.println("Student found: " + txtStudentID.getText());

            int acqCredits = 0;
            for (Course regCourse : studentProfile.getRegisteredCourseList()) {
                try {
                    acqCredits = acqCredits + Integer.parseInt(regCourse.getCreditHours());
                } catch (NumberFormatException e) {
                    // Handle the exception (e.g., print an error message, set a default value, etc.)
                    System.out.println("Error parsing credit hours: " + regCourse.getCreditHours());
                }

            }

            if (acqCredits >= 8) {
                
                HotelStaffDirectory hotelStaffDirectory = business.getHotelStaffDirectory();
                PersonDirectory personDirectory = business.getPersonDirectory();
                UserAccountDirectory userAccountDirectory = business.getUserAccountDirectory();
                
//                Profile personProfile = personDirectory.findPerson(studentProfile.getPerson().getPersonId());
                
                Profile newStaffProfile = hotelStaffDirectory.addNewStaff(studentProfile.getPerson(), txtStaffType.getText());
                userAccountDirectory.newUserAccount(newStaffProfile, "hm" + newStaffProfile.getPerson().getName(), "hm" + newStaffProfile.getPerson().getName());
                
                System.out.println("Student Hired !! ");
                JOptionPane.showMessageDialog(null, "New applicant Hired.", "Information", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "New UserAccount Created.", "Information", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Username & Password is Applicant hm + first name.", "Information", JOptionPane.INFORMATION_MESSAGE);
                
                for (Profile hotelStaffProfile : business.getHotelStaffDirectory().getHotelStaffList()) {
                    
                    System.out.println(hotelStaffProfile.getPerson().getName());
                    
                }
                
            } else {
                System.out.println("Cannot Hire student. Not enough credits acquired.");
                JOptionPane.showMessageDialog(null, "Not enough credits acquired for recruitment.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            System.out.println("Student not found: " + txtStudentID.getText());
        }
    }//GEN-LAST:event_btnHireActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
        HotelManagerLandingPageJPanel hotelManagerLandingPagePanel = new HotelManagerLandingPageJPanel(business, hotelManagerProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("HotelManagerLandingPageJPanel", hotelManagerLandingPagePanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHire;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStaffType;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblSubTitle1;
    private javax.swing.JLabel lblSubTitle2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAllStudentTable;
    private javax.swing.JTextField txtStaffType;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblAllStudentTable.getModel();
        dtm.setRowCount(0);
        for (StudentProfile studentProfile : business.getStudentdirectory().getStudentList()) {

            int acqCredits = 0;
            for (Course regCourse : studentProfile.getRegisteredCourseList()) {
                try {
                    acqCredits = acqCredits + Integer.parseInt(regCourse.getCreditHours());
                } catch (NumberFormatException e) {
                    // Handle the exception (e.g., print an error message, set a default value, etc.)
                    System.out.println("Error parsing credit hours: " + regCourse.getCreditHours());
                }

            }

            Object[] row = new Object[7];
            row[0] = studentProfile.getPerson().getPersonId();
            row[1] = studentProfile.getPerson().getName();
            row[2] = studentProfile.getPerson().getGender();
            row[3] = studentProfile.getPerson().getAge();
            row[4] = studentProfile.getPerson().getPhoneNumber();
            row[5] = acqCredits;
            dtm.addRow(row);
        }
        System.out.println("Table Populated");
    }
}
