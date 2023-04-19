package OtobusBilet;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class biletlerim extends JFrame {

	private static final Object[] JTextField = null;
	private JPanel contentPane;
	public String bilet_sorgu;
	public String bilet_adet;
	public int adet;
	public String bkalkis,bvaris,bsaat,btarih,botobus,bkoltuk;
	private JTextField textField;
	private JTable table;
	public String sql_delete;
	public String tarih;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object[] kolonlar = {"kalkis","varis","saat","otobus","tarih","koltukno"};
	Object[] satirlar =new Object[6];
	private JTextField tarihiptal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					biletlerim frame = new biletlerim();
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
	public biletlerim() {
		getContentPane().setLayout(null);

		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 510, 226);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		modelim.addRow(satirlar);
		table.setModel(modelim);
		table.setBounds(95, 176, 318, 140);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("BİLET İPTAL");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tarih=tarihiptal.getText();
				Baglanti.baglan();
				sql_delete="DELETE FROM public.sefer WHERE kul_ad='"+KarsilamaEkrani.ad+"' AND tarih='"+tarih+"';";
				Baglanti.sorgu(sql_delete);
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(186, 343, 117, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("BİLET AL");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				istek istk = new istek();
				istk.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.setBounds(402, 343, 128, 44);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("LÜTFEN İPTAL ETMEK İSTEDİĞİNİZ \r\n");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 248, 223, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblBiletinTarihiniYaznz = new JLabel("BİLETİN TARİHİNİ YAZINIZ.\r\n");
		lblBiletinTarihiniYaznz.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblBiletinTarihiniYaznz.setBounds(10, 273, 184, 29);
		contentPane.add(lblBiletinTarihiniYaznz);
		
		tarihiptal = new JTextField();
		tarihiptal.setBounds(10, 313, 161, 29);
		contentPane.add(tarihiptal);
		tarihiptal.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("YENİLE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelim.setRowCount(0);
				ResultSet rs1= Baglanti.sorgu(bilet_sorgu);
				
				try {
						while(rs1.next() ) {
							satirlar[0]=rs1.getString("kalkis");
							satirlar[1]=rs1.getString("varis");
							satirlar[2]=rs1.getString("saat");
							satirlar[3]=rs1.getString("otobus");
							satirlar[4]=rs1.getString("tarih");
							satirlar[5]=rs1.getString("koltukno");
							modelim.addRow(satirlar);
							
								
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					}
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(416, 248, 104, 23);
		contentPane.add(btnNewButton_1);
		
	
		
	
		
		
		
		
		Baglanti.baglan();
		bilet_adet="SELECT COUNT(kalkis) as sayi FROM public.sefer WHERE kul_ad='"+KarsilamaEkrani.ad+"';";
		bilet_sorgu="SELECT * FROM public.sefer WHERE kul_ad='"+KarsilamaEkrani.ad+"';";
		ResultSet rs = Baglanti.sorgu(bilet_adet);
		try {
			while(rs.next()) {
					adet = Integer.parseInt(rs.getString(1));
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
			
		ResultSet rs1= Baglanti.sorgu(bilet_sorgu);
		
		try {
				while(rs1.next() ) {
					satirlar[0]=rs1.getString("kalkis");
					satirlar[1]=rs1.getString("varis");
					satirlar[2]=rs1.getString("saat");
					satirlar[3]=rs1.getString("otobus");
					satirlar[4]=rs1.getString("tarih");
					satirlar[5]=rs1.getString("koltukno");
					modelim.addRow(satirlar);
					
						
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
			}
		
			
	}
}
