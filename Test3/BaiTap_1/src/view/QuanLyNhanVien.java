package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class QuanLyNhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable tbl_nhanVien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyNhanVien frame = new QuanLyNhanVien();
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
	public QuanLyNhanVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1220, 730);
		this.setTitle("Quản Lý Nhân Viên");
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qu\u1EA3n L\u00FD Nh\u00E2n Vi\u00EAn");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(238, 11, 554, 79);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 72, 1131, 594);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("C\u1EACP NH\u1EACT", new ImageIcon("C:\\Users\\lethi\\Downloads\\HocVien.png"), panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E3 Nh\u00E2n Vi\u00EAn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(27, 11, 461, 49);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(27, 55, 500, 49);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("T\u00EAn Nh\u00E2n Vi\u00EAn");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(27, 118, 294, 41);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(27, 163, 500, 49);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tu\u1ED5i");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(27, 211, 420, 41);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(27, 248, 500, 49);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("L\u01B0\u01A1ng");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(27, 291, 500, 41);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(27, 335, 500, 49);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(26, 377, 501, 49);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(27, 428, 500, 49);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Click v\u00E0o \u0111\u00E2y \u0111\u1EC3 ch\u1ECDn h\u00ECnh");
		lblNewLabel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(715, 21, 351, 311);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("Hi\u1EC3n Th\u1ECB");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(568, 360, 120, 41);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tho\u00E1t");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(568, 292, 120, 46);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("M\u1EDBi");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(568, 43, 120, 49);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("X\u00F3a");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.setBounds(568, 232, 120, 49);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("S\u1EEDa");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_5.setBounds(568, 163, 120, 49);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Th\u00EAm");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_6.setBounds(568, 103, 120, 49);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("|<");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(567, 428, 120, 49);
		panel.add(btnNewButton);
		
		JButton btnNewButton_7 = new JButton("<<");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_7.setBounds(697, 428, 120, 49);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton(">>");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_8.setBounds(827, 428, 120, 49);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton(">|");
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_8_1.setBounds(963, 428, 120, 49);
		panel.add(btnNewButton_8_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("DANH S\u00C1CH", new ImageIcon("C:\\Users\\lethi\\Downloads\\staff-icon.png"), panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "T\u00ECm Ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 27, 1072, 94);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(24, 21, 1024, 52);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 153, 1072, 368);
		panel_1.add(scrollPane);
		
		tbl_nhanVien = new JTable();
		scrollPane.setViewportView(tbl_nhanVien);
		
		JLabel lblNewLabel_7 = new JLabel("Record : 1 of 10");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBounds(956, 22, 186, 51);
		contentPane.add(lblNewLabel_7);
	}
}
