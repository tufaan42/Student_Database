
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WIJN
 */
public class SU extends javax.swing.JFrame {
    String ID=new String();
    Connection conn=null;
    private Object Connect;
    /**
     * Creates new form SU
     */
    public SU() {
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

        bg3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        txt_sex = new javax.swing.JComboBox<>();
        txt_age = new javax.swing.JComboBox<>();
        txt_password = new javax.swing.JPasswordField();
        txt_name = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();
        txt_blood = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_registration = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new.jpg"))); // NOI18N
        bg3.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Submit");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(510, 380, 100, 30);

        txt_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(txt_sex);
        txt_sex.setBounds(220, 390, 90, 30);

        txt_age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });
        getContentPane().add(txt_age);
        txt_age.setBounds(220, 350, 90, 30);
        getContentPane().add(txt_password);
        txt_password.setBounds(220, 90, 160, 30);

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_name);
        txt_name.setBounds(220, 10, 160, 30);
        getContentPane().add(txt_username);
        txt_username.setBounds(220, 50, 160, 30);
        getContentPane().add(txt_department);
        txt_department.setBounds(220, 130, 160, 30);
        getContentPane().add(txt_blood);
        txt_blood.setBounds(220, 170, 160, 30);
        getContentPane().add(txt_phone);
        txt_phone.setBounds(220, 210, 160, 30);
        getContentPane().add(txt_email);
        txt_email.setBounds(220, 250, 160, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 65, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Username: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 50, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 100, 100, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Department: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 140, 130, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Blood Group: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 180, 130, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phone: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 220, 80, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Emai: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 250, 60, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Age: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 350, 50, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Sex:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 390, 50, 22);
        getContentPane().add(txt_registration);
        txt_registration.setBounds(220, 300, 160, 30);

        jLabel10.setText("Registration No:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, 300, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn=Sqlite.ConnectDB();
        ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      
   //to view or search
      s="select * from student_db";
      try{
          ps=conn.prepareStatement(s);
          rs=ps.executeQuery();
          while(rs.next()){
              //System.out.println(rs.getString("Username"));
               //jLabel3.setText(rs.getString("Username"));
               //System.out.println(rs.getString("Password"));
 if(rs.getString("Registration_no").equals(ID)){
     txt_name.setText(rs.getString("Name"));
     txt_username.setText(rs.getString("Username"));
     txt_password.setText(rs.getString("Password"));
     txt_blood.setText(rs.getString("Blood_group"));
     txt_phone.setText(rs.getString("Phone_no"));
     txt_age.setSelectedItem(rs.getString("Age"));
     txt_sex.setSelectedItem(rs.getString("Sex"));
     txt_department.setText(rs.getString("Department"));
     txt_email.setText(rs.getString("email"));
     txt_registration.setText(rs.getString("Registration_no"));
     //txt_name.setText(rs.getString("Name"));
     
     System.out.println("Login successful");
     break;
 }              
              
          }
          
      }catch(Exception e){
          System.out.printf("Login failed");
      }
    }//GEN-LAST:event_formWindowOpened

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        ResultSet rs=null;
      PreparedStatement ps=null;
      String s=new String();
      String s1=txt_name.getText();
      String s2=txt_username.getText();
      String s3=txt_password.getText();
      String s4=txt_department.getText();
      String s5=txt_blood.getText();
      String s6=txt_phone.getText();
      String s7=txt_email.getText();
      String s8=txt_age.getSelectedItem().toString();
      String s9=txt_sex.getSelectedItem().toString();
      String s10=txt_registration.getText();
      //s="update student_db set Name= '"+s1+"',Username='"+s2+"',Password='"+s3+"',Department='"+s4+"',Blood_group='"+s5+"',Phone_no='"+s6+"',email='"+s7+"',Age='"+s8+"',Sex='"+s9+"' where Name='"+s1+"' ";;
      try{   
          //s="select * from student_db";
          s="update student_db set Name= '"+s1+"',Username='"+s2+"',Password='"+s3+"',Department='"+s4+"',Blood_group='"+s5+"',Phone_no='"+s6+"',email='"+s7+"',Age='"+s8+"',Sex='"+s9+"',Registration_no='"+s10+"' where Registration_no='"+ID+"' ";
          ps=conn.prepareStatement(s);
          //ps.getTest();
          ps.execute();
          System.out.printf("Saved");
          
      }
      catch(Exception e){
          System.out.println("Not");
      }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> txt_age;
    private javax.swing.JTextField txt_blood;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_registration;
    private javax.swing.JComboBox<String> txt_sex;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
