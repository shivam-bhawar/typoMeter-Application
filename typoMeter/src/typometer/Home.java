package typometer;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("Home Page");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 467);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel typometer_title = new JLabel("");
		typometer_title.setBounds(490, 80, 300, 25);
		typometer_title.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));		
		Image typometer_title_obj = new ImageIcon(this.getClass().getResource("/typometer_title_lite.png")).getImage();
		typometer_title.setIcon(new ImageIcon(typometer_title_obj));
		contentPane.add(typometer_title);
		
		JLabel keyboard = new JLabel("");
		keyboard.setBounds(388, 135, 493, 345);
		Image keyboard_obj = new ImageIcon(this.getClass().getResource("/keyboard.gif")).getImage();
		keyboard.setIcon(new ImageIcon(keyboard_obj));
		contentPane.add(keyboard);
		
		JButton demo_button = new JButton("DEMO");
		demo_button.setBounds(410, 510, 100, 25);
		demo_button.setForeground(Color.WHITE);
		demo_button.setBackground(new Color(204, 0, 0));
		demo_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		demo_button.setFocusable(false);
		demo_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		demo_button.setToolTipText("Take a Quick Test");
		demo_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Demo.main(null);
				dispose();
			}
		});
		contentPane.add(demo_button);
		
		JButton login_button = new JButton("LOGIN");
		login_button.setBounds(530, 510, 100, 25);
		login_button.setForeground(Color.WHITE);
		login_button.setBackground(new Color(204, 0, 0));
		login_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		login_button.setFocusable(false);
		login_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login_button.setToolTipText("Login into Your Account");
		login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Login ref = new Login();
				ref.setVisible(true);
				dispose();
			}
		});
		contentPane.add(login_button);
		
		JButton register_button = new JButton("REGISTER");
		register_button.setBounds(648, 510, 100, 25);
		register_button.setForeground(Color.WHITE);
		register_button.setBackground(new Color(204, 0, 0));
		register_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		register_button.setFocusable(false);
		register_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register_button.setToolTipText("Create a New Account");
		register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Register ref = new Register();
				ref.setVisible(true);
				dispose();
			}
		});
		contentPane.add(register_button);
		
		JButton developers_button = new JButton("DEVELOPERS");
		developers_button.setBounds(770, 510, 100, 25);
		developers_button.setForeground(Color.WHITE);
		developers_button.setBackground(new Color(204, 0, 0));
		developers_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		developers_button.setFocusable(false);
		developers_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		developers_button.setToolTipText("Reach the Developers");
		developers_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Developers ref = new Developers();
				ref.setVisible(true);
				dispose();
			}
		});
		contentPane.add(developers_button);
		
		JButton exit_button = new JButton("");
		exit_button.setBounds(936, 156, 30, 30);
		exit_button.setContentAreaFilled(false);
		exit_button.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\exit_button.png"));
		exit_button.setBorder(null);
		exit_button.setFocusable(false);
		exit_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit_button.setToolTipText("Exit the Application");
		exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(exit_button);
		
		JLabel background_picture = new JLabel("");
		background_picture.setBounds(90, 20, 1100, 610);
		Image background_picture_obj = new ImageIcon(this.getClass().getResource("/magna_doodle.png")).getImage();
		background_picture.setIcon(new ImageIcon(background_picture_obj));
		contentPane.add(background_picture);
	}
}
