package py.com.gasto.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import py.com.gasto.dao.IngresoDAO;
import py.com.gasto.formulario.IngresoFormulario;
import py.com.gasto.model.Ingreso;

public class IngresoControlador implements ActionListener {
	private IngresoFormulario vent;

	
	public IngresoControlador (IngresoFormulario vv){
		vent=vv;
		vent.getBtnGuardar_1().addActionListener(this);
	
		
	}
	
	private void guardarIngreso() {
   	 Ingreso ingreso=new Ingreso();
   		ingreso.setMonto(Integer.parseInt(vent.getIingreso().getText()));
   	    IngresoDAO.registrarIngreso(ingreso);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(vent.getBtnGuardar_1())) {
	          guardarIngreso();
	}
		
	}

	
}
