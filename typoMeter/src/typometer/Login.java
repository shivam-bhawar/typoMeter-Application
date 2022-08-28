package typometer;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.awt.Cursor;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	public static String userid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setBackground(Color.WHITE);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1118, 735);
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
		
		JLabel username_title = new JLabel("Enter your Username :");
		username_title.setBounds(490, 240, 300, 35);
		username_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		contentPane.add(username_title);
		
		username = new JTextField();
		username.setBounds(490, 280, 300, 30);
		username.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setSelectionColor(new Color(220, 220, 220));
		username.setSelectedTextColor(new Color(255, 215, 0));
		username.setCaretColor(new Color(255, 215, 0));
		username.setColumns(10);
		username.setBorder(null);
		username.setToolTipText("Enter your Username");
		contentPane.add(username);
		
		
		JLabel password_title = new JLabel("Enter your Password :");
		password_title.setBounds(490, 340, 300, 35);
		password_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		contentPane.add(password_title);
		
		password = new JPasswordField();
		password.setBounds(490, 380, 300, 30);
		password.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setSelectionColor(new Color(220, 220, 220));
		password.setSelectedTextColor(new Color(255, 215, 0));
		password.setCaretColor(new Color(255, 215, 0));
		password.setBorder(null);
		password.setToolTipText("Enter your Password");
		contentPane.add(password);
		
		JButton reset_button = new JButton("RESET");
		reset_button.setBounds(490, 455, 75, 30);
		reset_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		reset_button.setForeground(new Color(255, 255, 255));
		reset_button.setBackground(new Color(0, 0, 0));
		reset_button.setBorder(null);
		reset_button.setFocusable(false);
		reset_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		reset_button.setToolTipText("Reset all Input");
		reset_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				username.setText(null);
				password.setText(null);
			}
		});
		contentPane.add(reset_button);
		
		JButton login_button = new JButton("LOGIN");
		login_button.setBounds(690, 455, 100, 30);
		login_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		login_button.setForeground(new Color(0, 0, 0));
		login_button.setBackground(new Color(255, 215, 0));
		login_button.setBorder(null);
		login_button.setFocusable(false);
		login_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login_button.setToolTipText("Login into your Account");
		login_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) 
			{
				if((username.getText()).equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Username properly.","Username can't be empty !!!",JOptionPane.ERROR_MESSAGE);
				}
				else if((password.getText()).equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Password properly.","Password can't be empty !!!",JOptionPane.ERROR_MESSAGE);
				}
				else if((password.getText()).length() < 8)
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Password properly.","Password too short !!!",JOptionPane.ERROR_MESSAGE);
					password.setText(null);
				}
				else if((password.getText()).length() > 15)
				{
					JOptionPane.showMessageDialog(null, "Please, Enter your Password properly.","Password too long !!!",JOptionPane.ERROR_MESSAGE);
					password.setText(null);
				}

				else
				{
					try{
						
						 int flag = 0;
				            
				            Class.forName("com.mysql.jdbc.Driver");
				            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/typometer?autoReconnect=true&useSSL=false", "root", "12345");
				            Statement st1 = con.createStatement();
				            ResultSet res = st1.executeQuery("select * from users");
				            String uname = username.getText();
				            String pass = password.getText();
				            while(res.next())
				            {
				            	String duname = res.getString(4);
				            	String dpwd = res.getString(5);
				                
								if(uname.equals(duname)&&pass.equals(dpwd))
								{
									flag=1;
						            JOptionPane.showMessageDialog(null,"Could your Login be any more Successful ?");
						  
						            Option_Menu.main(null);
						            userid = uname;
						            dispose();
						            break;
								}
				            } 
				            if(flag != 1)
			                {
			                    JOptionPane.showMessageDialog(null, "You got Bamboozled.","Wrong Username or Password !",JOptionPane.ERROR_MESSAGE); 
			                    username.setText(null);
			                    password.setText(null);
			                }
				        }
				        catch(Exception ex)
				        {
				            JOptionPane.showMessageDialog(null, ex);
				        }
				}
			}
		});
		contentPane.add(login_button);
		
		JLabel register_title = new JLabel(" Don't have an Account ?");
		register_title.setBounds(510, 530, 300, 35);
		register_title.setFont(new Font("Bradley Hand ITC", Font.BOLD, 23));
		contentPane.add(register_title);
		
		JButton register_button = new JButton("REGISTER");
		register_button.setBounds(590, 580, 100, 30);
		register_button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_button.setForeground(new Color(0, 0, 0));
		register_button.setBackground(new Color(255, 215, 0));
		register_button.setBorder(null);
		register_button.setFocusable(false);
		register_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register_button.setToolTipText("Create a New Account");
		register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Register second = new Register();
				second.setVisible(true);
				dispose();
			}
		});
		contentPane.add(register_button);
	}
}
