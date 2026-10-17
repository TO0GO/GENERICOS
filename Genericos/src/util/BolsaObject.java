package util;

//El Problema antiguo
//Demostración porque se usaba object y como provoca un ClassCastException en 
//tiempo de ejecución

public class BolsaObject {
	private Object[] contenido;
	private int cantidad;
	
	//constructor
	public BolsaObject() {
		this.contenido = new Object[50];
		this.cantidad = 0;
	}
	
	public void setContenido(Object nuevo) {
		if(cantidad < contenido.length) {
			this.contenido[cantidad++] = nuevo;
			
		}else {
			System.out.println("No hay espacio en la bolsa");
		}
		
		
	}

	public Object getContenido(int index) {
		if(index < this.contenido.length) {
			return contenido[index];
		}
		return null;
	}

	
	
	
	
	
	
	
}
