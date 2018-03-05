// first we import all of the classes we will use
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
//import javax.swing.JTextArea;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.BorderLayout;


public class WindowDemo{
  public static void main(String[] args){

  JFrame window = new JFrame("GUI Test");
  JPanel content = new JPanel();
 //content.setLayout(new FlowLayout());
 //content.setLayout(new GridLayout(2,2));

 content.setLayout(new BorderLayout());


 JButton okButton = new JButton("OK");

 //JTextArea paragraph = new JTextArea("This one has a preset size", 5, 40);
 //JTextArea intro = new JTextArea("This is some text that is used to demo this text areas");

 String[] languages= {"English","Spanish","Chinese","French","Japanese"};
 JComboBox langDropdown = new JComboBox(languages);

 JButton cancelButton = new JButton("Cancel");
 JLabel title = new JLabel("component demo");


 //content.add(okButton);
 //content.add(cancelButton);
 //content.add(title);
 //content.add(langDropdown);

 content.add(title,BorderLayout.PAGE_START);
 content.add(langDropdown,BorderLayout.CENTER);


//content.add(paragraph);
//content.add(intro);

 window.setContentPane(content);
 window.setSize(250,300);
 window.setLocation(100,100);
 window.setVisible(true);

 }
}
