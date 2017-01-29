package py.com.gasto.model;

public class Informe {
			private int codigo;
			private String descripcion;
			private String cantidad;
			private double precio;
			private String tipo;
			private String fecha;
			
			public Informe() {
				super();
				codigo=0;
				descripcion="";
				cantidad="";
				precio=0.0;
				tipo="";
				fecha="";
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

			public String getCantidad() {
				return cantidad;
			}

			public void setCantidad(String cantidad) {
				this.cantidad = cantidad;
			}

			public double getPrecio() {
				return precio;
			}

			public void setPrecio(double precio) {
				this.precio = precio;
			}

			public String getTipo() {
				return tipo;
			}

			public void setTipo(String tipo) {
				this.tipo = tipo;
			}

			public String getFecha() {
				return fecha;
			}

			public void setFecha(String fecha) {
				this.fecha = fecha;
			}

			@Override
			public String toString() {
				return "Informe [codigo=" + codigo + ", descripcion="
						+ descripcion + ", cantidad=" + cantidad + ", precio="
						+ precio + ", tipo=" + tipo + ", fecha=" + fecha + "]";
			}

			
			
}
