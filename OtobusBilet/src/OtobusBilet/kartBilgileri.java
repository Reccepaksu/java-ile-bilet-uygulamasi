package OtobusBilet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kartBilgileri extends JFrame {

	private JPanel contentPane;
	private JTextField kartisim;
	private JTextField no;
	private JTextField skt;
	private JTextField cvv;
	public String sql_ekle;
	public String kartno,kartad,kartskt,kartcvv;
	public static JLabel ucret = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kartBilgileri frame = new kartBilgileri();
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
	public kartBilgileri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KART BİLGİLERİ ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel.setBounds(81, 52, 284, 86);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("KART ÜZERİNDEKİ İSİM");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 149, 161, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("KART NO ");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 190, 99, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SON KULLANMA TARİHİ");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(10, 238, 146, 30);
		contentPane.add(lblNewLabel_3);
		
		kartisim = new JTextField();
		kartisim.setBounds(181, 154, 258, 20);
		contentPane.add(kartisim);
		kartisim.setColumns(10);
		
		no = new JTextField();
		no.setBounds(181, 195, 258, 20);
		contentPane.add(no);
		no.setColumns(10);
		
		skt = new JTextField();
		skt.setBounds(181, 243, 99, 20);
		contentPane.add(skt);
		skt.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CVV");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(10, 279, 99, 27);
		contentPane.add(lblNewLabel_4);
		
		cvv = new JTextField();
		cvv.setBounds(181, 282, 99, 20);
		contentPane.add(cvv);
		cvv.setColumns(10);
		
		JButton btnNewButton = new JButton("ÖDE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kartno=no.getText();
				kartad=kartisim.getText();
				kartskt=skt.getText();
				kartcvv=cvv.getText();	
				sql_ekle="INSERT INTO public.odeme (kul_ad,kart_isim,kart_no,kart_skt,kart_cvv) VALUES ('"+KarsilamaEkrani.ad+"','"+kartad+"',"+"'"+kartno+"',"+"'"+kartskt+"',"+"'"+kartcvv+"')";
				Baglanti.baglan();
				Baglanti.sorgu(sql_ekle);
				JOptionPane.showInternalMessageDialog(null,"ÖDEMENİZ BAŞARI İLE GERÇEKLEŞTİ...");
				bilet blt = new bilet();
				blt.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton.setBounds(301, 380, 119, 35);
		contentPane.add(btnNewButton);
		ucret.setForeground(Color.BLACK);
		
		ucret.setHorizontalAlignment(SwingConstants.LEFT);
		ucret.setFont(new Font("Arial Black", Font.PLAIN, 16));
		ucret.setBounds(10, 11, 410, 59);
		contentPane.add(ucret);
		
		JLabel background = new JLabel(new ImageIcon("Image/kartbilgileri.png"));
		background.setBackground(Color.WHITE);
		background.setBounds(-109, -22, 671, 474);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		
		
	}
}
