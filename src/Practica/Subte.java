package Practica;

public class Subte {
	public static void main(String[] args) {
		String _opcionActual;
		String _opcionDestino;
		int actual;
		int destino;
		int cantidadEstaciones;
		Boolean preguntaIngreso=true;
		String respuesta;
		String [] estaciones = {"HOSPITALES","PARQUE PATRICIOS","CASEROS","INCLAN","HUMBERTO 1",
				"VENEZUELA","ONCE","CORRIENTES","SANTA FE","LAS HERAS"};
		Robot objetoRobot = new Robot();		
		System.out.println(">>>BIENVENIDO A LA LÍNEA H<<<");
		do {
			System.out.println("");
			System.out.println("Ingrese estación actual: ");
			_opcionActual=objetoRobot.LeerTexto();
		} while (validarDestino(_opcionActual));
		do {
			System.out.println("");
			System.out.println("Ingrese estación destino: ");
			_opcionDestino=objetoRobot.LeerTexto();
		} while (validarDestino(_opcionDestino));
		
        actual=asignarID(_opcionActual);
        destino=asignarID(_opcionDestino);
		
        do {
			System.out.println("");
        	System.out.println("El subte ha llegado, ¿desea ingresar? Responda: SI o NO");
        	respuesta=objetoRobot.LeerTexto();
        	if (respuesta.equalsIgnoreCase("SI"))
    		{
        		preguntaIngreso=false;
    		} else if (respuesta.equalsIgnoreCase("NO")) {
    		} else  {
    			System.err.println("Ha ingresado una respuesta incorrecta, por favor responda por: SI o NO");
    		}
         	
        } while (preguntaIngreso);
        
		System.out.println("");
       
        if (actual > destino) {
        	cantidadEstaciones=actual-destino;
    		int j;
    		j=actual;
        	for (int i=0; i <= cantidadEstaciones; i++) {
        		System.out.print(" - "+estaciones[j]);
        		j--;
			}
        	
        } else if (actual < destino) {
        	cantidadEstaciones=destino-actual;
        	int j;
    		j=actual;
        	for (int i=0; i <= cantidadEstaciones; i++) {
        		System.out.print(" - "+estaciones[j]);
        		j++;
			}
        	
        } else {
        	System.out.print("Ya se encuentra en el destino.");
        }
        
		System.out.println("");
		System.out.println("");
        System.out.println("Gracias por viajar con Codo a Codo");
}
	
//// FUNCIÓN PARA VALIDAR LO INGRESADO
	public static Boolean validarDestino (String opcionDestino)  {
		String [] estacionesH = {"HOSPITALES","PARQUE PATRICIOS","CASEROS","INCLAN","HUMBERTO 1",
				"VENEZUELA","ONCE","CORRIENTES","SANTA FE","LAS HERAS"};
		Boolean volverAPedir=true;
		
		for (int i = 0; i < estacionesH.length; i++) {
			if (opcionDestino.equalsIgnoreCase(estacionesH[i]))
			{
				volverAPedir=false;
			}
		}
		
		if (volverAPedir==false)
		{
			return false;
		}	else {
			System.err.println("Por favor ingrese una opción válida.");
			return true;
		    }
	}

//// FUNCIÓN PARA ASIGNAR ID	
	public static int asignarID (String opcion)  {
		int id = 0;
		String [] estacionesH = {"HOSPITALES","PARQUE PATRICIOS","CASEROS","INCLAN","HUMBERTO 1",
				"VENEZUELA","ONCE","CORRIENTES","SANTA FE","LAS HERAS"};
		
		for (int i = 0; i < estacionesH.length; i++) {
			if (opcion.equalsIgnoreCase(estacionesH[i]))
			{
				id=i;
			}
		}
		return id;	
	}
	
}

	