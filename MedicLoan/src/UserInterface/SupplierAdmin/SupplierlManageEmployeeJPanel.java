/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Komal
 */
public class SupplierlManageEmployeeJPanel extends javax.swing.JPanel {

    /**
        this.userProcessContainer =userProcessContainer; 
        this.directory=directory;
 Creates new form SupplierlManageEmployeeJPanel
     */
    private JPanel userProcessContainer; 
    private OrganizationDirectory directory;
    private EcoSystem system;
    public SupplierlManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory directory,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.directory=directory;
        this.system=system;
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }

    public void populateOrganizationComboBox(){
        jcbOrganization.removeAllItems();
        
        for (Organization organization : directory.getOrganizationList()){
            jcbOrganization.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        jcbOrgtoAddEmp.removeAllItems();
        
        for (Organization organization : directory.getOrganizationList()){
            jcbOrgtoAddEmp.addItem(organization);
        }
    }
    
    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[4];
            row[0] = employee.getId();
            row[1] = employee.getName();
            row[2] = employee.getEmailId();
            row[3] = employee.getAddress();
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

        jLabel6 = new javax.swing.JLabel();
        lblCustomername1 = new javax.swing.JLabel();
        jcbOrganization = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnCreateOrganization = new javax.swing.JButton();
        jcbOrgtoAddEmp = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtEmployee = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Activity:");
        add(jLabel6);
        jLabel6.setBounds(10, 11, 56, 16);

        lblCustomername1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCustomername1.setForeground(new java.awt.Color(0, 102, 0));
        lblCustomername1.setText("Employee");
        add(lblCustomername1);
        lblCustomername1.setBounds(72, 11, 61, 16);

        jcbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOrganizationActionPerformed(evt);
            }
        });
        add(jcbOrganization);
        jcbOrganization.setBounds(420, 20, 208, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Select Organization");
        add(jLabel7);
        jLabel7.setBounds(270, 20, 119, 20);

        tblEmployee.setBackground(new java.awt.Color(204, 255, 204));
        tblEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblEmployee.setForeground(new java.awt.Color(102, 0, 102));
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Employee Id", "Name", "Email Id", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        add(jScrollPane1);
        jScrollPane1.setBounds(160, 70, 640, 140);

        btnCreateOrganization.setBackground(new java.awt.Color(0, 153, 153));
        btnCreateOrganization.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCreateOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateOrganization.setText("Add Employee");
        btnCreateOrganization.setMaximumSize(new java.awt.Dimension(200, 200));
        btnCreateOrganization.setMinimumSize(new java.awt.Dimension(200, 200));
        btnCreateOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrganizationActionPerformed(evt);
            }
        });
        add(btnCreateOrganization);
        btnCreateOrganization.setBounds(370, 500, 223, 39);

        jcbOrgtoAddEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbOrgtoAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOrgtoAddEmpActionPerformed(evt);
            }
        });
        add(jcbOrgtoAddEmp);
        jcbOrgtoAddEmp.setBounds(430, 230, 208, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("Organization");
        add(jLabel8);
        jLabel8.setBounds(300, 230, 78, 15);

        txtEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeActionPerformed(evt);
            }
        });
        txtEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmployeeKeyPressed(evt);
            }
        });
        add(txtEmployee);
        txtEmployee.setBounds(430, 270, 208, 27);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("Employee Name");
        add(jLabel9);
        jLabel9.setBounds(300, 270, 95, 15);

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("Email Id:");
        add(jLabel10);
        jLabel10.setBounds(300, 320, 59, 15);

        txtEmailId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmailId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailIdKeyPressed(evt);
            }
        });
        add(txtEmailId);
        txtEmailId.setBounds(430, 310, 207, 27);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Address:");
        add(jLabel11);
        jLabel11.setBounds(300, 360, 59, 15);

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        add(jScrollPane2);
        jScrollPane2.setBounds(430, 350, 210, 100);
    }// </editor-fold>//GEN-END:initComponents

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    private void btnCreateOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrganizationActionPerformed
        // TODO add your handling code here:
        String name = txtEmployee.getText();
        String email = txtEmailId.getText();
        String address = txtAddress.getText();

        if (name.equals("") || email.equals("") || address.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (!validate(email)) {
            txtEmailId.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Please Enter Valid Email Id");
        } else {
            txtEmailId.setBackground(Color.white);
            Organization organization = (Organization) jcbOrgtoAddEmp.getSelectedItem();
            organization.getEmployeeDirectory().createEmployee(name, email, address);
            populateTable(organization);
            JOptionPane.showMessageDialog(null, "Employee Added to" + organization.getName() + ".");

        }
    }//GEN-LAST:event_btnCreateOrganizationActionPerformed

    private void txtEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeActionPerformed

    private void txtEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if ((key >= evt.VK_0 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9)) {
            txtEmployee.setEditable(false);
            txtEmployee.setBackground(Color.red);
        } else {
            txtEmployee.setEditable(true);
            txtEmployee.setBackground(Color.WHITE);
        }

        
    }//GEN-LAST:event_txtEmployeeKeyPressed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jcbOrgtoAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOrgtoAddEmpActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) jcbOrganization.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_jcbOrgtoAddEmpActionPerformed

    private void jcbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOrganizationActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) jcbOrganization.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_jcbOrganizationActionPerformed

    private void txtEmailIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateOrganization;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcbOrganization;
    private javax.swing.JComboBox jcbOrgtoAddEmp;
    private javax.swing.JLabel lblCustomername1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmployee;
    // End of variables declaration//GEN-END:variables
}