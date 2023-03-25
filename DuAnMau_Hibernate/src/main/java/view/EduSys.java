package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class EduSys extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EduSys frame = new EduSys();
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
	public EduSys() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1103, 688);
		contentPane = new JPanel();
		this.setLocationRelativeTo(null);
		this.setTitle("Hệ Thống Quản Lý Đào Tạo");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(30, 29, 1027, 93);
		contentPane.add(panel);
		panel.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1027, 93);
		panel.add(menuBar);

		JMenu mnNewMenu = new JMenu("Hệ Thống");
		mnNewMenu.setIcon(new ImageIcon(EduSys.class.getResource("/icon/System-icon.png")));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);

		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);

		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_2);

		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_1 = new JMenu("Quản Lý");
		mnNewMenu_1.setIcon(new ImageIcon(EduSys.class.getResource("/icon/Manager-icon.png")));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_4);

		JSeparator separator_3 = new JSeparator();
		mnNewMenu_1.add(separator_3);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_5);

		JSeparator separator_4 = new JSeparator();
		mnNewMenu_1.add(separator_4);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_6);

		JSeparator separator_5 = new JSeparator();
		mnNewMenu_1.add(separator_5);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_7);

		JSeparator separator_6 = new JSeparator();
		mnNewMenu_1.add(separator_6);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_8);

		JMenu mnNewMenu_2 = new JMenu("Thống Kê");
		mnNewMenu_2.setIcon(new ImageIcon(EduSys.class.getResource("/icon/login-icon.png")));
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_9);

		JSeparator separator_7 = new JSeparator();
		mnNewMenu_2.add(separator_7);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_10);

		JSeparator separator_8 = new JSeparator();
		mnNewMenu_2.add(separator_8);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_12);

		JSeparator separator_9 = new JSeparator();
		mnNewMenu_2.add(separator_9);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_11);

		JMenu mnNewMenu_3 = new JMenu("Trợ Giúp");
		mnNewMenu_3.setIcon(new ImageIcon(EduSys.class.getResource("/icon/support-icon.png")));
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_13);

		JSeparator separator_10 = new JSeparator();
		mnNewMenu_3.add(separator_10);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_14);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(28, 133, 1027, 124);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 1027, 124);
		panel_1.add(toolBar);

		JButton btnNewButton = new JButton("Đăng Xuất");
		btnNewButton.setIcon(new ImageIcon(EduSys.class.getResource("/icon/Logout-icon.png")));
		toolBar.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Kết Thúc");
		btnNewButton_1.setIcon(new ImageIcon(EduSys.class.getResource("/icon/finish-icon.png")));
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		toolBar.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Chuyên Đề");
		btnNewButton_2.setIcon(new ImageIcon(EduSys.class.getResource("/icon/ChuyenDe.png")));
		toolBar.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Khóa Học\r\n\r\n");
		btnNewButton_3.setIcon(new ImageIcon(EduSys.class.getResource("/icon/Courses-icon.png")));
		toolBar.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Người Học");
		btnNewButton_4.setIcon(new ImageIcon(EduSys.class.getResource("/icon/Student.png")));
		toolBar.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Nhân Viên");
		btnNewButton_5.setIcon(new ImageIcon(EduSys.class.getResource("/icon/NhanVien.png")));
		toolBar.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Học Viên");
		btnNewButton_6.setIcon(new ImageIcon(EduSys.class.getResource("/icon/HocVien.png")));
		toolBar.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Hướng Dẫn");
		btnNewButton_7.setIcon(new ImageIcon(EduSys.class.getResource("/icon/Guide-icon.png")));
		toolBar.add(btnNewButton_7);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 594, 125, 57);
		contentPane.add(lblNewLabel);

		final JLabel lbl_Clock = new JLabel("");
		lbl_Clock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_Clock.setIcon(new ImageIcon(EduSys.class.getResource("/icon/Alarm-clock-icon.png")));
		lbl_Clock.setBounds(877, 586, 202, 65);
		new Timer(1000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date now = new Date();
				SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
				String text = formater.format(now);
				lbl_Clock.setText(text);
			}
		}).start();
		contentPane.add(lbl_Clock);
	}
}
