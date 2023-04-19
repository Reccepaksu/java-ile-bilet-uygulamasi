package OtobusBilet;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import java.awt.Component;
import java.awt.Dimension;

public class KarsilamaEkrani extends JFrame {

	private JPanel contentPane;
	static JTextField kuladi;
	static JPasswordField kulsifre;
	public static String ad,soyad,sifre,giris;
	static String sql_admin;
	static String sql_soyad;
	static String sql_cinsiyet;
	public static String C1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KarsilamaEkrani frame = new KarsilamaEkrani();
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
	public KarsilamaEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 509);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("HOSGELDİNİZ");
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD, 46));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(48, 5, 369, 97);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("KULLANICI ADI:");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(27, 270, 153, 39);
		contentPane.add(lblNewLabel_1);
		
		kuladi = new JTextField();
		kuladi.setForeground(Color.BLACK);
		kuladi.setFont(new Font("Arial", Font.PLAIN, 20));
		kuladi.setBounds(207, 270, 187, 39);
		contentPane.add(kuladi);
		kuladi.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PAROLA");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(37, 320, 143, 39);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("GIRIS");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Baglanti.baglan();
				ad=kuladi.getText();
				sifre=kulsifre.getText();
				
				sql_admin="SELECT count(kul_id) as giris FROM public.admin WHERE kul_ad='"+ad+"' and kul_sifre='"+sifre+"'";
				sql_soyad="SELECT kul_id as soyad from public.admin where kul_ad='"+ad+"'";
				ResultSet rs = Baglanti.sorgu(sql_soyad);
				try {
					while(rs.next()) {
						soyad=rs.getString(1);
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				rs = Baglanti.sorgu(sql_admin);
				
				try {
					while(rs.next()){
						if(rs.getInt("giris")==1) {
							istek istek = new istek();
							istek.setVisible(true);
							istek.lblNewLabel.setText("HOŞGELDİN "+ad+"...");
							setVisible(false); 
						}
						else {
							btnNewButton.setText("Hatalı Giris");
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				sql_cinsiyet="SELECT cinsiyet as cinsiyet from public.musteri where kul_ad='"+ad+"';";
				ResultSet rs2=Baglanti.sorgu(sql_cinsiyet);
				try {
					while(rs2.next()) {
						C1=rs2.getString("cinsiyet");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(C1);
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton.setBounds(280, 370, 114, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("KAYIT OL ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kayitOl kyt = new kayitOl();
				kyt.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_1.setBounds(141, 370, 129, 44);
		contentPane.add(btnNewButton_1);
		
		kulsifre = new JPasswordField(5);
		kulsifre.setAlignmentX(Component.LEFT_ALIGNMENT);
		kulsifre.setEchoChar('*');
		kulsifre.setFont(new Font("Arial", Font.PLAIN, 20));
		kulsifre.setForeground(Color.BLACK);
		kulsifre.setBounds(207, 320, 187, 39);
		contentPane.add(kulsifre);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon("Image/b.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				kulsifre.setEchoChar((char)0);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				kulsifre.setEchoChar('*');
			}
		});
		btnNewButton_2.setBackground(new Color(135, 206, 235));
		btnNewButton_2.setBounds(403, 320, 34, 38);
		getContentPane().add(btnNewButton_2);
		btnNewButton_2.setLayout(new FlowLayout());
		
		
		
		JLabel background = new JLabel(new ImageIcon("Image/resim1.jpeg"));
		background.setBackground(Color.WHITE);
		background.setBounds(5, 5, 456, 374);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
	
	}
}