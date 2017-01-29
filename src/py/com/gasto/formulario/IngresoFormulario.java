package py.com.gasto.formulario;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.Label;

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JButton;

import py.com.gasto.controlador.IngresoControlador;
import py.com.gasto.controlador.MenuControlador;
import py.com.gasto.dao.IngresoDAO;
import py.com.gasto.model.Ingreso;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoFormulario extends JDialog {
	private JTextField textField;
	private JTextField Iingreso;
	private JButton btnGuardar_1;
	private MenuControlador monto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoFormulario dialog = new IngresoFormulario();
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
	public IngresoFormulario() {
		getContentPane().setBackground(new Color(0, 0, 153));
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCodigo.setBounds(10, 11, 84, 25);
		getContentPane().add(lblCodigo);
		
		textField = new JTextField();
		textField.setBounds(104, 11, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIngreso = new JLabel("Ingreso:");
		lblIngreso.setForeground(Color.WHITE);
		lblIngreso.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIngreso.setBounds(10, 65, 106, 25);
		getContentPane().add(lblIngreso);
		
		Iingreso = new JTextField();
		Iingreso.setBounds(104, 71, 161, 20);
		getContentPane().add(Iingreso);
		Iingreso.setColumns(10);
		
		JButton btnGuardar = new JButton("Eliminar");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGuardar.setBounds(45, 219, 106, 31);
		getContentPane().add(btnGuardar);
		
		JButton btnCanselar = new JButton("Canselar");
		btnCanselar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCanselar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCanselar.setBounds(161, 219, 120, 31);
		getContentPane().add(btnCanselar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCerrar.setBounds(291, 219, 106, 31);
		getContentPane().add(btnCerrar);
		
		btnGuardar_1 = new JButton("Guardar");
		btnGuardar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				
			}
		});
		btnGuardar_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGuardar_1.setBounds(90, 175, 120, 31);
		getContentPane().add(btnGuardar_1);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnModificar.setBounds(225, 177, 120, 31);
		getContentPane().add(btnModificar);
	
		Ingreso();
        
	}

	public JTextField getIingreso() {
		return Iingreso;
	}

	public void setIingreso(JTextField iingreso) {
		Iingreso = iingreso;
	}

	public JTextField getTextField_1() {
		return Iingreso;
	}

	public void setTextField_1(JTextField textField_1) {
		this.Iingreso = textField_1;
	}

	public JButton getBtnGuardar_1() {
		return btnGuardar_1;
	}

	public void setBtnGuardar_1(JButton btnGuardar_1) {
		this.btnGuardar_1 = btnGuardar_1;
	}
	private void Ingreso() {
		IngresoControlador controlador=new IngresoControlador(this);

	}
	
}
