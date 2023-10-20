package View;

<<<<<<< HEAD
//import Data.user;
import javax.swing.*;  
public class CreateProfile {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame 
=======
import java.awt.Frame;

public class CreateProfile extends Frame {
	
	
>>>>>>> refs/remotes/origin/main

JTextField Nusername= new JTextField("Enter name :");
JTextField Nusersurname= new JTextField("Enter surname :");
JTextField Nuseremail= new JTextField("Enter email :");
JTextField Nuserpassword= new JTextField("Enter password :");

JButton buttonvalid=new JButton("Create profile");//creating instance of JButton

Nusername.setBounds(10,20,150,40);
Nusersurname.setBounds(10,70,150,40);
Nuseremail.setBounds(10,120,150,40);
Nuserpassword.setBounds(10,170,150,40);
buttonvalid.setBounds(300,230,180, 50);//x axis, y axis, width, height  

f.add(buttonvalid);//adding button in JFrame 
f.add(Nusername);
f.add(Nusersurname);
f.add(Nuseremail);
f.add(Nuserpassword);

          
f.setSize(500,400); 
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  

// créer une méthode créant un nouveau user
}  