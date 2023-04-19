package OtobusBilet;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class kayitOl extends JFrame {

	private JPanel contentPane;
	private JTextField kayıtAd;
	private JTextField kayıtSoyad;
	private JTextField kayıtKulad;
	private JPasswordField kayıtSifre;
	private JTextField dogumtarihi;
	private JTextField telefon;
	private JTextField cinsiyet;
	public String dtarihi;
	public String tel;
	public String ad;
	public static String soyad;
	public String kullaniciAdi;
	public String sifre;
	public String cnsyt;
	public static String id;
	public String sql_ekle;
	public String sql_ekle2;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kayitOl frame = new kayitOl();
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
	public kayitOl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 528);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("KAYIT OL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 36));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(70, -6, 226, 50);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("AD : ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 68, 108, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOYAD :");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 117, 108, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("KULLANICI ADI :");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(20, 306, 141, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ŞİFRE :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(20, 355, 108, 38);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("ONAYLA");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				ad=kayıtAd.getText();
				soyad=kayıtSoyad.getText();
				kullaniciAdi=kayıtKulad.getText();
				sifre=kayıtSifre.getText();
				dtarihi=dogumtarihi.getText();
				tel=telefon.getText();
				cnsyt=cinsiyet.getText();
				id="1";
				sql_ekle2="INSERT INTO public.musteri (ad,soyad,telefon,cinsiyet,dtarihi,kul_ad) VALUES ('"+ad+"','"+soyad+"',"+"'"+tel+"',"+"'"+cnsyt+"',"+"'"+dtarihi+"',"+"'"+kullaniciAdi+"')";
				sql_ekle="INSERT INTO public.admin (kul_ad,kul_sifre,kul_id) VALUES ('"+kullaniciAdi+"',"+"'"+sifre+"',"+"'"+id+"')";
				Baglanti.baglan();
				Baglanti.sorgu(sql_ekle);
				Baglanti.sorgu(sql_ekle2);
			
				JOptionPane.showInternalMessageDialog(null,"Sayin : "+ad+" "+soyad+" aramıza hoşgeldiniz...");
				
				KarsilamaEkrani ekrn = new KarsilamaEkrani();
				ekrn.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton.setBounds(259, 434, 108, 44);
		contentPane.add(btnNewButton);
		
		kayıtAd = new JTextField();
		kayıtAd.setBounds(187, 79, 135, 20);
		contentPane.add(kayıtAd);
		kayıtAd.setColumns(10);
		
		kayıtSoyad = new JTextField();
		kayıtSoyad.setBounds(187, 130, 135, 20);
		contentPane.add(kayıtSoyad);
		kayıtSoyad.setColumns(10);
		
		kayıtKulad = new JTextField();
		kayıtKulad.setBounds(187, 317, 135, 20);
		contentPane.add(kayıtKulad);
		kayıtKulad.setColumns(10);
		
		kayıtSifre = new JPasswordField();
		kayıtSifre.setBounds(187, 366, 135, 20);
		contentPane.add(kayıtSifre);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("Image/b.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				kayıtSifre.setEchoChar((char)0);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				kayıtSifre.setEchoChar('*');
			}
		});
		btnNewButton_2.setBackground(new Color(135, 206, 235));
		btnNewButton_2.setBounds(332, 366, 34, 20);
		getContentPane().add(btnNewButton_2);
		btnNewButton_2.setLayout(new FlowLayout());
		
		JLabel lblNewLabel_5 = new JLabel("DOĞUM TARİHİ");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(20, 166, 141, 38);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("TELEFON");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(20, 215, 108, 38);
		contentPane.add(lblNewLabel_6);
		
		dogumtarihi = new JTextField();
		dogumtarihi.setColumns(10);
		dogumtarihi.setBounds(187, 177, 135, 20);
		contentPane.add(dogumtarihi);
		
		telefon = new JTextField();
		telefon.setColumns(10);
		telefon.setBounds(187, 226, 135, 20);
		contentPane.add(telefon);
		
		JLabel background = new JLabel(new ImageIcon("Image/desen.png"));
		background.setBackground(Color.WHITE);
		background.setBounds(0, -146, 372, 320);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		
		JLabel lblNewLabel_7 = new JLabel("CİNSİYET");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(20, 264, 108, 38);
		contentPane.add(lblNewLabel_7);
		
		cinsiyet = new JTextField();
		cinsiyet.setColumns(10);
		cinsiyet.setBounds(187, 275, 135, 20);
		contentPane.add(cinsiyet);
		
	}
}
