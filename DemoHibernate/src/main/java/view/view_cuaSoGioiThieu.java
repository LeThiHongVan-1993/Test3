package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Color;

public class view_cuaSoGioiThieu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_cuaSoGioiThieu frame = new view_cuaSoGioiThieu();
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
	public view_cuaSoGioiThieu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 739);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(32846, 32767));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setDisabledIcon(new ImageIcon("C:\\Users\\lethi\\Downloads\\tải xuống.png"));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lethi\\Downloads\\logo.png"));
		lblNewLabel.setBounds(10, 0, 1074, 413);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrPropolyLD = new JTextArea();
		txtrPropolyLD.setForeground(Color.BLUE);
		txtrPropolyLD.setFont(new Font("Courier New", Font.PLAIN, 20));
		txtrPropolyLD.setText("Propoly là dự án mẫu. Mục tiêu chính là huấn luyện sinh viên qui trình thực hiện dự án.\r\n\r\nMục tiêu của dự án này là để rèn luyện kỹ năng IO (CDIO) tức không yêu cầu sinh viên\r\nphải thu thập phân tích mà chỉ thực hiện và vận hành một phần mềm chuẩn bị cho các \r\ndự án sau này. \r\nCác kỹ năng CD (trong CDIO) sẽ được huẩn luyện ở dự án 1 và dự án 2.\r\n\r\nYêu cầu về môi trường:\r\n1. Hệ điều hành bất kỳ.\r\n2. JDK 1.8 trở lên.\r\n3. SQL Server 2009 trở lên.");
		txtrPropolyLD.setBounds(10, 424, 1074, 276);
		contentPane.add(txtrPropolyLD);
	}
}
