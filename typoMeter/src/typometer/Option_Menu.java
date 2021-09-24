package typometer;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Option_Menu {

	private JFrame frame;
	public ButtonGroup bg;
	public String s;
	static String first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Option_Menu window = new Option_Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Option_Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.scrollbar);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1700, 1000);
		frame.getContentPane().setLayout(null);
		
		JLabel menu_board_title = new JLabel("");
		menu_board_title.setBounds(507, 75, 282, 143);
		menu_board_title.setBackground(Color.WHITE);
		Image menu_board_title_obj = new ImageIcon(this.getClass().getResource("/menu_board_title.png")).getImage();
		menu_board_title.setIcon(new ImageIcon(menu_board_title_obj));
		frame.getContentPane().add(menu_board_title);
		
		JLabel choose_option_title = new JLabel("Choose Test");
		choose_option_title.setToolTipText("Choose Any of the Following Paragraphs");
		choose_option_title.setBounds(535, 250, 250, 30);
		choose_option_title.setForeground(Color.WHITE);
		choose_option_title.setFont(new Font("Stencil", Font.PLAIN, 35));
		frame.getContentPane().add(choose_option_title);
		
		JRadioButton radio_button1 = new JRadioButton("The One with the Tea Leaves");
		radio_button1.setBounds(507, 330, 282, 50);
		radio_button1.setFont(new Font("Segoe Script", Font.BOLD, 16));
		radio_button1.setForeground(new Color(255, 153, 255));
		radio_button1.setBackground(UIManager.getColor("RadioButton.foreground"));
		radio_button1.setFocusable(false);
		radio_button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		radio_button1.setToolTipText("Paragraph No. 1");		
		radio_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(radio_button1.isSelected())
				{
					first="I'm not great at the advice, Can I interest you in a sarcastic comment?";
					Runner.main(null);
					frame.setVisible(false);
				}
			}
		});
		frame.getContentPane().add(radio_button1);

		JRadioButton radio_button2 = new JRadioButton("The One with the Rumor");
		radio_button2.setBounds(507, 400, 282, 50);
		radio_button2.setFont(new Font("Segoe Script", Font.BOLD, 16));
		radio_button2.setForeground(new Color(0, 255, 255));
		radio_button2.setBackground(UIManager.getColor("RadioButton.foreground"));
		radio_button2.setFocusable(false);
		radio_button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		radio_button2.setToolTipText("Paragraph No. 2");
		radio_button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(radio_button2.isSelected())
				{
					first="That’s right! ‘Cause I’m a Tribbiani! And this is what we do! I mean we may not be great thinkers or world leaders, we don’t read a lot or run very fast, but damnit! We can eat!";
					Runner.main(null);
					frame.setVisible(false);
				}
			}
		});
		frame.getContentPane().add(radio_button2);
		
		JRadioButton radio_button3 = new JRadioButton("The One with the Proposal");
		radio_button3.setBounds(507, 470, 282, 50);
		radio_button3.setFont(new Font("Segoe Script", Font.BOLD, 16));
		radio_button3.setForeground(new Color(255, 255, 0));
		radio_button3.setBackground(UIManager.getColor("RadioButton.foreground"));
		radio_button3.setFocusable(false);
		radio_button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		radio_button3.setToolTipText("Paragraph No. 3");
		radio_button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(radio_button3.isSelected())
				{
					first="I thought that it mattered what I said or where I said it. Then I realized the only thing that matters is that you make me happier than I ever thought I could be, and if you let me I will spend the rest of my life trying to make you feel the same way.";
					Runner.main(null);
					frame.setVisible(false);
				}
			}
		});
		frame.getContentPane().add(radio_button3);
		
		JLabel menu_board = new JLabel("");
		menu_board.setBounds(475, -80, 350, 733);
		Image menu_board_obj = new ImageIcon(this.getClass().getResource("/menu_board.png")).getImage();
		menu_board.setIcon(new ImageIcon(menu_board_obj));
		frame.getContentPane().add(menu_board);
	}
}

