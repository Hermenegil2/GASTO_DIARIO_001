package py.com.gasto.model;

public class Ingreso {
         private int id;
         private int monto;
         private int efectivo;
         
         
		public Ingreso() {
			super();
			id=0;
			monto=0;
			efectivo=0;
		}


		public int getEfectivo() {
			return efectivo;
		}


		public void setEfectivo(int efectivo) {
			this.efectivo = efectivo;
		}


		public Ingreso(int id, int monto) {
			super();
			this.id = id;
			this.monto = monto;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getMonto() {
			return monto;
		}


		public void setMonto(int monto) {
			this.monto = monto;
		}
		
         
         
}
