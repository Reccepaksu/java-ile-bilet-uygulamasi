package OtobusBilet;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bilgiAlma extends JFrame {

	static JPanel contentPane;
	static JTextField textad;
	static JTextField textsoyad;
	static JTextField textcinsiyet;
	static JTextField textkalkis;
	static JTextField textvaris;
	static JLabel lblNewLabel_5;
	static JTextField textid;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bilgiAlma frame = new bilgiAlma();
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
	public bilgiAlma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 306, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ad\u0131n\u0131z");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 66, 86, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_5 = new JLabel("TC no");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(24, 22, 55, 33);
		contentPane.add(lblNewLabel_5);
		
		textid = new JTextField();
		textid.setHorizontalAlignment(SwingConstants.CENTER);
		textid.setBounds(108, 29, 115, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		textad = new JTextField();
		textad.setHorizontalAlignment(SwingConstants.CENTER);
		textad.setBounds(108, 60, 115, 20);
		contentPane.add(textad);
		textad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Soyad\u0131n\u0131z");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 97, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		textsoyad = new JTextField();
		textsoyad.setHorizontalAlignment(SwingConstants.CENTER);
		textsoyad.setBounds(108, 95, 115, 20);
		contentPane.add(textsoyad);
		textsoyad.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cinsiyetiniz");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 132, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textcinsiyet = new JTextField();
		textcinsiyet.setHorizontalAlignment(SwingConstants.CENTER);
		textcinsiyet.setBounds(108, 129, 115, 20);
		contentPane.add(textcinsiyet);
		textcinsiyet.setColumns(10);
		
		/*JLabel lblNewLabel_3 = new JLabel("Kalk\u0131\u015F Noktas\u0131");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 167, 86, 14);
		contentPane.add(lblNewLabel_3);*/
		
		/*textkalkis = new JTextField();
		textkalkis.setHorizontalAlignment(SwingConstants.CENTER);
		textkalkis.setBounds(108, 164, 115, 20);
		contentPane.add(textkalkis);
		textkalkis.setColumns(10);*/
		
		/*JLabel lblNewLabel_4 = new JLabel("Var\u0131\u015F Noktas\u0131");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 206, 86, 14);
		contentPane.add(lblNewLabel_4);*/
		
		/*textvaris = new JTextField();
		textvaris.setHorizontalAlignment(SwingConstants.CENTER);
		textvaris.setBounds(108, 203, 115, 20);
		contentPane.add(textvaris);
		textvaris.setColumns(10);*/
		
		JButton btnNewButton = new JButton("Onayla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglanti.baglan();
				
				String id,ad,soyad,cinsiyet,sql_sorgu;
				id = textid.getText();
				ad = textad.getText();
				soyad = textsoyad.getText();
				cinsiyet = textcinsiyet.getText();
						
				sql_sorgu = "insert into musteri(mus_id,mus_ad,mus_soyad,mus_cinsiyet) values "
						+ "('"+id + "','" +ad  + "'," + "'" + soyad + "'," + "'" + cinsiyet + "')" ;
						
				
				Baglanti.sorgu(sql_sorgu);
				dispose();
				
			}
		});
		btnNewButton.setBounds(191, 248, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}