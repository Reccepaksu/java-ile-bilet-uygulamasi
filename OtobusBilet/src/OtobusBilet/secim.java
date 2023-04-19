package OtobusBilet;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class secim extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secim frame = new secim();
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
	public secim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 292);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("KENDİM İÇİN BİLET ALMAK İSTİYORUM \r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kartBilgileri krt = new kartBilgileri();
				krt.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton.setBounds(29, 33, 381, 58);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BAŞKASI İÇİN BİLET ALMAK İSTİYORUM \r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yeniMusteri musteri = new yeniMusteri();
				musteri.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_1.setBounds(29, 122, 381, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<--");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seferSec sfrsec = new seferSec();
				sfrsec.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_2.setBounds(10, 201, 72, 41);
		contentPane.add(btnNewButton_2);
	}
}
