package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class DangNhap extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DangNhap dialog = new DangNhap();
			dialog.setTitle("Cửa Sổ Đăng Nhập");
			dialog.setLocationRelativeTo(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DangNhap() {
		setBounds(100, 100, 1105, 710);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(DangNhap.class.getResource("/icon/Studiomx-Web-Earth-Security.256.png")));
			lblNewLabel.setBounds(39, 87, 328, 402);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Đăng Nhập");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
			lblNewLabel_1.setForeground(Color.GREEN);
			lblNewLabel_1.setBounds(575, 35, 319, 85);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Tên Đăng Nhập");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblNewLabel_2.setBounds(493, 141, 328, 61);
			contentPanel.add(lblNewLabel_2);
		}
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(493, 200, 467, 66);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Mật  Khẩu");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(493, 277, 328, 61);
		contentPanel.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 25));
		passwordField.setBounds(493, 349, 467, 61);
		contentPanel.add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(493, 445, 215, 35);
		contentPanel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("show password");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox_1.setBounds(731, 445, 230, 35);
		contentPanel.add(chckbxNewCheckBox_1);
		
		JButton btnNewButton = new JButton("Đăng Nhập");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(493, 520, 191, 61);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Kết Thúc");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(731, 520, 191, 61);
		contentPanel.add(btnNewButton_1);
	}
}
