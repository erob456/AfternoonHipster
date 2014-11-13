package ctec.hipster.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import ctec.hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private SpringLayout baseLayout;
	
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album info here");
		albumBox = new JComboBox();
		baseLayout.putConstraint(SpringLayout.WEST, albumBox, 101, SpringLayout.EAST, albumLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, albumBox, -116, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 3, SpringLayout.NORTH, albumBox);
		hipsterImage = new JLabel("Eric Selfie", new ImageIcon(HipsterPanel.class.getResource("/ctec/hipster/view/images/CTECHipsterResize.jpg")), JLabel.CENTER);
		baseLayout.putConstraint(SpringLayout.EAST, hipsterImage, -697, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 94, SpringLayout.EAST, hipsterImage);
		baseLayout.putConstraint(SpringLayout.NORTH, hipsterImage, -74, SpringLayout.NORTH, albumBox);
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupComboBox()
	{
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.YELLOW);
		this.setLayout(baseLayout);
		this.setSize(1000,300);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
	}
	
	private void setupLayout()
	{
	}
	
	private void setupListeners()
	{
		
	}

}
