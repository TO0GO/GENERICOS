package util;
//CajaEnviable generica
public class CajaEnviableGenerica<U> implements Enviable<U> {

	@Override
	public void enviar(U t) {
     	System.out.println("Enviado: "+t);	
	}

}
