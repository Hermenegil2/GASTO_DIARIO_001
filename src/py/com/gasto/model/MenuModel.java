package py.com.gasto.model;

/**
 * 
 * @author Hermenegil2
 *
 */
public class MenuModel {
			private int codigo;
			private String descripcion;
			private int cantidad;
			private String peso;
			private double precioUni;
			private String tipo;
			
			
			public MenuModel() {
				super();
				codigo=0;
				descripcion="";
				cantidad=0;
				peso="";
				precioUni=0;
				tipo="";
			}


			public int getCodigo() {
				return codigo;
			}


			public void setCodigo(int codigo) {
				this.codigo = codigo;
			}


			public String getDescripcion() {
				return descripcion;
			}


			public void setDescripcion(String descripcion) {
				this.descripcion = descripcion;
			}


			public int getCantidad() {
				return cantidad;
			}


			public void setCantidad(int cantidad) {
				this.cantidad = cantidad;
			}


			public double getPrecioUni() {
				return precioUni;
			}


			public void setPrecioUni(double precioUni) {
				this.precioUni = precioUni;
			}


			public String getTipo() {
				return tipo;
			}


			public void setTipo(String tipo) {
				this.tipo = tipo;
			}
			
			public String getPeso(){
				return peso;
			}
			
			public void setPeso(String peso){
				this.peso=tipo;
			}


			@Override
			public String toString() {
				return "MenuModel [codigo=" + codigo + ", descripcion="
						+ descripcion + ", cantidad=" + cantidad + ", peso="
						+ peso + ", precioUni=" + precioUni + ", tipo=" + tipo
						+ "]";
			}


}