package view;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImagesPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton originalImageLabel;
	private JButton embeddedLabel;
	private JButton finalImageLabel;
	
	
	ImagesPanel(){
		setLayout(new GridLayout(1,3));
		add(originalImageLabel=new JButton());
		add(embeddedLabel=new JButton());
		add(finalImageLabel=new JButton());
		originalImageLabel.setSize(500, 500);
		finalImageLabel.setSize(500, 500);
		embeddedLabel.setSize(500, 500);
	}
	
	
	public void showOriginalImage(String image) {
		originalImageLabel.setIcon(new ImageIcon(image));
	}	
	
	public void showEmbeddedImage(BufferedImage image) {
		embeddedLabel.setIcon(new ImageIcon(image));	
	}
	
	public void showFinalImage(BufferedImage image) {
		finalImageLabel.setIcon(new ImageIcon(image));
	}
}
