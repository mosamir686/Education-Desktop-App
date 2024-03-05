package OS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class OS4_Answer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS4_Answer frame = new OS4_Answer();
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
	public OS4_Answer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(OS1_Answer.class.getResource("/IMG/Education.png")));
		setTitle("Education Desktop App");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 621);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q-7) Computer system is divided into how many numbers of components?");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 31));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(18, 22, 1007, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton b7 = new JRadioButton("2");
		b7.setForeground(Color.BLACK);
		b7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b7.setBackground(Color.WHITE);
		b7.setBounds(18, 140, 672, 34);
		contentPane.add(b7);
		
		JRadioButton a7 = new JRadioButton("1");
		a7.setForeground(Color.BLACK);
		a7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a7.setBackground(Color.WHITE);
		a7.setBounds(18, 103, 672, 34);
		contentPane.add(a7);
		
		JRadioButton c7 = new JRadioButton("3");
		c7.setForeground(Color.BLACK);
		c7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c7.setBackground(Color.WHITE);
		c7.setBounds(18, 177, 672, 34);
		contentPane.add(c7);
		
		JRadioButton d7 = new JRadioButton("4");
		d7.setForeground(Color.BLACK);
		d7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d7.setBackground(Color.WHITE);
		d7.setBounds(18, 214, 672, 34);
		contentPane.add(d7);
		
		JLabel lblQWhichOf = new JLabel("Q-8) UNIX operating system .........");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setBounds(18, 255, 1007, 89);
		contentPane.add(lblQWhichOf);
		
		JRadioButton a8 =new JRadioButton("can run on PC’s and larger system");
		a8.setForeground(Color.BLACK);
		a8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a8.setBackground(Color.WHITE);
		a8.setBounds(18, 347, 672, 34);
		contentPane.add(a8);
		
		JRadioButton b8 = new JRadioButton("is multitasking");
		b8.setForeground(Color.BLACK);
		b8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b8.setBackground(Color.WHITE);
		b8.setBounds(18, 384, 672, 34);
		contentPane.add(b8);
		
		JRadioButton c8 = new JRadioButton("is multiuser");
		c8.setForeground(Color.BLACK);
		c8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c8.setBackground(Color.WHITE);
		c8.setBounds(18, 421, 672, 34);
		contentPane.add(c8);
		
		JRadioButton d8 = new JRadioButton("all of these");
		d8.setForeground(Color.BLACK);
		d8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d8.setBackground(Color.WHITE);
		d8.setBounds(18, 458, 672, 34);
		contentPane.add(d8);
		
		a7.setEnabled(false);
		b7.setEnabled(false);
		c7.setEnabled(false);
		d7.setEnabled(false);
		a8.setEnabled(false);
		b8.setEnabled(false);
		c8.setEnabled(false);
		d8.setEnabled(false);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OS3_Answer s= new OS3_Answer();
				s.main();
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(58, 515, 123, 51);
		contentPane.add(btnBack);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OS5_Answer OS = new OS5_Answer();
				OS.main();
				dispose();
			}
		});
		btnNext.setForeground(Color.BLACK);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(857, 517, 123, 47);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(OS1_Answer.class.getResource("/IMG/Background L.png")));
		lblNewLabel_1.setBounds(0, 0, 1066, 591);
		contentPane.add(lblNewLabel_1);
		
		IT_QBank.OS_Answer answer = new IT_QBank.OS_Answer();
		
		if (answer.a7==true) {
			a7.setSelected(true);
			d7.setForeground(Color.red);
			d7.setFont(new Font("Times New Roman", Font.BOLD, 30));
			
		}else if (answer.b7==true) {
			b7.setSelected(true);
			d7.setForeground(Color.red);
			d7.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.c7==true) {
			c7.setSelected(true);
			d7.setForeground(Color.red);
			d7.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.d7==true) {
			d7.setSelected(true);
			
		}else {
			d7.setForeground(Color.red);
			d7.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
		
//		-----------------------------
		if (answer.a8==true) {
			a8.setSelected(true);
			d8.setForeground(Color.red);
			d8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.b8==true) {
			b8.setSelected(true);
			d8.setForeground(Color.red);
			d8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.c8==true) {
			c8.setSelected(true);
			d8.setForeground(Color.red);
			d8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.d8==true) {
			d8.setSelected(true);
	
		}else {
			d8.setForeground(Color.red);
			d8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
	}
}
