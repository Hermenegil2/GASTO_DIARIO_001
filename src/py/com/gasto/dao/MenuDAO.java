package py.com.gasto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import py.com.gasto.model.Ingreso;
import py.com.gasto.model.MenuModel;
import py.com.gastodiario.util.ConexionManager;
public class MenuDAO {
	
	public static ArrayList<MenuModel> listaDescripcion(String descripcion){
		ArrayList<MenuModel> lista=new ArrayList<MenuModel>();
		MenuModel menu=null;
		String sql="SELECT * FROM producto WHERE  descripcion IlIKE '%"+descripcion+"%'";
		System.out.println(sql);
		ConexionManager.abrirConexion();
		try {
			ResultSet rs=ConexionManager.sentencia.executeQuery(sql);
			  while(rs.next()){
				  menu=new MenuModel();
				  menu.setCodigo(rs.getInt("id"));
				  menu.setDescripcion(rs.getString("descripcion"));
				  lista.add(menu);
				  
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static Ingreso TotalIngresos(){
		String sql="SELECT SUM(monto) AS monto FROM ingreso";
		System.out.println(sql);
		Ingreso ingreso=null;
		ConexionManager.abrirConexion();
		try {
			ResultSet rs=ConexionManager.sentencia.executeQuery(sql);
			if(rs.next()){
				ingreso=new Ingreso();
				ingreso.setMonto(rs.getInt("monto"));
		
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		ConexionManager.cerrarConexion();
		return ingreso;
	}
	
	public static Ingreso TotalEnEfectivo(){
		String sql="SELECT (SUM(precio * cantidad)) AS total FROM compra;";
		System.out.println(sql);
		Ingreso efectivo=null;
		ConexionManager.abrirConexion();
		try {
			ResultSet rs=ConexionManager.sentencia.executeQuery(sql);
			if(rs.next()){
				efectivo=new Ingreso();
				efectivo.setEfectivo(rs.getInt("total"));
				
		
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		ConexionManager.cerrarConexion();
		return efectivo;
	}
	
	public static void guardarDatosDeLaTabla(MenuModel menu) {
		String sql="INSERT INTO compra(idproducto, cantidad, peso, precio, tipo) VALUES ("+menu.getCodigo()+","+menu.getCantidad()+",'"+menu.getPeso()+"',"+menu.getPrecioUni()+","+menu.getTipo()+");";
		System.out.println(sql);
		ConexionManager.abrirConexion();
		try {
			ConexionManager.sentencia.executeUpdate(sql);
		} catch (SQLException e) {
	
			e.printStackTrace();
		}

	}
}
