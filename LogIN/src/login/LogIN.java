/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author abdir
 */
public class LogIN implements ActionListener{
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordlabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JPanel panel = new JPanel(); 
        
        JFrame frame = new JFrame();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        panel.setLayout(null);
        
        userlabel = new JLabel("user");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);
        
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        
        passwordlabel = new JLabel("password");
        passwordlabel.setBounds(10, 50, 80, 25);
        panel.add(passwordlabel);
        
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        
        button = new JButton("log in ");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new LogIN());
        panel.add(button);
        
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        
        
         frame.add(panel);
         frame.setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String user = userText.getText();
      String password = passwordText.getText();
     
      
      if(user.equals("ibrahim") && password.equals("ibrahim1999") ){
          success.setText("log in successfull");
      }
      else{
          success.setText("incorrect username of password");
      }
    }
    
}
