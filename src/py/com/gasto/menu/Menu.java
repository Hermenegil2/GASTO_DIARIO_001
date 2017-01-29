package py.com.gasto.menu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import py.com.gasto.controlador.MenuControlador;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Menu extends JFrame {
	private JTable table;
	private JTextField Mcodigo;
	private JTextField Mdescripcion;
	private JTextField Mcantidad;
	private JTextField MprecioUnit;
	private JTable table_1;
	private JTextField MtotalIngreso;
	private JTextField Mtotalefectivo;
	private JComboBox Mtipo;
	private JButton btnPasar;
	private JButton btnCompra;
	private JTextField mTotal;
	private JButton btnAnular;
	private JButton btnAnularUnaFila;
	private JTextField Mhaber;
	private JMenuBar menuBar;
	private JMenu mnRegistro;
	private JMenu mnInforme;
	private JMenuItem MProducto;
	private JMenuItem MIngreso;
	private JMenuItem mntmCompra;
	private JComboBox Mpeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		getContentPane().setBackground(new Color(0, 0, 153));
		getContentPane().setForeground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// le decimo que termine el proceso y que libere memoria en el sistema operativo
		setExtendedState(MAXIMIZED_BOTH); //maximiza la pantalla
		setBounds(100, 100, 1403, 754);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 398, 706, 223);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Descripcion", "Cantidad", "Peso", "Precio Unitario", "Tipo de Gasto", "Precio Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Object.class, Integer.class, Object.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(59);
		table.getColumnModel().getColumn(1).setPreferredWidth(179);
		table.getColumnModel().getColumn(2).setPreferredWidth(74);
		scrollPane.setViewportView(table);
		
		Mcodigo = new JTextField();
		Mcodigo.setBounds(10, 342, 72, 20);
		getContentPane().add(Mcodigo);
		Mcodigo.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setBounds(10, 317, 72, 20);
		getContentPane().add(lblCodigo);
		
		Mdescripcion = new JTextField();
		Mdescripcion.setBounds(92, 342, 136, 20);
		getContentPane().add(Mdescripcion);
		Mdescripcion.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBounds(92, 317, 136, 20);
		getContentPane().add(lblDescripcion);
		
		Mcantidad = new JTextField();
		Mcantidad.setBounds(238, 342, 86, 20);
		getContentPane().add(Mcantidad);
		Mcantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBounds(241, 317, 83, 20);
		getContentPane().add(lblCantidad);
		
		MprecioUnit = new JTextField();
		MprecioUnit.setBounds(405, 342, 86, 20);
		getContentPane().add(MprecioUnit);
		MprecioUnit.setColumns(10);
		
		JLabel lblPrecioUnitario = new JLabel("Precio Uni.");
		lblPrecioUnitario.setForeground(Color.WHITE);
		lblPrecioUnitario.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrecioUnitario.setBounds(405, 317, 102, 20);
		getContentPane().add(lblPrecioUnitario);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 186, 549, 101);
		getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Descripcion"
			}
		));
		table_1.getColumnModel().getColumn(1).setPreferredWidth(390);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_2 = new JLabel("Total de Ingreso");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(276, 47, 257, 20);
		getContentPane().add(lblNewLabel_2);
		
		MtotalIngreso = new JTextField();
		MtotalIngreso.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		MtotalIngreso.setBounds(275, 70, 172, 20);
		getContentPane().add(MtotalIngreso);
		MtotalIngreso.setColumns(10);
		
		JLabel lblTotalEnEfectivo = new JLabel("Total de Compra");
		lblTotalEnEfectivo.setForeground(Color.WHITE);
		lblTotalEnEfectivo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalEnEfectivo.setBounds(276, 108, 257, 20);
		getContentPane().add(lblTotalEnEfectivo);
		
		Mtotalefectivo = new JTextField();
		Mtotalefectivo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		Mtotalefectivo.setColumns(10);
		Mtotalefectivo.setBounds(275, 139, 172, 20);
		getContentPane().add(Mtotalefectivo);
		
		Mtipo = new JComboBox();
		Mtipo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		Mtipo.setModel(new DefaultComboBoxModel(new String[] {"Comestible", "No Comestible"}));
		Mtipo.setBounds(518, 340, 102, 20);
		getContentPane().add(Mtipo);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTipo.setBounds(545, 317, 51, 20);
		getContentPane().add(lblTipo);
		
		btnPasar = new JButton("Pasar");
		btnPasar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnPasar.setBounds(627, 340, 89, 23);
		getContentPane().add(btnPasar);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 632, 569, 58);
		getContentPane().add(panel);
		
		btnCompra = new JButton("Comprar");
		btnCompra.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		panel.add(btnCompra);
		
		btnAnular = new JButton("Anular Todo");
		btnAnular.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		panel.add(btnAnular);
		
		btnAnularUnaFila = new JButton("Anular Una Fila");
		btnAnularUnaFila.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		panel.add(btnAnularUnaFila);
		
		mTotal = new JTextField();
		mTotal.setBounds(614, 654, 102, 36);
		getContentPane().add(mTotal);
		mTotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblTotal.setBounds(632, 632, 72, 14);
		getContentPane().add(lblTotal);
		
		Mhaber = new JTextField();
		Mhaber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		Mhaber.setColumns(10);
		Mhaber.setBounds(469, 108, 172, 20);
		getContentPane().add(Mhaber);
		
		JLabel lblEnElHaber = new JLabel("En el Haber");
		lblEnElHaber.setForeground(Color.WHITE);
		lblEnElHaber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEnElHaber.setBounds(470, 85, 257, 20);
		getContentPane().add(lblEnElHaber);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1372, 36);
		getContentPane().add(menuBar);
		
		mnRegistro = new JMenu("Registro");
		mnRegistro.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 20));
		menuBar.add(mnRegistro);
		
		MProducto = new JMenuItem("Producto");
		mnRegistro.add(MProducto);
		
		MIngreso = new JMenuItem("Ingreso");
		mnRegistro.add(MIngreso);
		
		mnInforme = new JMenu("Informe");
		mnInforme.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 20));
		menuBar.add(mnInforme);
		
		mntmCompra = new JMenuItem("Compra");
		mnInforme.add(mntmCompra);
		
		Mpeso = new JComboBox();
		Mpeso.setModel(new DefaultComboBoxModel(new String[] {"Unidad", "KG", "ML"}));
		Mpeso.setBounds(334, 342, 61, 20);
		getContentPane().add(Mpeso);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setForeground(Color.WHITE);
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPeso.setBounds(334, 317, 83, 20);
		getContentPane().add(lblPeso);
		
		
		MenuControlador controlador=new MenuControlador(this);
		controlador.pasarCampoATabla();
		controlador.TotalMonto();
		controlador.TotalEfectivo();
		controlador.haber();

	}
	
	
	public JMenuItem getMProducto() {
		return MProducto;
	}

	public void setMProducto(JMenuItem mProducto) {
		MProducto = mProducto;
	}

	public JMenuItem getMIngreso() {
		return MIngreso;
	}

	public void setMIngreso(JMenuItem mIngreso) {
		MIngreso = mIngreso;
	}

	public JMenuItem getMntmCompra() {
		return mntmCompra;
	}

	public void setMntmCompra(JMenuItem mntmCompra) {
		this.mntmCompra = mntmCompra;
	}

	public JTextField getMhaber() {
		return Mhaber;
	}

	public void setMhaber(JTextField mhaber) {
		Mhaber = mhaber;
	}

	public JButton getBtnAnular() {
		return btnAnular;
	}

	public void setBtnAnular(JButton btnAnular) {
		this.btnAnular = btnAnular;
	}

	public JButton getBtnAnularUnaFila() {
		return btnAnularUnaFila;
	}

	public void setBtnAnularUnaFila(JButton btnAnularUnaFila) {
		this.btnAnularUnaFila = btnAnularUnaFila;
	}

	public JTextField getMtotalefectivo() {
		return Mtotalefectivo;
	}

	public void setMtotalefectivo(JTextField mtotalefectivo) {
		Mtotalefectivo = mtotalefectivo;
	}

	public JTextField getmTotal() {
		return mTotal;
	}

	public void setmTotal(JTextField mTotal) {
		this.mTotal = mTotal;
	}

	public JTextField getMtotalIngreso() {
		return MtotalIngreso;
	}

	public JButton getBtnCompra() {
		return btnCompra;
	}

	public void setBtnCompra(JButton btnCompra) {
		this.btnCompra = btnCompra;
	}

	public void setMtotalIngreso(JTextField mtotalIngreso) {
		MtotalIngreso = mtotalIngreso;
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getMcodigo() {
		return Mcodigo;
	}

	public void setMcodigo(JTextField mcodigo) {
		Mcodigo = mcodigo;
	}

	public JTextField getMdescripcion() {
		return Mdescripcion;
	}

	public void setMdescripcion(JTextField mdescripcion) {
		Mdescripcion = mdescripcion;
	}

	public JTextField getMcantidad() {
		return Mcantidad;
	}

	public void setMcantidad(JTextField mcantidad) {
		Mcantidad = mcantidad;
	}

	public JTextField getMprecioUnit() {
		return MprecioUnit;
	}

	public void setMprecioUnit(JTextField mprecioUnit) {
		MprecioUnit = mprecioUnit;
	}

	public JComboBox getMtipo() {
		return Mtipo;
	}

	public void setMtipo(JComboBox mtipo) {
		Mtipo = mtipo;
	}

	public JButton getBtnPasar() {
		return btnPasar;
	}

	public void setBtnPasar(JButton btnPasar) {
		this.btnPasar = btnPasar;
	}

	public JComboBox getMpeso() {
		return Mpeso;
	}

	public void setMpeso(JComboBox mpeso) {
		Mpeso = mpeso;
	}
	
	
}

