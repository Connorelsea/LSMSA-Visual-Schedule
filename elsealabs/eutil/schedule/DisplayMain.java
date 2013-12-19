package elsealabs.eutil.schedule;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DisplayMain extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	static ResourceManager RESOURCE_MANAGER;
	static Image image;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		image = new ImageIcon
		(new String().getClass()
				.getClass()
				.getResource("/img/UI.png"))
				.getImage();
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					DisplayMain frame = new DisplayMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DisplayMain() {
		
		setUndecorated(true);
		setBackground(new Color(0, 0, 0, 0));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 481);
		
		contentPane = new JPanel() {
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
				g.drawImage(image, 0, 0, null);
			}
			
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setOpaque(false);
		
		setContentPane(contentPane);
	}

}
