package OtobusBilet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class istek extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel = new JLabel("");
	public JLabel lblNewLabel_2 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					istek frame = new istek();
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
	public istek() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 307);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 0, 359, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BİLET AL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guzergah gzrgh = new guzergah();
				gzrgh.lblNewLabel_2.setText("LÜTFEN GÜZERGAH SEÇİNİZ  ...");
				gzrgh.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.lightGray);
			}
		});
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton.setBackground(Color.gray);
			}
		});
		btnNewButton.setBounds(37, 129, 332, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BİLETLERİM");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				biletlerim blt=new biletlerim();
				blt.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton_1.setBackground(Color.gray);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(Color.lightGray);
			}
		});
		btnNewButton_1.setBounds(37, 210, 332, 48);
		contentPane.add(btnNewButton_1);
		
		JLabel background = new JLabel(new ImageIcon("Image/bilet.jpg"));
		background.setBackground(Color.WHITE);
		background.setBounds(0, 73, 412, 229);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		
	}
}
