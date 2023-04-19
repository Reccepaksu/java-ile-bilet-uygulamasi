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
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class tourismo extends JFrame {

	private JPanel contentPane;
	public static JLabel lblNewLabel = new JLabel("");
	public static String koltukno;
	public String sql_bilet;
	public static String tourismosaat = "17.00";
	public static String otobust="tourismo";
	public String sql_soyad,sql_ad,sql_tel;
	public static String ad,soyad;
	public static String tel;
	public String sql_koltuk;
	String c2;
	public static String ucretto="400 TL";
	
	public void koltukno(JButton btnNewButton) {
		koltukno=btnNewButton.getText();
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tourismo frame = new tourismo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public tourismo() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 17));
		
		lblNewLabel.setBounds(10, 276, 1091, 47);
		contentPane.add(lblNewLabel);
		System.out.println(KarsilamaEkrani.C1);
		c2=KarsilamaEkrani.C1;
		System.out.println(c2);
		
		JButton to1 = new JButton("1");
		to1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to1);
				to1.setBackground(Color.red);
			}
		});
		to1.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to1.setBackground(Color.GREEN);
		to1.setBounds(134, 178, 53, 45);
		contentPane.add(to1);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='1' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs = Baglanti.sorgu(sql_koltuk);
		while(rs.next()) {
			if(rs.getInt("giris")>=1) {
				if(c2=="KADIN") {
					to1.setBackground(Color.pink);
				}
				else if(c2=="ERKEK") {
					to1.setBackground(Color.BLUE);
				}
				else to1.setBackground(Color.red);
				
			}
			
		}
		
		
		JButton to2 = new JButton("2");
		to2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to2);
				to2.setBackground(Color.red);
			}
		});
		to2.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to2.setBackground(Color.GREEN);
		to2.setBounds(134, 71, 53, 45);
		contentPane.add(to2);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='2' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs1 = Baglanti.sorgu(sql_koltuk);
		while(rs1.next()) {
			if(rs1.getInt("giris")>=1) {
				to2.setBackground(Color.red);
				//if(c2 == ("KADIN")) {
					//to2.setBackground(Color.PINK);				}
				//to2.setBackground(Color.red);  {
			//
			}
		}
		
		
		JButton to3 = new JButton("3");
		to3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to3);
				to3.setBackground(Color.red);
			}
		});
		to3.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to3.setBackground(Color.GREEN);
		to3.setBounds(134, 15, 53, 45);
		contentPane.add(to3);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='3' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs3 = Baglanti.sorgu(sql_koltuk);
		while(rs3.next()) {
			if(rs3.getInt("giris")>=1) {
				to3.setBackground(Color.red);
			}
		}
		
		JButton to4 = new JButton("4");
		to4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to4);
				to4.setBackground(Color.red);
			}
		});
		to4.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to4.setBackground(Color.GREEN);
		to4.setBounds(197, 178, 53, 45);
		contentPane.add(to4);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='4' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs4 = Baglanti.sorgu(sql_koltuk);
		while(rs4.next()) {
			if(rs4.getInt("giris")>=1) {
				to4.setBackground(Color.red);
			}
		}
		
		JButton to5 = new JButton("5");
		to5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to5);
				to5.setBackground(Color.red);
			}
		});
		to5.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to5.setBackground(Color.GREEN);
		to5.setBounds(197, 71, 53, 45);
		contentPane.add(to5);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='5' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs5 = Baglanti.sorgu(sql_koltuk);
		while(rs5.next()) {
			if(rs5.getInt("giris")>=1) {
				to5.setBackground(Color.red);
			}
		}
		
		JButton to6 = new JButton("6");
		to6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to6);
				to6.setBackground(Color.red);
			}
		});
		to6.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to6.setBackground(Color.GREEN);
		to6.setBounds(197, 15, 53, 45);
		contentPane.add(to6);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='6' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs6 = Baglanti.sorgu(sql_koltuk);
		while(rs6.next()) {
			if(rs6.getInt("giris")>=1) {
				to6.setBackground(Color.red);
			}
		}
		
		JButton to7 = new JButton("7");
		to7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to7);
				to7.setBackground(Color.red);
			}
		});
		to7.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to7.setBackground(Color.GREEN);
		to7.setBounds(260, 178, 53, 45);
		contentPane.add(to7);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='7' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs7 = Baglanti.sorgu(sql_koltuk);
		while(rs7.next()) {
			if(rs7.getInt("giris")>=1) {
				to7.setBackground(Color.red);
			}
		}
		
		JButton to8 = new JButton("8");
		to8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to8);
				to8.setBackground(Color.red);
			}
		});
		to8.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to8.setBackground(Color.GREEN);
		to8.setBounds(260, 71, 53, 45);
		contentPane.add(to8);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='8' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs8 = Baglanti.sorgu(sql_koltuk);
		while(rs8.next()) {
			if(rs8.getInt("giris")>=1) {
				to8.setBackground(Color.red);
			}
		}
		
		JButton to9 = new JButton("9");
		to9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to9);
				to9.setBackground(Color.red);
			}
		});
		to9.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to9.setBackground(Color.GREEN);
		to9.setBounds(260, 15, 53, 45);
		contentPane.add(to9);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='9' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs9 = Baglanti.sorgu(sql_koltuk);
		while(rs9.next()) {
			if(rs9.getInt("giris")>=1) {
				to9.setBackground(Color.red);
			}
		}
		
		JButton to10 = new JButton("10");
		to10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to10);
				to10.setBackground(Color.red);
			}
		});
		to10.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to10.setBackground(Color.GREEN);
		to10.setBounds(323, 178, 53, 45);
		contentPane.add(to10);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='10' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs10 = Baglanti.sorgu(sql_koltuk);
		while(rs10.next()) {
			if(rs10.getInt("giris")>=1) {
				to10.setBackground(Color.red);
			}
		}
		
		JButton to11 = new JButton("11");
		to11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to11);
				to11.setBackground(Color.red);
			}
		});
		to11.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to11.setBackground(Color.GREEN);
		to11.setBounds(323, 71, 53, 45);
		contentPane.add(to11);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='11' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs11 = Baglanti.sorgu(sql_koltuk);
		while(rs11.next()) {
			if(rs11.getInt("giris")>=1) {
				to11.setBackground(Color.red);
			}
		}
		
		JButton to12 = new JButton("12");
		to12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to12);
				to12.setBackground(Color.red);
			}
		});
		to12.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to12.setBackground(Color.GREEN);
		to12.setBounds(323, 15, 53, 45);
		contentPane.add(to12);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='12' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs12 = Baglanti.sorgu(sql_koltuk);
		while(rs12.next()) {
			if(rs12.getInt("giris")>=1) {
				to12.setBackground(Color.red);
			}
		}
		
		JButton to13 = new JButton("13");
		to13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to13);
				to13.setBackground(Color.red);
			}
		});
		to13.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to13.setBackground(Color.GREEN);
		to13.setBounds(386, 178, 53, 45);
		contentPane.add(to13);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='13' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs13 = Baglanti.sorgu(sql_koltuk);
		while(rs13.next()) {
			if(rs13.getInt("giris")>=1) {
				to13.setBackground(Color.red);
			}
		}
		
		JButton to14 = new JButton("14");
		to14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to14);
				to14.setBackground(Color.red);
			}
		});
		to14.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to14.setBackground(Color.GREEN);
		to14.setBounds(386, 71, 53, 45);
		contentPane.add(to14);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='14' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs14 = Baglanti.sorgu(sql_koltuk);
		while(rs14.next()) {
			if(rs14.getInt("giris")>=1) {
				to14.setBackground(Color.red);
			}
		}
		
		JButton to15 = new JButton("15");
		to15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to15);
				to15.setBackground(Color.red);
			}
		});
		to15.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to15.setBackground(Color.GREEN);
		to15.setBounds(386, 15, 53, 45);
		contentPane.add(to15);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='15' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs15 = Baglanti.sorgu(sql_koltuk);
		while(rs15.next()) {
			if(rs15.getInt("giris")>=1) {
				to15.setBackground(Color.red);
			}
		}
		
		JButton to16 = new JButton("16");
		to16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to16);
				to16.setBackground(Color.red);
			}
		});
		to16.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to16.setBackground(Color.GREEN);
		to16.setBounds(449, 178, 53, 45);
		contentPane.add(to16);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='16' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs16 = Baglanti.sorgu(sql_koltuk);
		while(rs16.next()) {
			if(rs16.getInt("giris")>=1) {
				to16.setBackground(Color.red);
			}
		}
		
		JButton to17 = new JButton("17");
		to17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to17);
				to17.setBackground(Color.red);
			}
		});
		to17.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to17.setBackground(Color.GREEN);
		to17.setBounds(449, 71, 53, 45);
		contentPane.add(to17);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='17' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs17 = Baglanti.sorgu(sql_koltuk);
		while(rs17.next()) {
			if(rs17.getInt("giris")>=1) {
				to17.setBackground(Color.red);
			}
		}
		
		JButton to18 = new JButton("18");
		to18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to18);
				to18.setBackground(Color.red);
			}
		});
		to18.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to18.setBackground(Color.GREEN);
		to18.setBounds(449, 15, 53, 45);
		contentPane.add(to18);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='18' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs18 = Baglanti.sorgu(sql_koltuk);
		while(rs18.next()) {
			if(rs18.getInt("giris")>=1) {
				to18.setBackground(Color.red);
			}
		}
		
		JButton to19 = new JButton("19");
		to19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to19);
				to19.setBackground(Color.red);
			}
		});
		to19.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to19.setBackground(Color.GREEN);
		to19.setBounds(512, 178, 53, 45);
		contentPane.add(to19);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='19' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs19 = Baglanti.sorgu(sql_koltuk);
		while(rs19.next()) {
			if(rs19.getInt("giris")>=1) {
				to19.setBackground(Color.red);
			}
		}
		
		JButton to20 = new JButton("20");
		to20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to20);
				to20.setBackground(Color.red);
			}
		});
		to20.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to20.setBackground(Color.GREEN);
		to20.setBounds(512, 71, 53, 45);
		contentPane.add(to20);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='20' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs20 = Baglanti.sorgu(sql_koltuk);
		while(rs20.next()) {
			if(rs20.getInt("giris")>=1) {
				to20.setBackground(Color.red);
			}
		}
		
		JButton to21 = new JButton("21");
		to21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to21);
				to21.setBackground(Color.red);
			}
		});
		to21.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to21.setBackground(Color.GREEN);
		to21.setBounds(512, 15, 53, 45);
		contentPane.add(to21);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='21' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs21 = Baglanti.sorgu(sql_koltuk);
		while(rs21.next()) {
			if(rs21.getInt("giris")>=1) {
				to21.setBackground(Color.red);
			}
		}
		
		JButton to22 = new JButton("22");
		to22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to22);
				to22.setBackground(Color.red);
			}
		});
		to22.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to22.setBackground(Color.GREEN);
		to22.setBounds(575, 178, 53, 45);
		contentPane.add(to22);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='22' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs22 = Baglanti.sorgu(sql_koltuk);
		while(rs22.next()) {
			if(rs22.getInt("giris")>=1) {
				to22.setBackground(Color.red);
			}
		}
		
		JButton to23 = new JButton("23");
		to23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to23);
				to23.setBackground(Color.red);
			}
		});
		to23.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to23.setBackground(Color.GREEN);
		to23.setBounds(638, 178, 53, 45);
		contentPane.add(to23);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='23' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs23 = Baglanti.sorgu(sql_koltuk);
		while(rs23.next()) {
			if(rs23.getInt("giris")>=1) {
				to23.setBackground(Color.red);
			}
		}
		
		JButton to24 = new JButton("24");
		to24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to24);
				to24.setBackground(Color.red);
			}
		});
		to24.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to24.setBackground(Color.GREEN);
		to24.setBounds(638, 71, 53, 45);
		contentPane.add(to24);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='24' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs24 = Baglanti.sorgu(sql_koltuk);
		while(rs24.next()) {
			if(rs24.getInt("giris")>=1) {
				to24.setBackground(Color.red);
			}
		}
		
		JButton to25 = new JButton("25");
		to25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to25);
				to25.setBackground(Color.red);
			}
		});
		to25.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to25.setBackground(Color.GREEN);
		to25.setBounds(638, 15, 53, 45);
		contentPane.add(to25);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='25' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs25 = Baglanti.sorgu(sql_koltuk);
		while(rs25.next()) {
			if(rs25.getInt("giris")>=1) {
				to25.setBackground(Color.red);
			}
		}
		
		JButton to26 = new JButton("26");
		to26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to26);
				to26.setBackground(Color.red);
			}
		});
		to26.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to26.setBackground(Color.GREEN);
		to26.setBounds(701, 178, 53, 45);
		contentPane.add(to26);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='26' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs26 = Baglanti.sorgu(sql_koltuk);
		while(rs26.next()) {
			if(rs26.getInt("giris")>=1) {
				to26.setBackground(Color.red);
			}
		}
		
		JButton to27 = new JButton("27");
		to27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to27);
				to27.setBackground(Color.red);
			}
		});
		to27.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to27.setBackground(Color.GREEN);
		to27.setBounds(701, 71, 53, 45);
		contentPane.add(to27);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='27' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs27 = Baglanti.sorgu(sql_koltuk);
		while(rs27.next()) {
			if(rs27.getInt("giris")>=1) {
				to27.setBackground(Color.red);
			}
		}
		
		JButton to28 = new JButton("28");
		to28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to28);
				to28.setBackground(Color.red);
			}
		});
		to28.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to28.setBackground(Color.GREEN);
		to28.setBounds(701, 15, 53, 45);
		contentPane.add(to28);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='28' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs28 = Baglanti.sorgu(sql_koltuk);
		while(rs28.next()) {
			if(rs28.getInt("giris")>=1) {
				to28.setBackground(Color.red);
			}
		}
		
		JButton to29 = new JButton("29");
		to29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to29);
				to29.setBackground(Color.red);
			}
		});
		to29.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to29.setBackground(Color.GREEN);
		to29.setBounds(764, 178, 53, 45);
		contentPane.add(to29);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='29' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs29 = Baglanti.sorgu(sql_koltuk);
		while(rs29.next()) {
			if(rs29.getInt("giris")>=1) {
				to29.setBackground(Color.red);
			}
		}
		
		JButton to30 = new JButton("30");
		to30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to30);
				to30.setBackground(Color.red);
			}
		});
		to30.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to30.setBackground(Color.GREEN);
		to30.setBounds(764, 71, 53, 45);
		contentPane.add(to30);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='30' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs30 = Baglanti.sorgu(sql_koltuk);
		while(rs30.next()) {
			if(rs30.getInt("giris")>=1) {
				to30.setBackground(Color.red);
			}
		}
		
		JButton to31 = new JButton("31");
		to31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to31);
				to31.setBackground(Color.red);
			}
		});
		to31.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to31.setBackground(Color.GREEN);
		to31.setBounds(764, 15, 53, 45);
		contentPane.add(to31);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='31' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs31 = Baglanti.sorgu(sql_koltuk);
		while(rs31.next()) {
			if(rs31.getInt("giris")>=1) {
				to31.setBackground(Color.red);
			}
		}
		
		JButton to32 = new JButton("32");
		to32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to32);
				to32.setBackground(Color.red);
			}
		});
		to32.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to32.setBackground(Color.GREEN);
		to32.setBounds(827, 178, 53, 45);
		contentPane.add(to32);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='32' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs32 = Baglanti.sorgu(sql_koltuk);
		while(rs32.next()) {
			if(rs32.getInt("giris")>=1) {
				to32.setBackground(Color.red);
			}
		}
		
		JButton to33 = new JButton("33");
		to33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to33);
				to33.setBackground(Color.red);
			}
		});
		to33.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to33.setBackground(Color.GREEN);
		to33.setBounds(827, 124, 53, 45);
		contentPane.add(to33);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='33' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs33 = Baglanti.sorgu(sql_koltuk);
		while(rs33.next()) {
			if(rs33.getInt("giris")>=1) {
				to33.setBackground(Color.red);
			}
		}
		
		JButton to34 = new JButton("34");
		to34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to34);
				to34.setBackground(Color.red);
			}
		});
		to34.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to34.setBackground(Color.GREEN);
		to34.setBounds(827, 71, 53, 45);
		contentPane.add(to34);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='34' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs34 = Baglanti.sorgu(sql_koltuk);
		while(rs34.next()) {
			if(rs34.getInt("giris")>=1) {
				to34.setBackground(Color.red);
			}
		}
		
		JButton to35 = new JButton("35");
		to35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(to35);
				to35.setBackground(Color.red);
			}
		});
		to35.setFont(new Font("Arial Black", Font.PLAIN, 10));
		to35.setBackground(Color.GREEN);
		to35.setBounds(827, 15, 53, 45);
		contentPane.add(to35);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='35' and otobus='tourismo' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs35 = Baglanti.sorgu(sql_koltuk);
		while(rs35.next()) {
			if(rs35.getInt("giris")>=1) {
				to35.setBackground(Color.red);
			}
		}
		
		JButton btnNewButton_1 = new JButton("DEVAM");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kartBilgileri krt = new kartBilgileri();
				krt.ucret.setText("ÖDEMENİZ GEREKEN TUTAR : "+ucretto);
				
				sql_bilet="INSERT INTO public.sefer(kalkis,varis,saat,otobus,tarih,koltukno,kul_ad) VALUES ('"+guzergah.kalkis+"','"+guzergah.varis+"',"+"'"+tourismosaat+"',"+"'"+otobust+"',"+"'"+guzergah.tarih+"',"+"'"+koltukno+"',"+"'"+KarsilamaEkrani.ad+"')";
				Baglanti.baglan();
				Baglanti.sorgu(sql_bilet);
				bilet.saat.setText(tourismosaat);
				bilet.otobus.setText(otobust);
				bilet.koltukno.setText(koltukno);
				
				sql_ad="SELECT ad as ad from public.musteri where kul_ad='"+KarsilamaEkrani.ad+"'";
				Baglanti.sorgu(sql_ad);
				ResultSet rs = Baglanti.sorgu(sql_ad);
				try {
					while(rs.next()) {
						ad=rs.getString(1);
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				sql_soyad="SELECT soyad as soyad from public.musteri where kul_ad='"+KarsilamaEkrani.ad+"'";
				Baglanti.sorgu(sql_soyad);
				ResultSet rs1 = Baglanti.sorgu(sql_soyad);
				try {
					while(rs1.next()) {
						soyad=rs1.getString(1);
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				sql_tel="SELECT telefon as tel from public.musteri where kul_ad='"+KarsilamaEkrani.ad+"'";
				Baglanti.sorgu(sql_tel);
				ResultSet rs2 = Baglanti.sorgu(sql_tel);
				try {
					while(rs2.next()) {
						tel=rs2.getString(1);
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				bilet.ad.setText(ad);
				bilet.soyad.setText(soyad);
				bilet.tel.setText(tel);
				
				
				secim scm = new secim();
				scm.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setBounds(811, 322, 91, 30);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("LÜTFEN SADECE 1 KOLTUK SEÇİMİ YAPINIZ.");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(461, 322, 364, 30);
		contentPane.add(lblNewLabel_1);
		
		

		JLabel background = new JLabel(new ImageIcon("Image/otobus.png"));
		background.setBounds(-178, 0, 1248, 269);
		background.setBackground(Color.WHITE);
		getContentPane().add(background);
		background.setLayout(new FlowLayout()); 
		
		
		
	}
}
