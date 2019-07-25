package OberverStudy;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//GUI
public class ChatClientGUI extends JFrame {
	   private JLabel label;
	   private JTextField textField;
	   private JButton button;
	   private IClientChat clientChat;
	   
	   public ChatClientGUI(IClientChat clientChat) {
	      this.clientChat = clientChat;
	      
	      label = new JLabel("");
	      textField = new JTextField("ddddd");
	      button = new JButton("전송");
	      
	      setLayout(new FlowLayout());
	      add(label);
	      add(textField);
	      add(button);
	      
	      button.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            clientChat.sendMessage(textField.getText());
	         }
	      });
	      
	      clientChat.addOnRecieveListener(new OnRecieveListener() {
	         @Override
	         public void onRecieve(String message) {
	            label.setText(message);
	         }
	      });
	      
	      setSize(500, 500);
	      setVisible(true);
	   }
	}
