
package CDP;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
	static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
	
   int opc=0;
   
   ArrayList<Perros>list=new ArrayList<>();
   
   
   do {
		System.out.println("BIENVENIDO");
		System.out.println("MENÚ");
		System.out.println("1 - Agregar Perro");
		System.out.println("2 - Información del perro");
		System.out.println("3 - Perros según su raza");
		System.out.println("4 - Perros ubicados en cada Localidad");
		System.out.println("5 - SALIR");

		opc = tec.nextInt();

	switch (opc) {
		
	case 1:	
		
		tec.nextLine();
	
		Perros p = new Perros();
		
		
		System.out.println("Ingrese nombre del perro");
		p.setNombre(tec.nextLine().toLowerCase());
		
		System.out.println("Ingrese raza");
		p.setRaza(tec.nextLine().toLowerCase());
		
		System.out.println("Ingrese dia en el que asistira al colegio");
		p.setDia(tec.nextLine().toLowerCase());
		
		System.out.println("Ingrese Nombre del Dueño");
		p.setNombredueño(tec.nextLine().toLowerCase());
		
		System.out.println("Ingrese Localidad");
		p.setLocalidad(tec.nextLine().toLowerCase());
		
		System.out.println("Ingrese Cédula");
		p.setCedula(tec.nextInt());
		
		System.out.println("Ingrese número telefónico");
		p.setTelefono(tec.nextInt());
	
		list.add(p);
		
		
    break;
    
	case 2:
		
		int t=0;
		String name;
		tec.nextLine();
		
		System.out.println("Ingrese nombre del perro");
		name = tec.nextLine().toLowerCase();
		
		for(Perros perro : list) {
			
			if(perro.getNombre().equals(name)) {
				
				System.out.println("Nombre = " +perro.getNombre().substring(0,1).toUpperCase()+perro.getNombre().substring(1));
				System.out.println("Raza = "+perro.getRaza().substring(0,1).toUpperCase()+perro.getRaza().substring(1));
				System.out.println("Nombre del dueño = "+perro.getNombredueño().substring(0,1).toUpperCase()+perro.getNombredueño().substring(1));
				System.out.println("Cédula = "+perro.getCedula());
				System.out.println("Localidad = "+perro.getLocalidad().substring(0,1).toUpperCase()+perro.getLocalidad().substring(1));
				System.out.println("Teléfono = "+perro.getTelefono());
				System.out.println("Dia en el que asiste = " +perro.getDia().substring(0,1).toUpperCase()+perro.getDia().substring(1));
                System.out.println("");
				t++;
	
			}
		}
		
		if(t==0) {
			
			    System.out.println("No hay perros registados con ese nombre");
			    System.out.println("");
		}
		break;
		
	case 3:
		
		int tr=0;
		
		tec.nextLine();
		
		System.out.println("Ingrese la raza a buscar");
		String raza = tec.nextLine().toLowerCase();
		
		for(Perros perro : list){
			
			if(perro.getRaza().equals(raza)) {
				
				tr++;
			}
		}
		
		if (tr==0) {
			
			System.out.println("no se encontraron perros con esa raza.");
		}else if(tr==1) {
			
			System.out.println("De la raza "+raza+ " Se encontro un solo perro." );
			
		}else {
			
			System.out.println("De la raza "+raza+" se encontraron "+tr+" perros.");
		}
		
	break;
	
	case 4:
		
		int tl=0;
		tec.nextLine();
		
		System.out.println("Ingrese localidad");
		String localidad = tec.nextLine().toLowerCase();
		
		System.out.println("Lista de perros ubicados en esa localidad");
		for(Perros perro : list) {
			
			if(perro.getLocalidad().equals(localidad)) {
				
				System.out.println("Nombre = " +perro.getNombre().substring(0,1).toUpperCase()+perro.getNombre().substring(1));
				System.out.println("Raza = "+perro.getRaza().substring(0,1).toUpperCase()+perro.getRaza().substring(1));
				System.out.println("Nombre del dueño = "+perro.getNombredueño().substring(0,1).toUpperCase()+perro.getNombredueño().substring(1));
				System.out.println();
				tl++;
			}
		}
		
		if(tl==0) {
			
			System.out.println("No se encontraron perros ubicados en esta localidad");
		}
		
	break;
	}
	}while(opc!=5);		
		 
	}

}
