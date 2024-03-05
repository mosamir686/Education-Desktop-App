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

public class OS1_Answer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS1_Answer frame = new OS1_Answer();
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
	public OS1_Answer() {
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
		
		JLabel lblNewLabel = new JLabel("Q-1) Operating systems is .........");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(18, 22, 511, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton b = new JRadioButton("provides a layer, user friendly interface");
		b.setForeground(Color.BLACK);
		b.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b.setBackground(Color.WHITE);
		b.setBounds(18, 140, 672, 34);
		contentPane.add(b);
		
		JRadioButton a = new JRadioButton("enables the programmer to draw a flow chart\r\n");
		a.setForeground(Color.BLACK);
		a.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a.setBackground(Color.WHITE);
		a.setBounds(18, 103, 672, 34);
		contentPane.add(a);
		
		JRadioButton c = new JRadioButton("links a program with subroutine it references");
		c.setForeground(Color.BLACK);
		c.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c.setBackground(Color.WHITE);
		c.setBounds(18, 177, 672, 34);
		contentPane.add(c);
		
		JRadioButton d = new JRadioButton("all of these");
		d.setForeground(Color.BLACK);
		d.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d.setBackground(Color.WHITE);
		d.setBounds(18, 214, 672, 34);
		contentPane.add(d);
		
		JLabel lblQWhichOf = new JLabel("Q-2) Which of the following Is not a part of the operating system?");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setBounds(18, 255, 1007, 89);
		contentPane.add(lblQWhichOf);
		
		JRadioButton a2 =new JRadioButton("Input/output control program");
		a2.setForeground(Color.BLACK);
		a2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a2.setBackground(Color.WHITE);
		a2.setBounds(18, 347, 672, 34);
		contentPane.add(a2);
		
		JRadioButton b2 = new JRadioButton("Job control program");
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b2.setBackground(Color.WHITE);
		b2.setBounds(18, 384, 672, 34);
		contentPane.add(b2);
		
		JRadioButton c2 = new JRadioButton("Supervisor");
		c2.setForeground(Color.BLACK);
		c2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c2.setBackground(Color.WHITE);
		c2.setBounds(18, 421, 672, 34);
		contentPane.add(c2);
		
		JRadioButton d2 = new JRadioButton("Performance monitor");
		d2.setForeground(Color.BLACK);
		d2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d2.setBackground(Color.WHITE);
		d2.setBounds(18, 458, 672, 34);
		contentPane.add(d2);
		
		a.setEnabled(false);
		b.setEnabled(false);
		c.setEnabled(false);
		d.setEnabled(false);
		a2.setEnabled(false);
		b2.setEnabled(false);
		c2.setEnabled(false);
		d2.setEnabled(false);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IT_QBank.Score s = new IT_QBank.Score();
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
				OS2_Answer OS = new OS2_Answer();
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
		
		if (answer.a1==true) {
			a.setSelected(true);
			b.setForeground(Color.red);
			b.setFont(new Font("Times New Roman", Font.BOLD, 30));
			
		}else if (answer.b1==true) {
			b.setSelected(true);
			
		}else if (answer.c1==true) {
			c.setSelected(true);
			b.setForeground(Color.red);
			b.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.d1==true) {
			d.setSelected(true);
			b.setForeground(Color.red);
			b.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else {
			b.setForeground(Color.red);
			b.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
		
//		-----------------------------
		if (answer.a2==true) {
			a2.setSelected(true);
			d2.setForeground(Color.red);
			d2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.b2==true) {
			b2.setSelected(true);
			d2.setForeground(Color.red);
			d2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.c2==true) {
			c2.setSelected(true);
			d2.setForeground(Color.red);
			d2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.d2==true) {
			d2.setSelected(true);
	
		}else {
			d2.setForeground(Color.red);
			d2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
	}
}
