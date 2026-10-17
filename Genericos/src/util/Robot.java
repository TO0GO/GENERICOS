package util;

public class Robot {
    private String modelo;

	public Robot(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Robot [modelo=" + modelo + "]";
	}
    
    
}
