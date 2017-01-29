package py.com.gasto.formulario;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JButton;

import py.com.gasto.controlador.ProductoControlador;

public class ProductoFormulario extends JDialog {
	private JTextField Pcodigo;
	private JTextField Pdescripcion;
	private JButton btnGuardar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCanselar;
	private JButton btnCerrar;
	private JButton btnNuevo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductoFormulario dialog = new ProductoFormulario();
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
	public ProductoFormulario() {
		getContentPane().setBackground(new Color(0, 0, 153));
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCodigo.setBounds(10, 11, 81, 21);
		getContentPane().add(lblCodigo);
		
		Pcodigo = new JTextField();
		Pcodigo.setBounds(101, 15, 86, 20);
		getContentPane().add(Pcodigo);
		Pcodigo.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDescripcion.setBounds(10, 58, 145, 21);
		getContentPane().add(lblDescripcion);
		
		Pdescripcion = new JTextField();
		Pdescripcion.setBounds(148, 62, 276, 20);
		getContentPane().add(Pdescripcion);
		Pdescripcion.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEliminar.setBounds(33, 219, 114, 31);
		getContentPane().add(btnEliminar);
		
		btnCanselar = new JButton("Canselar");
		btnCanselar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCanselar.setBounds(157, 219, 114, 31);
		getContentPane().add(btnCanselar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCerrar.setBounds(281, 219, 114, 31);
		getContentPane().add(btnCerrar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGuardar.setBounds(83, 177, 127, 31);
		getContentPane().add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnModificar.setBounds(220, 177, 135, 31);
		getContentPane().add(btnModificar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNuevo.setBounds(148, 144, 127, 23);
		getContentPane().add(btnNuevo);
		
		ProductoControlador controlador=new ProductoControlador(this);
//		controlador.guardar();

	}

	public JButton getBtnNuevo() {
		return btnNuevo;
	}

	public void setBtnNuevo(JButton btnNuevo) {
		this.btnNuevo = btnNuevo;
	}

	public JTextField getPcodigo() {
		return Pcodigo;
	}

	public void setPcodigo(JTextField pcodigo) {
		Pcodigo = pcodigo;
	}

	public JTextField getPdescripcion() {
		return Pdescripcion;
	}

	public void setPdescripcion(JTextField pdescripcion) {
		Pdescripcion = pdescripcion;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnCanselar() {
		return btnCanselar;
	}

	public void setBtnCanselar(JButton btnCanselar) {
		this.btnCanselar = btnCanselar;
	}

	public JButton getBtnCerrar() {
		return btnCerrar;
	}

	public void setBtnCerrar(JButton btnCerrar) {
		this.btnCerrar = btnCerrar;
	}
}
