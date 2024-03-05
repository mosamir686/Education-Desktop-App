package Education_App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/IMG/Education.png")));
		setResizable(false);
		setTitle("Education Desktop App");
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Chemistry");
		lblNewLabel_4_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Chemistry CH = new Chemistry();
				CH.main();
				dispose();
			}
		});
		lblNewLabel_4_1_1.setFont(new Font("Sitka Heading", Font.PLAIN, 30));
		lblNewLabel_4_1_1.setBounds(454, 285, 138, 73);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Chemistry CH = new Chemistry();
				CH.main();
				dispose();
			}
		});
		lblNewLabel_3_1_1.setIcon(new ImageIcon(Home.class.getResource("/IMG/Button.png")));
		lblNewLabel_3_1_1.setBounds(444, 285, 148, 64);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Physics");
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Physics x = new Physics();
				x.main();
				dispose();
			}
		});
		lblNewLabel_4_1.setFont(new Font("Sitka Heading", Font.PLAIN, 30));
		lblNewLabel_4_1.setBounds(285, 286, 96, 73);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Physics x = new Physics();
				x.main();
				dispose();
			}
		});
		lblNewLabel_3_1.setIcon(new ImageIcon(Home.class.getResource("/IMG/Button.png")));
		lblNewLabel_3_1.setBounds(254, 286, 148, 64);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("IT");
		lblNewLabel_4.setFont(new Font("Sitka Heading", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(114, 285, 46, 74);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				IT it = new IT ();
				it.main();
				dispose();
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(Home.class.getResource("/IMG/Button.png")));
		lblNewLabel_3.setBounds(55, 285, 148, 64);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Eduaction App");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 40));
		lblNewLabel.setBounds(229, 48, 193, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hello Friend");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Sitka Banner", Font.BOLD, 95));
		lblNewLabel_1.setBounds(77, 148, 485, 107);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Home.class.getResource("/IMG/Background S.png")));
		lblNewLabel_2.setBounds(0, 0, 636, 413);
		contentPane.add(lblNewLabel_2);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
