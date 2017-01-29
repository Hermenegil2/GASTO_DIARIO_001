package py.com.gasto.formulario;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

import com.sun.glass.ui.Menu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsuarioFormulario extends JDialog {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioFormulario dialog = new UsuarioFormulario();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public UsuarioFormulario() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblUsuario.setBounds(155, 11, 108, 44);
		getContentPane().add(lblUsuario);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(77, 68, 294, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblContrasea.setBounds(136, 116, 190, 44);
		getContentPane().add(lblContrasea);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				menu();
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEntrar.setBounds(77, 227, 99, 23);
		getContentPane().add(btnEntrar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCerrar.setBounds(272, 227, 99, 23);
		getContentPane().add(btnCerrar);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 25));
		passwordField.setBounds(77, 171, 294, 37);
		getContentPane().add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Hermenegil2\\Pictures\\es.jpg"));
		label.setBounds(0, 0, 434, 261);
		getContentPane().add(label);

	}
	
	private void menu() {
		py.com.gasto.menu.Menu menu=new py.com.gasto.menu.Menu();
		menu.setVisible(true);

	}
}
