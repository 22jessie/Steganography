package view;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import model.Constants;

public class SteganographySender extends JFrame {
	
	
private static final long serialVersionUID = 1L;
	
	
	private final int WIDTH_PX = 500;
	private final int HEIGHT_PX = 500;
	
	private IpPanel ipPanel;
	private ButtonsPanel buttonsPanel;
	private ImagesPanel imagesPanel;
	
	public SteganographySender() {
		setSize(WIDTH_PX, HEIGHT_PX);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(Constants.APP_TITLE);
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH,ipPanel=new IpPanel());
		add(BorderLayout.CENTER,imagesPanel=new ImagesPanel());
		add(BorderLayout.SOUTH,buttonsPanel=new ButtonsPanel(imagesPanel));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}


}
