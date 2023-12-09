package View;

import Data.user;
import javax.swing.*;  
public class Parameters {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame 


JTextField username= new JTextField("Name :"+ user.name);
JTextField usersurname= new JTextField("Surname :"+ user.surname);
JTextField useremail= new JTextField("Email :"+ user.email);
JTextField userphone= new JTextField("Phone :"+ user.phone_number);

JButton buttonvalid=new JButton("Save changes");//creating instance of JButton

username.setBounds(10,20,150,40);
usersurname.setBounds(10,70,150,40);
useremail.setBounds(10,120,150,40);
userphone.setBounds(10,170,150,40);
buttonvalid.setBounds(300,230,180, 50);//x axis, y axis, width, height  

f.add(buttonvalid);//adding button in JFrame 
f.add(username);
f.add(usersurname);
f.add(useremail);
f.add(userphone);

          
f.setSize(500,400); 
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  