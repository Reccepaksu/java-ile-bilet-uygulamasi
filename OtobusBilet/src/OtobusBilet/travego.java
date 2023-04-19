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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class travego extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel = new JLabel("");
	public String koltukno;
	public static String travegosaat="09.20";
	public static String otobustravego="Travego";
	public static String ad,soyad,tel;
	public String sql_bilet,sql_ad,sql_soyad,sql_tel,sql_koltuk;
	public static String ucret="420 TL";
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
					travego frame = new travego();
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
	public travego() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 247, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 280, 895, 46);
		contentPane.add(lblNewLabel);
		
		JButton tr1 = new JButton("1");
		tr1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr1);
				tr1.setBackground(Color.red);
			}
		});
		tr1.setBackground(Color.GREEN);
		tr1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr1.setBounds(128, 187, 49, 46);
		contentPane.add(tr1);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='1' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs1 = Baglanti.sorgu(sql_koltuk);
		while(rs1.next()) {
			if(rs1.getInt("giris")>=1) {
				tr1.setBackground(Color.red);
			}
		}
		
		JButton tr4 = new JButton("4");
		tr4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr4);
				tr4.setBackground(Color.red);
			}
		});
		tr4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr4.setBackground(Color.GREEN);
		tr4.setBounds(187, 187, 49, 46);
		contentPane.add(tr4);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='4' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs4 = Baglanti.sorgu(sql_koltuk);
		while(rs4.next()) {
			if(rs4.getInt("giris")>=1) {
				tr4.setBackground(Color.red);
			}
		}
		
		JButton tr2 = new JButton("2");
		tr2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr2);
				tr2.setBackground(Color.red);
			}
		});
		tr2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr2.setBackground(Color.GREEN);
		tr2.setBounds(128, 131, 49, 46);
		contentPane.add(tr2);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='2' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs2 = Baglanti.sorgu(sql_koltuk);
		while(rs2.next()) {
			if(rs2.getInt("giris")>=1) {
				tr2.setBackground(Color.red);
			}
		}
		
		JButton tr5 = new JButton("5");
		tr5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr5);
				tr5.setBackground(Color.red);
			}
		});
		tr5.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr5.setBackground(Color.GREEN);
		tr5.setBounds(187, 130, 49, 46);
		contentPane.add(tr5);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='5' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs5 = Baglanti.sorgu(sql_koltuk);
		while(rs5.next()) {
			if(rs5.getInt("giris")>=1) {
				tr5.setBackground(Color.red);
			}
		}
		
		JButton tr7 = new JButton("7");
		tr7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr7);
				tr7.setBackground(Color.red);
			}
		});
		tr7.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr7.setBackground(Color.GREEN);
		tr7.setBounds(246, 187, 49, 46);
		contentPane.add(tr7);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='7' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs7 = Baglanti.sorgu(sql_koltuk);
		while(rs7.next()) {
			if(rs7.getInt("giris")>=1) {
				tr5.setBackground(Color.red);
			}
		}
		
		JButton tr8 = new JButton("8");
		tr8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr8);
				tr8.setBackground(Color.red);
			}
		});
		tr8.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr8.setBackground(Color.GREEN);
		tr8.setBounds(246, 131, 49, 46);
		contentPane.add(tr8);
		
		JButton tr10 = new JButton("10");
		tr10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr10);
				tr10.setBackground(Color.red);
			}
		});
		tr10.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr10.setBackground(Color.GREEN);
		tr10.setBounds(305, 187, 49, 46);
		contentPane.add(tr10);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='10' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs10 = Baglanti.sorgu(sql_koltuk);
		while(rs10.next()) {
			if(rs10.getInt("giris")>=1) {
				tr10.setBackground(Color.red);
			}
		}
		
		JButton tr11 = new JButton("11");
		tr11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr11);
				tr11.setBackground(Color.red);
			}
		});
		tr11.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr11.setBackground(Color.GREEN);
		tr11.setBounds(305, 131, 49, 46);
		contentPane.add(tr11);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='11' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs11 = Baglanti.sorgu(sql_koltuk);
		while(rs11.next()) {
			if(rs11.getInt("giris")>=1) {
				tr11.setBackground(Color.red);
			}
		}
		
		JButton tr13 = new JButton("13");
		tr13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr13);
				tr13.setBackground(Color.red);
			}
		});
		tr13.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr13.setBackground(Color.GREEN);
		tr13.setBounds(364, 187, 49, 46);
		contentPane.add(tr13);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='13' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs13 = Baglanti.sorgu(sql_koltuk);
		while(rs13.next()) {
			if(rs13.getInt("giris")>=1) {
				tr13.setBackground(Color.red);
			}
		}
		
		JButton tr14 = new JButton("14");
		tr14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr14);
				tr14.setBackground(Color.red);
			}
		});
		tr14.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr14.setBackground(Color.GREEN);
		tr14.setBounds(364, 131, 49, 46);
		contentPane.add(tr14);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='14' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs14 = Baglanti.sorgu(sql_koltuk);
		while(rs14.next()) {
			if(rs14.getInt("giris")>=1) {
				tr14.setBackground(Color.red);
			}
		}
		
		JButton tr16 = new JButton("16");
		tr16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr16);
				tr16.setBackground(Color.red);
			}
		});
		tr16.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr16.setBackground(Color.GREEN);
		tr16.setBounds(423, 187, 49, 46);
		contentPane.add(tr16);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='16' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs16 = Baglanti.sorgu(sql_koltuk);
		while(rs16.next()) {
			if(rs16.getInt("giris")>=1) {
				tr16.setBackground(Color.red);
			}
		}
		
		JButton tr17 = new JButton("17");
		tr17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr17);
				tr17.setBackground(Color.red);
			}
		});
		tr17.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr17.setBackground(Color.GREEN);
		tr17.setBounds(423, 131, 49, 46);
		contentPane.add(tr17);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='17' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs17 = Baglanti.sorgu(sql_koltuk);
		while(rs17.next()) {
			if(rs17.getInt("giris")>=1) {
				tr17.setBackground(Color.red);
			}
		}
		
		JButton tr19 = new JButton("19");
		tr19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr19);
				tr19.setBackground(Color.red);
			}
		});
		tr19.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr19.setBackground(Color.GREEN);
		tr19.setBounds(482, 187, 49, 46);
		contentPane.add(tr19);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='19' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs19 = Baglanti.sorgu(sql_koltuk);
		while(rs19.next()) {
			if(rs19.getInt("giris")>=1) {
				tr19.setBackground(Color.red);
			}
		}
		
		JButton tr20 = new JButton("20");
		tr20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr20);
				tr20.setBackground(Color.red);
			}
		});
		tr20.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr20.setBackground(Color.GREEN);
		tr20.setBounds(482, 131, 49, 46);
		contentPane.add(tr20);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='20' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs20 = Baglanti.sorgu(sql_koltuk);
		while(rs20.next()) {
			if(rs20.getInt("giris")>=1) {
				tr20.setBackground(Color.red);
			}
		}
		
		JButton tr21 = new JButton("21");
		tr21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr21);
				tr21.setBackground(Color.red);
			}
		});
		tr21.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr21.setBackground(Color.GREEN);
		tr21.setBounds(541, 187, 49, 46);
		contentPane.add(tr21);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='21' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs21 = Baglanti.sorgu(sql_koltuk);
		while(rs21.next()) {
			if(rs21.getInt("giris")>=1) {
				tr21.setBackground(Color.red);
			}
		}
		
		JButton tr22 = new JButton("22");
		tr22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr22);
				tr22.setBackground(Color.red);
			}
		});
		tr22.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr22.setBackground(Color.GREEN);
		tr22.setBounds(541, 131, 49, 46);
		contentPane.add(tr22);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='22' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs22 = Baglanti.sorgu(sql_koltuk);
		while(rs22.next()) {
			if(rs22.getInt("giris")>=1) {
				tr22.setBackground(Color.red);
			}
		}
		
		JButton tr24 = new JButton("24");
		tr24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr24);
				tr24.setBackground(Color.red);
			}
		});
		tr24.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr24.setBackground(Color.GREEN);
		tr24.setBounds(600, 187, 49, 46);
		contentPane.add(tr24);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='24' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs24 = Baglanti.sorgu(sql_koltuk);
		while(rs24.next()) {
			if(rs24.getInt("giris")>=1) {
				tr24.setBackground(Color.red);
			}
		}
		
		JButton tr25 = new JButton("25");
		tr25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr25);
				tr25.setBackground(Color.red);
			}
		});
		tr25.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr25.setBackground(Color.GREEN);
		tr25.setBounds(600, 131, 49, 46);
		contentPane.add(tr25);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='25' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs25 = Baglanti.sorgu(sql_koltuk);
		while(rs25.next()) {
			if(rs25.getInt("giris")>=1) {
				tr25.setBackground(Color.red);
			}
		}
		
		JButton tr27 = new JButton("27");
		tr27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr27);
				tr27.setBackground(Color.red);
			}
		});
		tr27.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr27.setBackground(Color.GREEN);
		tr27.setBounds(659, 187, 49, 46);
		contentPane.add(tr27);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='27' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs27 = Baglanti.sorgu(sql_koltuk);
		while(rs27.next()) {
			if(rs27.getInt("giris")>=1) {
				tr27.setBackground(Color.red);
			}
		}
		
		JButton tr28 = new JButton("28");
		tr28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr28);
				tr28.setBackground(Color.red);
			}
		});
		tr28.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr28.setBackground(Color.GREEN);
		tr28.setBounds(659, 131, 49, 46);
		contentPane.add(tr28);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='28' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs28 = Baglanti.sorgu(sql_koltuk);
		while(rs28.next()) {
			if(rs28.getInt("giris")>=1) {
				tr28.setBackground(Color.red);
			}
		}
		
		JButton tr30 = new JButton("30");
		tr30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr30);
				tr30.setBackground(Color.red);
			}
		});
		tr30.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr30.setBackground(Color.GREEN);
		tr30.setBounds(718, 187, 49, 46);
		contentPane.add(tr30);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='30' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs30 = Baglanti.sorgu(sql_koltuk);
		while(rs30.next()) {
			if(rs30.getInt("giris")>=1) {
				tr30.setBackground(Color.red);
			}
		}
		
		JButton tr31 = new JButton("31");
		tr31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr31);
				tr31.setBackground(Color.red);
			}
		});
		tr31.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr31.setBackground(Color.GREEN);
		tr31.setBounds(718, 131, 49, 46);
		contentPane.add(tr31);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='31' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs31 = Baglanti.sorgu(sql_koltuk);
		while(rs31.next()) {
			if(rs31.getInt("giris")>=1) {
				tr31.setBackground(Color.red);
			}
		}
		
		JButton tr33 = new JButton("33");
		tr33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr33);
				tr33.setBackground(Color.red);
			}
		});
		tr33.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr33.setBackground(Color.GREEN);
		tr33.setBounds(777, 187, 49, 46);
		contentPane.add(tr33);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='33' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs33= Baglanti.sorgu(sql_koltuk);
		while(rs33.next()) {
			if(rs33.getInt("giris")>=1) {
				tr33.setBackground(Color.red);
			}
		}
		
		JButton tr34 = new JButton("34");
		tr34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr34);
				tr34.setBackground(Color.red);
			}
		});
		tr34.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr34.setBackground(Color.GREEN);
		tr34.setBounds(777, 131, 49, 46);
		contentPane.add(tr34);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='34' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs34 = Baglanti.sorgu(sql_koltuk);
		while(rs34.next()) {
			if(rs34.getInt("giris")>=1) {
				tr34.setBackground(Color.red);
			}
		}
		
		JButton tr36 = new JButton("36");
		tr36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr36);
				tr36.setBackground(Color.red);
			}
		});
		tr36.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr36.setBackground(Color.GREEN);
		tr36.setBounds(836, 187, 49, 46);
		contentPane.add(tr36);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='36' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs36 = Baglanti.sorgu(sql_koltuk);
		while(rs36.next()) {
			if(rs36.getInt("giris")>=1) {
				tr36.setBackground(Color.red);
			}
		}
		
		JButton tr37 = new JButton("37");
		tr37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr37);
				tr37.setBackground(Color.red);
			}
		});
		tr37.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr37.setBackground(Color.GREEN);
		tr37.setBounds(836, 131, 49, 46);
		contentPane.add(tr37);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='37' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs37 = Baglanti.sorgu(sql_koltuk);
		while(rs37.next()) {
			if(rs37.getInt("giris")>=1) {
				tr37.setBackground(Color.red);
			}
		}
		
		JButton tr38 = new JButton("38");
		tr38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr38);
				tr38.setBackground(Color.red);
			}
		});
		tr38.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr38.setBackground(Color.GREEN);
		tr38.setBounds(836, 75, 49, 46);
		contentPane.add(tr38);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='38' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs38 = Baglanti.sorgu(sql_koltuk);
		while(rs38.next()) {
			if(rs38.getInt("giris")>=1) {
				tr38.setBackground(Color.red);
			}
		}
		
		JButton tr39 = new JButton("39");
		tr39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr39);
				tr39.setBackground(Color.red);
			}
		});
		tr39.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr39.setBackground(Color.GREEN);
		tr39.setBounds(836, 18, 49, 46);
		contentPane.add(tr39);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='39' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs39 = Baglanti.sorgu(sql_koltuk);
		while(rs39.next()) {
			if(rs39.getInt("giris")>=1) {
				tr39.setBackground(Color.red);
			}
		}
		
		JButton tr35 = new JButton("35");
		tr35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr35);
				tr35.setBackground(Color.red);
			}
		});
		tr35.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr35.setBackground(Color.GREEN);
		tr35.setBounds(777, 18, 49, 46);
		contentPane.add(tr35);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='35' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs35 = Baglanti.sorgu(sql_koltuk);
		while(rs35.next()) {
			if(rs35.getInt("giris")>=1) {
				tr35.setBackground(Color.red);
			}
		}
		
		JButton tr32 = new JButton("32");
		tr32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr32);
				tr32.setBackground(Color.red);
			}
		});
		tr32.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr32.setBackground(Color.GREEN);
		tr32.setBounds(718, 18, 49, 46);
		contentPane.add(tr32);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='32' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs32 = Baglanti.sorgu(sql_koltuk);
		while(rs32.next()) {
			if(rs32.getInt("giris")>=1) {
				tr32.setBackground(Color.red);
			}
		}
		
		JButton tr29 = new JButton("29");
		tr29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr29);
				tr29.setBackground(Color.red);
			}
		});
		tr29.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr29.setBackground(Color.GREEN);
		tr29.setBounds(659, 18, 49, 46);
		contentPane.add(tr29);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='29' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs29 = Baglanti.sorgu(sql_koltuk);
		while(rs29.next()) {
			if(rs29.getInt("giris")>=1) {
				tr29.setBackground(Color.red);
			}
		}
		
		JButton tr26 = new JButton("26");
		tr26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr26);
				tr26.setBackground(Color.red);
			}
		});
		tr26.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr26.setBackground(Color.GREEN);
		tr26.setBounds(600, 18, 49, 46);
		contentPane.add(tr26);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='26' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs26 = Baglanti.sorgu(sql_koltuk);
		while(rs26.next()) {
			if(rs26.getInt("giris")>=1) {
				tr26.setBackground(Color.red);
			}
		}
		
		JButton tr23 = new JButton("23");
		tr23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr23);
				tr23.setBackground(Color.red);
			}
		});
		tr23.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr23.setBackground(Color.GREEN);
		tr23.setBounds(541, 18, 49, 46);
		contentPane.add(tr23);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='23' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs23 = Baglanti.sorgu(sql_koltuk);
		while(rs23.next()) {
			if(rs23.getInt("giris")>=1) {
				tr23.setBackground(Color.red);
			}
		}
		
		JButton tr18 = new JButton("18");
		tr18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr18);
				tr18.setBackground(Color.red);
			}
		});
		tr18.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr18.setBackground(Color.GREEN);
		tr18.setBounds(423, 18, 49, 46);
		contentPane.add(tr18);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='18' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs18 = Baglanti.sorgu(sql_koltuk);
		while(rs18.next()) {
			if(rs18.getInt("giris")>=1) {
				tr18.setBackground(Color.red);
			}
		}
		
		JButton tr15 = new JButton("15");
		tr15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr15);
				tr15.setBackground(Color.red);
			}
		});
		tr15.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr15.setBackground(Color.GREEN);
		tr15.setBounds(364, 18, 49, 46);
		contentPane.add(tr15);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='15' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs15 = Baglanti.sorgu(sql_koltuk);
		while(rs15.next()) {
			if(rs15.getInt("giris")>=1) {
				tr15.setBackground(Color.red);
			}
		}
		
		JButton tr12 = new JButton("12");
		tr12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr12);
				tr12.setBackground(Color.red);
			}
		});
		tr12.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr12.setBackground(Color.GREEN);
		tr12.setBounds(305, 18, 49, 46);
		contentPane.add(tr12);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='12' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs12 = Baglanti.sorgu(sql_koltuk);
		while(rs12.next()) {
			if(rs12.getInt("giris")>=1) {
				tr12.setBackground(Color.red);
			}
		}
		
		JButton tr9 = new JButton("9");
		tr9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr9);
				tr9.setBackground(Color.red);
			}
		});
		tr9.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr9.setBackground(Color.GREEN);
		tr9.setBounds(246, 18, 49, 46);
		contentPane.add(tr9);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='9' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs9 = Baglanti.sorgu(sql_koltuk);
		while(rs9.next()) {
			if(rs9.getInt("giris")>=1) {
				tr9.setBackground(Color.red);
			}
		}
		
		JButton tr6 = new JButton("6");
		tr6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr6);
				tr6.setBackground(Color.red);
			}
		});
		tr6.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr6.setBackground(Color.GREEN);
		tr6.setBounds(187, 18, 49, 46);
		contentPane.add(tr6);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='6' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs6 = Baglanti.sorgu(sql_koltuk);
		while(rs6.next()) {
			if(rs6.getInt("giris")>=1) {
				tr6.setBackground(Color.red);
			}
		}
		
		JButton tr3 = new JButton("3");
		tr3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(tr3);
				tr3.setBackground(Color.red);
			}
		});
		tr3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tr3.setBackground(Color.GREEN);
		tr3.setBounds(128, 18, 49, 46);
		contentPane.add(tr3);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='3' and otobus='Travego' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs3 = Baglanti.sorgu(sql_koltuk);
		while(rs3.next()) {
			if(rs3.getInt("giris")>=1) {
				tr3.setBackground(Color.red);
			}
		}
		
		JLabel background = new JLabel(new ImageIcon("Image/otobus.png"));
		background.setBounds(0, 0, 905, 279);
		background.setBackground(Color.WHITE);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		
		JButton btnNewButton_2 = new JButton("DEVAM");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kartBilgileri krt = new kartBilgileri();
				krt.ucret.setText("ÖDEMENİZ GEREKEN TUTAR : "+ucret);
				
				sql_bilet="INSERT INTO public.sefer(kalkis,varis,saat,otobus,tarih,koltukno,kul_ad) VALUES ('"+guzergah.kalkis+"','"+guzergah.varis+"',"+"'"+travegosaat+"',"+"'"+otobustravego+"',"+"'"+guzergah.tarih+"',"+"'"+koltukno+"',"+"'"+KarsilamaEkrani.ad+"')";
				Baglanti.baglan();
				Baglanti.sorgu(sql_bilet);
				bilet.saat.setText(travegosaat);
				bilet.otobus.setText(otobustravego);
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
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnNewButton_2.setBounds(807, 328, 103, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("LÜTFEN SADECE 1 KOLTUK SEÇİNİZ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(423, 328, 358, 32);
		contentPane.add(lblNewLabel_1);
		
		
		
	}
}
