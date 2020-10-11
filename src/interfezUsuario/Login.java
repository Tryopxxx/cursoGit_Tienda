package interfezUsuario;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

public class Login extends JFrame {

	private JPanel panel;
	private JPasswordField passwordField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		panel=new JPanel();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "LOGIN", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GRAY));
		panel_1.setBounds(0, 0, 308, 600);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(112, 22, 113, 101);
		label.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\tienda\\src\\imagenes\\usuario.png"));
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(0, 0, 1, 1);
		panel_1.add(verticalBox);
		panel_1.add(label);		
		
		JLabel lblUsuario = new JLabel("Usuario:\r\n");
		lblUsuario.setForeground(Color.BLACK);
		lblUsuario.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblUsuario.setBounds(59, 150, 86, 22);
		panel_1.add(lblUsuario);
		
		JTextArea txtrAsd = new JTextArea();
		txtrAsd.setForeground(Color.GRAY);
		txtrAsd.setBackground(new Color(240,240,240));
		txtrAsd.setBounds(108, 192, 142, 30);
		panel_1.add(txtrAsd);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:\r\n");
		lblContrasea.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblContrasea.setBounds(59, 274, 86, 22);
		panel_1.add(lblContrasea);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(56, 224, 227, 8);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(56, 345, 227, 8);
		panel_1.add(separator_1);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.GRAY);
		passwordField.setEchoChar('*');
		passwordField.setBounds(108, 307, 142, 36);
		passwordField.setBackground(new Color(240,240,240));
		panel_1.add(passwordField);
		JPanel pagos = new JPanel();
		passwordField.setBorder(null);
		
		JButton button = new JButton("");
		button.setBackground(Color.white);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\tienda\\src\\imagenes\\Entrar_off.png"));
		button.setBounds(94, 401, 131, 64);
		button.setBorder(null);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setIcon(new ImageIcon("src\\imagenes\\Entrar_on.png"));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				button.setIcon(new ImageIcon("src\\imagenes\\Entrar_off.png"));			
			}
			
		});
		panel_1.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\tienda\\src\\imagenes\\pequengo_usuario.png"));
		label_1.setBounds(59, 173, 48, 49);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\tienda\\src\\imagenes\\contrasena.png"));
		label_2.setBounds(59, 293, 38, 60);
		panel_1.add(label_2);
		pagos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "PAGOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		pagos.setBounds(309, 0, 691, 600);
		panel.add(pagos);
		pagos.setLayout(null);
		
		JButton btnNewButton = new JButton("CR\u00C9DITO");
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Garamond", Font.PLAIN, 22));
		btnNewButton.setBounds(113, 44, 182, 51);
		pagos.add(btnNewButton);
		
		JButton btnServicio = new JButton("SERVICIO");
		btnServicio.setForeground(Color.GRAY);
		btnServicio.setFont(new Font("Garamond", Font.PLAIN, 22));
		btnServicio.setBackground(Color.LIGHT_GRAY);
		btnServicio.setBounds(392, 44, 182, 51);
		pagos.add(btnServicio);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(240,240,240));
		panel_2.setBounds(59, 120, 576, 382);
		pagos.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblNombre.setBounds(45, 48, 68, 22);
		panel_2.add(lblNombre);
		
		JTextArea txtrAsd_1 = new JTextArea();
		txtrAsd_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrAsd_1.setForeground(Color.GRAY);
		txtrAsd_1.setBackground(SystemColor.menu);
		txtrAsd_1.setBounds(124, 47, 410, 23);
		panel_2.add(txtrAsd_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(101, 71, 445, 2);
		panel_2.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(79, 123, 195, 2);
		panel_2.add(separator_2_1);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.BLACK);
		lblDni.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblDni.setBounds(45, 100, 68, 22);
		panel_2.add(lblDni);
		
		JTextArea txtrAsd_1_1 = new JTextArea();
		txtrAsd_1_1.setForeground(Color.GRAY);
		txtrAsd_1_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrAsd_1_1.setBackground(SystemColor.menu);
		txtrAsd_1_1.setBounds(101, 99, 158, 23);
		panel_2.add(txtrAsd_1_1);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBounds(351, 124, 195, 2);
		panel_2.add(separator_2_1_1);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setForeground(Color.BLACK);
		lblCantidad.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblCantidad.setBounds(284, 101, 101, 22);
		panel_2.add(lblCantidad);
		
		JTextArea txtrAsd_1_1_1 = new JTextArea();
		txtrAsd_1_1_1.setForeground(Color.GRAY);
		txtrAsd_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrAsd_1_1_1.setBackground(SystemColor.menu);
		txtrAsd_1_1_1.setBounds(362, 100, 169, 23);
		panel_2.add(txtrAsd_1_1_1);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBounds(115, 175, 431, 2);
		panel_2.add(separator_2_2);
		
		JTextArea txtrAsd_1_2 = new JTextArea();
		txtrAsd_1_2.setForeground(Color.GRAY);
		txtrAsd_1_2.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrAsd_1_2.setBackground(SystemColor.menu);
		txtrAsd_1_2.setBounds(124, 151, 410, 23);
		panel_2.add(txtrAsd_1_2);
		
		JLabel lblNPagar = new JLabel("C\u00F3digo");
		lblNPagar.setForeground(Color.BLACK);
		lblNPagar.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblNPagar.setBounds(45, 152, 68, 22);
		panel_2.add(lblNPagar);
		
		JSeparator separator_2_1_1_1 = new JSeparator();
		separator_2_1_1_1.setBounds(112, 232, 179, 2);
		panel_2.add(separator_2_1_1_1);
		
		JTextArea txtrAsd_1_1_1_1 = new JTextArea();
		txtrAsd_1_1_1_1.setForeground(Color.GRAY);
		txtrAsd_1_1_1_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrAsd_1_1_1_1.setBackground(SystemColor.menu);
		txtrAsd_1_1_1_1.setBounds(124, 208, 168, 23);
		panel_2.add(txtrAsd_1_1_1_1);
		
		JLabel lblCantidad_1 = new JLabel("Tel\u00E9fono:");
		lblCantidad_1.setForeground(Color.BLACK);
		lblCantidad_1.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblCantidad_1.setBounds(45, 209, 68, 22);
		panel_2.add(lblCantidad_1);
		
		ButtonGroup grupoDeuda=new ButtonGroup();
		
		JRadioButton deudor = new JRadioButton("No");
		deudor.setSelected(true);
		deudor.setHorizontalAlignment(SwingConstants.LEFT);
		deudor.setBounds(446, 210, 44, 23);
		deudor.setHorizontalTextPosition(2);
		panel_2.add(deudor);
		
		JRadioButton rdbtnS = new JRadioButton("Sí");
		rdbtnS.setHorizontalTextPosition(SwingConstants.LEFT);
		rdbtnS.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnS.setBounds(400, 210, 44, 23);
		panel_2.add(rdbtnS);
		grupoDeuda.add(deudor);
		grupoDeuda.add(rdbtnS);
		
		JLabel lblDebe = new JLabel("Debe:");
		lblDebe.setForeground(Color.BLACK);
		lblDebe.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblDebe.setBounds(351, 209, 44, 22);
		panel_2.add(lblDebe);
		
		JSeparator separator_2_3 = new JSeparator();
		separator_2_3.setBounds(136, 281, 410, 2);
		panel_2.add(separator_2_3);
		
		JTextArea txtrAsd_1_3 = new JTextArea();
		txtrAsd_1_3.setForeground(Color.GRAY);
		txtrAsd_1_3.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrAsd_1_3.setBackground(SystemColor.menu);
		txtrAsd_1_3.setBounds(142, 257, 392, 23);
		panel_2.add(txtrAsd_1_3);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setForeground(Color.BLACK);
		lblDescripcin.setFont(new Font("Garamond", Font.PLAIN, 16));
		lblDescripcin.setBounds(45, 258, 87, 22);
		panel_2.add(lblDescripcin);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(135, 320, 110, 20);
		dateChooser.setDate(new Date());
		panel_2.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(334, 320, 110, 20);
		dateChooser_1.setDate(new Date());
		panel_2.add(dateChooser_1);
		
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(272, 530, 138, 44);
		pagos.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(590, 528, 74, 48);
		pagos.add(btnNewButton_2);
		
		panel_2.setVisible(false);
		
		setBounds(100, 100, 1000, 600);
		this.setUndecorated(true);
	}
}
