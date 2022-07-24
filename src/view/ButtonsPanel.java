package view;

import java.awt.BorderLayout;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import model.StegnphyThread;

public class ButtonsPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File file;
	private JButton sendBtn;
	private JButton chooseFileBtn;
	private JButton applyStegnphyBtn;
	
	
	ButtonsPanel(ImagesPanel imagesPanel){
		setLayout(new BorderLayout());
		sendBtn=new JButton();
		chooseFileBtn=new JButton();
		sendBtn.setText("Send Image");
		chooseFileBtn.setText("Choose Image");
		
		chooseFileBtn.addActionListener(e->{
			JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            	file=fileChooser.getSelectedFile();
            	imagesPanel.showOriginalImage(file.getPath());
            	System.out.println(file);
            }
		});
		
		applyStegnphyBtn.addActionListener(e->{
			new StegnphyThread().start();
		});
		add(BorderLayout.NORTH,sendBtn);
		add(BorderLayout.SOUTH,chooseFileBtn);
		add(applyStegnphyBtn);
		
	}
}
