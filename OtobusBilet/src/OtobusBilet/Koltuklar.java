package OtobusBilet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Koltuklar extends JFrame {

	private JPanel koltul23;
	static JButton bt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Koltuklar frame = new Koltuklar();
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
	public Koltuklar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 566);
		koltul23 = new JPanel();
		koltul23.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(koltul23);
		koltul23.setLayout(null);
		
		JButton  bt1 = new JButton("1");
		bt1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		bt1.setForeground(Color.BLACK);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				bt1.setBackground(Color.RED);
			}
		});
		bt1.setBackground(Color.GREEN);
		bt1.setBounds(10, 37, 44, 30);
		koltul23.add(bt1);
		
		JButton koltuk2 = new JButton("2");
		koltuk2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk2.setBackground(Color.RED);
			}
		});
		koltuk2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk2.setBackground(Color.GREEN);
		koltuk2.setBounds(109, 37, 44, 30);
		koltul23.add(koltuk2);
		
		JButton koltuk3 = new JButton("3");
		koltuk3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk3.setBackground(Color.RED);
			}
		});
		koltuk3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk3.setBackground(Color.GREEN);
		koltuk3.setBounds(163, 37, 44, 30);
		koltul23.add(koltuk3);
		
		JButton koltuk4 = new JButton("4");
		koltuk4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk4.setBackground(Color.RED);
			}
		});
		koltuk4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk4.setBackground(Color.GREEN);
		koltuk4.setBounds(10, 78, 44, 30);
		koltul23.add(koltuk4);
		
		JButton koltuk5 = new JButton("5");
		koltuk5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk5.setBackground(Color.RED);
			}
		});
		koltuk5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk5.setBackground(Color.GREEN);
		koltuk5.setBounds(109, 78, 44, 30);
		koltul23.add(koltuk5);
		
		JButton koltuk6 = new JButton("6");
		koltuk6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk6.setBackground(Color.RED);
			}
		});
		koltuk6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk6.setBackground(Color.GREEN);
		koltuk6.setBounds(163, 78, 44, 30);
		koltul23.add(koltuk6);
		
		JButton koltuk7 = new JButton("7");
		koltuk7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk7.setBackground(Color.RED);
			}
		});
		koltuk7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk7.setBackground(Color.GREEN);
		koltuk7.setBounds(10, 119, 44, 30);
		koltul23.add(koltuk7);
		
		JButton koltuk8 = new JButton("8");
		koltuk8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk8.setBackground(Color.RED);
			}
		});
		koltuk8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk8.setBackground(Color.GREEN);
		koltuk8.setBounds(109, 119, 44, 30);
		koltul23.add(koltuk8);
		
		JButton koltuk9 = new JButton("9");
		koltuk9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk9.setBackground(Color.RED);
			}
		});
		koltuk9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk9.setBackground(Color.GREEN);
		koltuk9.setBounds(163, 119, 44, 30);
		koltul23.add(koltuk9);
		
		JButton koltuk10 = new JButton("10");
		koltuk10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk10.setBackground(Color.RED);
			}
		});
		koltuk10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk10.setBackground(Color.GREEN);
		koltuk10.setBounds(10, 160, 44, 30);
		koltul23.add(koltuk10);
		
		JButton koltuk11 = new JButton("11");
		koltuk11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk11.setBackground(Color.RED);
			}
		});
		koltuk11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk11.setBackground(Color.GREEN);
		koltuk11.setBounds(109, 160, 44, 30);
		koltul23.add(koltuk11);
		
		JButton koltuk12 = new JButton("12");
		koltuk12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk12.setBackground(Color.RED);
			}
		});
		koltuk12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk12.setBackground(Color.GREEN);
		koltuk12.setBounds(163, 160, 44, 30);
		koltul23.add(koltuk12);
		
		JButton koltuk13 = new JButton("13");
		koltuk13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk13.setBackground(Color.RED);
			}
		});
		koltuk13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk13.setBackground(Color.GREEN);
		koltuk13.setBounds(10, 201, 44, 30);
		koltul23.add(koltuk13);
		
		JButton koltuk14 = new JButton("14");
		koltuk14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk14.setBackground(Color.RED);
			}
		});
		koltuk14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk14.setBackground(Color.GREEN);
		koltuk14.setBounds(109, 201, 44, 30);
		koltul23.add(koltuk14);
		
		JButton koltuk15 = new JButton("15");
		koltuk15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk15.setBackground(Color.RED);
			}
		});
		koltuk15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk15.setBackground(Color.GREEN);
		koltuk15.setBounds(163, 201, 44, 30);
		koltul23.add(koltuk15);
		
		JButton koltuk16 = new JButton("16");
		koltuk16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk16.setBackground(Color.RED);
			}
		});
		koltuk16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk16.setBackground(Color.GREEN);
		koltuk16.setBounds(10, 242, 44, 30);
		koltul23.add(koltuk16);
		
		JButton koltuk17 = new JButton("17");
		koltuk17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk17.setBackground(Color.RED);
			}
		});
		koltuk17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk17.setBackground(Color.GREEN);
		koltuk17.setBounds(109, 242, 44, 30);
		koltul23.add(koltuk17);
		
		JButton koltuk18 = new JButton("18");
		koltuk18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk18.setBackground(Color.RED);
			}
		});
		koltuk18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk18.setBackground(Color.GREEN);
		koltuk18.setBounds(163, 242, 44, 30);
		koltul23.add(koltuk18);
		
		JButton koltuk19 = new JButton("19");
		koltuk19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk19.setBackground(Color.RED);
			}
		});
		koltuk19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk19.setBackground(Color.GREEN);
		koltuk19.setBounds(10, 283, 44, 30);
		koltul23.add(koltuk19);
		
		JButton koltuk20 = new JButton("20");
		koltuk20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk20.setBackground(Color.RED);
			}
		});
		koltuk20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk20.setBackground(Color.GREEN);
		koltuk20.setBounds(10, 324, 44, 30);
		koltul23.add(koltuk20);
		
		JButton koltuk21 = new JButton("21");
		koltuk21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk21.setBackground(Color.RED);
			}
		});
		koltuk21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk21.setBackground(Color.GREEN);
		koltuk21.setBounds(109, 324, 44, 30);
		koltul23.add(koltuk21);
		
		JButton koltuk22 = new JButton("22");
		koltuk22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk22.setBackground(Color.RED);
			}
		});
		koltuk22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk22.setBackground(Color.GREEN);
		koltuk22.setBounds(163, 324, 44, 30);
		koltul23.add(koltuk22);
		
		JButton koltuk23 = new JButton("23");
		koltuk23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk23.setBackground(Color.RED);
			}
		});
		koltuk23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk23.setBackground(Color.GREEN);
		koltuk23.setBounds(10, 365, 44, 30);
		koltul23.add(koltuk23);
		
		JButton koltuk24 = new JButton("24");
		koltuk24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk24.setBackground(Color.RED);
			}
		});
		koltuk24.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk24.setBackground(Color.GREEN);
		koltuk24.setBounds(109, 365, 44, 30);
		koltul23.add(koltuk24);
		
		JButton koltuk25 = new JButton("25");
		koltuk25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk25.setBackground(Color.RED);
			}
		});
		koltuk25.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk25.setBackground(Color.GREEN);
		koltuk25.setBounds(163, 365, 44, 30);
		koltul23.add(koltuk25);
		
		JButton koltuk26 = new JButton("26");
		koltuk26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk26.setBackground(Color.RED);
			}
		});
		koltuk26.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk26.setBackground(Color.GREEN);
		koltuk26.setBounds(10, 406, 44, 30);
		koltul23.add(koltuk26);
		
		JButton koltuk27 = new JButton("27");
		koltuk27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk27.setBackground(Color.RED);
			}
		});
		koltuk27.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk27.setBackground(Color.GREEN);
		koltuk27.setBounds(109, 406, 44, 30);
		koltul23.add(koltuk27);
		
		JButton koltuk28 = new JButton("28");
		koltuk28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk28.setBackground(Color.RED);
			}
		});
		koltuk28.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk28.setBackground(Color.GREEN);
		koltuk28.setBounds(163, 406, 44, 30);
		koltul23.add(koltuk28);
		
		JButton koltuk29 = new JButton("29");
		koltuk29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk29.setBackground(Color.RED);
			}
		});
		koltuk29.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk29.setBackground(Color.GREEN);
		koltuk29.setBounds(10, 447, 44, 30);
		koltul23.add(koltuk29);
		
		JButton koltuk30 = new JButton("30");
		koltuk30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk30.setBackground(Color.RED);
			}
		});
		koltuk30.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk30.setBackground(Color.GREEN);
		koltuk30.setBounds(109, 447, 44, 30);
		koltul23.add(koltuk30);
		
		JButton koltuk31 = new JButton("31");
		koltuk31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk31.setBackground(Color.RED);
			}
		});
		koltuk31.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk31.setBackground(Color.GREEN);
		koltuk31.setBounds(163, 447, 44, 30);
		koltul23.add(koltuk31);
		
		JButton koltuk32 = new JButton("32");
		koltuk32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk32.setBackground(Color.RED);
			}
		});
		koltuk32.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk32.setBackground(Color.GREEN);
		koltuk32.setBounds(10, 488, 44, 30);
		koltul23.add(koltuk32);
		
		JButton koltuk34 = new JButton("34");
		koltuk34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk34.setBackground(Color.RED);
			}
		});
		koltuk34.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk34.setBackground(Color.GREEN);
		koltuk34.setBounds(109, 488, 44, 30);
		koltul23.add(koltuk34);
		
		JButton koltuk35 = new JButton("35");
		koltuk35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				frm2.setBounds(300,100, 306, 321);
				koltuk35.setBackground(Color.RED);
			}
		});
		koltuk35.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk35.setBackground(Color.GREEN);
		koltuk35.setBounds(163, 488, 44, 30);
		koltul23.add(koltuk35);
		
		JButton koltuk33 = new JButton("33");
		koltuk33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bilgiAlma frm2 = new bilgiAlma();
				frm2.setVisible(true);
				koltuk33.setBackground(Color.RED);
			}
		});
		koltuk33.setFont(new Font("Tahoma", Font.PLAIN, 10));
		koltuk33.setBackground(Color.GREEN);
		koltuk33.setBounds(60, 488, 44, 30);
		koltul23.add(koltuk33);
	}
}