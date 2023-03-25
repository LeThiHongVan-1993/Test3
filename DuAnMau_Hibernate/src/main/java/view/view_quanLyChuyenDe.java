package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class view_quanLyChuyenDe extends JFrame {

	private JPanel contentPane;
	private JTextField txt_maCD;
	private JTextField txt_tenCD;
	private JTextField txt_thoiLuong;
	private JTextField txt_hocPhi;
	private JTable tbl_chuyenDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_quanLyChuyenDe frame = new view_quanLyChuyenDe();
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
	public view_quanLyChuyenDe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_QuanLyChuyenDe = new JLabel("Quản Lý Chuyên Đề");
		lbl_QuanLyChuyenDe.setForeground(Color.GREEN);
		lbl_QuanLyChuyenDe.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_QuanLyChuyenDe.setBounds(21, 11, 731, 37);
		contentPane.add(lbl_QuanLyChuyenDe);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 48, 956, 629);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("CẬP NHẬT", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 931, 579);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hình logo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 88, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Click vào đây để chọn hình");
		lblNewLabel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 34, 252, 292);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã Chuyên Đề");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(319, 11, 549, 21);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tên Chuyên Đề");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(319, 85, 602, 32);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Thời lượng (giờ)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(319, 165, 585, 29);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Học phí");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(319, 247, 585, 25);
		panel_2.add(lblNewLabel_5);
		
		txt_maCD = new JTextField();
		txt_maCD.setBounds(319, 34, 602, 49);
		panel_2.add(txt_maCD);
		txt_maCD.setColumns(10);
		
		txt_tenCD = new JTextField();
		txt_tenCD.setBounds(319, 115, 602, 49);
		panel_2.add(txt_tenCD);
		txt_tenCD.setColumns(10);
		
		txt_thoiLuong = new JTextField();
		txt_thoiLuong.setBounds(319, 192, 602, 49);
		panel_2.add(txt_thoiLuong);
		txt_thoiLuong.setColumns(10);
		
		txt_hocPhi = new JTextField();
		txt_hocPhi.setBounds(319, 277, 602, 49);
		panel_2.add(txt_hocPhi);
		txt_hocPhi.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Mô tả chuyên đề");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(10, 334, 301, 32);
		panel_2.add(lblNewLabel_6);
		
		JTextArea txt_moTaCD = new JTextArea();
		txt_moTaCD.setBounds(10, 363, 911, 136);
		panel_2.add(txt_moTaCD);
		
		JButton btn_Them = new JButton("Thêm");
		btn_Them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				them();
			}
		});
		btn_Them.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_Them.setBounds(10, 510, 88, 42);
		panel_2.add(btn_Them);
		
		
		JButton btn_Sua = new JButton("Sửa");
		btn_Sua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_Sua.setBounds(107, 510, 73, 42);
		panel_2.add(btn_Sua);
		
		JButton btn_Xoa = new JButton("Xóa");
		btn_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_Xoa.setBounds(190, 510, 89, 42);
		panel_2.add(btn_Xoa);
		
		JButton btn_Moi = new JButton("Mới");
		btn_Moi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_Moi.setBounds(289, 510, 89, 42);
		panel_2.add(btn_Moi);
		
		JButton btn_first = new JButton("|<");
		btn_first.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_first.setBounds(540, 510, 89, 40);
		panel_2.add(btn_first);
		
		JButton btn_previous = new JButton("<<");
		btn_previous.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_previous.setBounds(639, 510, 89, 40);
		panel_2.add(btn_previous);
		
		JButton btn_next = new JButton(">>");
		btn_next.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_next.setBounds(738, 510, 89, 40);
		panel_2.add(btn_next);
		
		JButton btn_last = new JButton(">|");
		btn_last.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_last.setBounds(832, 510, 89, 40);
		panel_2.add(btn_last);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 0, 951, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tabbedPane.addTab("DANH SÁCH", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setBounds(20, 11, 900, 336);
		panel_1.add(scrollPane);
		
		tbl_chuyenDe = new JTable();
		tbl_chuyenDe.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "MÃ CD", "TÊN CD", "HỌC PHÍ", "THỜI LƯỢNG", "HÌNH"
			}
		));
		scrollPane.setViewportView(tbl_chuyenDe);
		
//		controller = new ChuyenDeController();
//	}
//	
//	private void getAll() {
//		List<ChuyenDe> list = controller.getAll();
//		
//		// update view
//	}
//	
//	private void them() {
//		ChuyenDe cd = new ChuyenDe();
//
//		// TODO validate + set
//		
//		cd = controller.them(cd);
//		if (cd == null) {
//			// TODO error
//		} else {
//			
//			// TODO display to view
//		}
//	}
//	
//	private void xoa() {
//		ChuyenDe cd = new ChuyenDe();
//		// set info
//		
//		cd = controller.xoa(cd);
//		if (cd == null) {
//			// TODO error
//		} else {
//			// TODO remove in table
//		}
	}
}

