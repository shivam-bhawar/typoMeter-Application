package typometer;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import java.sql.*;

import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.awt.Cursor;

public class Register extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField first_name;
	private JTextField last_name;
	private JTextField email_id;
	private JTextField username;
	private JTextField password;
	private JTextField confirm_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setTitle("Register");
		setBackground(Color.WHITE);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1117, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel peephole_frame = new JLabel("");
		peephole_frame.setBounds(560, -10, 210, 260);
		Image peephole_frame_obj = new ImageIcon(this.getClass().getResource("/peephole_frame.gif")).getImage();
		peephole_frame.setIcon(new ImageIcon(peephole_frame_obj));
		contentPane.add(peephole_frame);
		
		JLabel first_name_title = new JLabel("First Name :");
		first_name_title.setBounds(350, 240, 300, 35);
		first_name_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		first_name_title.setToolTipText("");
		contentPane.add(first_name_title);
		
		first_name = new JTextField();
		first_name.setBounds(350, 280, 250, 30);
		first_name.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		first_name.setHorizontalAlignment(SwingConstants.CENTER);
		first_name.setSelectionColor(new Color(220, 220, 220));
		first_name.setSelectedTextColor(new Color(255, 215, 0));
		first_name.setCaretColor(new Color(255, 215, 0));
		first_name.setColumns(10);
		first_name.setBorder(null);
		first_name.setToolTipText("Enter your First Name");
		contentPane.add(first_name);
		
		JLabel last_name_title = new JLabel("Last Name :");
		last_name_title.setBounds(680, 240, 300, 35);
		last_name_title.setToolTipText("");
		last_name_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		contentPane.add(last_name_title);
		
		last_name = new JTextField();
		last_name.setBounds(680, 280, 250, 30);
		last_name.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		last_name.setHorizontalAlignment(SwingConstants.CENTER);
		last_name.setSelectionColor(new Color(220, 220, 220));
		last_name.setSelectedTextColor(new Color(255, 215, 0));
		last_name.setCaretColor(new Color(255, 215, 0));
		last_name.setColumns(10);
		last_name.setBorder(null);
		last_name.setToolTipText("Enter your Last Name");
		contentPane.add(last_name);
		
		JLabel username_title = new JLabel("Username :");
		username_title.setBounds(350, 320, 300, 35);
		username_title.setToolTipText("");
		username_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		contentPane.add(username_title);
		
		username = new JTextField();
		username.setBounds(350, 360, 250, 30);
		username.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setSelectionColor(new Color(220, 220, 220));
		username.setSelectedTextColor(new Color(255, 215, 0));
		username.setCaretColor(new Color(255, 215, 0));
		username.setColumns(10);
		username.setBorder(null);
		username.setToolTipText("Enter your Username");
		contentPane.add(username);
		
		JLabel email_id_title = new JLabel("Email-ID :");
		email_id_title.setBounds(680, 320, 300, 35);
		email_id_title.setToolTipText("");
		email_id_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		contentPane.add(email_id_title);
		
		email_id = new JTextField();
		email_id.setBounds(680, 360, 250, 30);
		email_id.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		email_id.setHorizontalAlignment(SwingConstants.CENTER);
		email_id.setSelectionColor(new Color(220, 220, 220));
		email_id.setSelectedTextColor(new Color(255, 215, 0));
		email_id.setCaretColor(new Color(255, 215, 0));
		email_id.setColumns(10);
		email_id.setBorder(null);
		email_id.setToolTipText("Enter your Email-ID");
		contentPane.add(email_id);
		
		JLabel password_title = new JLabel("Password :");
		password_title.setBounds(350, 400, 300, 35);
		password_title.setToolTipText("");
		password_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		contentPane.add(password_title);
		
		password = new JTextField();
		password.setBounds(350, 440, 250, 30);
		password.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setSelectionColor(new Color(220, 220, 220));
		password.setSelectedTextColor(new Color(255, 215, 0));
		password.setCaretColor(new Color(255, 215, 0));
		password.setColumns(10);
		password.setBorder(null);
		password.setToolTipText("Enter your Password");
		contentPane.add(password);
		
		JLabel confirm_password_title = new JLabel("Confirm Password : ");
		confirm_password_title.setBounds(680, 400, 300, 35);
		confirm_password_title.setToolTipText("");
		confirm_password_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		contentPane.add(confirm_password_title);
		
		confirm_password = new JTextField();
		confirm_password.setBounds(680, 440, 250, 30);
		confirm_password.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		confirm_password.setHorizontalAlignment(SwingConstants.CENTER);
		confirm_password.setSelectionColor(new Color(220, 220, 220));
		confirm_password.setSelectedTextColor(new Color(255, 215, 0));
		confirm_password.setCaretColor(new Color(255, 215, 0));
		confirm_password.setBorder(null);
		confirm_password.setColumns(10);
		confirm_password.setToolTipText("Confirm your Password");
		contentPane.add(confirm_password);
		
		JButton reset_button = new JButton("RESET");
		reset_button.setBounds(350, 510, 75, 30);
		reset_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		reset_button.setForeground(Color.WHITE);
		reset_button.setBackground(Color.BLACK);
		reset_button.setBorder(null);
		reset_button.setFocusable(false);
		reset_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		reset_button.setToolTipText("Reset all Input");
		reset_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				first_name.setText(null);
				last_name.setText(null);
				email_id.setText(null);
				username.setText(null);
				password.setText(null);
				confirm_password.setText(null);
			}
		});
		contentPane.add(reset_button);
		
		JButton register_button = new JButton("REGISTER");
		register_button.setBounds(565, 510, 150, 30);
		register_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_button.setForeground(Color.BLACK);
		register_button.setBackground(new Color(255, 215, 0));
		register_button.setBorder(null);
		register_button.setFocusable(false);
		register_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register_button.setToolTipText("Create a New Account");
		register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if((first_name.getText()).equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your First Name properly.","First Name can't be empty !!!",JOptionPane.ERROR_MESSAGE);
				}
				else if((last_name.getText()).equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Last Name properly.","Last Name can't be empty !!!",JOptionPane.ERROR_MESSAGE);
				}
				else if((username.getText()).equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Username properly.","Username can't be empty !!!",JOptionPane.ERROR_MESSAGE);
				}
				else if((email_id.getText()).equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Email-ID properly.","Email-ID can't be empty !!!",JOptionPane.ERROR_MESSAGE);
				}
				else if((password.getText()).equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Password properly.","Password can't be empty !!!",JOptionPane.ERROR_MESSAGE);
				}
				else if((password.getText()).length() < 8)
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Password properly.","Password too short !!!",JOptionPane.ERROR_MESSAGE);
					password.setText(null);
					confirm_password.setText(null);
				}
				else if((password.getText()).length() > 15)
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Password properly.","Password too long !!!",JOptionPane.ERROR_MESSAGE);
					password.setText(null);
					confirm_password.setText(null);
				}
				else if((confirm_password.getText()).equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please, Confirm your Password properly.","Confirm Password can't be empty !!!",JOptionPane.ERROR_MESSAGE);
				}
				else if(!(confirm_password.getText()).equals(password.getText()))
				{
					JOptionPane.showMessageDialog(null, "Please, Enter and Confirm your Password properly.","Password and Confirmed Password must be same !!!",JOptionPane.ERROR_MESSAGE);
					confirm_password.setText(null);
				}
				else
				{	
					Connection con = null;
					PreparedStatement st = null;
					
					try
					{
			            String query = "insert into users(First_Name, Last_Name, Email_ID, Username, Password, Confirm_Password) values (?, ?, ?, ?, ?, ?);";
			            
			            Class.forName("com.mysql.jdbc.Driver");
			            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/typometer?autoReconnect=true&useSSL=false", "root", "12345");
			            st = con.prepareStatement(query);
			            st.setString(1, first_name.getText());
			            st.setString(2, last_name.getText());
			            st.setString(3, email_id.getText());
			            st.setString(4, username.getText());
			            st.setString(5, password.getText());
			            st.setString(6, confirm_password.getText());
			            
			            st.executeUpdate();
			            JOptionPane.showMessageDialog(null, "Your Registration couldn't be any more Successful !");
			            
			            Login second = new Login();
						second.setVisible(true);
						dispose();
			        }
			        catch(Exception ex)
			        {
			            JOptionPane.showMessageDialog(null, ex);
			        }
				}
			}
		});
		contentPane.add(register_button);
		
		JButton exit_button = new JButton("EXIT");
		exit_button.setBounds(855, 510, 75, 30);
		exit_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		exit_button.setForeground(Color.WHITE);
		exit_button.setBackground(Color.BLACK);
		exit_button.setBorder(null);
		exit_button.setFocusable(false);
		exit_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit_button.setToolTipText("Exit the Application");
		exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);			}
		});
		contentPane.add(exit_button);
		
		JLabel login_title = new JLabel("Already have an Account ?");
		login_title.setBounds(485, 560, 350, 35);
		login_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		contentPane.add(login_title);
		
		JButton login_button = new JButton("LOGIN");
		login_button.setBounds(590, 610, 100, 30);
		login_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		login_button.setForeground(Color.BLACK);
		login_button.setBackground(new Color(255, 215, 0));
		login_button.setBorder(null);
		login_button.setFocusable(false);
		login_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login_button.setToolTipText("Login into an existing Account");
		login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Login second = new Login();
				second.setVisible(true);
				dispose();
			}
		});	
		contentPane.add(login_button);
	}
}
