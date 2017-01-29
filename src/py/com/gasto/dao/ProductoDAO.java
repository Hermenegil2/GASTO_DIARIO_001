package py.com.gasto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import py.com.gasto.model.Producto;
import py.com.gastodiario.util.ConexionManager;

public class ProductoDAO {
	
			public void registrar(Producto producto){
				String sql="INSERT INTO producto(descripcion) VALUES ('"+producto.getDescripcion()+"');";
				System.out.println(sql);
				ConexionManager.abrirConexion();
				try {
					ConexionManager.sentencia.executeUpdate(sql);
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "La Sentencia no Fue Ejecutada."+e.getMessage());
					e.printStackTrace();
				}
				ConexionManager.cerrarConexion();
			}
			
			public static Producto obtenerUltimoId(){
				String sql="SELECT MAX(id)+1 AS id FROM producto";
				System.out.println(sql);
				ConexionManager.abrirConexion();
				Producto producto=null;
				try {
					ResultSet rs=ConexionManager.sentencia.executeQuery(sql);
					if(rs.next()){
						producto=new Producto();
						producto.setId(rs.getInt("id"));
					}
					System.out.println("la sentencia fue ejecutada");
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "La Sentencia No Fue Ejecutada."+e.getMessage());
					e.printStackTrace();
				}
				ConexionManager.cerrarConexion();
				return producto;
			}
}
