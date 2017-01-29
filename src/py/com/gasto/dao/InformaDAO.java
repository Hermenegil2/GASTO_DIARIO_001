package py.com.gasto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import py.com.gasto.model.Informe;
import py.com.gastodiario.util.ConexionManager;

public class InformaDAO {
	
		
		
	 public static ArrayList<Informe> traerInforme(int limite){
	 ArrayList<Informe> lista=new ArrayList<>();
	 Informe informe=null;
  	   String sql="SELECT compra.id,producto.descripcion,compra.cantidad || ' ' || compra.peso AS cantidad,compra.precio,compra.tipo,compra.fecha FROM compra INNER JOIN producto on compra.idproducto=producto.id ORDER BY id DESC limit "+limite+"";
  	   
  	  ConexionManager.abrirConexion();
  	  try {
			ResultSet rs=ConexionManager.sentencia.executeQuery(sql);
			while(rs.next()){
				informe=new Informe();
				informe.setCodigo(rs.getInt("id"));
				informe.setDescripcion(rs.getString("descripcion"));
				informe.setCantidad(rs.getString("cantidad"));
				informe.setPrecio(rs.getDouble("precio"));
				informe.setTipo(rs.getString("tipo"));
				informe.setFecha(rs.getString("fecha"));
				lista.add(informe);
			}
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al traer el informe"+e.getMessage());
		}
  	  ConexionManager.cerrarConexion();
  	  return lista;
  	  
  	  
     }
	 public static ArrayList<Informe> traerInformeTodo(){
		 ArrayList<Informe> lista=new ArrayList<>();
		 Informe informe=null;
	  	   String sql="SELECT compra.id,producto.descripcion,compra.cantidad || ' ' || compra.peso AS cantidad,compra.precio,compra.tipo,compra.fecha FROM compra INNER JOIN producto on compra.idproducto=producto.id ORDER BY id DESC ";
	  	   
	  	  ConexionManager.abrirConexion();
	  	  try {
				ResultSet rs=ConexionManager.sentencia.executeQuery(sql);
				while(rs.next()){
					informe=new Informe();
					informe.setCodigo(rs.getInt("id"));
					informe.setDescripcion(rs.getString("descripcion"));
					informe.setCantidad(rs.getString("cantidad"));
					informe.setPrecio(rs.getDouble("precio"));
					informe.setTipo(rs.getString("tipo"));
					informe.setFecha(rs.getString("fecha"));
					lista.add(informe);
				}
				
			} catch (SQLException e) {
			
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error al traer todo el informe"+e.getMessage());
			}
	  	  ConexionManager.cerrarConexion();
	  	  return lista;
	  	  
	  	  
	     }
	 public static ArrayList<Informe> MayorCompra(){
	 ArrayList<Informe> lista=new ArrayList<>();
	 Informe informe=null;
  	   String sql="SELECT descripcion,SUM(cantidad) || ' ' || peso AS cantidad,SUM(precio*cantidad) AS precio,tipo FROM compra INNER JOIN producto ON compra.idproducto=producto.id GROUP BY idproducto,descripcion,tipo,peso ORDER BY precio DESC";
  	   
  	  ConexionManager.abrirConexion();
  	  try {
			ResultSet rs=ConexionManager.sentencia.executeQuery(sql);
			while(rs.next()){
				informe=new Informe();
				informe.setDescripcion(rs.getString("descripcion"));
				informe.setCantidad(rs.getString("cantidad"));
				informe.setPrecio(rs.getInt("precio"));
				informe.setTipo(rs.getString("tipo"));
				lista.add(informe);
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al traer el mayor compra");
		}
  	  ConexionManager.cerrarConexion();
  	  return lista;
  	  
  	  
     }

}
