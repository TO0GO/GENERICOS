package util;

public class Prueba {

	public static void main(String[] args) {
      System.out.println("===1. EL PROBLEMA ANTES DE JAVA 5 (SIN GENERICOS)===");
      
      BolsaObject bolsaAntigua = new BolsaObject();
      bolsaAntigua.setContenido("Esto es un texto");
      bolsaAntigua.setContenido(42);
      
      String msg = (String) bolsaAntigua.getContenido(0);
      System.out.println("Mensaje: "+ msg);
      
      try {
		 Integer error = (Integer)bolsaAntigua.getContenido(0);
	} catch (ClassCastException e) {
		System.out.println("Error detectado en runtime: "+e.getMessage());
	}
//      ***********************************************************************
      
      System.out.println("\n===2.SEGURIDAD DE TIPOS CON CLASES GENÉRICAS===");
      
//      Type Safety(Seguridad en tiempo de compilacion)
//      Uso del operador diamante
      Bolsa<String> bolsaTexto = new Bolsa<>(10);
     bolsaTexto.add("Ana");
     bolsaTexto.add("Juan");
//     bolsaTexto.add(123); ERROR DE COMPILACIÓN: Protege la integridad del tipo
     System.out.println("Estudiante: "+bolsaTexto.get(0));
     
     Bolsa<Integer> bolsaEnteros = new Bolsa<>(10);
     bolsaEnteros.add(43);
     bolsaEnteros.add(21);
     System.out.println("Edad: "+bolsaEnteros.get(0));
     
//     Incopatibilidad directa de tipos genéricos distintos
//      bolsaTexto = bolsaEnteros; ERROR DE COMPILACIÓN: Bolsa<Integer>no es Bolsa<String>
     
//     ****************************************************
   System.out.println("\n ===3.MÚLTIPLES PARÁMETROS GENÉRICOS (Pair)===");
//   Forma 1: Concreta
   
   Pair<Integer, String> worldCup = new Pair<>(2018,"Rusia");
   System.out.println("Año: "+ worldCup.getFirst()+"|Sede: "+ worldCup.getSecond());
   
//   ***************************************************************************************
   
   System.out.println("\n===4.IMPLEMENTACIONES DE INTERFACES GENERICAS===");
//   Forma 1. Concreta
   CajaEnviableRobot cajaRobot = new CajaEnviableRobot();
   cajaRobot.enviar(new Robot("RX-78"));
   
//   Forma 2. Generica
   CajaEnviableGenerica<String> cajaTexto = new CajaEnviableGenerica<>();
   cajaTexto.enviar("Paquete de libros");
	
//   Forma 3: Raw Type (Aviso/Warning de compilador)
   CajaEnviableCruda cajaRaw = new CajaEnviableCruda();
   cajaRaw.enviar(100);
   cajaRaw.enviar("Objeto variado");
   
//   ***********************************************************
   
   System.out.println("\n===5.RECORDS GENERICOS===");
   CrateRecord<Robot> contenedorRobot = new CrateRecord<>(new Robot("Gundam-01"));
   System.out.println("Contenido del Record: "+contenedorRobot.contents());
   
	}

}
