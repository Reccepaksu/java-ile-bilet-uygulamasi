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
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class guzergah extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel_2 = new JLabel("");
	public static String kalkis;
	public static String varis;
	public static String id;
	public static String tarih;
	public String sql_gzrgh,sql_soyad;
	private JTextField tarih_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guzergah frame = new guzergah();
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
	public guzergah() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kalkış Noktası");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 112, 157, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Varış Noktası");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(85, 166, 157, 56);
		contentPane.add(lblNewLabel_1);
		
		JComboBox kalkisBox = new JComboBox();
		kalkisBox.setEditable(true);
		kalkisBox.setBackground(Color.GRAY);
		kalkisBox.setModel(new DefaultComboBoxModel(new String[] {"ŞEHİR SEÇİNİZ...", "İSTANBUL (Avrupa)", "İSTANBUL (Anadolu)", "ANKARA", "KOCAELİ", "SAKARYA", "ESKİŞEHİR", "BİLECİK", "İZMİR", "DENİZLİ ", "ERZURUM", "AYDIN", "ISPARTA", "ANTALYA", "TRABZON", "SAMSUN", "ORDU", "MUŞ", "AĞRI", "ŞANLIURFA ", "ELAZIĞ ", "RİZE", "KARABÜK", "KASTAMONU", "GİRESUN"}));
		kalkisBox.setToolTipText("");
		kalkisBox.setBounds(278, 131, 157, 22);
		contentPane.add(kalkisBox);
		System.out.println();
		JComboBox varisBox = new JComboBox();
		varisBox.setModel(new DefaultComboBoxModel(new String[] {"ŞEHİR SEÇİNİZ...", "İSTANBUL (Avrupa)", "İSTANBUL (Anadolu)", "ANKARA", "KOCAELİ", "SAKARYA", "ESKİŞEHİR", "BİLECİK", "İZMİR", "DENİZLİ ", "ERZURUM", "AYDIN", "ISPARTA", "ANTALYA", "TRABZON", "SAMSUN", "ORDU", "MUŞ", "AĞRI", "ŞANLIURFA ", "ELAZIĞ ", "RİZE", "KARABÜK", "KASTAMONU", "GİRESUN"}));
		varisBox.setBounds(278, 185, 157, 22);
		contentPane.add(varisBox);
		
		JButton btnNewButton = new JButton("ONAYLA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kalkis=(String) kalkisBox.getSelectedItem();
				varis=(String) varisBox.getSelectedItem();
				tarih=(String) tarih_text.getText();
				sql_gzrgh="INSERT INTO public.guzergah (kul_ad,kalkis,varis) VALUES ('"+KarsilamaEkrani.ad+"','"+kalkis+"',"+"'"+varis+"')";
				sql_soyad="SELECT kul_id as id from public.admin where kul_ad='"+KarsilamaEkrani.kuladi+"'";
				Baglanti.baglan();
				Baglanti.sorgu(sql_soyad);
				ResultSet rs = Baglanti.sorgu(sql_soyad);
				try {
					while(rs.next()) {
						id=rs.getString(1);
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				sql_gzrgh="INSERT INTO public.guzergah (kul_ad,kalkis,varis,tarih) VALUES ('"+KarsilamaEkrani.ad+"','"+kalkis+"',"+"'"+varis+"',"+"'"+tarih+"')";
				Baglanti.sorgu(sql_gzrgh);
				bilet.kalkis.setText(kalkis);
				bilet.varis.setText(varis);
				seferSec sec = new seferSec();
				sec.lblNewLabel.setText("Lütfen "+tarih+" tarihi için sefer seçiniz.");
				sec.setVisible(true);
				setVisible(false);
				
			
			
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(458, 318, 137, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("GERİ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				istek geri1 = new istek();
				geri1.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(0, 318, 89, 40);
		contentPane.add(btnNewButton_1);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		
		
		
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(0, 268, 595, 40);
		contentPane.add(lblNewLabel_2);
		
		
	
		
		JLabel lblNewLabel_3 = new JLabel("TARİH ");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(101, 76, 126, 43);
		contentPane.add(lblNewLabel_3);
		
		tarih_text = new JTextField();
		tarih_text.setBounds(278, 87, 146, 22);
		contentPane.add(tarih_text);
		tarih_text.setColumns(10);
		
		JLabel background = new JLabel(new ImageIcon("Image/resim4.png"));
		background.setBackground(Color.WHITE);
		background.setBounds(-43, -59, 671, 378);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		
		
		
	}
}
