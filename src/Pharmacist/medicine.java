/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pharmacist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class medicine extends javax.swing.JFrame {

    /**
     * Creates new form medicine
     */
    public medicine() {
        initComponents();
    }
    
      Connection con = null;
    Statement st = null;
    ResultSet rs = null;
     
    public void clearField() {
        id.setText(null);
        name.setText(null);
       
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        medicineTable = new javax.swing.JTable();
        button36 = new java.awt.Button();
        search2 = new java.awt.Button();
        clear2 = new java.awt.Button();
        CompanyView2 = new java.awt.Button();
        jPanel20 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        company = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel15.setBackground(new java.awt.Color(0, 102, 51));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 204));
        jLabel17.setText("Pharmacy Management System");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(264, 264, 264))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel17)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(0, 102, 51));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 255, 204)));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Manage Medicine");

        medicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Exp Date", "Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(medicineTable);

        button36.setLabel("Back");
        button36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button36button34ActionPerformed(evt);
            }
        });

        search2.setLabel("Search");
        search2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search2searchMouseClicked(evt);
            }
        });

        clear2.setLabel("Clear");
        clear2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear2clearMouseClicked(evt);
            }
        });
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2clearbutton4ActionPerformed(evt);
            }
        });

        CompanyView2.setLabel("View");
        CompanyView2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompanyView2CompanyViewMouseClicked(evt);
            }
        });
        CompanyView2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyView2CompanyViewbutton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(CompanyView2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(button36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CompanyView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(204, 255, 204));

        jLabel28.setBackground(new java.awt.Color(255, 204, 204));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 102, 51));
        jLabel28.setText("Medicine");
        jLabel28.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel29.setBackground(new java.awt.Color(204, 204, 255));
        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 0));
        jLabel29.setText("ID");

        jLabel30.setBackground(new java.awt.Color(204, 204, 255));
        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 0));
        jLabel30.setText("Name");

        jLabel31.setBackground(new java.awt.Color(204, 204, 255));
        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 0));
        jLabel31.setText("Company");

        company.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incepta ", "Beximco", "Renata", "Globe", "Square", "ACME", "ACI", "Beacon", "Orion", "Sanofi", " " }));

        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel28))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(company, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button36button34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button36button34ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Do you want to go back?", "Pharmacy System", JOptionPane.YES_NO_CANCEL_OPTION);
        if (a == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_button36button34ActionPerformed

    private void search2searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2searchMouseClicked
        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
        model.setRowCount(0);

        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root123");
            String sql = "select * from company where id = " + id.getText();
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int i = 0;

            if (rs.next()) {
                int ID = rs.getInt("ID");
                String Medicine = rs.getString("Medicine");
                int Price = rs.getInt("Price");
                int Quantity = rs.getInt("quantity");
                String date = rs.getString("Date");
                String Company = rs.getString("Company");
                model.addRow(new Object[]{ID, Medicine, Price, Quantity, date, Company});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error",JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                JOptionPane.showMessageDialog(this, "Record Found");
            } else {
                //JOptionPane.showMessageDialog(this, "Record Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_search2searchMouseClicked

    private void clear2clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear2clearMouseClicked
        clearField();
    }//GEN-LAST:event_clear2clearMouseClicked

    private void clear2clearbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2clearbutton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear2clearbutton4ActionPerformed

    private void CompanyView2CompanyViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompanyView2CompanyViewMouseClicked
        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
        model.setRowCount(0);
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root123");
            Statement st = con.createStatement();
            String sql = "select * from company";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int ID = rs.getInt("ID");
                String Medicine = rs.getString("Medicine");
                int Price = rs.getInt("Price");
                int Quantity = rs.getInt("quantity");
                String date = rs.getString("Date");
                String Company = rs.getString("Company");

                model.addRow(new Object[]{ID, Medicine, Price, Quantity, date, Company});

            }

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_CompanyView2CompanyViewMouseClicked

    private void CompanyView2CompanyViewbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyView2CompanyViewbutton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyView2CompanyViewbutton4ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button CompanyView2;
    private java.awt.Button button36;
    private java.awt.Button clear2;
    private javax.swing.JComboBox<String> company;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable medicineTable;
    private javax.swing.JTextField name;
    private java.awt.Button search2;
    // End of variables declaration//GEN-END:variables
}