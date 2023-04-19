package OtobusBilet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.SQLException;

public class seferSec extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel = new JLabel("");
	private final JLabel sehir1 = new JLabel("sad");
	private final JLabel sehir2 = new JLabel("sad");
	public JLabel saat = new JLabel("Hareket: 09,00");
	public JLabel otobus = new JLabel("Otobus: Travego 2+1");
	public JLabel saat_1 = new JLabel("Hareket: 12,00");
	public JLabel lblOtobusNeoplan = new JLabel("Otobus: Neoplan 2+2");
	public JLabel lblOtobusTurismo = new JLabel("Otobus: Turismo 2+1");
	public JLabel saat_1_1 = new JLabel("Hareket: 17,00");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seferSec frame = new seferSec();
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
	public seferSec() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 805);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 564, 36);
		//lblNewLabel.setText("lütfen "+guzergah.tarih+" tarihi için sefer seçiniz.");
		contentPane.add(lblNewLabel);
		
		JLabel sehir1 = new JLabel(guzergah.kalkis);
		sehir1.setHorizontalAlignment(SwingConstants.CENTER);
		sehir1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		sehir1.setBounds(10, 105, 244, 47);
		contentPane.add(sehir1);
		
		JLabel sehir2 = new JLabel(guzergah.varis);
		sehir2.setFont(new Font("Arial Black", Font.PLAIN, 25));
		sehir2.setHorizontalAlignment(SwingConstants.CENTER);
		sehir2.setBounds(349, 105, 212, 47);
		
		contentPane.add(sehir2);
		
		saat.setForeground(Color.GRAY);
		saat.setHorizontalAlignment(SwingConstants.CENTER);
		saat.setFont(new Font("Arial Black", Font.PLAIN, 23));
		saat.setBounds(21, 171, 190, 41);
		contentPane.add(saat);
		
		
		otobus.setForeground(Color.GRAY);
		otobus.setHorizontalAlignment(SwingConstants.CENTER);
		otobus.setFont(new Font("Arial Black", Font.PLAIN, 23));
		otobus.setBounds(279, 171, 282, 41);
		contentPane.add(otobus);
		
		JButton btnNewButton = new JButton("FİYAT : 420TL                                               BİLET AL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				travego travego;
				try {
					travego = new travego();
					travego.setVisible(true);
					travego.lblNewLabel.setText(guzergah.kalkis+" - "+guzergah.varis+"  "+guzergah.tarih+" tarihli saat 09.00 kalkışı olan seferiniz için lütfen koltuk seçimini tamamlayınız..");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(0,255,255));
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton.setBackground(new Color(0, 191, 255));
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(0,255,255));
			}
			
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnNewButton.setBounds(0, 235, 584, 41);
		contentPane.add(btnNewButton);
		
		JLabel sehir3 = new JLabel(guzergah.kalkis);
		sehir3.setHorizontalAlignment(SwingConstants.CENTER);
		sehir3.setFont(new Font("Arial Black", Font.PLAIN, 25));
		sehir3.setBounds(21, 345, 233, 47);
		contentPane.add(sehir3);
		
		JLabel sehir4 = new JLabel(guzergah.varis);
		sehir4.setHorizontalAlignment(SwingConstants.CENTER);
		sehir4.setFont(new Font("Arial Black", Font.PLAIN, 25));
		sehir4.setBounds(349, 345, 212, 47);
		contentPane.add(sehir4);
		
		JLabel sehir5 = new JLabel(guzergah.kalkis);
		sehir5.setHorizontalAlignment(SwingConstants.CENTER);
		sehir5.setFont(new Font("Arial Black", Font.PLAIN, 25));
		sehir5.setBounds(21, 594, 233, 47);
		contentPane.add(sehir5);
		
		JLabel sehir6 = new JLabel(guzergah.varis);
		sehir6.setHorizontalAlignment(SwingConstants.CENTER);
		sehir6.setFont(new Font("Arial Black", Font.PLAIN, 25));
		sehir6.setBounds(349, 594, 212, 47);
		contentPane.add(sehir6);
		
		
		saat_1.setHorizontalAlignment(SwingConstants.CENTER);
		saat_1.setForeground(Color.GRAY);
		saat_1.setFont(new Font("Arial Black", Font.PLAIN, 23));
		saat_1.setBounds(37, 402, 190, 41);
		contentPane.add(saat_1);
		
		
		lblOtobusNeoplan.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtobusNeoplan.setForeground(Color.GRAY);
		lblOtobusNeoplan.setFont(new Font("Arial Black", Font.PLAIN, 23));
		lblOtobusNeoplan.setBounds(279, 402, 282, 41);
		contentPane.add(lblOtobusNeoplan);
		
		
		lblOtobusTurismo.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtobusTurismo.setForeground(Color.GRAY);
		lblOtobusTurismo.setFont(new Font("Arial Black", Font.PLAIN, 23));
		lblOtobusTurismo.setBounds(292, 653, 282, 41);
		contentPane.add(lblOtobusTurismo);
		
		
		saat_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		saat_1_1.setForeground(Color.GRAY);
		saat_1_1.setFont(new Font("Arial Black", Font.PLAIN, 23));
		saat_1_1.setBounds(37, 653, 190, 41);
		contentPane.add(saat_1_1);
		
		JButton btnNewButton_1 = new JButton("FİYAT : 395TL                                               BİLET AL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				
				neoplan neoplan;
				 
				try {
					neoplan = new neoplan();
					 neoplan.setVisible(true);
					 neoplan.neoplan.setText(guzergah.kalkis+" - "+guzergah.varis+"  "+guzergah.tarih+" tarihli saat 09.00 kalkışı olan seferiniz için lütfen koltuk seçimini tamamlayınız..");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				 setVisible(false);
			}
		});
		btnNewButton_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton_1.setBackground(Color.GREEN);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(0,255,154));
			}
		});
		btnNewButton_1.setBackground(new Color(0, 250, 154));
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnNewButton_1.setBounds(0, 477, 584, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("FİYAT : 400TL                                               BİLET AL");
		btnNewButton_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton_2.setBackground(new Color(255, 20, 147));
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBackground(new Color(255, 0, 255));
			}
		});
		btnNewButton_2.setBackground(new Color(255, 0, 255));
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tourismo trsm;
				try {
					
					trsm = new tourismo();
					trsm.setVisible(true);
					trsm.lblNewLabel.setText(guzergah.kalkis+" - "+guzergah.varis+"  "+guzergah.tarih+" tarihli saat 09.00 kalkışı olan seferiniz için lütfen koltuk seçimini tamamlayınız..");
					setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setBounds(0, 725, 584, 41);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("<-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guzergah gzrgh = new guzergah();
				gzrgh.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton_3.setBounds(0, 0, 50, 36);
		contentPane.add(btnNewButton_3);
		
		JLabel background = new JLabel(new ImageIcon("Image/biletsec.png"));
		background.setBounds(0, 45, 584, 710);
		background.setBackground(Color.WHITE);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		

		
		
		
		
	}
}
