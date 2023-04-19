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

public class neoplan extends JFrame {

	private JPanel contentPane;
	public static String neoplansaat="12.00";
	public static String otobusneoplan="Neoplan";
	public static String ad,soyad,tel;
	public String sql_bilet,sql_ad,sql_soyad,sql_tel;
	public JLabel neoplan = new JLabel("");
	public String koltukno,sql_koltuk;
	public static String ucretno="395 TL";
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
					neoplan frame = new neoplan();
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
	public neoplan() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton no1 = new JButton("1");
		no1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no1);
				no1.setBackground(Color.red);
			}
		});
		no1.setBackground(Color.GREEN);
		no1.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no1.setBounds(136, 207, 53, 45);
		contentPane.add(no1);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='1' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs1 = Baglanti.sorgu(sql_koltuk);
		while(rs1.next()) {
			if(rs1.getInt("giris")>=1) {
				no1.setBackground(Color.red);
			}
		}
		
	
		
		JButton no2 = new JButton("2");
		no2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no2);
				no2.setBackground(Color.red);

			}
		});
		no2.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no2.setBounds(136, 159, 53, 45);
		no2.setBackground(Color.GREEN);
		contentPane.add(no2);
		no2.getText();
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='2' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs2 = Baglanti.sorgu(sql_koltuk);
		while(rs2.next()) {
			if(rs2.getInt("giris")>=1) {
				no2.setBackground(Color.red);
			}
		}
		
		
		JButton n03 = new JButton("3");
		n03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(n03);
				n03.setBackground(Color.red);
				
			}
		});
		n03.setFont(new Font("Arial Black", Font.PLAIN, 10));
		n03.setBounds(136, 60, 53, 45);
		n03.setBackground(Color.GREEN);
		contentPane.add(n03);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='3' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs3 = Baglanti.sorgu(sql_koltuk);
		while(rs3.next()) {
			if(rs3.getInt("giris")>=1) {
				n03.setBackground(Color.red);
			}
		}
		
		
		JButton no4 = new JButton("4");
		no4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no4);
				no4.setBackground(Color.red);
				
			}
		});
		no4.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no4.setBounds(136, 11, 53, 45);
		contentPane.add(no4);
		no4.setBackground(Color.GREEN);
		koltukno(no4);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='4' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs4 = Baglanti.sorgu(sql_koltuk);
		while(rs4.next()) {
			if(rs4.getInt("giris")>=1) {
				no4.setBackground(Color.red);
			}
		}
		
		JButton no5 = new JButton("5");
		no5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no4);
				no5.setBackground(Color.red);
				
			}
		});
		no5.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no5.setBounds(199, 207, 53, 45);
		no5.setBackground(Color.GREEN);
		contentPane.add(no5);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='5' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs5 = Baglanti.sorgu(sql_koltuk);
		while(rs5.next()) {
			if(rs5.getInt("giris")>=1) {
				no5.setBackground(Color.red);
			}
		}
	
		
		JButton no6 = new JButton("6");
		no6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no6);
				no6.setBackground(Color.red);
				
			}
		});
		no6.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no6.setBounds(199, 159, 53, 45);
		no6.setBackground(Color.GREEN);
		contentPane.add(no6);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='6' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs6 = Baglanti.sorgu(sql_koltuk);
		while(rs6.next()) {
			if(rs6.getInt("giris")>=1) {
				no6.setBackground(Color.red);
			}
		}
		
		
		JButton no7 = new JButton("7");
		no7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no7 );
				no7.setBackground(Color.red);
			}
		});
		no7.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no7.setBounds(199, 60, 53, 45);
		no7.setBackground(Color.GREEN);
		contentPane.add(no7);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='7' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs7 = Baglanti.sorgu(sql_koltuk);
		while(rs7.next()) {
			if(rs7.getInt("giris")>=1) {
				no7.setBackground(Color.red);
			}
		}
		
		
		JButton no8 = new JButton("8");
		no8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no8 );
				no8.setBackground(Color.red);
			}
		});
		no8.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no8.setBounds(199, 11, 53, 45);
		no8.setBackground(Color.GREEN);
		contentPane.add(no8);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='8' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs8 = Baglanti.sorgu(sql_koltuk);
		while(rs8.next()) {
			if(rs8.getInt("giris")>=1) {
				no8.setBackground(Color.red);
			}
		}
		
		
		JButton no11 = new JButton("11");
		no11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no11 );
				no11.setBackground(Color.red);
			}
		});
		no11.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no11.setBounds(262, 60, 53, 45);
		no11.setBackground(Color.GREEN);
		contentPane.add(no11);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='11' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs11 = Baglanti.sorgu(sql_koltuk);
		while(rs11.next()) {
			if(rs11.getInt("giris")>=1) {
				no11.setBackground(Color.red);
			}
		}
		
		JButton no12 = new JButton("12");
		no12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no12 );
				no12.setBackground(Color.red);
				
			}
		});
		no12.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no12.setBounds(262, 11, 53, 45);
		no12.setBackground(Color.GREEN);
		contentPane.add(no12);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='12' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs12 = Baglanti.sorgu(sql_koltuk);
		while(rs12.next()) {
			if(rs12.getInt("giris")>=1) {
				no12.setBackground(Color.red);
			}
		}
		
		
		JButton no10 = new JButton("10");
		no10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no10 );
				no10.setBackground(Color.red);
			}
		});
		no10.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no10.setBounds(262, 159, 53, 45);
		no10.setBackground(Color.GREEN);
		contentPane.add(no10);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='10' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs10 = Baglanti.sorgu(sql_koltuk);
		while(rs10.next()) {
			if(rs10.getInt("giris")>=1) {
				no10.setBackground(Color.red);
			}
		}
	
		
		JButton no9 = new JButton("9");
		no9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no9 );
				no9.setBackground(Color.red);
				
			}
		});
		no9.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no9.setBounds(262, 207, 53, 45);
		no9.setBackground(Color.GREEN);
		contentPane.add(no9);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='9' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs9 = Baglanti.sorgu(sql_koltuk);
		while(rs9.next()) {
			if(rs9.getInt("giris")>=1) {
				no9.setBackground(Color.red);
			}
		}
		
		
		JButton no13 = new JButton("13");
		no13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no13 );
				no13.setBackground(Color.red);
			}
		});
		no13.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no13.setBounds(325, 207, 53, 45);
		no13.setBackground(Color.GREEN);
		contentPane.add(no13);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='13' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs13 = Baglanti.sorgu(sql_koltuk);
		while(rs13.next()) {
			if(rs13.getInt("giris")>=1) {
				no13.setBackground(Color.red);
			}
		}
	
		
		JButton no14 = new JButton("14");
		no14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no14 );
				no14.setBackground(Color.red);
			}
		});
		no14.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no14.setBounds(325, 159, 53, 45);
		no14.setBackground(Color.GREEN);
		contentPane.add(no14);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='14' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs14 = Baglanti.sorgu(sql_koltuk);
		while(rs14.next()) {
			if(rs14.getInt("giris")>=1) {
				no14.setBackground(Color.red);
			}
		}
		
		
		JButton no15 = new JButton("15");
		no15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no15 );
				no15.setBackground(Color.red);
			}
		});
		no15.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no15.setBounds(325, 60, 53, 45);
		no15.setBackground(Color.GREEN);
		contentPane.add(no15);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='15' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs15 = Baglanti.sorgu(sql_koltuk);
		while(rs15.next()) {
			if(rs15.getInt("giris")>=1) {
				no15.setBackground(Color.red);
			}
		}
		
		
		JButton no16 = new JButton("16");
		no16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no16 );
				no16.setBackground(Color.red);
			}
		});
		no16.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no16.setBounds(325, 11, 53, 45);
		no16.setBackground(Color.GREEN);
		contentPane.add(no16);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='16' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs16 = Baglanti.sorgu(sql_koltuk);
		while(rs16.next()) {
			if(rs16.getInt("giris")>=1) {
				no16.setBackground(Color.red);
			}
		}
		
		
		JButton no17 = new JButton("17");
		no17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no17 );
				no17.setBackground(Color.red);
			}
		});
		no17.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no17.setBounds(388, 207, 53, 45);
		no17.setBackground(Color.GREEN);
		contentPane.add(no17);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='17' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs17 = Baglanti.sorgu(sql_koltuk);
		while(rs17.next()) {
			if(rs17.getInt("giris")>=1) {
				no17.setBackground(Color.red);
			}
		}
		
		JButton no18 = new JButton("18");
		no18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no18 );
				no18.setBackground(Color.red);
			}
		});
		no18.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no18.setBounds(388, 159, 53, 45);
		no18.setBackground(Color.GREEN);
		contentPane.add(no18);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='18' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs18 = Baglanti.sorgu(sql_koltuk);
		while(rs18.next()) {
			if(rs18.getInt("giris")>=1) {
				no18.setBackground(Color.red);
			}
		}
		
		JButton no19 = new JButton("19");
		no19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no19 );
				no19.setBackground(Color.red);
			}
		});
		no19.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no19.setBounds(388, 60, 53, 45);
		no19.setBackground(Color.GREEN);
		contentPane.add(no19);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='19' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs19 = Baglanti.sorgu(sql_koltuk);
		while(rs19.next()) {
			if(rs19.getInt("giris")>=1) {
				no19.setBackground(Color.red);
			}
		}
		
		JButton no20 = new JButton("20");
		no20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no20 );
				no20.setBackground(Color.red);
			}
		});
		no20.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no20.setBounds(388, 11, 53, 45);
		no20.setBackground(Color.GREEN);
		contentPane.add(no20);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='20' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs20 = Baglanti.sorgu(sql_koltuk);
		while(rs20.next()) {
			if(rs20.getInt("giris")>=1) {
				no20.setBackground(Color.red);
			}
		}
		
		JButton no21 = new JButton("21");
		no21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no21 );
				no21.setBackground(Color.red);
			}
		});
		no21.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no21.setBounds(451, 207, 53, 45);
		no21.setBackground(Color.GREEN);
		contentPane.add(no21);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='21' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs21 = Baglanti.sorgu(sql_koltuk);
		while(rs21.next()) {
			if(rs21.getInt("giris")>=1) {
				no21.setBackground(Color.red);
			}
		}
		
		JButton no22 = new JButton("22");
		no22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no22 );
				no22.setBackground(Color.red);
			}
		});
		no22.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no22.setBounds(451, 159, 53, 45);
		no22.setBackground(Color.GREEN);
		contentPane.add(no22);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='22' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs22 = Baglanti.sorgu(sql_koltuk);
		while(rs22.next()) {
			if(rs22.getInt("giris")>=1) {
				no22.setBackground(Color.red);
			}
		}
		
		JButton no23 = new JButton("23");
		no23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no23 );
				no23.setBackground(Color.red);
			}
		});
		no23.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no23.setBounds(451, 60, 53, 45);
		no23.setBackground(Color.GREEN);
		contentPane.add(no23);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='23' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs23 = Baglanti.sorgu(sql_koltuk);
		while(rs23.next()) {
			if(rs23.getInt("giris")>=1) {
				no23.setBackground(Color.red);
			}
		}
		
		JButton no24 = new JButton("24");
		no24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no24 );
				no24.setBackground(Color.red);
			}
		});
		no24.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no24.setBounds(451, 11, 53, 45);
		no24.setBackground(Color.GREEN);
		contentPane.add(no24);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='24' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs24 = Baglanti.sorgu(sql_koltuk);
		while(rs24.next()) {
			if(rs24.getInt("giris")>=1) {
				no24.setBackground(Color.red);
			}
		}
		
		JButton no25 = new JButton("25");
		no25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no25 );
				no25.setBackground(Color.red);
			}
		});
		no25.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no25.setBounds(511, 207, 53, 45);
		no25.setBackground(Color.GREEN);
		contentPane.add(no25);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='25' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs25 = Baglanti.sorgu(sql_koltuk);
		while(rs25.next()) {
			if(rs25.getInt("giris")>=1) {
				no25.setBackground(Color.red);
			}
		}
		
		JButton no26 = new JButton("26");
		no26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no26 );
				no26.setBackground(Color.red);
				
			}
		});
		no26.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no26.setBounds(511, 159, 53, 45);
		no26.setBackground(Color.GREEN);
		contentPane.add(no26);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='26' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs26 =  Baglanti.sorgu(sql_koltuk);
		while(rs26.next()) {
			if(rs26.getInt("giris")>=1) {
				no26.setBackground(Color.red);
			}
		}
		
		JButton no29 = new JButton("29");
		no29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no29 );
				no29.setBackground(Color.red);
			}
		});
		no29.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no29.setBounds(574, 60, 53, 45);
		no29.setBackground(Color.GREEN);
		contentPane.add(no29);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='29' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs29 = Baglanti.sorgu(sql_koltuk);
		while(rs29.next()) {
			if(rs29.getInt("giris")>=1) {
				no29.setBackground(Color.red);
			}
		}
		
		JButton no30 = new JButton("30");
		no30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no30 );
				no30.setBackground(Color.red);
			}
		});
		no30.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no30.setBounds(574, 11, 53, 45);
		no30.setBackground(Color.GREEN);
		contentPane.add(no30);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='30' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs30 = Baglanti.sorgu(sql_koltuk);
		while(rs30.next()) {
			if(rs30.getInt("giris")>=1) {
				no30.setBackground(Color.red);
			}
		}
		
		JButton no31 = new JButton("31");
		no31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no31 );
				no31.setBackground(Color.red);
			}
		});
		no31.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no31.setBounds(637, 207, 53, 45);
		no31.setBackground(Color.GREEN);
		contentPane.add(no31);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='31' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs31 = Baglanti.sorgu(sql_koltuk);
		while(rs31.next()) {
			if(rs31.getInt("giris")>=1) {
				no31.setBackground(Color.red);
			}
		}
		
		JButton no32 = new JButton("32");
		no32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no32 );
				no32.setBackground(Color.red);
			}
		});
		no32.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no32.setBounds(637, 159, 53, 45);
		no32.setBackground(Color.GREEN);
		contentPane.add(no32);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='1' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs32 = Baglanti.sorgu(sql_koltuk);
		while(rs32.next()) {
			if(rs32.getInt("giris")>=1) {
				no32.setBackground(Color.red);
			}
		}
		
		JButton no33 = new JButton("33");
		no33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no33 );
				no33.setBackground(Color.red);
			}
		});
		no33.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no33.setBounds(637, 60, 53, 45);
		no33.setBackground(Color.GREEN);
		contentPane.add(no33);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='33' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs33 = Baglanti.sorgu(sql_koltuk);
		while(rs33.next()) {
			if(rs33.getInt("giris")>=1) {
				no33.setBackground(Color.red);
			}
		}
		
		JButton no34 = new JButton("34");
		no34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no34 );
				no34.setBackground(Color.red);
			}
		});
		no34.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no34.setBounds(637, 11, 53, 45);
		no34.setBackground(Color.GREEN);
		contentPane.add(no34);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='34' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs34 = Baglanti.sorgu(sql_koltuk);
		while(rs34.next()) {
			if(rs34.getInt("giris")>=1) {
				no34.setBackground(Color.red);
			}
		}
		
		JButton no35 = new JButton("35");
		no35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no35 );
				no35.setBackground(Color.red);
			}
		});
		no35.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no35.setBounds(700, 207, 53, 45);
		no35.setBackground(Color.GREEN);
		contentPane.add(no35);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='35' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs35 = Baglanti.sorgu(sql_koltuk);
		while(rs35.next()) {
			if(rs35.getInt("giris")>=1) {
				no35.setBackground(Color.red);
			}
		}
		
		JButton no36 = new JButton("36");
		no36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no36 );
				no36.setBackground(Color.red);
				
			}
		});
		no36.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no36.setBounds(700, 159, 53, 45);
		no36.setBackground(Color.GREEN);
		contentPane.add(no36);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='36' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs36 = Baglanti.sorgu(sql_koltuk);
		while(rs36.next()) {
			if(rs36.getInt("giris")>=1) {
				no36.setBackground(Color.red);
			}
		}
		
		JButton no37 = new JButton("37");
		no37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no37 );
				no37.setBackground(Color.red);
			}
		});
		no37.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no37.setBounds(700, 60, 53, 45);
		no37.setBackground(Color.GREEN);
		contentPane.add(no37);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='37' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs37 = Baglanti.sorgu(sql_koltuk);
		while(rs37.next()) {
			if(rs37.getInt("giris")>=1) {
				no37.setBackground(Color.red);
			}
		}
		
		JButton no38 = new JButton("38");
		no38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no38 );
				no38.setBackground(Color.red);
			}
		});
		no38.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no38.setBounds(700, 11, 53, 45);
		no38.setBackground(Color.GREEN);
		contentPane.add(no38);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='38' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs38 = Baglanti.sorgu(sql_koltuk);
		while(rs38.next()) {
			if(rs38.getInt("giris")>=1) {
				no38.setBackground(Color.red);
			}
		}
		
		JButton no39 = new JButton("39");
		no39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no39 );
				no39.setBackground(Color.red);
			}
		});
		no39.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no39.setBounds(763, 207, 53, 45);
		no39.setBackground(Color.GREEN);
		contentPane.add(no39);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='39' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs39 = Baglanti.sorgu(sql_koltuk);
		while(rs39.next()) {
			if(rs39.getInt("giris")>=1) {
				no39.setBackground(Color.red);
			}
		}
		
		JButton no40 = new JButton("40");
		no40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no40 );
				no40.setBackground(Color.red);
				
			}
		});
		no40.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no40.setBounds(763, 159, 53, 45);
		no40.setBackground(Color.GREEN);
		contentPane.add(no40);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='40' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs40 = Baglanti.sorgu(sql_koltuk);
		while(rs40.next()) {
			if(rs40.getInt("giris")>=1) {
				no40.setBackground(Color.red);
			}
		}
		
		JButton no41 = new JButton("41");
		no41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no41 );
				no41.setBackground(Color.red);
			}
		});
		no41.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no41.setBounds(763, 60, 53, 45);
		no41.setBackground(Color.GREEN);
		contentPane.add(no41);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='41' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs41 = Baglanti.sorgu(sql_koltuk);
		while(rs41.next()) {
			if(rs41.getInt("giris")>=1) {
				no41.setBackground(Color.red);
			}
		}
		
		JButton no42 = new JButton("42");
		no42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no42 );
				no42.setBackground(Color.red);
			}
		});
		no42.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no42.setBounds(763, 11, 53, 45);
		no42.setBackground(Color.GREEN);
		contentPane.add(no42);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='42' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs42 = Baglanti.sorgu(sql_koltuk);
		while(rs42.next()) {
			if(rs42.getInt("giris")>=1) {
				no42.setBackground(Color.red);
			}
		}
		
		
		JButton no43 = new JButton("43");
		no43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no43 );
				no43.setBackground(Color.red);
			}
		});
		no43.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no43.setBounds(826, 207, 53, 45);
		no43.setBackground(Color.GREEN);
		contentPane.add(no43);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='43' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs43 = Baglanti.sorgu(sql_koltuk);
		while(rs43.next()) {
			if(rs43.getInt("giris")>=1) {
				no43.setBackground(Color.red);
			}
		}
		
		JButton no44 = new JButton("44");
		no44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no44 );
				no44.setBackground(Color.red);
			}
		});
		no44.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no44.setBounds(826, 159, 53, 45);
		no44.setBackground(Color.GREEN);
		contentPane.add(no44);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='44' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs44 = Baglanti.sorgu(sql_koltuk);
		while(rs44.next()) {
			if(rs44.getInt("giris")>=1) {
				no44.setBackground(Color.red);
			}
		}
		
		JButton no46 = new JButton("46");
		no46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no46 );
				no46.setBackground(Color.red);
			}
		});
		no46.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no46.setBounds(826, 60, 53, 45);
		no46.setBackground(Color.GREEN);
		contentPane.add(no46);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='46' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs46 = Baglanti.sorgu(sql_koltuk);
		while(rs46.next()) {
			if(rs46.getInt("giris")>=1) {
				no46.setBackground(Color.red);
			}
		}
		
		JButton no47 = new JButton("47");
		no47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no47 );
				no47.setBackground(Color.red);
			}
		});
		no47.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no47.setBounds(826, 11, 53, 45);
		no47.setBackground(Color.GREEN);
		contentPane.add(no47);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='47' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs47 = Baglanti.sorgu(sql_koltuk);
		while(rs47.next()) {
			if(rs47.getInt("giris")>=1) {
				no47.setBackground(Color.red);
			}
		}
		
		JButton no45 = new JButton("45");
		no45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no45 );
				no45.setBackground(Color.red);
			}
		});
		no45.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no45.setBounds(826, 109, 53, 45);
		no45.setBackground(Color.GREEN);
		contentPane.add(no45);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='45' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs45 = Baglanti.sorgu(sql_koltuk);
		while(rs45.next()) {
			if(rs45.getInt("giris")>=1) {
				no45.setBackground(Color.red);
			}
		}
		
		JButton no28 = new JButton("28");
		no28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no28 );
				no28.setBackground(Color.red);
			}
		});
		no28.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no28.setBounds(574, 159, 53, 45);
		no28.setBackground(Color.GREEN);
		contentPane.add(no28);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='28' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs28 = Baglanti.sorgu(sql_koltuk);
		while(rs28.next()) {
			if(rs28.getInt("giris")>=1) {
				no28.setBackground(Color.red);
			}
		}
		
		JButton no27 = new JButton("27");
		no27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koltukno(no27 );
				no27.setBackground(Color.red);
			}
		});
		no27.setFont(new Font("Arial Black", Font.PLAIN, 10));
		no27.setBounds(574, 207, 53, 45);
		no27.setBackground(Color.GREEN);
		contentPane.add(no27);
		
		sql_koltuk="SELECT count(koltukno) as giris FROM public.sefer WHERE koltukno='27' and otobus='Neoplan' and kalkis='"+guzergah.kalkis+"' and varis='"+guzergah.varis+"';";
		Baglanti.baglan();
		ResultSet rs27 = Baglanti.sorgu(sql_koltuk);
		while(rs27.next()) {
			if(rs27.getInt("giris")>=1) {
				no27.setBackground(Color.red);
			}
		}
		
		neoplan.setHorizontalAlignment(SwingConstants.CENTER);

		neoplan.setFont(new Font("Arial Black", Font.PLAIN, 13));
		neoplan.setBounds(0, 277, 910, 53);
		contentPane.add(neoplan);
		
		JLabel background = new JLabel(new ImageIcon("Image/otobus.png"));
		background.setBounds(0, 0, 905, 279);
		background.setBackground(Color.WHITE);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		
		JButton btnNewButton_45 = new JButton("DEVAM");
		btnNewButton_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				kartBilgileri krt = new kartBilgileri();
				krt.ucret.setText("ÖDEMENİZ GEREKEN TUTAR : "+ucretno);
				sql_bilet="INSERT INTO public.sefer(kalkis,varis,saat,otobus,tarih,koltukno,kul_ad) VALUES ('"+guzergah.kalkis+"','"+guzergah.varis+"',"+"'"+neoplansaat+"',"+"'"+otobusneoplan+"',"+"'"+guzergah.tarih+"',"+"'"+koltukno+"',"+"'"+KarsilamaEkrani.ad+"')";
				Baglanti.baglan();
				Baglanti.sorgu(sql_bilet);
				bilet.saat.setText(neoplansaat);
				bilet.otobus.setText(otobusneoplan);
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
		btnNewButton_45.setBackground(Color.CYAN);
		btnNewButton_45.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnNewButton_45.setBounds(807, 332, 103, 37);
		contentPane.add(btnNewButton_45);
		
		JLabel lblNewLabel = new JLabel("LÜTFEN SADECE 1 KOLTUK SEÇİNİZ");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(451, 332, 346, 37);
		contentPane.add(lblNewLabel);
		
	}
}
