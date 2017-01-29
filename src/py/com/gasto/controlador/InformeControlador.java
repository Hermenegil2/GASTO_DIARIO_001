package py.com.gasto.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import py.com.gasto.dao.InformaDAO;
import py.com.gasto.menu.InformeMenu;
import py.com.gasto.model.Informe;

public class InformeControlador implements ActionListener{
		private InformeMenu ventana;

		public InformeControlador (InformeMenu v){
			this.ventana=v;
		    ventana.getBtnProceder().addActionListener(this);
		    ventana.getBtnMayorCompra().addActionListener(this);
			
		}
		
		
	private void listarInforme(){
		if (ventana.getLimite().getText().isEmpty()) {
				DefaultTableModel modelo=(DefaultTableModel) ventana.getTable().getModel();
				ArrayList<Informe>info=InformaDAO.traerInformeTodo();
				Object[] fila=new Object[modelo.getColumnCount()];
				for (int i = 0; i < info.size(); i++) {
				    fila[0]=info.get(i).getCodigo();
					fila[1]=info.get(i).getDescripcion();
					fila[2]=info.get(i).getCantidad();
					fila[3]=info.get(i).getPrecio();
					fila[4]=info.get(i).getTipo();
					fila[5]=info.get(i).getFecha();
				    modelo.addRow(fila);
				
			}
		} else {
				ArrayList<Informe> info=new ArrayList<Informe>();
				Integer limi=Integer.parseInt(ventana.getLimite().getText());
				//String ord=String.valueOf(ventana.getOrden().getSelectedIndex());
				info=InformaDAO.traerInforme(limi);
				if (info !=null) {
					DefaultTableModel modelo=(DefaultTableModel) ventana.getTable().getModel();
					Object[] fila=new Object[modelo.getColumnCount()];
					for (int i = 0; i < info.size(); i++) {
					    fila[0]=info.get(i).getCodigo();
						fila[1]=info.get(i).getDescripcion();
						fila[2]=info.get(i).getCantidad();
						fila[3]=info.get(i).getPrecio();
						fila[4]=info.get(i).getTipo();
						fila[5]=info.get(i).getFecha();
					    modelo.addRow(fila);
					}
				}
		}
 	}

	private void listarMayorCompra(){
			DefaultTableModel modelo=(DefaultTableModel) ventana.getTable().getModel();
			ArrayList<Informe>lista=InformaDAO.MayorCompra();
			Object[] fila=new Object[modelo.getColumnCount()];
			for (int i = 0; i < lista.size(); i++) {
				fila[1]=lista.get(i).getDescripcion();
				fila[2]=lista.get(i).getCantidad();
				fila[3]=lista.get(i).getPrecio();
				fila[4]=lista.get(i).getTipo();
				modelo.addRow(fila);
			}
		}
	public void limpiarTabla() {
		DefaultTableModel modelo=(DefaultTableModel) ventana.getTable().getModel();
		for (int i = 0; i < ventana.getTable().getRowCount(); i++) {
			modelo.removeRow(i);
			i-=1;
		}

	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(ventana.getBtnProceder())) {
			limpiarTabla();
			listarInforme();
			
		}
		if (e.getSource().equals(ventana.getBtnMayorCompra())) {
			limpiarTabla();
			listarMayorCompra();
			
		
		}}
		
}
