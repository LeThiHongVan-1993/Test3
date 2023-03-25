package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Font;

public class ManHinhChao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhChao frame = new ManHinhChao();
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
	public ManHinhChao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 772);
		setLocationRelativeTo(null);
		setTitle("Cửa Sổ Chào");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lethi\\Downloads\\logo.png"));
		lblNewLabel.setBounds(10, 11, 1031, 637);
		contentPane.add(lblNewLabel);
		
		final JProgressBar pgb_Loading = new JProgressBar();
		pgb_Loading.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pgb_Loading.setForeground(Color.GREEN);
		pgb_Loading.setStringPainted(true);
		new Timer(10, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int value = pgb_Loading.getValue();
				if (value < pgb_Loading.getMaximum()) {
					pgb_Loading.setValue(value + 1);
				}
				else {
					ManHinhChao.this.dispose();
				}
			}
		}).start();
		pgb_Loading.setBounds(10, 592, 1031, 56);
		contentPane.add(pgb_Loading);
	}
}
