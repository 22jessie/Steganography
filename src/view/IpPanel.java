package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IpPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField ipTextField;
	
	IpPanel(){
		add(new JLabel("IP Address: "));
		ipTextField=new JTextField(20);
		add(ipTextField);
	}
	
	public String getIpAddress() {
		return ipTextField.getText();
	}

}
