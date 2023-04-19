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
import java.awt.Font;

public class bilet extends JFrame {

	private JPanel contentPane;
	guzergah gzrgh = new guzergah();
	public static JLabel tel = new JLabel("");
	public static JLabel soyad = new JLabel("");
	public static JLabel ad = new JLabel("");
	public static JLabel koltukno = new JLabel("");
	public static JLabel otobus = new JLabel("");
	public static JLabel kalkis = new JLabel("");
	public static JLabel varis = new JLabel("");
	public static JLabel saat = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bilet frame = new bilet();
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
	public bilet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("AD");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(270, 25, 77, 32);
		contentPane.add(lblNewLabel_3);
		
		
		
		JLabel lblNewLabel_3_1 = new JLabel("SOYAD");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(270, 56, 77, 32);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("TEL");
		lblNewLabel_3_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(270, 88, 77, 32);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("KOLTUK NO ");
		lblNewLabel_3_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_3_4.setBounds(82, 327, 111, 32);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("OTOBUS");
		lblNewLabel_3_4_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_3_4_1.setBounds(82, 284, 87, 32);
		contentPane.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("SAAT");
		lblNewLabel_3_4_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_3_4_2.setBounds(82, 241, 87, 32);
		contentPane.add(lblNewLabel_3_4_2);
		
		JLabel lblNewLabel_3_4_3 = new JLabel("VARIŞ");
		lblNewLabel_3_4_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_3_4_3.setBounds(82, 198, 87, 32);
		contentPane.add(lblNewLabel_3_4_3);
		
		JLabel lblNewLabel_3_4_4 = new JLabel("KALKIŞ");
		lblNewLabel_3_4_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_3_4_4.setBounds(82, 155, 87, 32);
		contentPane.add(lblNewLabel_3_4_4);
		kalkis.setForeground(Color.MAGENTA);
		
		
		
		
		kalkis.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		kalkis.setBounds(270, 155, 252, 32);
		contentPane.add(kalkis);
		varis.setForeground(Color.MAGENTA);
		
		
		varis.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		varis.setBounds(270, 198, 252, 32);
		contentPane.add(varis);
		saat.setForeground(Color.MAGENTA);
		
		
		saat.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		saat.setBounds(270, 241, 252, 32);
		contentPane.add(saat);
		otobus.setForeground(Color.MAGENTA);
		
		
		otobus.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		otobus.setBounds(270, 284, 252, 32);
		contentPane.add(otobus);
		koltukno.setForeground(Color.MAGENTA);
		
		
		koltukno.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		koltukno.setBounds(270, 327, 252, 32);
		contentPane.add(koltukno);
		ad.setForeground(Color.MAGENTA);
		
		
		ad.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		ad.setBounds(342, 25, 252, 32);
		contentPane.add(ad);
		soyad.setForeground(Color.MAGENTA);
		
		
		soyad.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		soyad.setBounds(342, 56, 252, 32);
		contentPane.add(soyad);
		tel.setForeground(Color.MAGENTA);
		
		
		tel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		tel.setBounds(342, 88, 252, 32);
		contentPane.add(tel);
		
		JLabel background = new JLabel(new ImageIcon("Image/biletresmi.png"));
		background.setBackground(Color.WHITE);
		background.setBounds(-34, -55, 1088, 549);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
	}

}
