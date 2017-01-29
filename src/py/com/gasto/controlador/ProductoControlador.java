package py.com.gasto.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import py.com.gasto.dao.ProductoDAO;
import py.com.gasto.formulario.ProductoFormulario;
import py.com.gasto.model.Producto;
/**
 * 
 * @author Hermenegil2
 *
 */
public class ProductoControlador implements ActionListener{
	private ProductoDAO dao;
	private ProductoFormulario ventana;
	private Producto producto;
	
	public ProductoControlador(ProductoFormulario v){
		this.ventana=v;
		ventana.getBtnGuardar().addActionListener(this);
		ventana.getBtnNuevo().addActionListener(this);
	}
	
	public void guardar() {
		if (ventana.getPdescripcion().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debe Ingresar la descripcion");
			ventana.getPdescripcion().requestFocus();
		}else {
			producto=new Producto();
			producto.setDescripcion(ventana.getPdescripcion().getText());
			dao=new ProductoDAO();
			dao.registrar(producto);
		}

	}
	
	private void obtenerUltimoId() {
		Producto producto=ProductoDAO.obtenerUltimoId();
		ventana.getPcodigo().setText(Integer.toString(producto.getId()));
	}

	private void limpiarCampo() {
		this.ventana.getPdescripcion().setText("");
 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(ventana.getBtnGuardar())) {
			guardar();
			limpiarCampo();
		} 
		if (e.getSource().equals(ventana.getBtnNuevo())) {
			obtenerUltimoId();
		}

	}

	

}
