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

public class OS2_Answer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS2_Answer frame = new OS2_Answer();
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
	public OS2_Answer() {
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
		
		JLabel lblNewLabel = new JLabel("Q-3) Dual mode of operating system has ....");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(181, 22, 672, 89);
		contentPane.add(lblNewLabel);
		
		JRadioButton b3 = new JRadioButton("2 mode");
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b3.setBackground(Color.WHITE);
		b3.setBounds(181, 140, 672, 34);
		contentPane.add(b3);
		
		JRadioButton a3 = new JRadioButton("1 mode");
		a3.setForeground(Color.BLACK);
		a3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a3.setBackground(Color.WHITE);
		a3.setBounds(181, 103, 672, 34);
		contentPane.add(a3);
		
		JRadioButton c3 = new JRadioButton("3 mode");
		c3.setForeground(Color.BLACK);
		c3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c3.setBackground(Color.WHITE);
		c3.setBounds(181, 177, 672, 34);
		contentPane.add(c3);
		
		JRadioButton d3 = new JRadioButton("4 mode");
		d3.setForeground(Color.BLACK);
		d3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d3.setBackground(Color.WHITE);
		d3.setBounds(181, 214, 672, 34);
		contentPane.add(d3);
		
		JLabel lblQWhichOf = new JLabel("Q-4) Operating system is a collection of ?");
		lblQWhichOf.setForeground(Color.BLACK);
		lblQWhichOf.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblQWhichOf.setBackground(Color.WHITE);
		lblQWhichOf.setBounds(181, 255, 672, 89);
		contentPane.add(lblQWhichOf);
		
		JRadioButton a4 =new JRadioButton("Software routines");
		a4.setForeground(Color.BLACK);
		a4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		a4.setBackground(Color.WHITE);
		a4.setBounds(181, 347, 672, 34);
		contentPane.add(a4);
		
		JRadioButton b4 = new JRadioButton("Input-output devices");
		b4.setForeground(Color.BLACK);
		b4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		b4.setBackground(Color.WHITE);
		b4.setBounds(181, 384, 672, 34);
		contentPane.add(b4);
		
		JRadioButton c4 = new JRadioButton("Hardware components");
		c4.setForeground(Color.BLACK);
		c4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		c4.setBackground(Color.WHITE);
		c4.setBounds(181, 421, 672, 34);
		contentPane.add(c4);
		
		JRadioButton d4 = new JRadioButton("All of these");
		d4.setForeground(Color.BLACK);
		d4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		d4.setBackground(Color.WHITE);
		d4.setBounds(181, 458, 672, 34);
		contentPane.add(d4);
		
		a3.setEnabled(false);
		b3.setEnabled(false);
		c3.setEnabled(false);
		d3.setEnabled(false);
		a4.setEnabled(false);
		b4.setEnabled(false);
		c4.setEnabled(false);
		d4.setEnabled(false);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OS1_Answer s= new OS1_Answer();
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
				OS3_Answer OS = new OS3_Answer();
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
		
		if (answer.a3==true) {
			a3.setSelected(true);
			b3.setForeground(Color.red);
			b3.setFont(new Font("Times New Roman", Font.BOLD, 30));
			
		}else if (answer.b3==true) {
			b3.setSelected(true);
			
		}else if (answer.c3==true) {
			c3.setSelected(true);
			b3.setForeground(Color.red);
			b3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.d3==true) {
			d3.setSelected(true);
			b3.setForeground(Color.red);
			b3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else {
			b3.setForeground(Color.red);
			b3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
		
//		-----------------------------
		if (answer.a4==true) {
			a4.setSelected(true);
			d4.setForeground(Color.red);
			d4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.b4==true) {
			b4.setSelected(true);
			d4.setForeground(Color.red);
			d4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.c4==true) {
			c4.setSelected(true);
			d4.setForeground(Color.red);
			d4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}else if (answer.d4==true) {
			d4.setSelected(true);
	
		}else {
			d4.setForeground(Color.red);
			d4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
	}
}
