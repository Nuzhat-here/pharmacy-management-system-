/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;
import DbConnection.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author USER
 */
public class Medcon {
    Connection con = dbConnection.getConnection();
    PreparedStatement ps;
    
   
    public int getMax(){
        int MedId = 0;
        Statement st;
       
        try {
            st = con.createStatement();
             ResultSet rs = st.executeQuery("select max(MedId) from medicinetable");
             while (rs.next()){
                 MedId = rs.getInt(1);
             }
             
        } catch (SQLException ex) {
            Logger.getLogger(Medcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MedId + 1;
        
    }
    
    public void insert (int MedId, String MedName,String MedPrice, String MedQnty,  String MedExp, String MedCmp ){
        String sql = "insert into medicinetable values (?,?,?,?,?,?)";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, MedId);
            ps.setString(2, MedName);
            ps.setString(3, MedPrice);
            ps.setString(4, MedQnty);
            
            ps.setString(5, MedExp);
            ps.setString(6, MedCmp);
            
            if (ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"New data added successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Medcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
public void getMedicineValue(JTable table, String searchValue){
    String sql = "select * from medicinetable";
    
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+searchValue+"%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                model.addRow(row);
            }
        } catch (Exception ex) {
            
        }
    
}

public boolean isIdExist(int MedId){
        try{
        ps = con.prepareStatement("select * from medicinetable where MedQnty = ?");
        ps.setInt(1, MedId);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            return true;
        }
    }
        catch (SQLException ex){
            Logger.getLogger(Medcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

public void Delete(int id){
    int yesOrNo = JOptionPane.showConfirmDialog(null, "data will deleted","med Delete",JOptionPane.OK_CANCEL_OPTION,0);
    if(yesOrNo == JOptionPane.OK_OPTION){
        try {
            ps = con.prepareStatement("delete from medicinetable where MedId = ?");
            ps.setInt(1, id);
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Medicine deleted successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Medcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

}



