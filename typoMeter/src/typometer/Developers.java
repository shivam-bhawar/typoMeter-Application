package typometer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Image;
import javax.swing.ImageIcon;

import java.awt.Desktop;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;

public class Developers extends JFrame {

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
					Developers frame = new Developers();
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
	public Developers() {
		setTitle("Developers");
		setBackground(Color.WHITE);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1131, 734);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel typometer_title = new JLabel("");
		typometer_title.setBounds(390, 90, 500, 40);
		typometer_title.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image typometer_title_obj = new ImageIcon(this.getClass().getResource("/typometer_title.png")).getImage();
		typometer_title.setIcon(new ImageIcon(typometer_title_obj));
		contentPane.add(typometer_title);
		
		JButton home_button = new JButton("HOME");
		home_button.setBounds(10, 10, 100, 25);
		home_button.setForeground(Color.WHITE);
		home_button.setBackground(Color.BLACK);
		home_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		home_button.setFocusable(false);
		home_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		home_button.setToolTipText("Back to Home Page");
		home_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Home second = new Home();
				second.setVisible(true);
				dispose();
			}
		});		
		contentPane.add(home_button);
		
		JLabel datta = new JLabel("");
		datta.setBounds(110, 410, 170, 23);
		datta.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image datta_obj = new ImageIcon(this.getClass().getResource("/DATTA.png")).getImage();
		datta.setIcon(new ImageIcon(datta_obj));
		contentPane.add(datta);
		
		JLabel katkhade = new JLabel("");
		katkhade.setBounds(78, 450, 240, 21);
		katkhade.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image katkhade_obj = new ImageIcon(this.getClass().getResource("/KATKHADE.png")).getImage();
		katkhade.setIcon(new ImageIcon(katkhade_obj));
		contentPane.add(katkhade);
		
		JButton datta_linkedin = new JButton("");
		datta_linkedin.setBounds(120, 488, 30, 35);
		datta_linkedin.setContentAreaFilled(false);
		datta_linkedin.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\linkedin_icon.png"));
		datta_linkedin.setBorder(null);
		datta_linkedin.setFocusable(false);
		datta_linkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		datta_linkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://linkedin.com/in/knight-furry/").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(datta_linkedin);
		
		JButton datta_github = new JButton("");
		datta_github.setBounds(183, 490, 30, 30);
		datta_github.setContentAreaFilled(false);
		datta_github.setBorder(null);
		datta_github.setFocusable(false);
		datta_github.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\github_icon.png"));
		datta_github.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		datta_github.setToolTipText("Smelly Cat");
		datta_github.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://github.com/knight-furry/").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(datta_github);
		
		JButton datta_instagram = new JButton("");
		datta_instagram.setBounds(246, 490, 30, 30);
		datta_instagram.setContentAreaFilled(false);
		datta_instagram.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\instagram_icon.png"));
		datta_instagram.setBorder(null);
		datta_instagram.setFocusable(false);
		datta_instagram.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		datta_instagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/datta.katkhade/").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(datta_instagram);
		
		JLabel rituja = new JLabel("");
		rituja.setBounds(405, 410, 180, 25);
		rituja.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image rituja_obj = new ImageIcon(this.getClass().getResource("/RITUJA.png")).getImage();
		rituja.setIcon(new ImageIcon(rituja_obj));
		contentPane.add(rituja);
		
		JLabel puranik = new JLabel("");
		puranik.setBounds(383, 450, 220, 25);
		puranik.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image puranik_obj = new ImageIcon(this.getClass().getResource("/PURANIK.png")).getImage();
		puranik.setIcon(new ImageIcon(puranik_obj));
		contentPane.add(puranik);
		
		JButton rituja_linkedin = new JButton("");
		rituja_linkedin.setBounds(420, 488, 30, 35);
		rituja_linkedin.setContentAreaFilled(false);
		rituja_linkedin.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\linkedin_icon.png"));
		rituja_linkedin.setBorder(null);
		rituja_linkedin.setFocusable(false);
		rituja_linkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rituja_linkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://linkedin.com/in/rituja-puranik-a676781b0").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(rituja_linkedin);
		
		JButton rituja_github = new JButton("");
		rituja_github.setBounds(483, 490, 30, 30);
		rituja_github.setContentAreaFilled(false);
		rituja_github.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\github_icon.png"));
		rituja_github.setBorder(null);
		rituja_github.setFocusable(false);
		rituja_github.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rituja_github.setToolTipText("Smelly Cat");
		rituja_github.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://github.com/Rituja123/").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(rituja_github);
		
		JButton rituja_instagram = new JButton("");
		rituja_instagram.setBounds(546, 490, 30, 30);
		rituja_instagram.setContentAreaFilled(false);
		rituja_instagram.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\instagram_icon.png"));
		rituja_instagram.setBorder(null);
		rituja_instagram.setFocusable(false);
		rituja_instagram.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rituja_instagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/rituja_puranik/").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(rituja_instagram);
		
		JLabel pranavi = new JLabel("");
		pranavi.setBounds(670, 413, 230, 23);
		pranavi.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image pranavi_obj = new ImageIcon(this.getClass().getResource("/PRANAVI.png")).getImage();
		pranavi.setIcon(new ImageIcon(pranavi_obj));
		contentPane.add(pranavi);
		
		JLabel pote = new JLabel("");
		pote.setBounds(725, 450, 120, 24);
		pote.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image pote_obj = new ImageIcon(this.getClass().getResource("/POTE.png")).getImage();
		pote.setIcon(new ImageIcon(pote_obj));
		contentPane.add(pote);
		
		JButton pranavi_linkedin = new JButton("");
		pranavi_linkedin.setBounds(710, 488, 30, 35);
		pranavi_linkedin.setContentAreaFilled(false);
		pranavi_linkedin.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\linkedin_icon.png"));
		pranavi_linkedin.setBorder(null);
		pranavi_linkedin.setFocusable(false);
		pranavi_linkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pranavi_linkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("http://www.linkedin.com/in/pranavi-pote-7266231b4").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(pranavi_linkedin);
			
		JButton pranavi_github = new JButton("");
		pranavi_github.setBounds(773, 490, 30, 30);
		pranavi_github.setContentAreaFilled(false);
		pranavi_github.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\github_icon.png"));
		pranavi_github.setBorder(null);
		pranavi_github.setFocusable(false);
		pranavi_github.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pranavi_github.setToolTipText("What are they");
		pranavi_github.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://github.com/pranavi8308").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(pranavi_github);
		
		JButton pranavi_instagram = new JButton("");
		pranavi_instagram.setBounds(836, 490, 30, 30);
		pranavi_instagram.setContentAreaFilled(false);
		pranavi_instagram.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\instagram_icon.png"));
		pranavi_instagram.setBorder(null);
		pranavi_instagram.setFocusable(false);
		pranavi_instagram.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pranavi_instagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/___cute_teen_54/").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(pranavi_instagram);
		
		JLabel shivam = new JLabel("");
		shivam.setBounds(990, 413, 190, 22);
		shivam.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image shivam_obj = new ImageIcon(this.getClass().getResource("/SHIVAM.png")).getImage();
		shivam.setIcon(new ImageIcon(shivam_obj));
		contentPane.add(shivam);
		
		JLabel bhawar = new JLabel("");
		bhawar.setBounds(978, 450, 210, 21);
		bhawar.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image bhawar_obj = new ImageIcon(this.getClass().getResource("/BHAWAR.png")).getImage();
		bhawar.setIcon(new ImageIcon(bhawar_obj));
		contentPane.add(bhawar);
		
		JButton shivam_linkedin = new JButton("");
		shivam_linkedin.setBounds(1010, 488, 30, 35);
		shivam_linkedin.setContentAreaFilled(false);
		shivam_linkedin.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\linkedin_icon.png"));
		shivam_linkedin.setBorder(null);
		shivam_linkedin.setFocusable(false);
		shivam_linkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		shivam_linkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://linkedin.com/in/shivam-bhawar/").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(shivam_linkedin);
		
		JButton shivam_github = new JButton("");
		shivam_github.setBounds(1073, 490, 30, 30);
		shivam_github.setContentAreaFilled(false);
		shivam_github.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\github_icon.png"));
		shivam_github.setBorder(null);
		shivam_github.setFocusable(false);
		shivam_github.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		shivam_github.setToolTipText("Feeding you ?");
		shivam_github.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://github.com/shivam-bhawar/").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(shivam_github);
		
		JButton shivam_instagram = new JButton("");
		shivam_instagram.setBounds(1136, 490, 30, 30);
		shivam_instagram.setContentAreaFilled(false);
		shivam_instagram.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\instagram_icon.png"));
		shivam_instagram.setBorder(null);
		shivam_instagram.setFocusable(false);
		shivam_instagram.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		shivam_instagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Desktop.getDesktop().browse(new URL("https://instagram.com/5hivam.bhawar").toURI());
				      }
				catch(Exception e)
				      {}
			}
		});
		contentPane.add(shivam_instagram);
		
		JLabel background_picture = new JLabel("");
		background_picture.setBounds(0, 0, 1281, 658);
		Image background_picture_obj = new ImageIcon(this.getClass().getResource("/background_picture.png")).getImage();
		background_picture.setIcon(new ImageIcon(background_picture_obj));
		contentPane.add(background_picture);
	}
}