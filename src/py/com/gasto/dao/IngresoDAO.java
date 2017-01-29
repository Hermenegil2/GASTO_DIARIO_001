package py.com.gasto.dao;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import py.com.gasto.model.Ingreso;
import py.com.gastodiario.util.ConexionManager;


public class IngresoDAO {
        
	
	public static void registrarIngreso(Ingreso ingreso){
		ConexionManager.abrirConexion();
		String sql="INSERT INTO ingreso(monto) VALUES ("+ingreso.getMonto()+")";
		System.out.println(sql);
		try {
			ConexionManager.sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "La sentencia no fue ejecutada"+e.getMessage());
			e.printStackTrace();
		}
	}

}
