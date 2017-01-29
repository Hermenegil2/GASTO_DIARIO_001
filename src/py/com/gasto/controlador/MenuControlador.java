package py.com.gasto.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import py.com.gasto.dao.MenuDAO;
import py.com.gasto.formulario.IngresoFormulario;
import py.com.gasto.formulario.ProductoFormulario;
import py.com.gasto.menu.InformeMenu;
import py.com.gasto.menu.Menu;
import py.com.gasto.model.Ingreso;
import py.com.gasto.model.MenuModel;

/**
 * 
 * @author Hermenegil2
 *
 */
public class MenuControlador implements  ActionListener {
	private Integer sumatoria=0;
	private Integer sumatoria1=0;
	//DecimalFormat formatea = new DecimalFormat("###,###.##");
	private Menu ventana;
	private Ingreso ingreso;
	private Integer valor;
	
	public MenuControlador (Menu v){
		this.ventana=v;
		ventana.getBtnCompra().addActionListener(this);
		ventana.getMntmCompra().addActionListener(this);
		ventana.getMProducto().addActionListener(this);
		ventana.getMIngreso().addActionListener(this);
		ventana.getMdescripcion().addActionListener(this);
		ventana.getBtnPasar().addActionListener(this);
		ventana.getBtnAnular().addActionListener(this);
		ventana.getBtnAnularUnaFila().addActionListener(this);
		
	}
	
    
	private void agregarFormularioEnTabla() {
		DefaultTableModel modelo=(DefaultTableModel) ventana.getTable().getModel();
		Object[] fila=new Object[7];
		fila[0]=ventana.getMcodigo().getText();
		fila[1]=ventana.getMdescripcion().getText();
		fila[2]=ventana.getMcantidad().getText();
		fila[3]=ventana.getMpeso().getSelectedItem();
		fila[4]=ventana.getMprecioUnit().getText();
		fila[5]=ventana.getMtipo().getSelectedItem();
		modelo.addRow(fila);
		ventana.getTable().setModel(modelo);

	
	}
	
	private void listarDescripcion(){
			ArrayList<MenuModel> menu=new ArrayList<MenuModel>();
			String MenuDesc=ventana.getMdescripcion().getText();
			menu=MenuDAO.listaDescripcion(MenuDesc);
			if (menu !=null) {
				DefaultTableModel modelo=(DefaultTableModel) ventana.getTable_1().getModel();
				Object[] fila=new Object[modelo.getColumnCount()];
				for (int i = 0; i <menu.size(); i++) {
					fila[0]=menu.get(i).getCodigo();
					fila[1]=menu.get(i).getDescripcion();
					modelo.addRow(fila);
				}
			}
		}
	
	public void limpiarTabla() {
		DefaultTableModel modelo=(DefaultTableModel) ventana.getTable_1().getModel();
		for (int i = 0; i < ventana.getTable_1().getRowCount(); i++) {
			modelo.removeRow(i);
			i-=1;
		}

	}
	
     public void pasarCampoATabla() {
    	 
    	 
    	 this.ventana.setLocationRelativeTo(null);
         ventana.getTable_1().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
   		
   		@Override
   		public void valueChanged(ListSelectionEvent arg0) {
   			 
   			if(ventana.getTable_1().getSelectedRow() !=-1){
   				int fila=ventana.getTable_1().getSelectedRow();
   				ventana.getMcodigo().setText(ventana.getTable_1().getValueAt(fila, 0).toString());
   				ventana.getMdescripcion().setText(ventana.getTable_1().getValueAt(fila, 1).toString());
   			}
   		}
   	});

	}
     
     public void TotalMonto() {
    
    	ingreso=MenuDAO.TotalIngresos();
 		ventana.getMtotalIngreso().setText(Integer.toString(ingreso.getMonto()));
 	
 	}
     
     
     public void TotalEfectivo(){
    	 ingreso=MenuDAO.TotalEnEfectivo();
    	 ventana.getMtotalefectivo().setText(Integer.toString(ingreso.getEfectivo()));
  		
     }
  
    
    private void guardarCompras() {
		MenuModel compra=new MenuModel();
		for (int i = 0; i < ventana.getTable().getRowCount(); i++) {
			compra.setCodigo(Integer.parseInt(ventana.getTable().getValueAt(i, 0).toString()));
			compra.setCantidad(Integer.parseInt(ventana.getTable().getValueAt(i, 2).toString()));
			compra.setPeso(ventana.getTable().getValueAt(i, 3).toString());
			compra.setPrecioUni(Double.parseDouble(ventana.getTable().getValueAt(i, 4).toString()));
			compra.setTipo(ventana.getTable().getValueAt(i, 5).toString());
			MenuDAO.guardarDatosDeLaTabla(compra);
		}
    }
      //la sumatoria de la columna
    public void sumar(){
    	int totalRow= ventana.getTable().getRowCount();
    	totalRow-=1;
    	for(int i=0;i<=(totalRow);i++)
    	{
    		sumatoria=Integer.parseInt(String.valueOf(ventana.getTable().getValueAt(i,6)));
    	}
    	
    	sumatoria1+=sumatoria;
    	ventana.getmTotal().setText(String.valueOf(sumatoria1));
    }
    

    private void calcularTotales() {
        for (int x = 0; x < ventana.getTable().getRowCount(); x ++) {
            String valor = null; 
            try {
                valor = String.valueOf((Integer.valueOf((String) ventana.getTable().getValueAt(x, 2)) * (Integer.valueOf((String) ventana.getTable().getValueAt(x, 4)))));
            } catch (Exception e) {}
            ventana.getTable().setValueAt(valor, x, 6);
        }

    
    }

	    private void limpiarTablasDeCompras() {
	    	DefaultTableModel modelo=(DefaultTableModel) ventana.getTable().getModel();	    		
			for (int i = 0; i < ventana.getTable().getRowCount(); i++) {
			      modelo.removeRow(i);
			     i-=1;
			}

		}
	    private void eliminarFilaEnTabla() {
			DefaultTableModel modelo=(DefaultTableModel) ventana.getTable().getModel();
			modelo.removeRow(ventana.getTable().getSelectedRow());

		}
	    private void limpiarCampo() {
	    	this.ventana.getMcodigo().setText("");
	    	this.ventana.getMcantidad().setText("");
	    	this.ventana.getMdescripcion().setText("");
	    	this.ventana.getMprecioUnit().setText("");

		}
	    private void limpiarTotal(){
	    	this.ventana.getmTotal().setText("");
	    }
	    
	    public void haber(){
	    	int ingreso=0,compra=0;
			ingreso=Integer.parseInt(ventana.getMtotalIngreso().getText());
			compra=Integer.parseInt(ventana.getMtotalefectivo().getText());
			valor =ingreso-compra;
			ventana.getMhaber().setText(valor.toString());
	    }
	    
	    private void abrirFormularioProduto() {
			ProductoFormulario pro=new ProductoFormulario();
			pro.setVisible(true);

		}
	    private void abrirFormularioIngreso(){
	    	IngresoFormulario ing=new IngresoFormulario();
	    	ing.setVisible(true);
	    }
	    private void abrirCompra(){
	    	InformeMenu inf=new InformeMenu();
	    	inf.setVisible(true);
	    }
	    
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(ventana.getBtnPasar())) {
			agregarFormularioEnTabla();
			calcularTotales();
			sumar();
			limpiarCampo();
		} 
		
		if (e.getSource().equals(ventana.getMdescripcion())) {
			limpiarTabla();
			listarDescripcion();
		}
		
		
		if (e.getSource().equals(ventana.getBtnCompra())) {
	          guardarCompras();
	          TotalMonto();
	          TotalEfectivo();
	          limpiarTablasDeCompras();
	          limpiarTotal();
	}
		
		if (e.getSource().equals(ventana.getBtnAnular())) {
			limpiarTablasDeCompras();
		}
		
		if (e.getSource().equals(ventana.getBtnAnularUnaFila())) {
			eliminarFilaEnTabla();
		}
		if (e.getSource().equals(ventana.getMProducto())) {
		       abrirFormularioProduto();
		}
		if (e.getSource().equals(ventana.getMIngreso())) {
			abrirFormularioIngreso();
		}
		
		if (e.getSource().equals(ventana.getMntmCompra())) {
			abrirCompra();
		}
	}
	
	
			
}
