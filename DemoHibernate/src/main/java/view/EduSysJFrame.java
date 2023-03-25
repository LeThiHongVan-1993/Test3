package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTree;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.KeyStroke;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class EduSysJFrame extends JFrame {

	private JPanel contentPane;
	
	private void init() {
		new ManHinhChao().setVisible(true);
		new DangNhap().setVisible(true);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EduSysJFrame frame = new EduSysJFrame();
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

	public EduSysJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");
		setLocationRelativeTo(null);
		setBounds(100, 100, 1160, 728);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.setBounds(10, 11, 1117, 56);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Hệ Thống");
		mnNewMenu.setMnemonic('N');
		mnNewMenu.setMnemonic(KeyEvent.VK_ENTER);
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Đăng Nhập");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem.setMnemonic(KeyEvent.VK_PROPS);
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Đăng Xuất");
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Đổi Mật Khẩu");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Kết Thúc");
		mntmNewMenuItem_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0));
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Quản Lý");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Quản lý chuyên đề");
		mntmNewMenuItem_10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu_1.add(separator_7);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Quản lý khóa học");
		mntmNewMenuItem_11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_11.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JSeparator separator_8 = new JSeparator();
		mnNewMenu_1.add(separator_8);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Quản lý nhân viên");
		mntmNewMenuItem_12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_12.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
		JSeparator separator_9 = new JSeparator();
		mnNewMenu_1.add(separator_9);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Quản lý học viên");
		mntmNewMenuItem_13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_13.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_1.add(mntmNewMenuItem_13);
		
		JSeparator separator_10 = new JSeparator();
		mnNewMenu_1.add(separator_10);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Quản lý người học");
		mntmNewMenuItem_14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem_14.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_1.add(mntmNewMenuItem_14);
		
		JMenu mnNewMenu_2 = new JMenu("Thống Kê");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Người học từng năm");
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.SHIFT_DOWN_MASK));
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu_2.add(separator_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Bảng điểm khóa ...");
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.SHIFT_DOWN_MASK));
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Điểm từng khóa học");
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, InputEvent.SHIFT_DOWN_MASK));
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem(" Doanh thu từng chuyên đề ...");
		mntmNewMenuItem_7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.SHIFT_DOWN_MASK));
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_2.add(separator_5);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_2.add(separator_3);
		
		JMenu mnNewMenu_3 = new JMenu("Trợ Giúp");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu_3);
		
		JSeparator separator_6 = new JSeparator();
		mnNewMenu_3.add(separator_6);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Hướng dẫn sử dụng");
		mntmNewMenuItem_8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mntmNewMenuItem_8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Giới thiệu sản phẩm");
		mntmNewMenuItem_9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 79, 1117, 86);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1117, 97);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(-6, -16, 1129, 108);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(6, 16, 1117, 86);
		panel_3.add(toolBar);
		
		JButton btnNewButton = new JButton("Đăng xuất");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Kết thúc");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Chuyên đề");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Người học");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Khóa học");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		toolBar.add(btnNewButton_4);
		
		JButton btnNewButton_7 = new JButton("Học viên");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		toolBar.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("Nhân viên");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		toolBar.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("Hướng dẫn");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		toolBar.add(btnNewButton_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 559, 1117, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 108, 45);
		panel.add(lblNewLabel);
		
		final JLabel lbl_Clock = new JLabel();
		lbl_Clock.setForeground(Color.ORANGE);
		lbl_Clock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_Clock.setBounds(911, 7, 185, 45);
		new Timer(1000, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date now = new Date();
				SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
				String text = formater.format(now);
				lbl_Clock.setText(text);
			}
		}).start();
		panel.add(lbl_Clock);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setLabelFor(this);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lethi\\Downloads\\logo.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 147, 1117, 401);
		contentPane.add(lblNewLabel_1);
		
	}
}
