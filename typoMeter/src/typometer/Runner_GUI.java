package typometer;

import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.sql.*;

public class Runner_GUI
{
	public JFrame frame;
	private JTextField input_field;
	private Stopwatch sw = new Stopwatch();
	private final WordUtility wu = new WordUtility();
	
	public static String wpm_out;
	public static String words_out;
	public static String accuracy_out;
	public static String time_out;
	private JTable table_record;
	
	DefaultTableModel model;

	public Runner_GUI(TypingSample sample)
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
		paragraph.setBackground(Color.WHITE);
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
		input_field.setBackground(Color.WHITE);
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
				
				Home obj = new Home();
				obj.setVisible(true);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(home_button);
		
		JButton back_button = new JButton("BACK");
		back_button.setBounds(530, 510, 100, 25);
		back_button.setForeground(Color.WHITE);
		back_button.setBackground(new Color(204, 0, 0));
		back_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		back_button.setFocusable(false);
		back_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back_button.setToolTipText("Back to Options Menu");
		back_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Option_Menu.main(null);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(back_button);
		
		JButton submit_button = new JButton("SUBMIT");
		submit_button.setBounds(650, 510, 100, 25);
		submit_button.setForeground(Color.WHITE);
		submit_button.setBackground(new Color(204, 0, 0));
		submit_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		submit_button.setFocusable(false);
		submit_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		submit_button.setToolTipText("Submit Your Results");
		submit_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Connection con = null;
				PreparedStatement st = null;
				
				try
				{
		            String query = "insert into typingdata(timeoutput, wpm, accuracy, words, username) values (?, ?, ?, ?, ?);";
		            
		            Class.forName("com.mysql.jdbc.Driver");
		            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/typometer?autoReconnect=true&useSSL=false", "root", "12345");
		            st = con.prepareStatement(query);
		            st.setString(1, time_out);
		            st.setString(2, wpm_out);
		            st.setString(3, accuracy_out);
		            st.setString(4, words_out);
		            st.setString(5, Login.userid);
		            
		            st.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Result Submitted Successfully");
		        }
		        catch(Exception ex)
		        {
		            JOptionPane.showMessageDialog(null, ex);
		        }
			}
		});
		frame.getContentPane().add(submit_button);
		
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
				Developers obj = new Developers();
				obj.setVisible(true);
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
				Runner.main(null);
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
		
		JButton record_button = new JButton("VIEW RECORDS");
		record_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		record_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Connection con = null;
				PreparedStatement st = null;
				
				model = new DefaultTableModel();
				Object[] column = {"Time", "Words", "Speed", "Accuracy"};
			    // Object[] row = new Object[0];
				model.setColumnIdentifiers(column);
				
				try
				{
		            String query = "SELECT timeoutput, words, wpm, accuracy FROM typingdata where username='" + Login.userid +"';";
		            
		            Class.forName("com.mysql.jdbc.Driver");
		            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/typometer?autoReconnect=true&useSSL=false", "root", "12345");
		            st = con.prepareStatement(query);
		            ResultSet rs = st.executeQuery();
		            while(rs.next())
		            {
		            	model.addRow(new Object[] {
		            			rs.getString("timeoutput"),
		            			rs.getString("words"),
		            			rs.getString("wpm"),
		            			rs.getString("accuracy"),
		            	});
		            }
		            
		            table_record.setModel(model);
		            
		        }
		        catch(Exception ex)
		        {
		            JOptionPane.showMessageDialog(null, ex);
		        }
				
			}
		});
		record_button.setToolTipText("View Your Records");
		record_button.setForeground(Color.WHITE);
		record_button.setFocusable(false);
		record_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		record_button.setBackground(new Color(204, 0, 0));
		record_button.setBounds(1020, 285, 250, 25);
		frame.getContentPane().add(record_button);
		
		JPanel result_board = new JPanel();
		result_board.setBackground(Color.WHITE);
		result_board.setToolTipText("Results for the Completed Test");
		result_board.setBounds(1020, 80, 250, 200);
		result_board.setBorder(new MatteBorder(1, 1, 5, 5, (Color) new Color(0, 51, 153)));
		frame.getContentPane().add(result_board);
		result_board.setLayout(new BoxLayout(result_board, BoxLayout.Y_AXIS));

		JLabel username = new JLabel(" User : " + Login.userid);
		username.setFont(new Font("Broadway", Font.PLAIN, 19));
		username.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		username.setBounds(1020, 70, 49, 14);
		result_board.add(username);
		
		JLabel partition_line = new JLabel(" ---------------------------");
		partition_line.setForeground(new Color(0, 51, 153));
		partition_line.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		result_board.add(partition_line);
		
		JLabel result_title = new JLabel("       RESULT");
		result_title.setForeground(new Color(0, 51, 153));
		result_title.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		result_board.add(result_title);
		
		JLabel stopwatch_field = new JLabel(" Time: 0.0 Seconds");
		stopwatch_field.setForeground(Color.RED);
		stopwatch_field.setFont(new Font("Verdana", Font.PLAIN, 18));
		result_board.add(stopwatch_field);
		
		JLabel word_count_field = new JLabel(" Number of Words: 0");
		word_count_field.setFont(new Font("Verdana", Font.PLAIN, 18));
		result_board.add(word_count_field);
		
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
				word_count_field.setText(String.format(" Number of Words : %d",wordCount));
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
					wpm_out = (String.format("%.0f WPM", wordsPerMin));
					words_out = (String.format("%d",wordCount));
					accuracy_out = (String.format("%.1f%%", acurracyPercent));
					time_out = (String.format("%.1f Sec.", (sw.timeElapsed()/1000)));
				}	
			}
		});
		
		JScrollPane record_table = new JScrollPane();
		record_table.setBackground(Color.WHITE);
		record_table.setEnabled(false);
		record_table.setToolTipText("Your Records");
		record_table.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		record_table.setFocusable(false);
		record_table.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		record_table.setBorder(new MatteBorder(1, 1, 5, 5, (Color) new Color(204, 0, 0)));
		record_table.setBounds(1020, 310, 250, 270);
		frame.getContentPane().add(record_table);
		
		table_record = new JTable();
		table_record.setBackground(Color.WHITE);
		table_record.setEditingRow(0);
		table_record.setEditingColumn(0);
		table_record.setRowMargin(2);
		table_record.setRowHeight(20);
		table_record.setGridColor(new Color(0, 51, 153));
		table_record.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		table_record.setFocusable(false);
		table_record.setEnabled(false);
		table_record.setRowSelectionAllowed(false);
		table_record.setSelectionForeground(new Color(0, 0, 0));
		table_record.setSelectionBackground(new Color(220, 220, 220));
		table_record.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		table_record.setBorder(null);
     /* model = new DefaultTableModel();
		Object[] column = {"Time", "Words", "Speed", "Accuracy"};
	    // Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
	*/	record_table.setViewportView(table_record);
		// table_record.setModel(model);
		table_record.setToolTipText("");
		table_record.getTableHeader().setReorderingAllowed(false);
	}
}