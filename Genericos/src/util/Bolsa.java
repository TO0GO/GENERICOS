package util;
//Clase genérica básica
//Parametro de tipo <T> El compilador valída los tipos ántes de la ejecución y elimina la necesidad de castigs manuales

public class Bolsa <T>{
   private T[] contenido;
   private int cantidad;
   
   public Bolsa(int capacidad) {
	   //En java no se puede hacer directo:
	   //new T[capacidad] debido al borrado de tipo
	   
	this.contenido = (T[]) new Object[capacidad];
	this.cantidad = 0;
   }
   
   public void add(T nuevo) {
	  if(cantidad < contenido.length) {
		  this.contenido[cantidad++] = nuevo;
		  
	  }else {
		  System.out.println("No hay espacio en la bolsa");
	  }
   }
	  public T get(int index) {
		  if(index < this.cantidad) {
			 return contenido[index];
		  }
		  return null;
	  }
   
   
   
}
