import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel extends JFrame {

	private JPanel contentPane;
	private JTextField txtLibreriaVera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel frame = new Panel();
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
	public Panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLibreriaVera.setText("libreria");
			}
		});
		btnNewButton.setBounds(28, 101, 89, 23);
		contentPane.add(btnNewButton);
		
		txtLibreriaVera = new JTextField();
		txtLibreriaVera.setToolTipText("");
		txtLibreriaVera.setFont(new Font("Lucida Fax", Font.PLAIN, 11));
		txtLibreriaVera.setForeground(Color.GRAY);
		txtLibreriaVera.setText("LIBRERIA VERA");
		txtLibreriaVera.setBounds(116, 20, 174, 51);
		contentPane.add(txtLibreriaVera);
		txtLibreriaVera.setColumns(10);
	}
}
