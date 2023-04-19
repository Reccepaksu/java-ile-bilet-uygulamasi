package OtobusBilet;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class yeniMusteri extends JFrame {

	private JPanel contentPane;
	private JTextField AD;
	private JTextField SOYAD;
	private JTextField TEL;
	private JTextField CİNSİYET;
	private JTextField DTARİH;
	public String sql_yeni_kayit;
	public String yeniad,yenisoyad,yenitel,yenitarih;
	public static String yenicinsiyet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yeniMusteri frame = new yeniMusteri();
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
	public yeniMusteri() {
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 485);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YENİ KAYIT");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(56, 0, 302, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AD :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 131, 102, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SOYAD : ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(30, 179, 102, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("TEL : ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(30, 228, 102, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("CİNSİYET : ");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(30, 276, 102, 25);
		contentPane.add(lblNewLabel_1_3);
		
		AD = new JTextField();
		AD.setBounds(185, 135, 173, 20);
		contentPane.add(AD);
		AD.setColumns(10);
		
		SOYAD = new JTextField();
		SOYAD.setColumns(10);
		SOYAD.setBounds(185, 183, 173, 20);
		contentPane.add(SOYAD);
		
		TEL = new JTextField();
		TEL.setColumns(10);
		TEL.setBounds(185, 232, 173, 20);
		contentPane.add(TEL);
		
		CİNSİYET = new JTextField();
		CİNSİYET.setColumns(10);
		CİNSİYET.setBounds(185, 280, 173, 20);
		contentPane.add(CİNSİYET);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("DOĞUM TARİHİ : ");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(30, 328, 145, 25);
		contentPane.add(lblNewLabel_1_3_1);
		
		DTARİH = new JTextField();
		DTARİH.setColumns(10);
		DTARİH.setBounds(185, 332, 173, 20);
		contentPane.add(DTARİH);
		
		
		
		
		JLabel background = new JLabel(new ImageIcon("Image/yeni kayıt.png"));
		background.setBounds(-13, -233, 451, 512);
		background.setBackground(Color.WHITE);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		
		JButton btnNewButton = new JButton("ONAYLA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				yeniad=AD.getText();
				yenisoyad=SOYAD.getText();
				yenitel=TEL.getText();
				yenicinsiyet=CİNSİYET.getText();
				yenitarih=DTARİH.getText();
				Baglanti.baglan();
				sql_yeni_kayit="INSERT INTO public.musteri(ad,soyad,telefon,dtarihi,cinsiyet,kul_ad) VALUES ('"+yeniad+"',"+"'"+yenisoyad+"',"+"'"+yenitel+"',"+"'"+yenitarih+"',"+"'"+yenicinsiyet+"',"+"'"+KarsilamaEkrani.ad+"')";
				Baglanti.sorgu(sql_yeni_kayit);
				
				bilet.ad.setText(yeniad);
				bilet.soyad.setText(yenisoyad);
				bilet.tel.setText(yenitel);
				
				kartBilgileri krt = new kartBilgileri();
				krt.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBackground(new Color(76,140,9));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton.setBounds(325, 411, 102, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secim scm = new secim();
				scm.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_1.setBackground(new Color(76, 140, 9));
		btnNewButton_1.setBounds(0, 421, 51, 25);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
	}
}
