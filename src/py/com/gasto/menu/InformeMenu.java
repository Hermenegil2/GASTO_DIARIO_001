package py.com.gasto.menu;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import py.com.gasto.controlador.InformeControlador;
import java.awt.Color;

public class InformeMenu extends JDialog {
	private JTable table;
	private JTextField limite;
	private JButton btnProceder;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnMayorCompra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformeMenu dialog = new InformeMenu();
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
	public InformeMenu() {
		getContentPane().setBackground(new Color(0,0,153));
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 122, 764, 428);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Codigo", "Descripcion", "Cantidad", "Precio", "Tipo", "Fecha"
			}
		));
		scrollPane.setViewportView(table);
		
		limite = new JTextField();
		limite.setBounds(169, 12, 86, 20);
		getContentPane().add(limite);
		limite.setColumns(10);
		
		JLabel lblElegirLaCantidad = new JLabel("Elegir la Cantidad de la Compra:");
		lblElegirLaCantidad.setBounds(10, 14, 163, 17);
		getContentPane().add(lblElegirLaCantidad);
		
		btnProceder = new JButton("Proceder");
		btnProceder.setBounds(260, 11, 89, 23);
		getContentPane().add(btnProceder);
		
		textField = new JTextField();
		textField.setBounds(10, 64, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblHasta = new JLabel("Hasta");
		lblHasta.setBounds(106, 67, 46, 14);
		getContentPane().add(lblHasta);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 64, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnMayorCompra = new JButton("Mayor Compra");
		btnMayorCompra.setBounds(245, 63, 119, 23);
		getContentPane().add(btnMayorCompra);
		
		InformeControlador controlador=new InformeControlador(this);

	}

	public JButton getBtnMayorCompra() {
		return btnMayorCompra;
	}

	public void setBtnMayorCompra(JButton btnMayorCompra) {
		this.btnMayorCompra = btnMayorCompra;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getLimite() {
		return limite;
	}

	public void setLimite(JTextField limite) {
		this.limite = limite;
	}



	public JButton getBtnProceder() {
		return btnProceder;
	}

	public void setBtnProceder(JButton btnProceder) {
		this.btnProceder = btnProceder;
	}
	
	
}
