package util;

public class CajaEnviableRobot implements Enviable<Robot> {

	@Override
	public void enviar(Robot t) {
		System.out.println("Enviando robot: "+t.getModelo());
	}

}
