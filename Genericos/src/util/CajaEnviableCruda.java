package util;

public class CajaEnviableCruda implements Enviable{

	@Override
	public void enviar(Object t) {
      System.out.println("Enviando objeto: "+t);		
	}

}
