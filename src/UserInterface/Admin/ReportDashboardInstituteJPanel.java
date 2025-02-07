/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Admin;

import TheBusiness.Personnel.EmployeeProfile;
import TheBusiness.BookingManagement.Booking;
import TheBusiness.BookingManagement.Room;
import TheBusiness.Business.Business;
import TheBusiness.EducationManagement.StudentProfile;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author sakshiwadaskar
 */
public class ReportDashboardInstituteJPanel extends javax.swing.JPanel {

    Business business;
    javax.swing.JPanel CardSequencePanel;
    EmployeeProfile adminProfile;

    /**
     * Creates new form ReportDashboardJPanel
     */
    public ReportDashboardInstituteJPanel(Business b, EmployeeProfile hmp, JPanel cardSequencePanel) {
        initComponents();
        business = b;
        this.adminProfile = hmp;
        this.CardSequencePanel = cardSequencePanel;
        showCharts();
    }

    private void showCharts() {

        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();

        DefaultPieDataset barDatasetRoomWiseData = new DefaultPieDataset();

        List<StudentProfile> studentList = business.getStudentdirectory().getStudentList();
        int totalStudents = studentList.size();
        int totalNoOfStudentGraduated = 0;
        for (StudentProfile student : studentList) {
            if (student.isGraduated()) {
                totalNoOfStudentGraduated++;
            }
        }
        barDataset.setValue("Total Students", new Double(totalStudents));
        barDataset.setValue("Ready to be hired Students", new Double(totalNoOfStudentGraduated));

        JFreeChart piechart = ChartFactory.createPieChart("Hotel Management Institute", barDataset, false, true, false);//explain

        PiePlot piePlot = (PiePlot) piechart.getPlot();


//        //changing pie chart blocks colors
//        piePlot.setSectionPaint("Total Bookings", new Color(255, 255, 102));
//        piePlot.setSectionPaint("Total Rooms", new Color(102, 255, 102));
//
//        roomWisePiePlot.setSectionPaint("Suite", new Color(255, 102, 153));
//        roomWisePiePlot.setSectionPaint("Deluxe", new Color(255, 255, 102));
//        roomWisePiePlot.setSectionPaint("Super Deluxe", new Color(255, 102, 153));
//        roomWisePiePlot.setSectionPaint("Standard", new Color(255, 255, 102));
//        // piePlot.setSectionPaint("Nokia Lumia", new Color(0,204,204));

        piePlot.setBackgroundPaint(Color.white);
        

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
       

        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
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
        panelBarChart = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();

        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        panelBarChart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setText("<<Back");
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
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(851, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 316, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 317, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addContainerGap(767, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 252, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 253, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
        AdminJPanel manageSuppliesPanel = new AdminJPanel(business, adminProfile, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ManageSuppliesJPanel", manageSuppliesPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBarChart;
    // End of variables declaration//GEN-END:variables
}
