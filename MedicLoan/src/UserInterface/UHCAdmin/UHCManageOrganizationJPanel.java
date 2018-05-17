/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UHCAdmin;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Komal
 */
public class UHCManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UHCManageOrganizationJPanel
     */
    private JPanel userProcessContainer;
    private OrganizationDirectory directory;
    public UHCManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory=directory;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        jcbOrganization.removeAllItems();
            jcbOrganization.addItem(Organization.Type.UniversityHealthCare);

    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblCustomername1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbOrganization = new javax.swing.JComboBox();
        btnCreateOrganization = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        tblOrganization.setBackground(new java.awt.Color(204, 255, 204));
        tblOrganization.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblOrganization.setForeground(new java.awt.Color(102, 0, 102));
        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Organization Id", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganization);

        add(jScrollPane1);
        jScrollPane1.setBounds(129, 100, 440, 110);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Activity:");
        add(jLabel6);
        jLabel6.setBounds(10, 11, 56, 16);

        lblCustomername1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustomername1.setForeground(new java.awt.Color(0, 102, 0));
        lblCustomername1.setText("Organization");
        add(lblCustomername1);
        lblCustomername1.setBounds(72, 11, 82, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Organization Type:");
        add(jLabel7);
        jLabel7.setBounds(148, 260, 115, 15);

        jcbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbOrganization);
        jcbOrganization.setBounds(301, 254, 226, 29);

        btnCreateOrganization.setBackground(new java.awt.Color(0, 153, 153));
        btnCreateOrganization.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCreateOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateOrganization.setText("Add Organization");
        btnCreateOrganization.setMaximumSize(new java.awt.Dimension(200, 200));
        btnCreateOrganization.setMinimumSize(new java.awt.Dimension(200, 200));
        btnCreateOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrganizationActionPerformed(evt);
            }
        });
        add(btnCreateOrganization);
        btnCreateOrganization.setBounds(240, 341, 204, 40);

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<");
        btnBack.setMaximumSize(new java.awt.Dimension(200, 200));
        btnBack.setMinimumSize(new java.awt.Dimension(200, 200));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 450, 55, 39);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrganizationActionPerformed
        // TODO add your handling code here:
        Organization.Type type = (Organization.Type) jcbOrganization.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_btnCreateOrganizationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateOrganization;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbOrganization;
    private javax.swing.JLabel lblCustomername1;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}
