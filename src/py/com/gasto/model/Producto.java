package py.com.gasto.model;
/**
 * 
 * @author Hermenegil2
 * Version 0.0.1
 */
public class Producto {
		private int id;
		private String descripcion;
		
		public Producto() {
			super();
			id=0;
			descripcion="";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		@Override
		public String toString() {
			return "Producto [id=" + id + ", descripcion=" + descripcion + "]";
		}
		
		
}
