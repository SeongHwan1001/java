package chatClient;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginPage extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel logoLabel;
	private JLabel messageLabel;
	private JTextField nameTextField;
	private JButton loginButton;
	private LoginListener loginListener;
	private GridBagLayout gridBagLayout;
	private StringMetrics stringMetrics;
	private String[] backgroundText;
	
	public LoginPage() {
		gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);
		initComponents();
		setBackground(new Color(255,255,0));
		stringMetrics = new StringMetrics(new Font("궁서", Font.ITALIC, 20));
		backgroundText = stringMetrics.toLineBreakString("5조5조5조5조5조5조5조5조5조5조5조5조5조5조5조5조5조5조5조5조5조5조", 300);
	}
	
	private void initComponents() {
		initLogoLabel();
		initMessageLabel();
		initNameTextField();
		initLoginButton();
	}
	
	private void initLogoLabel() {
		logoLabel = new JLabel(new ImageIcon("images/logo.png"));
		GridBagConstraints gridBagConstraints = makeGridBagConstraints(1, 1, 1, 1, 0, 0);
		add(logoLabel, gridBagConstraints);
	}
	
	private void initMessageLabel() {
		messageLabel = new JLabel("닉네임 : ");
		messageLabel.setOpaque(true);
		messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		messageLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		messageLabel.setFont(new Font("궁서",Font.BOLD, 20));
		messageLabel.setForeground(new Color(255,0,0)); 
		messageLabel.setBackground(new Color(0,0,255,100));
		messageLabel.setPreferredSize(new Dimension(200,50));
		GridBagConstraints gridBagConstraints = makeGridBagConstraints(1, 2, 1, 1, 0, 0);
		add(messageLabel, gridBagConstraints);
	}
	
	private void initNameTextField() {
		nameTextField = new JTextField(20);
		nameTextField.setPreferredSize(new Dimension(200,50));
		GridBagConstraints gridBagConstraints = makeGridBagConstraints(1, 3, 1, 1, 0, 0);
		add(nameTextField, gridBagConstraints);
}
	
	private void initLoginButton() {
		loginButton = new JButton("입장하기");
		loginButton.setPreferredSize(new Dimension(100,70));
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (loginListener != null)
					loginListener.onLoginRequest(nameTextField.getText());
			}
		});
		GridBagConstraints gridBagConstraints = makeGridBagConstraints(1, 4, 1, 1, 0, 0);
		gridBagConstraints.insets = new Insets(10, 0, 0, 0);
		gridBagConstraints.anchor = GridBagConstraints.LAST_LINE_END;
		gridBagConstraints.fill = GridBagConstraints.NONE;
		add(loginButton, gridBagConstraints);
}
	
	public void setLoginListener(LoginListener loginListener) {
		this.loginListener = loginListener;
	}
	
	public interface LoginListener {
		void onLoginRequest(String id);
	}
	
    public GridBagConstraints makeGridBagConstraints(int x, int y, int width, int height, int weightX, int weightY) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill= GridBagConstraints.BOTH;
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        gridBagConstraints.gridwidth = width;
        gridBagConstraints.gridheight = height;
        gridBagConstraints.weightx = weightX;
        gridBagConstraints.weighty = weightY;
        return gridBagConstraints;
    }
    
    @Override
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	g.setColor(new Color(255,128,128));
    	g.setFont(stringMetrics.getFont());
    	for (int i=0; i<backgroundText.length; i++) {
    		g.drawString(backgroundText[i], 0, stringMetrics.getHeight()*i);
    	}
    }
}
