package IT_QBank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Education_App.Home;
import OS.OS_1;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Score extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score frame = new Score();
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
	private JLabel lblR;

	
	public Score() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Score.class.getResource("/IMG/Education.png")));
		setTitle("Education Desktop App");
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Count Reset = new Count();
				Reset.setRestCount();
				Reset.setRestTotal();
				OS_Answer answer = new OS_Answer();
				answer.a1=false;
				answer.b1=false;
				answer.c1=false;
				answer.d1=false;
				answer.a2=false;
				answer.b2=false;
				answer.c2=false;
				answer.d2=false;
				Home H = new Home();
				H.main();
				dispose();
			}
		});
		btnHome.setForeground(Color.BLACK);
		btnHome.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnHome.setBackground(Color.WHITE);
		btnHome.setBounds(487, 222, 109, 46);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("Result:");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		lblNewLabel.setBounds(228, 84, 160, 58);
		contentPane.add(lblNewLabel);
		
		lblR = new JLabel("");
		lblR.setBackground(Color.WHITE);
		lblR.setForeground(Color.BLACK);
		lblR.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblR.setBounds(228, 153, 40, 46);
		contentPane.add(lblR);
		Count Count = new Count();
		lblR.setText(Count.getCount());
		
		JLabel lblOf = new JLabel("of");
		lblOf.setBackground(Color.WHITE);
		lblOf.setForeground(Color.BLACK);
		lblOf.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblOf.setBounds(280, 153, 33, 46);
		contentPane.add(lblOf);
		
		JLabel lblR_1_1 = new JLabel("0");
		lblR_1_1.setBackground(Color.WHITE);
		lblR_1_1.setForeground(Color.BLACK);
		lblR_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblR_1_1.setBounds(348, 153, 40, 46);
		contentPane.add(lblR_1_1);
		lblR_1_1.setText(Count.getTotal());
		JButton btnNewButton = new JButton("Check Your Answer");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OS.OS1_Answer OS = new OS.OS1_Answer();
				OS.main();
			dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBounds(21, 222, 288, 46);
		contentPane.add(btnNewButton);
		
		JButton btnTryAg = new JButton("Try Again");
		btnTryAg.setBackground(Color.WHITE);
		btnTryAg.setForeground(Color.BLACK);
		btnTryAg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OS_1 OS = new OS_1();
				OS.main();
				Count Reset = new Count();
				Reset.setRestCount();
				Reset.setRestTotal();
				OS_Answer answer = new OS_Answer();
				answer.a1=false;
				answer.b1=false;
				answer.c1=false;
				answer.d1=false;
				answer.a2=false;
				answer.b2=false;
				answer.c2=false;
				answer.d2=false;
				answer.a3=false;
				answer.b3=false;
				answer.c3=false;
				answer.d3=false;
				answer.a4=false;
				answer.b4=false;
				answer.c4=false;
				answer.d4=false;
				answer.a5=false;
				answer.b5=false;
				answer.c5=false;
				answer.d5=false;
				answer.a6=false;
				answer.b6=false;
				answer.c6=false;
				answer.d6=false;
				answer.a7=false;
				answer.b7=false;
				answer.c7=false;
				answer.d7=false;
				answer.a8=false;
				answer.b8=false;
				answer.c8=false;
				answer.d8=false;
				answer.a9=false;
				answer.b9=false;
				answer.c9=false;
				answer.d9=false;
				answer.a10=false;
				answer.b10=false;
				answer.c10=false;
				answer.d10=false;
				
			dispose();
			}
		});
		btnTryAg.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnTryAg.setBounds(319, 222, 160, 46);
		contentPane.add(btnTryAg);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Score.class.getResource("/IMG/Background S.png")));
		lblNewLabel_1.setBounds(-12, -100, 1066, 591);
		contentPane.add(lblNewLabel_1);
	}
}
