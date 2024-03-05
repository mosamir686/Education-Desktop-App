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

public class OS3_Answer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS3_Answer frame = new OS3_Answer();
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
	public OS3_Answer() {
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
		
		JLabel lblNewLabel = new JLabel("Q-5) Which of the following is not an operating system?");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(18, 22, 962, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton b5 = new JRadioButton("MS-DOS");
		b5.setForeground(Color.BLACK);
		b5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b5.setBackground(Color.WHITE);
		b5.setBounds(18, 140, 672, 34);
		contentPane.add(b5);
		
		JRadioButton a5 = new JRadioButton("UNIX");
		a5.setForeground(Color.BLACK);
		a5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a5.setBackground(Color.WHITE);
		a5.setBounds(18, 103, 672, 34);
		contentPane.add(a5);
		
		JRadioButton c5 = new JRadioButton("CP/M");
		c5.setForeground(Color.BLACK);
		c5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c5.setBackground(Color.WHITE);
		c5.setBounds(18, 177, 672, 34);
		contentPane.add(c5);
		
		JRadioButton d5 = new JRadioButton("PASCAL");
		d5.setForeground(Color.BLACK);
		d5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d5.setBackground(Color.WHITE);
		d5.setBounds(18, 214, 672, 34);
		contentPane.add(d5);
		
		JLabel lblQWhichOf = new JLabel("Q-6) Example of open source operating system is ........");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setBounds(18, 255, 1007, 89);
		contentPane.add(lblQWhichOf);
		
		JRadioButton a6 =new JRadioButton("UNIX");
		a6.setForeground(Color.BLACK);
		a6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a6.setBackground(Color.WHITE);
		a6.setBounds(18, 347, 672, 34);
		contentPane.add(a6);
		
		JRadioButton b6 = new JRadioButton("Linux");
		b6.setForeground(Color.BLACK);
		b6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b6.setBackground(Color.WHITE);
		b6.setBounds(18, 384, 672, 34);
		contentPane.add(b6);
		
		JRadioButton c6 = new JRadioButton("Windows");
		c6.setForeground(Color.BLACK);
		c6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c6.setBackground(Color.WHITE);
		c6.setBounds(18, 421, 672, 34);
		contentPane.add(c6);
		
		JRadioButton d6 = new JRadioButton("Both a and b ");
		d6.setForeground(Color.BLACK);
		d6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d6.setBackground(Color.WHITE);
		d6.setBounds(18, 458, 672, 34);
		contentPane.add(d6);
		
		a5.setEnabled(false);
		b5.setEnabled(false);
		c5.setEnabled(false);
		d5.setEnabled(false);
		a6.setEnabled(false);
		b6.setEnabled(false);
		c6.setEnabled(false);
		d6.setEnabled(false);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OS2_Answer s= new OS2_Answer();
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
				OS4_Answer OS = new OS4_Answer ();
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
		
		if (answer.a5==true) {
			a5.setSelected(true);
			d5.setForeground(Color.red);
			d5.setFont(new Font("Times New Roman", Font.BOLD, 30));
			
		}else if (answer.b5==true) {
			b5.setSelected(true);
			d5.setForeground(Color.red);
			d5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.c5==true) {
			c5.setSelected(true);
			d5.setForeground(Color.red);
			d5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.d5==true) {
			d5.setSelected(true);
			
		}else {
			d5.setForeground(Color.red);
			d5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
		
//		-----------------------------
		if (answer.a6==true) {
			a6.setSelected(true);
			d6.setForeground(Color.red);
			d6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.b6==true) {
			b6.setSelected(true);
			d6.setForeground(Color.red);
			d6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.c6==true) {
			c6.setSelected(true);
			d6.setForeground(Color.red);
			d6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.d6==true) {
			d6.setSelected(true);
	
		}else {
			d6.setForeground(Color.red);
			d6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
	}
}
