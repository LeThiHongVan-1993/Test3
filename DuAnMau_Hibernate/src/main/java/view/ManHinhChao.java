package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Font;

public class ManHinhChao extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ManHinhChao dialog = new ManHinhChao();
			dialog.setLocationRelativeTo(null);
			dialog.setTitle("Cửa Sổ Chào");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ManHinhChao() {
		setUndecorated(true);
		setBounds(100, 100, 1108, 691);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lethi\\Downloads\\logo.png"));
		lblNewLabel.setBounds(30, 40, 1037, 523);
		contentPanel.add(lblNewLabel);

		final JProgressBar pgb_Loading_1 = new JProgressBar();
		pgb_Loading_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pgb_Loading_1.setStringPainted(true);
		pgb_Loading_1.setBounds(10, 574, 1074, 58);
		contentPanel.add(pgb_Loading_1);
		new Timer(10, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int value = pgb_Loading_1.getValue();

				if (value < pgb_Loading_1.getMaximum()) {
					pgb_Loading_1.setValue(value + 1);
				} else {
					ManHinhChao.this.dispose();
				}
			}
		}).start();
	}

}
