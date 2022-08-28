package typometer;

import javax.swing.JFrame;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import java.awt.Insets;

public class Demo_GUI
{
	public JFrame frame;
	private JTextField input_field;
	private Stopwatch sw = new Stopwatch();
	private final WordUtility wu = new WordUtility();

	public Demo_GUI(TypingSample sample)
	{
		initialize(sample);
	}

	private void initialize(TypingSample sample)
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel typometer_title = new JLabel("");
		typometer_title.setBounds(490, 80, 300, 25);
		typometer_title.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image typometer_title_obj = new ImageIcon(this.getClass().getResource("/typometer_title_lite.png")).getImage();
		typometer_title.setIcon(new ImageIcon(typometer_title_obj));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(typometer_title);
		
		JTextArea paragraph = new JTextArea(sample.getSampleText());
		paragraph.setBounds(404, 170, 460, 150);
		paragraph.setForeground(new Color(0, 0, 0));
		paragraph.setWrapStyleWord(true);
		paragraph.setMargin(new Insets(2, 5, 2, 5));
		paragraph.setFocusable(false);
		paragraph.setBorder(null);
		paragraph.setBackground(new Color(245, 245, 245));
		paragraph.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		paragraph.setLineWrap(true);
		paragraph.setToolTipText("Sample Paragraph");
		paragraph.setEditable(false);
		frame.getContentPane().add(paragraph);
		
		input_field = new JTextField();
		input_field.setBounds(404, 360, 460, 100);
		input_field.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		input_field.setHorizontalAlignment(SwingConstants.CENTER);
		input_field.setForeground(Color.BLACK);
		input_field.setBackground(new Color(245, 245, 245));
		input_field.setBorder(null);
		input_field.setToolTipText("Start Typing here...");
		frame.getContentPane().add(input_field);
		
		JButton home_button = new JButton("HOME");
		home_button.setBounds(410, 510, 100, 25);
		home_button.setForeground(Color.WHITE);
		home_button.setBackground(new Color(204, 0, 0));
		home_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		home_button.setFocusable(false);
		home_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		home_button.setToolTipText("Back to Homepage");
		home_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Home ref = new Home();
				ref.setVisible(true);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(home_button);
		
		JButton login_button = new JButton("LOGIN");
		login_button.setBounds(530, 510, 100, 25);
		login_button.setForeground(Color.WHITE);
		login_button.setBackground(new Color(204, 0, 0));
		login_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		login_button.setFocusable(false);
		login_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login_button.setToolTipText("Login Into Your Account");
		login_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Login ref = new Login();
				ref.setVisible(true);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(login_button);
		
		JButton register_button = new JButton("REGISTER");
		register_button.setBounds(650, 510, 100, 25);
		register_button.setForeground(Color.WHITE);
		register_button.setBackground(new Color(204, 0, 0));
		register_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		register_button.setFocusable(false);
		register_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register_button.setToolTipText("Create a New Account");
		register_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Register ref = new Register();
				ref.setVisible(true);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(register_button);
		
		JButton developers_button = new JButton("DEVELOPERS");
		developers_button.setBounds(770, 510, 100, 25);
		developers_button.setForeground(Color.WHITE);
		developers_button.setBackground(new Color(204, 0, 0));
		developers_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		developers_button.setFocusable(false);
		developers_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		developers_button.setToolTipText("Reach the Developers");
		developers_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Developers ref = new Developers();
				ref.setVisible(true);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(developers_button);
		
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
		frame.getContentPane().add(exit_button);
		
		JButton refresh_button = new JButton("");
		refresh_button.setBounds(936, 238, 30, 30);
		refresh_button.setContentAreaFilled(false);
		refresh_button.setIcon(new ImageIcon("C:\\Users\\qwe\\eclipse-workspace\\TypoMeter\\Pictures\\refresh_button.png"));
		refresh_button.setBorder(null);
		refresh_button.setFocusable(false);
		refresh_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		refresh_button.setToolTipText("Restart the Test");
		refresh_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Demo.main(null);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(refresh_button);
		
		JLabel background_picture = new JLabel("");
		background_picture.setBounds(90, 20, 1100, 610);
		background_picture.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(background_picture);
		Image background_picture_obj = new ImageIcon(this.getClass().getResource("/magna_doodle.png")).getImage();
		background_picture.setIcon(new ImageIcon(background_picture_obj));
		
		JPanel result_board = new JPanel();
		result_board.setBackground(new Color(245, 245, 245));
		result_board.setToolTipText("Results of the Completed Test");
		result_board.setBounds(1020, 80, 250, 200);
		result_board.setBorder(new MatteBorder(1, 1, 5, 5, (Color) new Color(0, 51, 153)));
		frame.getContentPane().add(result_board);
		result_board.setLayout(new BoxLayout(result_board, BoxLayout.Y_AXIS));
		
		JLabel result_title = new JLabel("       RESULT");
		result_title.setForeground(new Color(0, 51, 153));
		result_title.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		result_board.add(result_title);
		
		JLabel partition_line = new JLabel(" ---------------------------");
		partition_line.setForeground(new Color(0, 51, 153));
		partition_line.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		result_board.add(partition_line);
		
		JLabel stopwatch_field = new JLabel(" Time: 0.0 Seconds");
		stopwatch_field.setForeground(Color.RED);
		stopwatch_field.setFont(new Font("Verdana", Font.PLAIN, 18));
		result_board.add(stopwatch_field);
		
		JLabel words_count_field = new JLabel(" Number of Words: 0");
		words_count_field.setFont(new Font("Verdana", Font.PLAIN, 18));
		result_board.add(words_count_field);

		JLabel wpm_field = new JLabel("");
		wpm_field.setFont(new Font("Verdana", Font.PLAIN, 18));
		wpm_field.setVisible(false);
		result_board.add(wpm_field);
		
		JLabel accuracy_field = new JLabel("");
		accuracy_field.setFont(new Font("Verdana", Font.PLAIN, 18));
		accuracy_field.setVisible(false);
		result_board.add(accuracy_field);

		Timer stopwatchTimer = new Timer(500, new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				double timeElapsed = sw.timeElapsed()/1000;
				stopwatch_field.setText(String.format(" Time : %.1f Seconds", (float)timeElapsed));
			}
		});
		
		input_field.addKeyListener(new KeyAdapter()
		{
                        @Override
			public void keyReleased(KeyEvent e)
			{
				if (!stopwatchTimer.isRunning()) 
				{
					sw = new Stopwatch(); 
					stopwatchTimer.start();
				}
				int wordCount = wu.countWords(input_field.getText());
				words_count_field.setText(String.format(" Number of Words : %d",wordCount));
				if (input_field.getText().length() >= sample.getCharacterCount())
				{
					input_field.setEnabled(false); 
					stopwatchTimer.stop();
					sw.setStop(); 
					float acurracyPercent = wu.acurracy(sample.getSampleText(),input_field.getText())*100; 
					accuracy_field.setText(String.format(" Accuracy : %.2f%%", acurracyPercent)); 
					double wordsPerMin = wu.wordsPerMinute(sw.getTotalTime(), wordCount); 
					wpm_field.setText(String.format(" Net Speed : %.2f WPM", wordsPerMin)); 

					wpm_field.setVisible(true);
					accuracy_field.setVisible(true);
				}
				
			}
		});
		
	}
}