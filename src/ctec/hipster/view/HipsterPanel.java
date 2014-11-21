package ctec.hipster.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import ctec.hipster.controller.HipsterAppController;
import javax.swing.JButton;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private SpringLayout baseLayout;
	private JButton btnUp;
	private JButton btnDown;

	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		hipsterImage = new JLabel("Eric Selfie", new ImageIcon(HipsterPanel.class.getResource("/ctec/hipster/view/images/CTECHipsterResize.jpg")), JLabel.CENTER);
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album info here");
		albumBox = new JComboBox();
		JButton btnDown = new JButton("Down");
		JButton btnUp = new JButton("Up");

		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupComboBox()
	{
		albumBox.setModel(new DefaultComboBoxModel(baseController.getSelfHipster().getHipsterAlbums()));

	}

	private void setupPanel()
	{
		this.setBackground(Color.YELLOW);
		this.setLayout(baseLayout);
		this.setSize(1000, 300);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);

		//add(btnUp);

		//add(btnDown);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, albumBox, 101, SpringLayout.EAST, albumLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, albumBox, -116, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 3, SpringLayout.NORTH, albumBox);

		baseLayout.putConstraint(SpringLayout.EAST, hipsterImage, -697, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 94, SpringLayout.EAST, hipsterImage);
		baseLayout.putConstraint(SpringLayout.NORTH, hipsterImage, -74, SpringLayout.NORTH, albumBox);

		//baseLayout.putConstraint(SpringLayout.WEST, btnUp, 6, SpringLayout.EAST, albumBox);
		//btnUp.setBackground(Color.LIGHT_GRAY);

		//baseLayout.putConstraint(SpringLayout.SOUTH, btnUp, -7, SpringLayout.NORTH, btnDown);
		//baseLayout.putConstraint(SpringLayout.NORTH, btnDown, 172, SpringLayout.NORTH, this);
		//baseLayout.putConstraint(SpringLayout.WEST, btnDown, 6, SpringLayout.EAST, albumBox);
	}

	private void setupListeners()
	{
		albumBox.addItemListener(new ItemListener()
		{

			@Override
			public void itemStateChanged(ItemEvent selected)
			{
				if (albumBox.getSelectedIndex() == 0)
				{
					albumLabel.setText("You are totes hip!");
				}
				else if (albumBox.getSelectedIndex() == 1)
				{
					albumLabel.setText("You might just have some hipness...");
				}
				else if (albumBox.getSelectedIndex() == 2)
				{
					albumLabel.setText("You hardly have any hipster...");
				}
				else
				{
					albumLabel.setText("On a scale from one to hipster, you're just not!");
				}
			}
		});
	}
}
