package practica_t2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class t2_jframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					t2_jframe frame = new t2_jframe();
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
	public t2_jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contrasena");
		lblNewLabel.setBounds(119, 59, 61, 16);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 52, 120, 30);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(201, 10, 120, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnNewButton.setBounds(6, 237, 117, 29);
		contentPane.add(btnNewButton);
		
		String passwd = "password";
		String uname = "natha";
		
		JButton btnNewButton_1 = new JButton("Entrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(passwd.equals(new String(passwordField.getPassword())) && uname.equals(textField.getText())) {
					Bienvenido_dialog.main(null);
				}
				else {
					inputError.main(null);
				}
				
				
			}
		});
		
		JFrame frame = new JFrame("Bienvenido");
		
		
		
		btnNewButton_1.setBounds(327, 237, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(119, 17, 61, 16);
		contentPane.add(lblNewLabel_1);
	}
}
