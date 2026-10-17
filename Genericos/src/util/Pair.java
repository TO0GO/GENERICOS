package util;
//Permite asociar dos tipos de datos parametrizados distintos en la misma escritura
public class Pair<T1,T2> {
     private T1 object1;
     private T2 object2;
     
	 public Pair(T1 one, T2 two) {
		
		this.object1 = one;
		this.object2 = two;
	 }

	 public T1 getFirst() {
		 return object1;
	 }

	 

	 public T2 getSecond() {
		 return object2;
	 }

	 
	 
	 
	 
     
     
}
